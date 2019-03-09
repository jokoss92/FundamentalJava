public class NestedIf {
    public static void main (String[] args){
        int x = 11;
        if(x <= 10) {
            
            if(x < 5){
                System.out.println("Lebih kecil");
            } else if(x >= 5) {
                System.out.println("Lebih besar");
            }
            
        } else {
            System.out.println("Error");
        }
    }
}