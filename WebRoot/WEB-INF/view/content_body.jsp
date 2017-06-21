<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<div class="tpl-content-wrapper">
	<div class="tpl-content-page-title">内容列表</div>
	<ol class="am-breadcrumb">
		<li><a href="#" class="am-icon-home">首页</a>
		</li>
		<li class="am-active">内容列表</li>
	</ol>

	<div class="tpl-content-scope">
		<div class="note note-info">
			<h3>
				使用方式 <span class="close" data-close="note"></span>
			</h3>
			<p>
				<span class="label label-danger">提示:</span> &lt;script src="<%=basePath%>i.x?pid=<%=Integer.parseInt(request.getParameter("pid"))%>"&gt;&lt;/script&gt;
			</p>
		</div>
	</div>


	<div class="tpl-portlet-components">
		<div class="portlet-title">
			<div class="caption font-green bold">
				<span class="am-icon-code"></span> 内容列表
			</div>
			


		</div>
		<div class="tpl-block">
			<div class="am-g">
				<div class="am-u-sm-12 am-u-md-6">
					<div class="am-btn-toolbar">
						<div class="am-btn-group am-btn-group-xs">
							<!-- button -->
							
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
									<th class="table-check"><input class="tpl-table-fz-check"
										type="checkbox">
									</th>
									<th class="table-id">编号</th>
									<th class="table-author am-hide-sm-only">地址</th>
									<th class="table-date am-hide-sm-only">内容</th>
									<th class="table-date am-hide-sm-only">时间</th>
									<th class="table-set">操作</th>
								</tr>
							</thead>
							<tbody>
								
								<c:forEach items="${contentList }" var="content">
								
									<tr>
									<td><input type="checkbox">
									</td>
									<td>${content.cid }</td>
									<td><a href="#">${content.location }</a>
									</td>
									<td class="am-hide-sm-only">${content.content }</td>
									<td class="am-hide-sm-only">${content.date }</td>
									<td>
										<div class="am-btn-toolbar">
											<div class="am-btn-group am-btn-group-xs">
												
												<button
													value="${content.cid }"
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
						<div class="am-cf">

							<div class="am-fr">
								<ul class="am-pagination tpl-pagination">
									<%String pid = request.getParameter("pid"); %>
									<li ><a href="Project/Content.x?pid=<%=pid%>&page=${ppage}">«</a>
									</li>
									<%
									int tpage = (Integer) request.getAttribute("tpage");
									for(int num = 1 ; num<=tpage ; num++){
									%>
									<li><a href="Project/Content.x?pid=<%=pid%>&page=<%=num %>"><%=num %></a>
									</li>
									<%} %>
									<li><a href="Project/Content.x?pid=<%=pid%>&page=${npage}">»</a>
									</li>
								</ul>
							</div>
						</div>
						<hr>

					</form>
				</div>

			</div>
		</div>
		<div class="tpl-alert"></div>
	</div>










</div>