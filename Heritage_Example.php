<?php
class Heritage_Example{
    public $name;

    // public method
    public function drive()
    {
        echo "Vehicle class drive method...<br/>";
    }

}

class Car extends Heritage_Example
{

    public function drive()
    {
        echo "Car class drive method...<br/>";
    }
}
$car = new Car();
$car->name = "Mercedes benz";

// calling child class method
$car->drive();

?>