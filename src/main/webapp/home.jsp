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
<!--DELETE and PUT operation in REST-->
<!--to do a delete operation,there should be a mapping in server side thus we go to the controller to add that-->

