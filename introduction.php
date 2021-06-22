<?php

class Employee
{
    public $prenom;
    public $nom;
    private $age;
    public function __construct($prenom, $nom, $age)
    {
        $this->prenom = $prenom;
        $this->nom = $nom;
        $this->setAge($age);
    }
    public function setAge($age)
    {
        if (is_int($age) && $age >= 1 && $age <= 120) {
            $this->age = $age;
        } else {
        throw new Exception("L'age doit etre un entier entre 1 et 120");
        }
    }
    public function Presentation()
    {
        var_dump("Bonjour, je suis $this->prenom $this->nom et j'ai $this->age ans");
    }
}
$employee1 = new Employee("Alpha", "Diallo", 32);
$employee1->Presentation();
