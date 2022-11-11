public class Calculadora {
    public static void main(String[] args) {
        int option = 1;

        System.out.println("+++ Calculadora +++");
        System.out.println("1.- Suma");
        System.out.println("2.- Resta - No disponible");
        System.out.println("3.- Multiplicacion - No disponible");
        System.out.println("4.- Division - No disponible");
        System.out.println("\n");

        switch (option){
            case 1:
                Suma suma = new Suma();
                //suma.Sumar(2,3);
                System.out.println("La suma de 2+3 es: "+suma.Sumar(2,3));
                break;

            default:
                System.out.println("Opcion "+option+" no valida");
        }
    }
}
