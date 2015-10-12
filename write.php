<?php


$myfile = fopen("C:/wamp/www/assignment1/akram.txt", "w") or die("Unable to open file!");

$txt = "\r\nName		:Muhammad Akram Bin Ahmad  \r\n";
fwrite($myfile, $txt);

$txt = "Matrix No	:2014873252 \r\n";
fwrite($myfile, $txt);

$txt = "Gender		:Male \r\n";
fwrite($myfile, $txt);

$txt = "Age		:24 \r\n";
fwrite($myfile, $txt);

$txt = "E-mails		:akram_ahmad2020@yahoo.com \r\n";
fwrite($myfile, $txt);

$txt = "Mobile No	:017-5209042 \r\n";
fwrite($myfile, $txt);

echo "\r\n----- akram's file has been created with the appropriate data -----";

fclose($myfile);


?>