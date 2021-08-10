var ctx = "purchase";
var array = new Array();
var index = 1;
function doAdd(){
    $("#add_form").validate({
        rules: {
            warehouseNo: {
                required: true,
                min: 1004
            },
            barcode: {
                required: true
            },
            number: {
                required: true,
                min: 1
            }
        },
        messages: {
            warehouseNo: "请选择仓库",
            barcode: "请输入条码",
            number: "请输入个数"
        }
    })
    var b = $("#add_form").valid()
    if (!b){
        return;
    }
    var formdata = $("#add_form").serializeArray();
    var data = {};
    data["warehouseName"] = $("#warehouse").find("option:selected").text();
    $(formdata).each(function(index, obj){
        data[obj.name] = obj.value;
    });
    console.log(data.warehouseNo);
    console.log(data.warehouseName);
    console.log(data.barcode);
    console.log(data.number);

    addTable(data);
    array.push(data);
}
function submitPur(){
    if(array.length<=0){
        alert("请至少写入一条进货记录");
        return;
    }
    $.ajax({
        type: "post",
        url: ctx+"/submit",
        data: JSON.stringify(array),
        dataType: "json",
        contentType: 'application/json;charset=UTF-8',
        success: function (response) {
            if(response.resultCode==200){
                alert("进货成功!");
                array = [];
                $("#tbody").html("");
            }else{
                alert("进货失败");
            }
        }
    });
}
function addTable(data){
    var str = "<tr><td>"+data.warehouseNo+"</td>";
    str += "<td>"+data.warehouseName+"</td>";
    str += "<td>"+data.barcode+"</td>";
    str += "<td>"+data.number+"</td>";
    str += "<td class=\"deleteTd\" style=\"border: 0px;\"><button class=\"deleteBtn\"><span class=\"glyphicon glyphicon-remove\" style=\"color: red;\"></span></button></td></tr>"
    $("#tbody").append(str);
    $(".deleteBtn").unbind();
    $(".deleteBtn").click(function(){
        var index = $(this).parent().parent().index();
        // todo 记录查找这个tr的索引
        $(this).parent().parent().remove();
        array.splice(index,1);
    });

}
