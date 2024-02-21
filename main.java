public class main {
    public static void main(String args[]){
        int a=10;
        char b='S';
        double c=3.14;
        String d="Pipoca";

        if(a==10){
            System.out.println(a);
        }
        if(b!='S'){
            System.out.println(b);
        }
        if(c<4){
            System.out.println(c);
        }
        if("Pipoca".equals(d)){
            System.out.println(d);
        }
        else{
            System.out.println("O nome não é pipoca");
        }
    }
}
