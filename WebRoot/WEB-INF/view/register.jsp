<!doctype html>
<html>

<head>
    <title>Register</title>
	<jsp:include page="head.jsp"></jsp:include>
	<script src="assets/js/jquery.min.js"></script>
</head>
	<script type="text/javascript">
			$(function(){
				
				$("button").click(function(){
				var username = $("#doc-ipt-username-1").val();
				var email = $("#doc-ipt-email-1").val();
				var password = $("#password").val();
				var code = $("#doc-ipt-code-1").val();
				
						$.post(
						"User/RegisterCheck.x",
						{
							"password":password,
							"email":email,
							"username":username,
							"code":code
						},
						function(msg){
							if(msg){
								location.href="User/Login.x";
							}else{
								alert("输入有误");
								location.reload();
							}
						}
						);
				});
				
			});
	</script>
<body data-type="login">

  <div class="am-g myapp-login">
	<div class="myapp-login-logo-block  tpl-login-max">
		<div class="myapp-login-logo-text">
			<div class="myapp-login-logo-text">
				JXSS Platform<span> Register</span> <i class="am-icon-skyatlas"></i>
				
			</div>
		</div>

		<div class="login-font">
			<span> <a href="User/Login.x">Log In</a></span> or <i>Sign Up</i>
		</div>
		<div class="am-u-sm-10 login-am-center">
<form class="am-form">
				<fieldset>
					<div class="am-form-group">
						<input type="text" name="code" class="" id="doc-ipt-code-1" placeholder="请输入激活码">
					</div>
					<div class="am-form-group">
						<input type="text" name="username" class="" id="doc-ipt-username-1" placeholder="请输入用户名">
					</div>
					<div class="am-form-group">
						<input type="email" name="email" class="" id="doc-ipt-email-1" placeholder="请输入邮箱">
					</div>
					<div class="am-form-group">
						<input type="password" name="password" id="password" placeholder="请输入密码">
					</div>
					<p><button type="button" class="am-btn am-btn-default">注册</button></p>
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