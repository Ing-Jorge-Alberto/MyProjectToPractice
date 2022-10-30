public class MyString {
    public static void main(String[] args) {
        String hello="Hello with String variable";
        System.out.println(hello+" have a length of "+hello.length()+" characters");
        System.out.println(hello.toLowerCase());
        System.out.println(hello.toUpperCase());
        String addString=hello.toLowerCase()+hello.toUpperCase();
        System.out.println(addString);
    }
}
