public class IfAnd {
    public static void main (String[] args){
        int x = 10;
        int y = 20;
        if((x <= 10)&&(y <= 15)){
            System.out.println("A");
        } else if((x <= 5)&&(y <= 20)) {
            System.out.println("B");
        } else if((x <= 5)&&(y <= x)) {
            System.out.println("C");
        } else if((x <= 10)&&(y <= 20)) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
    }
}