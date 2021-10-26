<?php
require_once("car.php");
require_once("uberX.php");
require_once("uberPool.php");
require_once("uberVan.php");
require_once("account.php");

$uberX = new UberX("CVB123", new Account("Andres Sanchez", "123456ty"), "Chevrolet", "Spark");
$uberX->setPassenger(4);
$uberX-> printDataCar();

$uberPool = new UberPool("PFF591", new Account("Andrea Roberta", "123656ty"), "Chevrolet", "Spark");
$uberPool->setPassenger(4);
$uberPool-> printDataCar();

$uberVan = new UberVan("OJL395", new Account("Raúl Ramírez", "AND456"), "Nissan", "Versa");
$uberVan->setPassenger(6);
$uberVan->printDataCar();
?>