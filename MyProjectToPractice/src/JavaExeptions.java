public class JavaExeptions {
    public static void main(String[] args) {
        String[] students = {"Dmitry","Olga","Roman"};
        System.out.println(students[3]);
       /* try {
            System.out.println(students[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exeption happened: "+e);
        }*/
    }
}
