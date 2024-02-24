public class helloWorld {
    public static void signo(int x) {
        if (x > 0) {
            System.out.print("positivo");
        } else if(x == 0) {
            System.out.print("cero");
        } else {
            System.out.print("negativo");
        }
    }

    public static void main(String[] args) {
        String par1 = args[1];
        int x = Integer.parseInt(par1);
        System.out.println(x);
    }
}