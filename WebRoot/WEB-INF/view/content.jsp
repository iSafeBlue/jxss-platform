<!doctype html>
<html>

<head>
	<jsp:include page="head.jsp"></jsp:include>
   	<title>Content</title>
</head>
	
	<script src="assets/js/jquery.min.js"></script>
	<script type="text/javascript">
		$(function(){
				
				$(".delete").click(function(){
						var id = $(this).val();
						$.post(
							"Project/DeleteContent.x",
							{pid:<%=request.getParameter("pid")%>,
							  cid:id},
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
	
			<!-- Menu -->
			<jsp:include page="menu.jsp"></jsp:include>
	      	<!-- Body -->
			<jsp:include page="content_body.jsp"></jsp:include>
	
		</div>
			
			
			
	<script src="assets/js/echarts.min.js"></script>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/amazeui.min.js"></script>
    <script src="assets/js/iscroll.js"></script>
    <script src="assets/js/app.js"></script>
	</body>

</html>