public class TabChaine {
    public static  String []aMethode(){
        String tabchaine[]={"TDSI","NIIT"};
        for (int i = 0; i < tabchaine.length; i++) {
            System.out.println(tabchaine[i]);
        }
        return tabchaine;
    }
    public static void main(String[] args) {
    int i=50;
    String intstr=String.valueOf(i);
    System.out.println(intstr);
    String str="3521";
    int n=Integer.parseInt(str);
    System.out.println(n);
    TabChaine.aMethode();
    }
}
