<script src = "../static/js/head.js"></script>
<script src="../static/js/jquery/jquery.validate.min.js"></script>
<script src="../static/js/jquery/jquery.js"></script>
<script src="../static/js/jquery/messages_zh.js"></script>
<link rel="stylesheet" href="../static/css/head.css">
<div class="head">
    <div class="logo">
        <img src="../static/img/erp.jpeg" alt="nofound">
        <span class="title">商品库存管理系统</span>
    </div>
    <div class="userinfo">
                <span>
                    当前操作用户：
                </span><span>XXX</span>
    </div>
</div><div class="menu">
    <ul style="margin-left: 40px;">
        <li class="xlist unfocus">
            <a href="#">商品管理</a>
            <ul class="level2menu">
                <li class="ylist">
                    <a href="/commodity">商品查询</a>
                </li>
                <li class="ylist">
                    <a href="#">供货商查询</a>
                </li>
                <li class="ylist">
                    <a href="#">商品属性</a>
                </li>
            </ul>
        </li>
        <li class="xlist unfocus" >
            <a href="#">库存管理</a>
            <ul class="level2menu">
                <li class="ylist">
                    <a href="/inventory">库存查询</a>
                </li>
                <li class="ylist">
                    <a href="/purchase">进货表单</a>
                </li>
                <#--<li class="ylist">
                    <a href="#">退货表单</a>
                </li>-->
                <li class="ylist last">
                    <a href="/distribute">商品分发</a>
                </li>
            </ul>
        </li>

        <li class="xlist unfocus">
            <a href="#">职员管理</a>
            <ul class="level2menu">
                <li class="ylist last">
                    <a href="/employee">职员基本信息</a>
                </li>
            </ul>
        </li>
        <li class="xlist unfocus">
            <a href="#">零售管理</a>
            <ul class="level2menu">
                <li class="ylist"><a href="/shopchart">门店报表</a></li>
                <li class="ylist last"><a href="#">门店基本信息</a></li>
            </ul>
        </li>
        <#--<li class="xlist unfocus">
            <a href="#">财务报表</a>
            <ul class="level2menu">
                <li class="ylist"><a href="#">收支统计</a></li>
                <li class="ylist last"><a href="#">开支记录</a></li>
            </ul>
        </li>-->
    </ul>
</div>
