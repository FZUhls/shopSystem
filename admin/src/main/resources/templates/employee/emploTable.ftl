<!DOCTYPE html>
<#include "../tag/header.ftl">
<body>
<link rel="stylesheet" href="../static/css/employee.css">
<script src="../static/js/employee.js"></script>
<#include "../tag/head.ftl">


<div class="mainbox">
    <div class="searchcontainer">
        <div class="container">
            <div class="row">
                <form id="search_form" onsubmit="return false" action="##" method="post">
                    <div class="col-xs-2">
                        <div class="input">工号</div>
                        <input type="number" class="form-control input" name="eid" placeholder="工号">
                    </div>
                    <div class="col-xs-2">
                        <div class="input">姓名</div>
                        <input type="text" class="form-control input" name="name" placeholder="姓名">
                    </div>
                    <div class="col-xs-2">
                        <div class="input">工种</div>
                        <select class="form-control" name="type">
                            <option value="0">所有工种</option>
                            <#if workTypes??>
                                <#list workTypes as workType>
                                    <option value="${workType.no}">${workType.name}</option>
                                </#list>
                            </#if>
                        </select>
                    </div>
                    <div class="col-xs-2">
                        <div class="input">部门</div>
                        <select class="form-control" name="department">
                            <option value="0">所有部门</option>
                            <#if departments??>
                                <#list departments as department>
                                    <option value="${department.no}">${department.name}</option>
                                </#list>
                            </#if>
                        </select>

                    </div>
                    <div class="col-xs-1">
                        <input type="submit" onclick="doSearch()" class="btn btn-primary" style="width: 120px; margin-top: 27px;" value="搜索">
                    </div>
                    <div class="col-xs-1">
                        <input type="reset" class="btn btn-warning" style="width: 120px; margin-top: 27px;" value="重置">
                    </div>
                </form>
                <div class="col-xs-1">
                    <button class="btn btn-info" onclick="showAddView()" style="width: 120px; margin-top: 27px;">添加</button>
                </div>
                <div class="col-xs-1">
                    <button class="btn btn-danger" id="removeBtn" onclick="showDeleteBtn()" style="width: 120px; margin-top: 27px;">删除</button>
                </div>
            </div>
        </div>
    </div>
    <div class="tablebox">
        <table class="table">
            <thead>
            <tr class="head">
                <td>工号</td>
                <td>姓名</td>
                <td>性别</td>
                <td>婚否</td>
                <td>身份证号</td>
                <td>生日</td>
                <td>政治面貌</td>
                <td>教育程度</td>
                <td>入职时间</td>
                <td>部门</td>
                <td>工种</td>
                <td>工资</td>
            </tr>
            </thead>
            <tbody id="tbody">
            </tbody>
        </table>
    </div>
</div>
<div class="addViewbackground">

    <div class="addView">
        <div class="controllerbar">
            <button id="closeBtn" onclick="closeAddView()" style="float: right;"><span class="glyphicon glyphicon-remove" style="color: rgb(13, 116, 252)"></span></button>
        </div>
        <div id="form">
            <div class="container">
                <div class="row">
                    <form action="##" onsubmit="return false" method="POST" id="insertForm">
                        <div class="col-xs-3">
                            <div class="input">姓名</div>
                            <input type="text" class="form-control input" name="name" placeholder="姓名">
                        </div>
                        <div class="col-xs-3">
                            <div class="input">性别</div>
                            <select name="sex" class="form-control">
                                <option value=""></option>
                                <option value="男">男</option>
                                <option value="女">女</option>
                            </select>
                        </div>
                        <div class="col-xs-3">
                            <div class="input">身份证号</div>
                            <input type="number" class="form-control" name="idCard" placeholder="身份证号">
                        </div>
                        <div class="col-xs-3">
                            <div class="input">出生日期</div>
                            <input type="date" class="form-control" name="birthday" placeholder="出生日期">
                        </div>
                        <div class="col-xs-12"></div>
                        <div class="col-xs-3">
                            <div class="input">婚姻状况</div>
                            <select name="ismarried" class="form-control">
                                <option value=""></option>
                                <option value="0">未婚</option>
                                <option value="1">已婚</option>
                            </select>
                        </div>

                        <div class="col-xs-3">
                            <div class="input">政治面貌</div>
                            <select name="politicsStatus" class="form-control">
                                <option value=""></option>
                                <option value="群众">群众</option>
                                <option value="共青团员">共青团员</option>
                                <option value="党员">党员</option>
                            </select>
                        </div>
                        <div class="col-xs-3">
                            <div class="input">教育程度</div>
                            <select name="educationStatus" class="form-control">
                                <option value=""></option>
                                <option value="primary">小学</option>
                                <option value="medium">中学或职高</option>
                                <option value="high">高中</option>
                                <option value="undergraduate">本科</option>
                                <option value="master">硕士</option>
                                <option value="doctor">博士</option>
                            </select>
                        </div>
                        <div class="col-xs-3">
                            <div class="input">工种</div>
                            <select class="form-control" name="workTypeNo">
                                <option value="0"></option>
                                <#if workTypes??>
                                    <#list workTypes as workType>
                                        <option value="${workType.no}">${workType.name}</option>
                                    </#list>
                                </#if>
                            </select>
                        </div>
                            <div class="col-xs-12"></div>
                        <div class="col-xs-3">
                            <div class="input">部门</div>
                            <select name="departmentNo" class="form-control">
                                <option value="0"></option>
                                <#if departments??>
                                    <#list departments as department>
                                        <option value="${department.no}">${department.name}</option>
                                    </#list>
                                </#if>
                            </select>
                        </div>
                        <div class="col-xs-3">
                            <div class="input">加入时间</div>
                            <input type="date" class="form-control" name="joinTime">
                        </div>
                        <div class="col-xs-3">
                            <div class="input">工资</div>
                            <input type="number" class="form-control input" name="salary" placeholder="工资" value="0">
                        </div>
                        <div class="col-xs-3"></div>
                        <div class="col-xs-12">
                            <div class="input">备注</div>
                            <textarea type="text" class="form-control input" name="notes" placeholder="备注" maxlength="255" style="resize:none; height: 100px;"></textarea>
                        </div>
                </div>
            </div>
        </div>

        <button onClick="sendFn()" class="btn btn-primary" id="btn" style="width: 120px;">
            提交
        </button>
        <input type="reset" onclick="reset()" class="btn btn-warning" style="margin-left: 50px; width: 120px;">
        </form>
    </div>
</div>

<div class="deleteAlertView">
    <div class="deleteView">
        <p style="font-size: 25px; margin-top: 20px;"><strong>是否确认删除</strong></p>
        <div id= "deleteConfirmView">
            <div>
                <button class="btn btn-primary" onclick="confirmDelete()" style="float: left; width: 120px;">确认</button>
                <button class="btn btn-danger" onclick="cancelDelete()" style="float: right; width: 120px;">取消</button>
            </div>
        </div>
    </div>
</div>