<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

    <!--now we add a form to be putting my values-->
    <!--
    <form action="addAlien">
        <input type="text" name="aid"><br>
        <input type="text" name="aname"><br>
        <input type="text" name="tech"><br>
        <input type="submit"><br>
    </form>
    -->

    <!--now we are going to fetch the alien based on the aid-->
    <!--thus we create a form and a controller for that-->

        <form action="getAlien">
            <input type="text" name="aid"><br>
            <input type="submit"><br>
        </form>


</body>
</html>

<!---->
<!--getting information not provided by human needs other ways of getting it, thats where we use web services to get info in XML and JSON format-->
<!--best way to implement web service is rest-->
<!--instead of having http://localhost:8080/getAlien?aid=101, what makes more sense is http://localhost:8080/alien/102 because it looks like you are accessing  resource-->
<!--http://localhost:8080/resource you want to get/ inner resource-->
<!--what we need to change is the mapping in Controller-->