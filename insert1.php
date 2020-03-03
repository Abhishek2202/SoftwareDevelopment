<?php

	$con = mysqli_connect('127.0.0.1', 'wikiuser', 'jagratisharma');

	if(!$con)
	{
		echo 'Not Connected to server';
	}

	if(!mysqli_select_db($con, 'media_wiki'))
	{
		echo 'Databse not selected';
	}


	$Name = $_POST['username'];
	$Course = $_POST['course'];
	$Num = $_POST['number'];


	$sql = "INSERT INTO Course_Data (Name,Course,Num) VALUES ('$Name','$Course','$Num')";

	if(!mysqli_query($con,$sql))
	{
		echo 'Not Inserted';
	}

	else
	{
		echo 'Inserted';
	}		

	header("refresh:1; url=index1.html");

?>	