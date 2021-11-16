let arr = ['Spring boot', 'angular', 'react'];
console.log("arr", arr);



let array = new Array();
array[0] = "Java";
array[1] = "PHP";
array[2] = "angular"
array[3] = "react";
array.push("Java");
array.pop();
console.log("arr", array);

let maVoiture = new Object();
maVoiture.fabricant = "Ford";
maVoiture.modele = "Mustang";
maVoiture.annee = 1969;
console.log(maVoiture.fabricant);


function Voiture(fabricant, modele, annee) {
    this.fabricant = fabricant;
    this.modele = modele;
    this.annee = annee;
}
let voiture1 = new Voiture("Eagle", "Talon TSi", 1993);
console.log(voiture1);

function Personne(nom, age, sexe) {
    this.nom = nom;
    this.age = age;
    this.sexe = sexe;
}
let max = new Personne("Max Gun", 33, "M");
let morgan = new Personne("Morgan Sousbrouille", 39, "M");

const responsable = {
    nom: "Jean",
    age: 27,
    poste: "Ingenieur logiciel"
};

const stagiaire = {
    nom: "Ben",
    age: 21,
    poste: "Stagiaire ingenieur logiciel"
};

function direBonjour() {
    console.log('Bonjour, mon nom est', this.nom)
};

responsable.direBonjour = direBonjour;
stagiaire.direBonjour = direBonjour;

responsable.direBonjour(); // Bonjour, mon nom est John'
stagiaire.direBonjour(); // Bonjour, mon nom est Ben'

const array1 = ['Java', 'Python', 'PHP'];
console.log('array1:', array1);
// expected output: "array1:" Array ["one", "two", "three"]

const reversed = array1.reverse();
console.log('reversed:', reversed);