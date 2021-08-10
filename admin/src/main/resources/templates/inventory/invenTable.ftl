<!DOCTYPE html>
<#include "../tag/header.ftl">
<body>
<link rel="stylesheet" href="../static/css/inventory.css">
<script src="../static/js/inventory.js"></script>
<#include "../tag/head.ftl">



<div class="mainbox">
    <div class="titlebox">
        <div class="container">
            <div class="row">
                <form id="search_form" onsubmit="return false" action="##" method="post">
                    <div class="col-xs-2">
                        <div class="input">条码号</div>
                        <input type="text" class="form-control input" name="barcode" placeholder="条码">
                    </div>
                    <div class="col-xs-2">
                        <div class="input">货品名</div>
                        <input type="text" class="form-control" name="name" placeholder="名称">
                    </div>
                    <div class="col-xs-2">
                        <div class="input">商品类型</div>
                        <select class="form-control" name="type_no">
                            <option value="0">所有类型</option>
                            <#if typeList??>
                                <#list typeList as type>
                                    <option value="${type.no}">${type.name}</option>
                                </#list>
                            </#if>
                        </select>
                    </div>
                    <div class="col-xs-2">
                        <div class="input" >供货商</div>
                        <select class="form-control" name="supplier_no">
                            <option value="0">所有供货商</option>
                            <#if supplierList??>
                                <#list supplierList as supplier>
                                    <option value="${supplier.sno}">${supplier.name}</option>
                                </#list>
                            </#if>
                        </select>
                    </div>
                    <div class="col-xs-2">
                        <div class="input" >仓库或门店</div>
                        <select class="form-control" name="department_no">
                            <option value="0">所有仓库门店</option>
                            <#if departmentList??>
                                <#list departmentList as department>
                                    <#if (department.no>=1004)>
                                        <option value="${department.no}">${department.name}</option>
                                    </#if>
                                </#list>
                            </#if>
                        </select>
                    </div>
                    <div class="col-xs-1">
                        <input type="submit" class="btn btn-primary " onclick="doSearch()" style="width: 120px; margin-top: 27px;" value="搜索">
                    </div>
                    <div class="col-xs-1">
                        <input type="reset" class="btn btn-info" style="width: 120px; margin-top: 27px; margin-left: 30px;" value="重置">
                    </div>
                </form>

            </div>
        </div>
    </div>
    <div class="tablebox">
        <table class="table">
            <thead>
            <tr class="head">
                <td>编号</td>
                <td>商品名</td>
                <td>材料</td>
                <td>颜色</td>
                <td>类型</td>
                <td>供货商</td>
                <td>条码号</td>
                <td>进货价</td>
                <td>售价</td>
                <td>数量</td>
            </tr>
            </thead>
            <tbody id="tbody"></tbody>
        </table>
    </div>
</div>

</body>
