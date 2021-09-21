<?php 
class Utilisateur{
    private  $user_name;
    private $user_password;

    public function __construct($n,$p){
        $this->user_name =$n;
        $this->user_password =$p;
    }
    public function __destruct(){
        // code ici
    }
    public function getName(){
        return $this->user_name;
    }
}
$a=new Utilisateur('Ismatou bah','abcdef');
$ismatou=new Utilisateur('Rama',123456);
echo $a->getName().'<br/>'; 
echo $ismatou->getName().'<br/>';