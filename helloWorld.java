public class helloWorld {
    public static int sumar(int num1, int num2) {
        int res = num1 + num2;
        return res;
    }

    public static void main(String[] args) {
        int resultadoSuma = sumar(2, 2);
        System.out.println("La suma es: " + resultadoSuma);
    }
}