<!doctype html>
<html>

<head>
	<jsp:include page="head.jsp"></jsp:include>
   	<title>Invite</title>
</head>
	
	<script src="assets/js/jquery.min.js"></script>
	<script type="text/javascript">
		$(function(){
		
				$(".add").click(function(){
						$.post(
							"Admin/AdminInviteAdd.x",
							function(){
								location.reload();
							}
						);
				});
		});
	</script>
	<body data-type="index">
	
		<!-- Header -->
		<jsp:include page="header.jsp"></jsp:include>
		        
	    <div class="tpl-page-container tpl-page-header-fixed">
	
			
	      	<!-- Body -->
			<jsp:include page="invite_body.jsp"></jsp:include>
	
		</div>
			
			
			
	<script src="assets/js/echarts.min.js"></script>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/amazeui.min.js"></script>
    <script src="assets/js/iscroll.js"></script>
    <script src="assets/js/app.js"></script>
	</body>

</html>