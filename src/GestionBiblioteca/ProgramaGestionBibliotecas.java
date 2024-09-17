package GestionBiblioteca;

public class ProgramaGestionBibliotecas {

    public static void main(String[] args) {
        Revistas revista1 = new Revistas(101, 4, "Revistas de Arquitectura", null);
        Revistas revista2 = new Revistas(202, 2, "Revistas de Construcción", null);
        Revistas revista3 = new Revistas(303, 2, "Revistas de anime", null);
        Revistas[] revistas = {revista1, revista2, revista3};

        Peliculas pelicula1 = new Peliculas("Cloverfield: Monstruo", "J. J. Abrams y Bryan Burk", "Ciencia Ficcion");
        Peliculas pelicula2 = new Peliculas("Your name", "Makoto Shinkai", "Romance");
        Peliculas pelicula3 = new Peliculas("Shrek 2", "Andrew Adamson", "Animada, comedia");
        Peliculas[] peliculas = {pelicula1, pelicula2, pelicula3};

        revista1.obtenerInformacion();
        double multaPagoRevista = revista1.calcularMultas(5);
        System.out.println("Multa por atraso en la revista: S/" + multaPagoRevista);
        System.out.println("---");

        pelicula1.prestar();
        pelicula1.devolver();
        double multaPelicula = pelicula1.calcularMultas(2);
        System.out.println("Multa por atraso en la pelicula: S/" + multaPelicula);
        pelicula1.obtenerInformacion();
        System.out.println("---");

        for (Revistas revista : revistas) {
            System.out.println("Informacion de la Revista:");
            revista.obtenerInformacion();
            System.out.println();

            revista.prestar();
            System.out.println();

            revista.devolver();
            System.out.println();

            int diasAtraso = 3;

            double multa = revista.calcularMultas(diasAtraso);
            System.out.println("Multa por " + diasAtraso + " dias de atraso: S/" + multa);
            System.out.println("---");
        }

        for (Peliculas pelicula : peliculas) {
            System.out.println("Informacion de la pelicula:");
            pelicula.obtenerInformacion();
            System.out.println();

            pelicula.prestar();
            System.out.println();

            pelicula.devolver();
            System.out.println();

            int diasAtraso = 3;

            double multa = pelicula.calcularMultas(diasAtraso);

            System.out.println("Multa por " + diasAtraso + " dias de atraso: S/" + multa);
            System.out.println("---");
        }
    }
}
