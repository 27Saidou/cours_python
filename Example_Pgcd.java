/**
 * Example_Pgcd
 */
public class Example_Pgcd {

    public static void main(String[] args) {
        System.out.println(PGCD(15, 21));
    }
    public static int PGCD(int a ,int b){
        if (a==b) {
            return a;
        }else{
            if(a>b){
                return PGCD(a-b,b);
            }else{
                return PGCD(a,b-a);
            }
        }
    }
}