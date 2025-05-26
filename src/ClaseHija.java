public class ClaseHija extends codHerencia {
    public ClaseHija(String reino, String filo, String clase, String orden, String familia, String genero, String especie) {
        super(reino, filo, clase, orden, familia, genero, especie);}

    public void mostrarTodo(){System.out.println("Taxonomia:" + reino + filo + clase + orden + familia + genero + especie);}
    }