
var ctx = "/commodity";
var cno;
searchAll();

//delete function
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
        cno = $(this).parent().siblings().first().text();
        $(".deleteAlertView").show();
    });
    $("#removeBtn").attr("onclick","hideDeleteBtn()");
}
function confirmDelete(){
    $.ajax({
        type: "post",
        url: ctx+"/delete",
        data: {"cno":cno},
        dataType: "json",
        success: function (response) {
            console.log(response.resultCode);
            if(response.resultCode!=400){
                hideDeleteAlertView();
                searchAll();
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

//
function sendFn() {
    var ele = document.getElementById("svg");
    var elem = document.getElementById("btn");

    // 添加表单检验
    $("#insertForm").validate({
        rules: {
            barcode: "required",
            name: "required",
            color_no: {
                required: "required",
                min: 1
            },
            supplier_no: {
                required: "required",
                min: 1
            },
            material_no: {
                required: "required",
                min: 1
            },
            costPrice: {
                required: "required",
                min: 0.01
            },
            sellPrice: {
                required: "required",
                min: 0.01
            },
            type_no: {
                required: "required",
                min: 1
            }
        },
        messages: {
            barcode: "请输入条码",
            name: "请输入商品名",
            color_no: {
                required: "请选择颜色",
                min:  "请选择颜色"
            },
            supplier_no: {
                required: "请选择供货商",
                min:  "请选择供货商"
            },
            material_no: {
                required: "请选择材料",
                min:  "请选择材料"
            },
            costPrice: {
                required: "请输入进货价",
                min:  "进货价必须大于0.01"
            },
            sellPrice: {
                required: "请输入售价",
                min:  "售价必须大于0.01"
            },
            type_no: {
                required: "请选择类型",
                min:  "请选择类型"
            }
        }
    });

    var bool = $("#insertForm").valid();
    console.log(bool);
    if(bool==false){
        return;
    }
    // 定义动画
    //
    // ele.classList.toggle("animation");
    // elem.classList.toggle("animationbutton");

    //开始ajax请求数据
    $.ajax({
        type: "post",
        url: ctx+"/addCom",
        data: $('#insertForm').serialize(),
        dataType: "json",
        success: function (response) {
            if (response.resultCode==200){
                alert("添加成功！");
                closeAddView();
                searchAll();
            }else {
                alert(response.resultMsg);
            }
        },
        error: function (XMLHttpRequest, textStatus, errorThrown){
            location.href = ctx;
        }
    });


   /* if (document.getElementById("send").innerHTML == "完成") {
        document.getElementById("send").innerHTML = "提交";
    } else {
        document.getElementById("send").innerHTML = "完成";
    }*/

}

function closeAddView(){
    document.getElementById("insertForm").reset();
    $(".addViewbackground").hide();
}
function showAddView(){
    $(".addViewbackground").show();
}

function doSearch(){
    $.ajax({
        url: ctx+"/find",
        type: "post",
        data: $('#search_form').serialize(),
        dateType: "json",
        success: function (form){
            drawTable(form);
        },
        error: function (XMLHttpRequest, textStatus, errorThrown){
            location.href = ctx;
        }
    })
}
function searchAll(){
    $.ajax({
        url: ctx+"/find",
        type: "post",
        data: "",
        dateType: "json",
        success: function (form){
            drawTable(form);
        },
        error: function (XMLHttpRequest, textStatus, errorThrown){
            location.href = ctx;
        }
    })
}


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
            t += data[i].no;
            t += "</td>";
            t += "<td>";
            t += data[i].name;
            t += "</td>";
            t += "<td>";
            t += data[i].material;
            t += "</td>";
            t += "<td>";
            t += data[i].color;
            t += "</td>";
            t += "<td>";
            t += data[i].type;
            t += "</td>";
            t += "<td>";
            t += data[i].supplier;
            t += "</td>";
            t += "<td>";
            t += data[i].barcode;
            t += "</td>";
            t += "<td>";
            t += data[i].costPrice;
            t += "</td>";
            t += "<td>";
            t += data[i].sellPrice;
            t += "</td>";
            t += "</tr>";
        }

        tbody.html(t);
        $("#removeBtn").attr("onclick","showDeleteBtn()");
    }else {
        var tbody = $("#tbody");
        var t = "<tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td></tr>";
        tbody.html(t);
    }
}

