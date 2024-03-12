package refactor;


class Report {

    void printReport() {
        titulo();

        System.out.println("Contenido 1...");
        System.out.println("Contenido 2...");

        conclucion();

    }

    private static void titulo() {
        System.out.println("Conclusión del Reporte");
    }

    private static void conclucion() {
        System.out.println("Título del Reporte");
    }

}