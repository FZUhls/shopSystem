<!DOCTYPE html>
<#include "../tag/header.ftl">
<body>
<#include "../tag/head.ftl">

<script src="../static/js/commodity.js"></script>

<link rel="stylesheet" href="../static/css/commodity.css">

<div class="mainbox">
    <div class="searchcontainer">
        <div class="container">
            <div class="row">
                <form id="search_form" onsubmit="return false" action="##" method="post">
                    <div class="col-xs-2">
                        <div class="input">条码号</div>
                        <input type="text" class="form-control input" name="barcode" placeholder="条码">
                    </div>
                    <div class="col-xs-2">
                        <div class="input">商品名</div>
                        <input type="text" class="form-control input" name="name" placeholder="名称">
                    </div>
                    <div class="col-xs-2">
                        <div class="input">商品类型</div>
                        <select class="form-control" name="tno">
                            <option value="0">所有类型</option>
<#--                            todo 增加类型-->
                            <#if types?? >
                                <#list types as type>
                                    <option value="${type.no}">${type.name}</option>
                                </#list>
                            </#if>
                        </select>
                    </div>
                    <div class="col-xs-2">
                        <div class="input">供货商</div>
                        <select class="form-control" name="sno">
                            <option value="0">所有供货商</option>
<#--                            todo 添加供货商-->
                            <#if suppliers?? >
                                <#list suppliers as supplier>
                                    <option value="${supplier.sno}">${supplier.name}</option>
                                </#list>
                            </#if>
                        </select>

                    </div>
                    <div class="col-xs-1">
                        <input type="submit" class="btn btn-primary" onclick="doSearch()" style="width: 120px; margin-top: 27px;"
                               value="搜索">
                    </div>
                    <div class="col-xs-1">
                        <input type="reset" class="btn btn-warning"
                               style="width: 120px; margin-top: 27px;" value="重置">
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
                <td>编号</td>
                <td>商品名</td>
                <td>材料</td>
                <td>颜色</td>
                <td>类型</td>
                <td>供货商</td>
                <td>条码号</td>
                <td>进货价</td>
                <td>售价</td>
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
                            <div class="input">条码号</div>
                            <input type="text" class="form-control input" name="barcode" placeholder="条码">
                        </div>
                        <div class="col-xs-3">
                            <div class="input">商品名</div>
                            <input type="text" class="form-control input" name="name" placeholder="商品名">
                        </div>
                        <div class="col-xs-3">
                            <div class="input">颜色</div>
                            <select class="form-control" name="cno">
                                <#if colors?? >
                                    <#list colors as color>
                                        <option value="${color.cno}">${color.name}</option>
                                    </#list>
                                </#if>
                            </select>
                        </div>

                        <div class="col-xs-3">
                            <div class="input">商品类型</div>
                            <select class="form-control" name="tno">
                                <#if types?? >
                                    <#list types as type>
                                        <option value="${type.no}">${type.name}</option>
                                    </#list>
                                </#if>
                            </select>
                        </div>
                        <div class="col-xs-12" style="height: 25px;"></div>
                        <div class="col-xs-3">
                            <div class="input">材料</div>
                            <select name="mno" class="form-control">
                                <#if materials??>
                                    <#list materials as material>
                                        <option value="${material.mno}">${material.name}</option>
                                    </#list>
                                </#if>
                            </select>
                        </div>
                        <div class="col-xs-3">
                            <div class="input">供货商</div>
                            <select name="sno" class="form-control">
                                <#if suppliers?? >
                                    <#list suppliers as supplier>
                                        <option value="${supplier.sno}">${supplier.name}</option>
                                    </#list>
                                </#if>
                            </select>
                        </div>
                        <div class="col-xs-3">
                            <div class="input">进货价</div>
                            <input type="number" class="form-control input" name="costPrice" placeholder="进货价" value="0">
                        </div>
                        <div class="col-xs-3">
                            <div class="input">出售价</div>
                            <input type="number" class="form-control input" name="sellPrice" placeholder="出售价" value="0">
                        </div>


                </div>
            </div>
        </div>
        <div class="submitBtnView">
            <button onClick="sendFn()" id="btn" class="btn btn-primary">
                提交
            </button>
        </div>


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

</body>
