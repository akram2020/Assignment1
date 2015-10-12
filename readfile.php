<?php

$myfile = fopen("C:/wamp/www/assignment1/akram.txt", "r") or die("Unable to open file!");
echo fread($myfile,filesize("akram.txt"));

fclose($myfile);

?>