public class Main {
    public static void main(String[] args) {
        Estudiante al1 = new Estudiante();
        Estudiante al2 = new Estudiante();
        Estudiante al3 = new Estudiante();

        al1.setNombre("Andre");al1.setMatricula(1281158);al1.setPromedio(80);
        al2.setNombre("Franco");al2.setMatricula(139232);al2.setPromedio(100);
        al3.setNombre("Juan");al3.setMatricula(1491148);al3.setPromedio(199);

        System.out.println(al1.getNombre() + "Matricula: " + al1.getMatricula() + " Promedio: " + al1.getPromedio());
        System.out.println(al1.getNombre() + "Matricula: " + al2.getMatricula() + " Promedio: " + al2.getPromedio());
        System.out.println(al1.getNombre() + "Matricula: " + al3.getMatricula() + " Promedio: " + al3.getPromedio());


    }
}
