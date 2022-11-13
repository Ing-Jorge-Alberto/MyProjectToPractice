public class Homework4 {
    public static void main(String[] args) {
        String str="Hello world!";
        String newStr="";
        System.out.println(str);
        int length=str.length();
        System.out.println("La longitud de la frase "+str+" es: "+length);
        int i=0;
        while (i<length){
            char x=str.charAt(i);
            if(x=='o'){
              newStr=newStr+0;
            }else newStr=newStr+x;
            i++;
        }
        System.out.println("La nueva frase es: "+newStr);
    }
}
