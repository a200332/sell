<html>
<#include "../common/header.ftl">

<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <form role="form" method="get" action="/sell/seller/login">
                <div class="form-group">
                    <label>openid</label><input name="openid" type="text" class="form-control"/>
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">密码</label><input type="password" class="form-control"
                                                                        id="exampleInputPassword1"/>
                </div>
                <div class="checkbox">
                    <label><input type="checkbox"/>请勾选</label>
                </div>
                <button type="submit" class="btn btn-default">登录</button>
            </form>
        </div>
    </div>
</div>
</body>
</html>