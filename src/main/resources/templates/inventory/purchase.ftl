<!DOCTYPE html>
<#include "../tag/header.ftl">
<body>
<link rel="stylesheet" href="../static/css/purchase.css">
<script src="../static/js/purchase.js"></script>
<#include "../tag/head.ftl">
<div class="mainbox">
    <div class="tablebox">
        <div class="searchcontainer">
            <div class="container">
                <div class="row">
                    <form id="add_form" onsubmit="return false" action="##" method="post">
                    <div class="col-xs-3">
                        <div class="input">仓库</div>
                        <select class="form-control" name="warehouseNo" id="warehouse">
                            <option value="0"></option>
                            <#if warehouses??>
                                <#list warehouses as warehouse>
                                    <#if warehouse.fatherNo?? && warehouse.fatherNo == 1002 >
                                        <option value="${warehouse.no}">${warehouse.name}</option>
                                    </#if>>
                                </#list>
                            </#if>
                        </select>
                    </div>
                    <div class="col-xs-3">
                        <div class="input">条码号</div>
                        <input type="text" class="form-control input" name="barcode" placeholder="条码号">
                    </div>
                    <div class="col-xs-3">
                        <div class="input">数量</div>
                        <input type="number" class="form-control input" name="number" placeholder="数量">
                    </div>
                    <div class="col-xs-1">
                        <input type="submit" onclick="doAdd()" class="btn btn-primary"
                               style="width: 120px; margin-top: 27px;"value="添加">
                    </div>
                    <div class="col-xs-1">
                        <input type="reset" class="btn btn-warning" onclick="resetTarget()"
                               style="width: 120px; margin-top: 27px;" value="重置">
                    </div>
                    <div class="col-xs-1">
                        <button onclick="submitPur()" class="btn btn-success" style="width: 120px; margin-top: 27px;">提交</button>
                    </div>
                    </form>
                </div>
            </div>
        </div>
        <table class="table">
            <thead>
            <tr class="head">
                <td>仓库号</td>
                <td>仓库</td>
                <td>条码号</td>
                <td>数量</td>
            </tr>
            </thead>
            <tbody id="tbody">

            </tbody>
        </table>
    </div>
</div>