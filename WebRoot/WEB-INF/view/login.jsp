<!doctype html>
<html>

<head>
    <title>Login</title>
	<jsp:include page="head.jsp"></jsp:include>
</head>

<body data-type="login">

  <div class="am-g myapp-login">
	<div class="myapp-login-logo-block  tpl-login-max">
		<div class="myapp-login-logo-text">
			<div class="myapp-login-logo-text">
				JXSS Platform<span> Login</span> <i class="am-icon-skyatlas"></i>
				
			</div>
		</div>

		<div class="login-font">
			<i>Log In </i> or <span> <a href="User/Register.x">Sign Up</a></span>
		</div>
		<div class="am-u-sm-10 login-am-center">
			<form class="am-form" action="User/LoginCheck.x" method="post">
				<fieldset>
					<div class="am-form-group">
						<input type="text" name="username" class="" id="doc-ipt-username-1" placeholder="输入账号">
					</div>
					<div class="am-form-group">
						<input type="password" name="password" class="" id="doc-ipt-pwd-1" placeholder="输入密码">
					</div>
					<p><button type="submit" class="am-btn am-btn-default">登录</button></p>
				</fieldset>
			</form>
		</div>
	</div>
</div>

  <script src="assets/js/jquery.min.js"></script>
  <script src="assets/js/amazeui.min.js"></script>
  <script src="assets/js/app.js"></script>
</body>

</html>