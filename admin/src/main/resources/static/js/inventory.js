
var ctx = "/inventory"
function drawTable(form){
        if(form.resultCode == 200){
            console.log(form.resultMsg);
            console.log(form.result);
            var data = form.result;
            console.log(data.length);
            var tbody = $("#tbody");
            var t = "";
            for(var i=0;i<data.length;i++){
                t += "<tr>";
                t += "<td>";
                t += data[i].cno;
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
                t += data[i].commodityType;
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
                t += "<td>";
                t += data[i].number;
                t += "</td>";
                t += "</tr>";
            }
            tbody.html(t);
        }else {
            var tbody = $("#tbody");
            var t = "<tr><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td></tr>";
            tbody.html(t);
        }
}

$(function(){
    $.ajax({
        type: "get",
        url: ctx+"/findAll",
        data: "",
        dataType: "json",
        success: function (form) {
            drawTable(form);
        },
        error: function (XMLHttpRequest, textStatus, errorThrown){
            location.href = ctx;
        }
    });
})
//按条件查询
function doSearch(){
    $.ajax({
        type: "post",
        url: ctx+"/findByCondition",
        data: $('#search_form').serialize(),
        dataType: "json",
        success: function (response) {
            drawTable(response);
        },
        error: function (XMLHttpRequest, textStatus, errorThrown){
            location.href = ctx;
        }
    });
}