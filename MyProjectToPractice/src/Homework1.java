public class Homework1 {
    public static void main(String[] args) {
        int numero=99;

        if(numero<0){
            System.out.println("Negative");
        } else if (numero==0) {
            System.out.println("Zero");
        } else if (numero<=10) {
            System.out.println("Small");
        } else if (numero>10 && numero<=22) {
            System.out.println("Less than 100");
        } else if (numero==23) {
            System.out.println("Jordan");
        } else if (numero>23 && numero<100) {
            System.out.println("Less than 100");
        } else System.out.println("Too big");
    }
}
