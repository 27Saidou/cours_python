public class Data {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    static int factorial(int n) {
        if (n != 0) 
            return n * factorial(n - 1);
        else
            return 1;
    }

    public static void main(String[] args) {
        Data d=new Data();
        d.setName("Programmation java");
        System.out.println(d.getName());
        int number=4,result;
        result = factorial(number);
        System.out.println(number + " factorial = " + result);
    }
}
