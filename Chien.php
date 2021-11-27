<?php
class Chien
{
    private $nom;
    private $age;
    private $race;
    public function __construct($nom, $age, $race)
    {
        $this->nom = $nom;
        $this->age = $age;
        $this->race = $race;
    }
    public function __toString()
    {
        return "Nom: " . $this->nom . "- Age: " . $this->age . "- Race: " . $this->race;
    }
}
$c1 = new Chien("Pam", 15, "yorkshire");
$c2 = new Chien("Mina", 5, "Yorkshire");
$c3 = new Chien("Hok", 12, "Jack Roussel");
echo $c1;
echo"\n";
echo $c2;
echo "\n";
echo $c3;
?>