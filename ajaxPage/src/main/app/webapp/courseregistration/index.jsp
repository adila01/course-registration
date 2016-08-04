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
                        First name: <input type="text" placeholder="John" id="first-name" name="firstname">
                        <br>
                        Last name: <input type="text" placeholder="Smith" id="last-name" name="lastname">
                        <br>
                        Phone number: <input type="tel" placeholder="123-456-7890" id="phone-number" name="phonenumber">
                        <br>
                        Subject/Course:
                                <select id="subject-course" name="subjectcourse">
                                  <option value="computerscience">Computer Science</option>
                                  <option value="electricalenginering">Electrical Engineering</option>
                                  <option value="geology">Geology</option>
                                  <option value="humanities">Humanities</option>
                                  <option value="philosophy">Philosophy</option>
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
