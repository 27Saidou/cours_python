<?php
class box{
    private $name="test";

    public function printHello(){
        echo  $this->name;
    }
}

class ban extends box{
    public function printHello()
    {
        parent::printHello();
    }
}

$obj=new ban();
$obj->printHello();
