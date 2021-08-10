var ctx = "/distribute";
var fromNo = 0;
var destinNo = 0;
var fromName = "";
var destinName = "";

function showAddView() {
    $(".selectDepartBackground").show();
}

function dosearch() {

    if($("#fromNo").val()!="" && $("destinNo").val()!="" && $("#fromNo").val() == $("destinNo").val()){
        alert("入库和出库不能相同");
        return;
    }

    $.ajax({
        type: "post",
        url: ctx + "/selectByCondition",
        data: $("#search-form").serialize(),
        dataType: "json",
        success: function (response) {
            if (response.resultCode == 200) {
                var data = response.result;
                var t = "";
                for (var i = 0; i < data.length; i++) {
                    t += "<tr>";
                    t += "<td>";
                    t += data[i].tno;
                    t += "</td>";
                    t += "<td>";
                    t += data[i].fromName;
                    t += "</td>";
                    t += "<td>";
                    t += data[i].destinName;
                    t += "</td>";
                    t += "<td>";
                    t += data[i].operator;
                    t += "</td>";
                    t += "<td>";
                    t += data[i].date;
                    t += "</td>";
                    t += "<td>";
                    switch(data[i].isFinish){
                        case 0:
                            t += "否";
                            break;
                        case 1:
                            t += "是";
                            break;
                    }
                    t += "</td>";
                    t +="</tr>";
                }
                $("#searchTbody").html(t);
                $("#searchTbody tr").unbind();
                $("#searchTbody tr").dblclick(function (){
                    var tno = $(this).children().first().text();
                    $.ajax({
                        type: "post",
                        url: ctx + "/queryDetail",
                        data: {"tno" : tno},
                        dataType: "json",
                        success: function (response){
                            if(response.resultCode == 200){
                                showDetailView(response.result);
                            }
                        }
                    })
                })
            }
        }
    });
}

function showDetailView(data){
    var t = "";
    for (var i = 0; i<data.length;i++){
        t+= "<tr><td>"
        t+= data[i].barcode;
        t+= "</td><td>"
        t+= data[i].number;
        t+= "</td></tr>"
    }
    $("#detailTbody").html(t);
    $(".detailViewBackground").show();
}
function closeDetailView(){
    $("#detailTbody").html("");
    $(".detailViewBackground").hide();
}

function makesure() {
    fromNo = $("#selectFromNo").val();
    fromName = $("#selectFromNo option:selected").text();
    destinNo = $("#selectDestinNo").val();
    destinName = $("#selectDestinNo option:selected").text();
    if (fromNo == 0 || destinNo == 0) {
        alert("请选择仓库");
        return;
    }
    if (fromNo != destinNo) {
        $("#addFromNo").val(fromName);
        $("#addDestinNo").val(destinName);
        addBarcodeToSelect();
        $(".addViewBackground").show();
    } else {
        alert("仓库不能相同");
    }
}

function addBarcodeToSelect() {
    $.ajax({
        type: "post",
        url: "/inventory/findByCondition",
        data: {
            "department_no": fromNo
        },
        dataType: "json",
        success: function (data) {
            if (data.resultCode == 200) {
                var msg = "";
                var array = data.result;
                for (var i = 0; i < array.length; i++) {
                    msg += "<option value=\"" + array[i].barcode + "\">" + array[i].barcode + "</option>";
                }
                $("#addBarcode").append(msg);
            }
        }
    });
}
var array = new Array();
function addTable() {
    var inputData = $("#add-form").serializeArray();
    var data = {};
    $(inputData).each(function(index, obj){
        data[obj.name] = obj.value;
    });
    var str = "";
    str += "<tr><td>";
    str += fromName;
    str += "</td>";
    str += "<td>"+destinName+"</td>"
    str += "<td>"+data.barcode+"</td>";
    str += "<td>"+data.number+"</td>";
    str += "<td class=\"deleteTd\" style=\"border: 0px;\"><button class=\"deleteBtn\"><span class=\"glyphicon glyphicon-remove\" style=\"color: red;\"></span></button></td></tr>"
    $("#addTbody").append(str);
    $(".deleteBtn").unbind();
    $(".deleteBtn").click(function(){
        var index = $(this).parent().parent().index();
        // todo 记录查找这个tr索引值的坑
        $(this).parent().parent().remove();
        array.splice(index,1);
    });
    array.push(data);
}

function sumbitTable(){
    var submitForm = {"fromNo":fromNo,"destinNo":destinNo,"data":array};
    $.ajax({
        type: "post",
        url: ctx+"/submit",
        data: JSON.stringify(submitForm),
        dataType: "json",
        contentType: 'application/json;charset=UTF-8',
        success: function (response) {
            if(response.resultCode==200){
                alert("调货成功!");
                array = [];
                $("#tbody").html("");
            }else{
                alert(response.resultMsg);
            }
        }
    });
}

function cancel() {
    $(".selectDepartBackground").hide();
    fromNo = 0;
    destinNo = 0;
    fromName = "";
    destinName = "";
}

function closeAddView() {
    $(".addViewBackground").hide();
    $("#addBarcode").html("<option value=\"0\"></option>>");
}