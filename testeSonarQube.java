public class testeSonarQube {
    public static void main(String[] args) {
        int i = 1;
        for (;i < 11; i++) {
           System.out.println(i); 
        }

    }
    public static int metodo(){
        int a = 3;

        for (int i = 0; i < 5; i--) {
            a = i * a - 2;
        }

        return a;
    }
}