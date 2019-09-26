<?php
/**
 * Définition de MyClass
 */
class MyClass
{

    
    function printHello()
    {
         
    }
}



/**
 * Définition de MyClass2
 */
class MyClass2 extends MyClass
{
    // On peut redéclarer les propriétés publics ou protégés, mais pas ceux privés
    public  $public = 'Public2';
    protected $protected = 'Protected2';
   

    function printHello()
    {
      parent::printHello();
        echo $this->public;
        echo $this->protected;
       
   }
}

$obj2 = new MyClass2();
echo $obj2->public; // Fonctionne

$obj2->printHello(); // Affiche Public2, Protected2 et Undefined (Indéfini)

?>