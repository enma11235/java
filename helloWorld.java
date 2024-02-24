public class helloWorld {
    public static int restar(int x, int y) {
        int res = x - y;
        return res;
    }

    public static void main(String[] args) {
        int res = restar(4, 2);
        System.out.println("La resta es: " + res);
    }
}