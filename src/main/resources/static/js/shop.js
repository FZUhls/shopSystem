var ctx = "/shopchart";
var target = false;
function doSearch(){
    console.log($("#search_form").serialize());
    $.ajax({
        type: "post",
        url: ctx+"/findByCondition",
        data: $("#search_form").serialize(),
        dataType: "json",
        success: function (response) {
            drawTable(response);
        },
        error: function (XMLHttpRequest, textStatus, errorThrown){
            location.href = ctx;
        }
    });
}
function resetTarget(){
    target = true;
    $("#operator").val(0);
}
function changTarget(){
    console.log("店铺发生了改变");
    target = true;
    $("#operator").val(0);
}
function searchOperators(){
    if (!target){
        return;
    }
    var shopNo = $("#shopName").val();
    if(shopNo==0){
        var htmlData = "<option value=\"0\">所有员工</option>";
        $("#operator").html(htmlData);
        return;
    }
    $.ajax({
        type: "post",
        url: "/employee/find/findByCondition",
        data: {
            "department" : shopNo
        },
        dataType: "json",
        success: function (form) {
            console.log("success");
            console.log(form);
            if (form.resultCode==200){
                var result = form.result;
                var htmlData = "<option value=\"0\">所有员工</option>";
                for(var i =0;i<result.length;i++){
                    htmlData +="<option value=\""+result[i].eid+"\">"+result[i].name+"</option>";
                }
                $("#operator").html(htmlData);
                target = false;
            }
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
            t += "<tr class = \"bodyTr\">";
            t += "<td>";
            t += data[i].shop;
            t += "</td>";
            t += "<td>";
            t += data[i].barcode;
            t += "</td>";
            t += "<td>";
            t += data[i].commodity;
            t += "</td>";
            t += "<td>";
            t += data[i].operator;
            t += "</td>";
            t += "<td>";
            t += data[i].number;
            t += "</td>";
            t += "<td>";
            t += data[i].time;
            t += "</td>";
            t += "<td>";
            t += data[i].totalPrice;
            t += "</td>";
            t += "</tr>";
        }
        tbody.html(t);
    }else {
        var tbody = $("#tbody");
        var t = "<tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td></tr>";
        tbody.html(t);
    }
}