<?php


// Déclaration d'un tableau vide
$fruits = array();

// Déclaration d'un tableau indexé numériquement
$legumes = array('carotte', 'poivron', 'aubergine', 'chou');

// Déclaration d'un tableau associatif
$identite = array(

    'nom' => 'Bah',
    'prenom' => 'Ramatoulaye',
    'age' => 19,
    'estEtudiant' => true
);
// Affichage des valeurs du tableau associatif
echo 'Nom : ', $identite['nom'], '<br/>';
echo 'Prenom : ', $identite['prenom'], '<br/>';
echo 'Age : ', $identite['age'], ' ans<br/>';