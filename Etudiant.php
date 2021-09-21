<?php
class Etudiant
{ 
    private $firstname;
    private $gender;
    public function getFirstName()
    {
        return $this->firstname;
    }

    public function setFirstName($firstname)
    {
        $this->firstname = $firstname;
        echo ("First_name est modifier " . $firstname);
        echo ("<br>");
    }

    public function getGender()
    {
        return $this->gender;
    }

    public function setGender($gender)
    {
        if ('Male' !== $gender and 'Female' !== $gender) {
            echo ('Definissez le sexe sur Masculin ou Feminin pour le sexe');
        }

        $this->gender = $gender;
        echo ("Le sexe est défini sur " . $gender);
        echo ("<br>");
    }
}
$etudiant =new Etudiant();
$etudiant->setFirstName("massoud"); 
$etudiant->setGender("masculin");