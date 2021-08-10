<!DOCTYPE html>
<#include "../tag/header.ftl">
<body>
<link rel="stylesheet" href="../static/css/shop.css">
<script src="../static/js/shop.js"></script>
<#include "../tag/head.ftl">

<div class="mainbox">
    <div class="tablebox">
        <div class="searchcontainer">
            <div class="container">
                <div class="row">
                    <form id="search_form" onsubmit="return false" action="##" method="post">
                        <div class="col-xs-3">
                            <div class="input">店铺名</div>
                            <select class="form-control" name="shopNo" id="shopName" onchange="changTarget()">
                                <option value="0">全部门店</option>
                                <#if shops??>
                                    <#list shops as shop>
                                        <#if shop.fatherNo?? && shop.fatherNo == 1001 >
                                            <option value="${shop.no}">${shop.name}</option>
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
                            <div class="input">经手人</div>
                            <select class="form-control" name="operator" id="operator" onclick="searchOperators()">
                                <option value="0"></option>

                            </select>
                        </div>
                        <div class="col-xs-3">
                            <div class="input">日期</div>
                            <input class="form-control" type="date" name = "date">

                        </div>
                        <div class="col-xs-1">
                            <input type="submit" onclick="doSearch()" class="btn btn-primary"
                                   style="width: 120px; margin-top: 27px;"value="搜索">
                        </div>
                        <div class="col-xs-1">
                            <input type="reset" class="btn btn-warning" onclick="resetTarget()"
                                   style="width: 120px; margin-top: 27px;" value="重置">
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <table class="table">
            <thead>
            <tr class="head">
                <td>店铺名</td>
                <td>条码号</td>
                <td>商品名</td>
                <td>经手人</td>
                <td>数量</td>
                <td>时间</td>
                <td>销售额</td>
            </tr>
            </thead>
            <tbody id="tbody">

            </tbody>
        </table>
    </div>
</div>

</body>