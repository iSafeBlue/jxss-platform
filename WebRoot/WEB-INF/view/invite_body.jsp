<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<div class="tpl-content-wrapper">
	<div class="tpl-content-page-title">邀请码</div>
	<ol class="am-breadcrumb">
		<li><a href="#" class="am-icon-home">首页</a>
		</li>
		<li class="am-active">邀请码</li>
	</ol>
	
<div class="tpl-portlet-components">
		<div class="portlet-title">
			<div class="caption font-green bold">
				<span class="am-icon-code"></span> 已使用的邀请码
			</div>
			


		</div>
		<div class="tpl-block">
			<div class="am-g">
				<div class="am-u-sm-12 am-u-md-6">
					<div class="am-btn-toolbar">
						<div class="am-btn-group am-btn-group-xs">
							<button type="button"
								class="am-btn am-btn-default am-btn-success add"
								>
								<span class="am-icon-plus"></span> 添加邀请码
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
									<th class="table-title" >邀请码</th>
									<th class="table-author am-hide-sm-only" style="width: 40%">是否使用</th>
									<th class="table-date am-hide-sm-only" style="width: 20%">创建日期</th>
								</tr>
							</thead>
							<tbody>
								
								<c:forEach items="${unusedInviteList }" var="invite">
								
									<tr>
									
									<td>${invite.id }</td>
									<td>${invite.invitecode }
									</td>
									<td class="am-hide-sm-only">未使用</td>
									<td class="am-hide-sm-only">${invite.credate }</td>
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

<div class="tpl-portlet-components">
		<div class="portlet-title">
			<div class="caption font-green bold">
				<span class="am-icon-code"></span> 未使用的邀请码
			</div>
			


		</div>
		<div class="tpl-block">
			<div class="am-g">
				<div class="am-u-sm-12 am-u-md-6">
					<div class="am-btn-toolbar">
						<div class="am-btn-group am-btn-group-xs">
							
							
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
									<th class="table-title" >邀请码</th>
									<th class="table-author am-hide-sm-only" style="width: 40%">是否使用</th>
									<th class="table-date am-hide-sm-only" style="width: 20%">创建日期</th>
								</tr>
							</thead>
							<tbody>
								
								<c:forEach items="${usedInviteList }" var="invite">
								
									<tr>
									
									<td>${invite.id }</td>
									<td>${invite.invitecode }
									</td>
									<td class="am-hide-sm-only">已使用</td>
									<td class="am-hide-sm-only">${invite.credate }</td>
									
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