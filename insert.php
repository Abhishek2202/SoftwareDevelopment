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
	$Email = $_POST['email'];
	$University = $_POST['university'];


	$sql = "INSERT INTO Personal_Data (Name,Email,University) VALUES ('$Name','$Email','$University')";

	if(!mysqli_query($con,$sql))
	{
		echo 'Not Inserted';
	}

	else
	{
		echo 'Inserted';
	}		

	header("refresh:2; url=index.html");

?>	