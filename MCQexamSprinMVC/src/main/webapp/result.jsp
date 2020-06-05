<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html >
<head>
<meta charset="ISO-8859-1">
<title>telusko: Result</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
<link rel="stylesheet" href="css/bootstrap.css">
<link rel="stylesheet" href="css/bootstrap.theme.css">
</head>
<body>
  <section id="about">
		<div class="container">
			<div class="row text-center">
			  <div class="row blue-box  blog-params">
				<div class="col-md-12 question">  
					<h3>Result Page</h3>
				</div>
			</div>
		</div>
		<br>
		 <center> 
		 <div class="col-md-12 text-center countdown-timer ct1">
		   <table class="table table-bordered">
		     <tr>
		       	 <td class="tg=b22t"><center>SCORE</center></td>
		          <td class="tg=b22t"><center>${result}</center></td>
		     </tr>
		     
		      <tr>
		       	 <td class="tg=b22t"><center>MAX SCORE</center></td>
		          <td class="tg=b22t"><center>5</center></td>
		     </tr>
		     
		      <tr>
		       	 <td class="tg=b22t"><center>PERSENTAGE</center></td>
		          <td class="tg=b22t"><center>${percent}%</center></td>
		     </tr>
		   </table>
		 </div>
		</center>
</body>
</html>