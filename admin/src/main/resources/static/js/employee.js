var ctx = "/employee";
var eno;
selectByCondition("");

function hideDeleteBtn(){
    console.log("移除删除按钮");
    $(".deleteTd").remove();
    $("#removeBtn").attr("onclick","showDeleteBtn()");
}

function showDeleteBtn(){
    console.log("展示删除按钮");
    $(".bodyTr").append("<td class=\"deleteTd\" style=\"border: 0px;\"><button class=\"deleteBtn\"><span class=\"glyphicon glyphicon-remove\" style=\"color: red;\"></span></button></td>");
    $(".deleteBtn").click(function(){
        console.log("点击了删除按钮");
        eno = $(this).parent().siblings().first().text();
        $(".deleteAlertView").show();
    });
    $("#removeBtn").attr("onclick","hideDeleteBtn()");
}
function confirmDelete(){
    $.ajax({
        type: "post",
        url: ctx+"/delete/deleteByKey",
        data: {"id":eno},
        dataType: "json",
        success: function (response) {
            console.log(response.resultCode);
            if(response.resultCode!=400){
                hideDeleteAlertView();
                selectByCondition("");
            }else{
                console.log(response.resultMsg);
                $(".deleteAlertView").hide();
                alert(response.resultMsg);
            }
        },
        error: function (XMLHttpRequest, textStatus, errorThrown){
            location.href = ctx;
        }
    });

}
function hideDeleteAlertView(){
    $(".deleteAlertView").hide();
}
function cancelDelete() {
    hideDeleteAlertView();
}
//生成表格
function drawTable(form){
    if(form.resultCode == 200){
        console.log(form.resultMsg);
        console.log(form.result);
        var data = form.result;
        console.log(data.length);
        var tbody = $("#tbody");
        var t = "";
        for(var i=0;i<data.length;i++){
            t += "<tr class=\"bodyTr\">";
            t += "<td>";
            t += data[i].eid;
            t += "</td>";
            t += "<td>";
            t += data[i].name;
            t += "</td>";
            t += "<td>";
            t += data[i].sex;
            t += "</td>";
            t += "<td>";
            switch (data[i].ismarried){
                case 1:
                    t += "已婚";
                    break;
                case 0:
                    t += "未婚"
                    break;
            }
            t += "</td>";
            t += "<td>";
            t += data[i].idCard;
            t += "</td>";
            t += "<td>";
            t += data[i].birthday;
            t += "</td>";
            t += "<td>";
            t += data[i].politics;
            t += "</td>";
            t += "<td>";
            switch (data[i].education) {
                case "primary":
                    t += "小学教育";
                    break;
                case "medium":
                    t += "中学或职高";
                    break;
                case "high":
                    t += "高中";
                    break;
                case "undergraduate":
                    t += "本科";
                    break;
                case "master":
                    t += "硕士";
                    break;
                case "doctor":
                    t += "博士";
                    break;
            }
            t += "</td>";
            t += "<td>";
            t += data[i].joinTime;
            t += "</td>";
            t += "<td>";
            t += data[i].department;
            t += "</td>";
            t += "<td>";
            t += data[i].workType;
            t += "</td>";
            t += "<td>";
            t += data[i].salary;
            t += "</td>";
            t += "</tr>";
        }
        tbody.html(t);
        $("#removeBtn").attr("onclick","showDeleteBtn()");
    }else {
        var tbody = $("#tbody");
        var t = "<tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td></tr>";
        tbody.html(t);
    }
}

function doSearch(){
    console.log("点击搜索");
    var data = $('#search_form').serialize();
    selectByCondition(data);
}
// 开关弹窗函数
function closeAddView(){
    document.getElementById("insertForm").reset();
    $(".addViewbackground").hide();
}
function showAddView(){
    $(".addViewbackground").show();
}
var xml;
function selectByCondition(date){
    $.ajax({
        type: "post",
        url: ctx+"/find/findByCondition",
        data: date,
        dataType: "json",
        success: function (data,textStatus,jqXHR) {
            console.log("seccess 查询成功")
            console.log(data);
            console.log(textStatus);
            console.log(jqXHR);
            drawTable(data);
        },
        error: function (XMLHttpRequest, textStatus, errorThrown){
            location.href = ctx;
        }
    });
}

function sendFn(){
    $("#insertForm").validate({
        rules: {
            name: "required",
            sex: "required",
            idCard: {
                required: true,
                maxlength: 18,
                minlength: 18
            },
            birthday: "required",
            ismarried: "required",
            politicsStatus: "required",
            educationStatus: "required",
            workTypeNo: {
                required: "required",
                min : 1
            },
            departmentNo: {
                required: "required",
                min: 1
            },
            joinTime: "required",
            salary: {
                required: "required",
                min: 0.001
            }
        },
        messages: {
            name: "请输入姓名",
            sex: "请选择性别",
            idCard: {
                required: "请输入身份证号",

                maxlength: "请输入合法的身份证号码",
                minlength: "请输入合法的身份证号码"
            },
            birthday: "请选择生日",
            ismarried: "请选择婚姻状况",
            politicsStatus: "请选择政治面貌",
            educationStatus: "请选择教育程度",
            workTypeNo:{
                required: "请选择工种",
                min: "请选择工种"
            },
            departmentNo: {
                required: "请选择部门",
                min: "请选择部门"
            },
            joinTime: "请选择入职时间",
            salary: {
                required: "请输入工资",
                min: "请输入工资"
            }
        }
    });
    var bool;
    bool = $("#insertForm").valid();
    if(bool == false){
        return;
    }
    var date = $("#insertForm").serialize();
    $.ajax({
        type: "post",
        url: ctx+"/insert/insertOne",
        data: date,
        dataType: "json",
        success: function (response) {
            if(response.resultCode==200){
                closeAddView();
                selectByCondition("");
            }else {
                alert(response.resultMsg);
            }
        },
        error: function (XMLHttpRequest, textStatus, errorThrown){
            location.href = ctx;
        }
    });
    console.log(date);
}
function reset() {
    $(".error").hide();
}

