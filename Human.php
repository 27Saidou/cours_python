<?php

class Human
{
    // public property name
    public $name;

    // public function walk
    public function walk()
    {
        echo $this->name . " is walking...<br/>";
    }

    // public function see
    public function see()
    {
        echo $this->name . " is seeing...<br/>";
    }
}

// child class
class Male extends Human
{
    // No code in child
}

// child class
class Female extends Human
{
    // No code in child
}

$male=new Male();
$male->name="Massodu";
$female=new Female();
$female->name="ismatou";
$female->walk();
$male->see();