<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="description" content="Fashi Template">
<meta name="keywords" content="Fashi, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>My Hanh Shop</title>
<script src="/TTTN_DA/js/jquery-3.3.1.min.js"></script> 
<!-- Google Font -->
<link
	href="https://fonts.googleapis.com/css?family=Muli:300,400,500,600,700,800,900&display=swap"
	rel="stylesheet">

<!-- Css Styles -->
<link rel="stylesheet" href="/TTTN_DA/css/bootstrap.min.css" type="text/css">

<link rel="stylesheet" href="/TTTN_DA/css/font-awesome.min.css"
	type="text/css">
<link rel="stylesheet" href="/TTTN_DA/css/themify-icons.css" type="text/css">
<link rel="stylesheet" href="/TTTN_DA/css/elegant-icons.css" type="text/css">
<link rel="stylesheet" href="/TTTN_DA/css/owl.carousel.min.css"
	type="text/css">
<link rel="stylesheet" href="/TTTN_DA/css/nice-select.css" type="text/css">
<link rel="stylesheet" href="/TTTN_DA/css/jquery-ui.min.css" type="text/css">
<link rel="stylesheet" href="/TTTN_DA/css/slicknav.min.css" type="text/css">
<link rel="stylesheet" href="/TTTN_DA/css/style.css" type="text/css">
</head>

<body>
	<!-- Page Preloder -->
	<div id="preloder">
		<div class="loader"></div>
	</div>

	<!-- Header Section Begin -->
	<header class="header-section">
		<div class="header-top">
			<div class="container">
				<div class="ht-left">
					<div class="mail-service">
						<i class=" fa fa-envelope"></i> myhanhshop@gmail.com
					</div>
					<div class="phone-service">
						<i class=" fa fa-phone"></i> 0979773222
					</div>
				</div>
				<div class="ht-right">
					<a href="/TTTN_DA/login/" class="login-panel"><i class="fa fa-user"></i>Đăng Nhập</a>
					<div class="lan-selector">
						<select class="language_drop" name="countries" id="countries"
							style="width: 300px;">
							<option value='yt' data-image="/TTTN_DA/img/vn.jpg"
								data-imagecss="flag yt" data-title="English">Vi</option>
							<option value='yu' data-image="/TTTN_DA/img/flag-1.jpg"
								data-imagecss="flag yu" data-title="Bangladesh">Us
							</option>
						</select>
					</div>
					<div class="top-social">
						<a href="#"><i class="ti-facebook"></i></a> <a href="#"><i
							class="ti-twitter-alt"></i></a> <a href="#"><i
							class="ti-linkedin"></i></a> <a href="#"><i class="ti-pinterest"></i></a>
					</div>
				</div>
			</div>
		</div>
		<div class="container">
			<div class="inner-header">
				<div class="row">
					<div class="col-lg-2 col-md-2">
						<div class="logo">
							<a href="/TTTN_DA/"> <img src="/TTTN_DA/img/logo.png" alt="">
							</a>
						</div>
					</div>
					<div class="col-lg-7 col-md-7">
						<div class="advanced-search">
							<button type="button" class="category-btn">Tìm kiếm Loại
								</button>
							<div class="input-group">
								<input type="text" placeholder="Bạn cần tìm gì?">
								<button type="button">
									<i class="ti-search"></i>
								</button>
							</div>
						</div>
					</div>
					<div class="col-lg-3 text-right col-md-3">
						<ul class="nav-right">
							<li class="heart-icon"><a href="#"> <i
									class="icon_heart_alt"></i> <span>1</span>
							</a></li>
							<li class="cart-icon"><a href="#"> <i
									class="icon_bag_alt"></i> <span>3</span>
							</a>
								<div class="cart-hover">
									<div class="select-items">
										<table>
											<tbody>
												<tr>
													<td class="si-pic"><img
														src="/TTTN_DA/img/select-product-1.jpg" alt=""></td>
													<td class="si-text">
														<div class="product-selected">
															<p>$60.00 x 1</p>
															<h6>Kabino Bedside Table</h6>
														</div>
													</td>
													<td class="si-close"><i class="ti-close"></i></td>
												</tr>
												<tr>
													<td class="si-pic"><img
														src="/TTTN_DA/img/select-product-2.jpg" alt=""></td>
													<td class="si-text">
														<div class="product-selected">
															<p>$60.00 x 1</p>
															<h6>Kabino Bedside Table</h6>
														</div>
													</td>
													<td class="si-close"><i class="ti-close"></i></td>
												</tr>
											</tbody>
										</table>
									</div>
									<div class="select-total">
										<span>total:</span>
										<h5>$120.00</h5>
									</div>
									<div class="select-button">
										<a href="#" class="primary-btn view-card">VIEW CARD</a> <a
											href="#" class="primary-btn checkout-btn">CHECK OUT</a>
									</div>
								</div></li>
							<li class="cart-price">$120.00</li>
						</ul>
					</div>
				</div>
			</div>
		</div>
		<div class="nav-item">
			<div class="container">
				<div class="nav-depart">
					<div class="depart-btn">
						<i class="ti-menu"></i> <span>Các mẫu</span>
						<ul class="depart-hover">
							<li class="active"><a href="#">Thời Trang Phụ Nữ</a></li>
							<li><a href="#">Thời Trang Nam</a></li>
							<li><a href="#">Thời Trang Trẻ Em</a></li>
							<li><a href="#">Thời Trang Thể Thao</a></li>
							
						</ul>
					</div>
				</div>
				<nav class="nav-menu mobile-menu">
					<ul>
						<li ><a href="/TTTN_DA/">Trang chủ</a></li>
						<li><a href="/TTTN_DA/shop/">Cửa Hàng</a></li>
					
						<li><a href="/TTTN_DA/blog/">Blog</a></li>
						<li><a href="/TTTN_DA/contact/">Liên Hệ</a></li>
						<li><a href="/TTTN_DA/followProduct/">Theo Dõi đơn hàng</a></li>
						
					</ul>
				</nav>
				<div id="mobile-menu-wrap"></div>
			</div>
		</div>
	</header>
	<!-- Header End -->