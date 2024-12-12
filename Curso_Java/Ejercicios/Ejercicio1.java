public class Ejercicio1 {

    public static void main(String[] args) {

        StringBuilder cancatenar = new StringBuilder();

        String nombre = null;
        String apellido = "nunj";
        String apellido1 = "nugj";
        cancatenar.append(nombre);


        String archivo = "ejercicio.cs";
        int punto = archivo.lastIndexOf(".");

        System.out.println(apellido1.compareTo(apellido));
        //System.out.println(cancatenar.toString());
        System.out.println(cancatenar.toString());
        System.out.println("tipo de archivo buscado:"+ archivo.substring(punto + 1));
    }
}