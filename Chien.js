class Chien {
    Constructor(nom, age, race) {
        this.nom = nom;
        this.age = age;
        this.race = race;
    }
    describe(){
        console.log('I am ${this.nom} and ${this.age} years old ${this.race}');
    }
}
let monChien=new Chien("Pam",15,"jeff");
monChien.describe();