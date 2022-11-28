public class javaMethods {
    public static void main(String[] args) {
        helloWorld();
        helloJac();
        helloName("George"); //Method with parameter
        infoPerson("Alberto",38);
        suma(3,5);
        suma(2.0,5.5);
        suma(2,4,6);
        int square=square(2);//One way to call method square using square variable
        System.out.println(square);
        System.out.println(square(4));//Another way calling method square directly in the Sysout
    }
    //Methods used in main method
    private static void helloWorld (){
        System.out.println("Hello World!");
    }
    private static void helloJac(){
        System.out.println("Hola JAC!");
    }
    private static void helloName(String name){
        System.out.println("Hola "+name);
    }
    private static void infoPerson(String name, int age){
        System.out.println("Hello "+name+" you are "+age+" years old");
    }
    private static void suma (int a, int b){
        int suma=a+b;
        System.out.println("The sum of "+a+" + "+b+" are: "+suma);
    }
    //Method Overloading
    //Same name method with different data types
    private static void suma (double a, double b){
        double suma=a+b;
        System.out.println("The sum of "+a+" + "+b+" are: "+suma);
    }
    //Same name method with same data types but more parameters
    private static void suma (int a, int b, int c){
        int suma=a+b+c;
        System.out.println("The sum of "+a+" + "+b+" + "+c+" are: "+suma);
    }
    //Method return type
    private static int square(int number){
        int result=number*number;
        return result;
    }
}
