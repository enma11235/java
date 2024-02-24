class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    static void saludar() {
        System.out.println("Hola :3");
    }

}

public class helloWorld {
    public static void main(String[] args) {
        Persona.saludar();
    }
}