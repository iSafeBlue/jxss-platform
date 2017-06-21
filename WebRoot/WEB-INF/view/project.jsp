<!doctype html>
<html>

<head>
	<jsp:include page="head.jsp"></jsp:include>
   	<title>Project</title>
</head>
	
	<script src="assets/js/jquery.min.js"></script>
	<script type="text/javascript">
		$(function(){
				$(".view").click(function(){
					location.href="Project/Content.x?pid="+$(this).val();
				});
		
				$(".delete").click(function(){
						var pid = $(this).val();
						$.post(
							"Project/Delete.x",
							{pid:pid},
							function(msg){
								if(msg){
									alert("删除成功");
								}else{
									alert("越权操作,删除失败");
								}
								location.reload();
							},
							"json"
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
			<jsp:include page="project_body.jsp"></jsp:include>
	
		</div>
			
			
			
	<script src="assets/js/echarts.min.js"></script>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/amazeui.min.js"></script>
    <script src="assets/js/iscroll.js"></script>
    <script src="assets/js/app.js"></script>
	</body>

</html>