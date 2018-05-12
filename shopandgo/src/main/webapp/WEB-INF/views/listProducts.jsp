<div class="container">
	<div class="row">
		<div class="col-md-3">
			<%@include file="./shared/sidebar.jsp" %>
		</div>
		<div class="col-md-9">
			<div class="row">
				<div class="col-lg-12">
					<c:if test="${userAllProducts == true}">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item active">All Products</li>
						</ol>
					</c:if>
					<c:if test="${userCategoryProducts == true}">
						<ol class="breadcrumb">
							<li class="breadcrumb-item"><a href="${contextRoot}/home">Home</a></li>
							<li class="breadcrumb-item active">Category</li>
							<li class="breadcrumb-item active">${category.name}</li>
						</ol>
					</c:if>
				</div>
			</div>
		</div>
	</div>
</div>