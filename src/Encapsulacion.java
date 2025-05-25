public class Encapsulacion {

    //private solo accesible dentro de la misma clase
    private static class SerVivo{
        private String nombre;
        //constructor
        public SerVivo(String nombreinicial){this.nombre=nombreinicial;}

        //getter
        public String traerNombre() {return nombre;}
        //setter
        public void setNombre(String nuevoNombre){ this.nombre= nuevoNombre; }
    }
    public static void main(String[] args) {

        SerVivo serVivo  = new SerVivo ("michifus");
        System.out.println("El nombre es: " + serVivo.traerNombre());

        serVivo.setNombre("zafira");
        System.out.println("Nuevo nombre: " + serVivo.traerNombre());
    //protected accesible dentro de la misma clase y clases hijas

    //public accesible desde cualquier parte del codigo

}}
