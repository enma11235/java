public class helloWorld {
    public static int signo(int x) {
        if (x > 0) {
            return 1;
        } else if (x == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int signo = signo(0);
        if (signo > 0) {
            System.out.println("positivo");
        } else if (signo == 0) {
            System.out.println("cero");
        } else {
            System.out.println("negativo");
        }
    }
}