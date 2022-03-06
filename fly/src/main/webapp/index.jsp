<!DOCTYPE html>
<html>
<head>

    <title>FlyAway</title>
    <link rel = "shortcut icon"  href = "img/favicon.jpg" >
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/style/global.css">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Raleway">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        body,h1,h2,h3,h4,h5,h6 {font-family: "Raleway", sans-serif}
        body, html {
            height: 100%;
            line-height: 1.8;
        }
        .bgimg-1 {
            background-position: center;
            background-size: cover;
           
            min-height: 100%;
        }
        .w3-bar .w3-button {
            padding: 16px;
        }

        .footer {
            position: fixed;
            left: 0;
            bottom: 0;
            width: 100%;
            background-color: #f5f5f5;
            color: #3b3b3b;
            text-align: center;
        }
    </style>
</head>

<body background="img/flightss.jpg">
    <div class="w3-top">
        <div class="w3-bar w3-white w3-card" id="myNavbar">
            <a href="./index.jsp" class="w3-bar-item w3-button w3-wide"> </a>
            <div class="w3-right w3-hide-small">
        <a href="./login.jsp" class="w3-button w3-red"><i class="teal"></i>  Admin Signin </a>
            </div>
        </div>
    </div>
    <header class="bgimg-1 w3-display-container w3-grayscale-min" id="home">
        <br>
        <div class="w3-display-centre w3-text-white" style="padding:48px">
           
           
        </div>
        <div class="w3-display-left w3-text-white" style="padding:48px">
            <p><br><br><br><br><br><br><br><br><br><br><a href="./search-portal.jsp" class="w3-button w3-purple" > Search and Book </a><br><br>
         <a href="./login.jsp"class="w3-button w3-purple" > Admin signin</a>
        </div>
    </header>
   
</body>
</html>