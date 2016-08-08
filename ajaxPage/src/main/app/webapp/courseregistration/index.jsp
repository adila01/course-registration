<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <head>
                <title>Course Registration</title>
                <meta charset="utf-8" />
        </head>
        <body>
                <h1>Course Registration</h1>

				<img src="img/header.png" alt="Header" />

				<!-- Success or Failure Messages -->
                <div id="success" style="background: green; display: none">SUCCESS</div>
                <div id="failure" style="background: red; display: none">FAILURE</div>
				<!-- End of Success or Failure Messages -->

				<!-- Course Registration Form -->
                <form id="course-registration" action="http://sci-campusapi.cloudhub.io/api/campus/prospect" method="POST">
                        First name: <input id="first-name" type="text" placeholder="John">
                        <br>
                        Last name: <input id="last-name" type="text" placeholder="Smith">
                        <br>
                        Phone number: <input id="phone-number" type="tel" placeholder="1234567890">
                        <br>
                        Email Address: <input id="email" type="email" placeholder="john.smith@unknown.com">
                        <br>
                        Subject/Course:
                                <select id="subject-course" name="subjectcourse">
                                  <option>Computer Science</option>
                                  <option>Electrical Engineering</option>
                                  <option>Geology</option>
                                  <option>Humanities</option>
                                  <option>Philosophy</option>
                                </select>
                        <br>
                        <input type="checkbox" name="agreement"> I agree that I may potentially receive text messages
                        <br>
                        <button>Submit</button>
                </form>
				<!-- End of Course Registration Form -->
				
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"></script>
                <script language="javascript" type="text/javascript">
                        $("#course-registration").submit(function(e)
                        {
                                var url = $(this).attr("action");
                                var json = {
										      "firstname": $("#first-name").val(),
										      "lastname": $("#last-name").val(),
										      "phonenumber": $("#phone-number").val(),
										      "email": $("#email").val(),
										      "subjectcourse": $("#subject-course option:selected").text()
                                	};
								var jsonString = JSON.stringify(json);
                                
                                $.ajax({
                                        url: url,
                                        type: 'POST',
                                        data:  jsonString,
                                        dataType: 'json',
                                        contentType: 'application/json',
                                        success: function(data, textStatus, jqXHR)
                                        {
                                                $("#course-registration").hide();
                                                $("#success").show();
                                        },
                                        error: function(jqXHR, textStatus, errorThrown) 
                                        {
                                                $("#course-registration").hide();
                                                $("#failure").show();
                                        }          
                                });
                                e.preventDefault();
                        });
                </script>
        </body>
</html>
