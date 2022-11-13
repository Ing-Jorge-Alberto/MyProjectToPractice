public class JavaLoops {
    public static void main(String[] args) {
        int pages=12;
        for (int i=0; i<=pages ; i++){
            System.out.println(i);
            if (i==5){
                System.out.println("STOP");
                break;
            }
        }
        System.out.println("---");
        String[] students={"Jorge","Pao","Beto","Vale"};
        for (String names:students){
            System.out.println(names);
        }
        System.out.println("---");
        int i=0;
        while (i<5){
            System.out.println(i);
            i++;
        }
        do {
            if (i==3){
                System.out.println("Skipping 3");
                i--;
                continue; //Lo ejecute sin el continue y me dio el mismo resultado, por que?
            }
            System.out.println(i);
            i--;
        } while (i>0);
    }
}
