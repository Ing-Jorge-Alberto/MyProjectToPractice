public class Homework5 {
    public static void main(String[] args) {
        //Write java method that calculates and returns average of three given numbers
        System.out.println(average(3,6,9));
        System.out.println(average(5.5,10.5,15.5));
    }
    private static double average (double a, double b, double c){
        return (a+b+c)/3;
    }
}
