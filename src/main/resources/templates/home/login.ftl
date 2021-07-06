<!DOCTYPE html>
<html lang="en">
    <#include "../tag/header.ftl">
    <link rel="stylesheet" href="../static/css/login.css">
    <title>登录库存管理系统</title>
    <script src="http://www.gongjuji.net/Content/files/jquery.md5.js"></script>
    <script>
        function doSubmitPwd(){
            var data = $("#password").val();
            console.log(data);
            var md5Data = $.md5(data);
            console.log(md5Data);
            $("#password").val(md5Data);
            var newdata = $("#password").val();
            console.log(newdata);
            return true;
        }
    </script>
    <body>
    <div class="background">
        <div class="wrap">
            <form method="POST" onsubmit="return doSubmitPwd()" action="/loginning">
            <ul>
                <li><div style="text-align: center; margin-top: 10px; font-size: 20px;" >商店库存管理系统</div></li>
                <li>
                    <div><input class="form-control" placeholder="账号" type="text" name = "username"></div>

                </li>
                <li>
                    <div><input class="form-control" placeholder="密码" type="password" name="password" id="password"></div>
                </li>
                <li style="text-align: right;margin-top: 5px ;"><a href="#">忘记密码</a></li>
                <li>
                    <div style="text-align: center;">
                        <input type="submit" value="登录" id="submitBtn" class="btn btn-primary" style="margin-top: 15px;">
                    </div>
                </li>
            </ul>
            </form>
        </div>
    </div>
    </body>
</html>