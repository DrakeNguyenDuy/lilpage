<%@include file="/common/lib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Startup - Startup Website Template</title>
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<meta content="Free HTML Templates" name="keywords">
<meta content="Free HTML Templates" name="description">

<!-- Favicon -->
<link href="<c:url value="/templates/web/img/favicon.ico"/>" rel="icon">

<!-- Google Web Fonts -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Nunito:wght@400;600;700;800&family=Rubik:wght@400;500;600;700&display=swap"
	rel="stylesheet">

<!-- Icon Font Stylesheet -->
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.1/font/bootstrap-icons.css"
	rel="stylesheet">

<!-- Libraries Stylesheet -->
<link
	href="<c:url value='/templates/web/lib/owlcarousel/assets/owl.carousel.min.css'/>"
	rel="stylesheet">
<link href="<c:url value="/templates/web/lib/animate/animate.min.css"/>"
	rel="stylesheet">

<!-- Customized Bootstrap Stylesheet -->
<link href="<c:url value="/templates/web/css/bootstrap.min.css"/>"
	rel="stylesheet">

<!-- Template Stylesheet -->
<link href="<c:url value="/templates/web/css/style.css"/>"
	rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
	<%@include file="/common/web/header.jsp"%>
	<!-- Full Screen Search Start -->
	<div class="modal fade" id="searchModal" tabindex="-1">
		<div class="modal-dialog modal-fullscreen">
			<div class="modal-content" style="background: rgba(9, 30, 62, .7);">
				<div class="modal-header border-0">
					<button type="button" class="btn bg-white btn-close"
						data-bs-dismiss="modal" aria-label="Close"></button>
				</div>
				<div
					class="modal-body d-flex align-items-center justify-content-center">
					<div class="input-group" style="max-width: 600px;">
						<input type="text"
							class="form-control bg-transparent border-primary p-3"
							placeholder="Type search keyword">
						<button class="btn btn-primary px-4">
							<i class="bi bi-search"></i>
						</button>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Full Screen Search End -->
	<dec:body></dec:body>
	<%@include file="/common/web/vendor.jsp"%>
	<%@include file="/common/web/footer.jsp"%>

	<!-- JavaScript Libraries -->
	<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/js/bootstrap.bundle.min.js"></script>
	<script src="<c:url value="/templates/web/lib/wow/wow.min.js"/>"></script>
	<script src="<c:url value="/templates/web/lib/easing/easing.min.js"/>"></script>
	<script
		src="<c:url value="/templates/web/lib/waypoints/waypoints.min.js"/>"></script>
	<script
		src="<c:url value="/templates/web/lib/counterup/counterup.min.js"/>"></script>
	<script
		src="<c:url value="/templates/web/lib/owlcarousel/owl.carousel.min.js"/>"></script>

	<!-- Template Javascript -->
	<script src="<c:url value="/templates/web/js/main.js"/>"></script>
</body>
</html>