<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar bg-primary " data-bs-theme="dark" >
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Simples Bank</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="balance">Balance Inquiry</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            More
          </a>
          <ul class="dropdown-menu">
            <li><a class="dropdown-item" href="createUserButton" >New User</a></li>
            <li><a class="dropdown-item" href="deposit">Deposit</a></li>
            <li><a class="dropdown-item" href="withdrawal">Withdrawal</a></li>
            <li><hr class="dropdown-divider"></li>
            <li><a class="dropdown-item" href="changepin">Change Password</a></li>
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled">simply simples</a>
        </li>
      </ul>
    </div>
  </div>
</nav>

<nav class="navbar bg-dark" data-bs-theme="dark"></nav>

<div id="carouselExampleSlidesOnly" class="carousel slide" data-bs-ride="carousel">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="https://img.freepik.com/free-psd/flat-design-discount-banner-template_23-2149397071.jpg?w=1380&t=st=1674920075~exp=1674920675~hmac=83c89e090b8b1c7ccf0d7cedc5b7817d8a278a30e272df686edbc83d42e4a17e"  height=250 class="d-block w-100 " alt="...">
    </div>
    <div class="carousel-item">
      <img src="https://img.freepik.com/free-vector/geometric-sale-banners_23-2148121345.jpg?w=740&t=st=1674920101~exp=1674920701~hmac=2e5f19e5348d97893bc08f54d49fde340b2b6c02529408c7ba71b9673604557f"  height=250 class="d-block w-100" alt="...">
    </div>
    <div class="carousel-item">
      <img src="https://img.freepik.com/premium-vector/bank-office-interior-professional-banking-service-finance-manager-clients-credit-deposit-consult-management-vector-concept_176411-627.jpg?w=1380" height=250 class="d-block w-100" alt="...">
    </div>
  </div>
</div>

<nav class="navbar" style="background-color: #e3f2fd;"></nav>


<div style="background-color:rgb(9, 117, 255; padding: 100px 0px 100px 0px;">
<div style="max-width:80rem; margin-left:8%;">
<div class="row row-cols-1 row-cols-md-2 g-4">
  <div class="col">
    <div class="card">
      <img src="https://www.incnow.com/wp-content/uploads/2016/08/Open-a-Bank-Account-1024x749.jpg" height=150  class="card-img-top " alt="...">
      <div class="card-body">
        <a  href="createUserButton" link="black"><h5 class="card-title">Open Account</h5> </a>
        <p class="card-text">Enter Adhaar and Pan details and get your Account Number instantly .</p>
      </div>
    </div>
  </div>
  
  <div class="col w-40">
    <div class="card">
      <img src="https://th.bing.com/th/id/R.8edc76780deb345b4b61339b12ec47ee?rik=cx0W9aRYwnyXQg&riu=http%3a%2f%2fwww.thebluediamondgallery.com%2fwooden-tile%2fimages%2fdeposit.jpg&ehk=XFdeNUSZltfZXnNrGDqEv%2bhfwEdYQ0KQm62bu0UplaA%3d&risl=&pid=ImgRaw&r=0" height=150 class="card-img-top" alt="...">
      <div class="card-body">
        <a href="deposit" ><h5 class="card-title">Deposit</h5></a>
        <p class="card-text">Deposit your money in your account via your password </p>
      </div>
    </div>
  </div>
  <div class="col">
    <div class="card">
      <img src="https://cdn.pixabay.com/photo/2016/04/04/06/11/euro-1306189_960_720.jpg" height=150 class="card-img-top" alt="...">
      <div class="card-body">
        <a href="withdrawal"><h5 class="card-title">Withdrawal Money</h5></a>
        <p class="card-text">Cash in tour hand .</p>
      </div>
    </div>
  </div>
  <div class="col">
    <div class="card">
      <img src="https://cdn.pixabay.com/photo/2016/08/13/09/43/data-1590455_960_720.jpg" height=150 class="card-img-top" alt="...">
      <div class="card-body">
        <a href="changepin"><h5 class="card-title">Change Password</h5></a>
        <p class="card-text">Change your password your password frequently and beware from online frauds.</p>
      </div>
    </div>
  </div>
</div>
</div>
</div>
</body>
</html>