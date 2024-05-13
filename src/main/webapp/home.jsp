<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>

    <!--now we add a form to be putting my values-->
    <form action="addAlien">
        <input type="text" name="aid"><br>
        <input type="text" name="aname"><br>
        <input type="text" name="tech"><br>
        <input type="submit"><br>
    </form>

    <!--now we are going to fetch the alien based on the aid-->
    <!--thus we create a form and a controller for that-->

        <form action="getAlien">
            <input type="text" name="aid"><br>
            <input type="submit"><br>
        </form>


</body>
</html>

<!---->
<!--why do we need a service layout? As a controller , we are always not sure if data is coming from database.Sometimes data comes from the network, user.Thus we need to process something, that processing is done in the service layout-->
<!--if data is coming from the repository then service layer will react with the repository-->
