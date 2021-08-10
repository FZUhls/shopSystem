$(function(){
    $(".unfocus").mouseenter(function () {
        $(this).find("ul").show();
    });
    $(".unfocus").mouseleave(function () {
        $(this).find("ul").hide();
    });
});
// $(document).ajaxComplete(function(event,obj,settings){
//     if (obj.responseText == 'timeout') { //超时标识
//         location.href='/login'; //跳转到登录页面
//     }
// })