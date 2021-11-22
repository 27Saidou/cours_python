class ThisExample {
    // declare variables
    int x;
    int y;

    ThisExample(int x, int y) {
        // assign values of variables inside constructor
        this.x = x;
        this.y = y;

        // value of x and y before calling add()
        System.out.println("Before passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);

        // call the add() method passing this as argument
        add(this);

        // value of x and y after calling add()
        System.out.println("After passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);
    }

    void add(ThisExample o) {
        o.x += 2;
        o.y += 2;
    }
    public static void main(String[] args) {
        ThisExample obj=new ThisExample(1,-2);
        System.out.println(obj.toString());
        Teste object = new Teste(10, 20);
        object.display();

        // creation d'un acteur
        Actor ad1 = new Actor("Diallo","Alfa");
        ad1.afficher_info_acteur();

        Alfa t1 = new Alfa();
        t1.display();

    }
}

class Teste {
    int a;
    int b;

    // Parameterized constructor
    Teste(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display()
    {
        //afficher tout les variables
        System.out.println("a = " + a + "  b = " + b);
    }
}

class Actor {
    String lastName;
    String firstName;

    public Actor(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
    public void afficher_info_acteur(){
        System.out.println("lastName est :"+this.lastName);
        System.out.println("firstName est:"+this.firstName);
    }
}

class Alfa {

    void display() {
        // calling function show()
        this.show();

        System.out.println("Engineer java");
    }

    void show() {
        System.out.println("Engineer Python");
    }
}


