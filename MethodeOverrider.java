class Programmer {
    public void code() {
        System.out.println("Coding in C++");
    }
}

class JavaProgrammer extends Programmer {
    public void code() {
        System.out.println("Coding in Java");
    }
}
public class MethodeOverrider {
    public static void main(String[] args) {
        Programmer ben = new JavaProgrammer();
        ben.code();
    }
}
