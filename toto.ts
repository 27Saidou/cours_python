/**
 * class parent
 */
class Animal {

    name:string;
    constructor(name:string){
        this.name=name;
    }
}


/**
 * class child
 */
class Lion extends Animal { // class Lion herite de Animal

    sex: string; // attribut

    constructor(name: string, sex: string) { // contructeur  
        super(name); // call constructeur de la class mère  
        this.sex = sex;
    }

    shout(): string { // une methode  
        return "Rooooaarrr!"
    }
}

//instanciation
var myLion = new Lion('pablo', 'female');

//call d'un methode
console.log(myLion.shout());