class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + "y tengo " + edad + " anios");
    }

}

public class helloWorld {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 25);
        persona.saludar();
    }
}