public class figuras_geometricas {
    public static void main(String args[]){
        for(int i = 0; i<5; i++ ){
            System.out.println("*****");
        }
            System.out.println("==========================================");
        for(int i = 0; i<6; i++ ){
            for(int j = 0; j < i; j++){
            System.out.print("*");
            }
            System.out.println("\n");
            }
            System.out.println("==========================================");
        for(int i = 4; i>=0; i-- ){
            for(int j = 0; j < i+1; j++){
            System.out.print("*");
            }
            System.out.println("\n");
            }
    }

}
