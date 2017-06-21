<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="tpl-content-wrapper">
	<div class="tpl-content-page-title">项目列表</div>
	<ol class="am-breadcrumb">
		<li><a href="#" class="am-icon-home">首页</a>
		</li>
		<li class="am-active">项目列表</li>
	</ol>
	<div class="tpl-portlet-components">
		<div class="portlet-title">
			<div class="caption font-green bold">
				<span class="am-icon-code"></span> 列表
			</div>
			


		</div>
		<div class="tpl-block">
			<div class="am-g">
				<div class="am-u-sm-12 am-u-md-6">
					<div class="am-btn-toolbar">
						<div class="am-btn-group am-btn-group-xs">
							<button type="button"
								class="am-btn am-btn-default am-btn-success"
								onclick="location.href='Project/Add.x'">
								<span class="am-icon-plus"></span> 新增
							</button>
							
						</div>
					</div>
				</div>


			</div>
			<div class="am-g">
				<div class="am-u-sm-12">
					<form class="am-form">
						<table class="am-table am-table-striped am-table-hover table-main">
							<thead>
								<tr>
									
									<th class="table-id">编号</th>
									<th class="table-title" style="width: 15%">标题</th>
									<th class="table-author am-hide-sm-only" style="width: 40%">项目简介</th>
									<th class="table-date am-hide-sm-only" style="width: 20%">创建日期</th>
									<th class="table-set" style="width: 20%">操作</th>
								</tr>
							</thead>
							<tbody>
								
								<c:forEach items="${projectList }" var="project">
								
									<tr>
									
									<td>${project.pid }</td>
									<td><a href="#">${project.pname }</a>
									</td>
									<td class="am-hide-sm-only">${project.pdescription }</td>
									<td class="am-hide-sm-only">${project.createdate }</td>
									<td>
										<div class="am-btn-toolbar">
											<div class="am-btn-group am-btn-group-xs">
												<button
													value="${project.pid }"
													type="button"
													class="am-btn am-btn-default am-btn-xs am-text-secondary view">
													<span class="am-icon-pencil-square-o"></span> 查看
												</button>
												<button
													value="${project.pid }"
													type="button"
													class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only delete">
													<span class="am-icon-trash-o"></span> 删除
												</button>
											</div>
										</div></td>
								</tr>
								
								</c:forEach>

							</tbody>
						</table>
						
						<hr>

					</form>
				</div>

			</div>
		</div>
		<div class="tpl-alert"></div>
	</div>










</div>