<?php
require_once("car.php");
require_once("uberX.php");
require_once("uberPool.php");
require_once("account.php");

$uberX = new UberX("CVB123", new Account("Andres Sanchez", "123456ty"), "Chevrolet", "Spark");
$uberX-> printDataCar();

$uberPool = new UberPool("PFF591", new Account("Andrea Roberta", "123656ty"), "Chevrolet", "Spark");
$uberPool-> printDataCar();
?>