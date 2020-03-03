<!DOCTYPE html>
<html>
<head>
<title>Table with database</title>
<style>
table {
border-collapse: collapse;
width: 100%;
color: #588c7e;
font-family: monospace;
font-size: 25px;
text-align: left;
}
th {
background-color: #588c7e;
color: white;
}
tr:nth-child(even) {background-color: #f2f2f2}
</style>
</head>
<body>
<table>
<tr>
<th>Id</th>
<th>Username</th>
<th>Password</th>
</tr>
<?php
$conn = mysqli_connect("localhost", "media_wiki", "jagratisharma", "wikiuser");
// Check connection
if ($conn->connect_error) {
die("Connection failed: " . $conn->connect_error);
}
$sql = "SELECT ID, Name,Course, Num  FROM Course_Data";
$result = $conn->query($sql);

if ($result -> num_rows > 0) {
// output data of each row
while($row = $result -> fetch_assoc()) {
echo "<tr><td>" . $row["ID"]. "</td><td>" . $row["Name"] . "</td><td>"
. $row["Course"]. "</td></tr>" . $row["Num"]. "</td></tr>";
}
echo "</table>";
} else { echo "0 results"; }
$conn->close();
?>
</table>
</body>
</html>