/**
 * Example_Pgcd
 */
package cours_python;
public class Example_Pgcd {

    public static void main(String[] args) {
        System.out.println(PGCD(15, 21));
    }
    // cette methode permet de chercher le PGCD de deux nombres
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