<!DOCTYPE html>
<#include "../tag/header.ftl">
<body>
<link rel="stylesheet" href="../static/css/distribute.css">
<script src="../static/js/distribute.js"></script>
<#include "../tag/head.ftl">

<div class="mainBox">
    <div class="controllerView">
        <div class="contanier">
            <div class="row">
                <form action="##" onsubmit="return false" id="search-form">
                    <div class="col-xs-3">
                        <div class="input">调出库</div>
                        <select class="form-control" name="fromNo" id="fromNo">
                            <option value="0"></option>
                            <#if departmentList??>
                                <#list departmentList as department>
                                    <#if department.fatherNo?? && department.fatherNo == 1002>
                                        <option value="${department.no}">${department.name}</option>
                                    </#if>
                                </#list>
                            </#if>
                        </select>
                    </div>
                    <div class="col-xs-3">
                        <div class="input">调入库</div>
                        <select class="form-control" name="destinNo" id="destinNo">
                            <option value="0"></option>
                            <#if departmentList??>
                                <#list departmentList as department>
                                    <#if (department.no>=1004)>
                                        <option value="${department.no}">${department.name}</option>
                                    </#if>
                                </#list>
                            </#if>
                        </select>
                    </div>
                    <div class="col-xs-3">
                        <div class="input">时间</div>
                        <input type="date" name="date" class="form-control">
                    </div>
                    <div class="col-xs-1">
                        <button class="btn btn-primary" onclick="dosearch()">搜索</button>
                    </div>
                    <div class="col-xs-1">
                        <input class="btn btn-warning" type="reset" value="重置"
                               style="width: 120px; margin-top: 18px;">
                    </div>
                </form>
                <div class="col-xs-1">
                    <button class="btn btn-info" onclick="showAddView()">添加</button>
                </div>
                <div class="col-xs-12" style="height: 30px"></div>

            </div>
        </div>
        <div class="tableView">
            <table class="table">
                <thead>
                <tr class="head">
                    <td>单号</td>
                    <td>调出库</td>
                    <td>调入库</td>
                    <td>操作人</td>
                    <td>时间</td>
                    <td>是否审核</td>
                </tr>
                <tbody id="searchTbody">
                </tbody>
                </thead>
            </table>
        </div>
    </div>
</div>
<div class="selectDepartBackground">
    <div class="selectDepart">
        <div class="container">
            <div class="row">
                <div class="col-xs-6">
                    <div class="input">调出库</div>
                    <select class="form-control" name="fromNo" id="selectFromNo">
                        <option value="0"></option>
                        <#if departmentList??>
                            <#list departmentList as department>
                                <#if department.fatherNo?? && department.fatherNo == 1002>
                                    <option value="${department.no}">${department.name}</option>
                                </#if>
                            </#list>
                        </#if>
                    </select>
                </div>
                <div class="col-xs-6">
                    <div class="input">调入库</div>
                    <select class="form-control" name="destinNo" id="selectDestinNo">
                        <option value="0"></option>
                        <#if departmentList??>
                            <#list departmentList as department>
                                <#if (department.no>=1004)>
                                    <option value="${department.no}">${department.name}</option>
                                </#if>
                            </#list>
                        </#if>
                    </select>
                </div>
                <div class="row" style="margin-top:150px;">
                    <div class="col-xs-6">
                        <button class="btn btn-primary" onclick="makesure()">确认</button>
                    </div>
                    <div class="col-xs-6">
                        <button class="btn btn-danger" onclick="cancel()">取消</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="addViewBackground">
    <div class="addView">
        <div class="controllerbar">
            <button id="closeBtn" onclick="closeAddView()" style="float: right;"><span
                        class="glyphicon glyphicon-remove" style="color: rgb(13, 116, 252)"></span></button>
        </div>
        <div class="addbox">
            <div class="container">
                <div class="row">
                    <div class="col-xs-3">
                        <div class="input">调出库</div>
                        <input type="text" class="form-control" id="addFromNo" disabled>
                    </div>
                    <div class="col-xs-3">
                        <div class="input">调入库</div>
                        <input type="text" class="form-control" id="addDestinNo" disabled>
                    </div>
                    <form action="##" onsubmit="return false" id="add-form">

                        <div class="col-xs-3">
                            <div class="input">条码号</div>
                            <select class="form-control" name="barcode" id="addBarcode">
                                <option value="0"></option>
                            </select>
                        </div>
                        <div class="col-xs-3">
                            <div class="input">数量</div>
                            <input type="number" name="number" id="number" class="form-control">
                        </div>
                        <div class="col-xs-1">
                            <button onclick="addTable()" class="btn btn-primary">添加</button>
                        </div>
                        <div class="col-xs-1">
                            <input type="reset" value="重置" class="btn btn-warning"
                                   style="width: 120px; margin-top: 18px;">
                        </div>
                        <div class="col-xs-1">
                            <input type="button" onclick="sumbitTable()" value="提交" class="btn btn-warning"
                                   style="width: 120px; margin-top: 18px;">
                        </div>
                    </form>
                </div>
            </div>

            <table class="table">
                <thead>
                <tr class="head">
                    <td>调出库</td>
                    <td>调入库</td>
                    <td>条码号</td>
                    <td>数量</td>
                </tr>
                </thead>
                <tbody id = "addTbody">
                </tbody>
            </table>
        </div>
    </div>
</div>
<div class="detailViewBackground">
    <div class="detailView">
        <div class="controllerbar">
            <button id="closeBtn" onclick="closeDetailView()" style="float: right;"><span
                        class="glyphicon glyphicon-remove" style="color: rgb(13, 116, 252)"></span></button>
        </div>
        <div class="titleDiv">调货单</div>
        <table class="table">
            <thead>
            <tr class="head">
                <td>条码号</td>
                <td>数量</td>
            </tr>
            </thead>
            <tbody id="detailTbody">

            </tbody>
        </table>
    </div>
</div>
</body>