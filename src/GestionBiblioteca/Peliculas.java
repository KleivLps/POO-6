package GestionBiblioteca;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Peliculas extends ItemsDeBiblioteca implements Catalogable{
    private String titulo;
    private String director;
    private String genero;
    private boolean prestada;
    private LocalDate fechaPrestamo;

    public Peliculas(String titulo, String director, String genero) {
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.prestada = false;
        this.fechaPrestamo = null;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    @Override
    public void prestar() {
        if (!prestada) {
            prestada = true;
            fechaPrestamo = LocalDate.now();
            System.out.println("Pelicula prestada el dia " +fechaPrestamo);
        } else {
            System.out.println("La pelicula ya esta prestada.");
        }
    }
    @Override
    public void devolver() {
        if (prestada) {
            prestada = false;
            fechaPrestamo = null;
            System.out.println("Pelicula devuelta.");
        } else {
            System.out.println("La pelicula no esta prestada.");
        }
    }

    @Override
    public double calcularMultas(int diasAtraso) {
        if (fechaPrestamo == null) {
            System.out.println("No se ha registrado un prestamo para esta pelicula.");
            return 0;
        }

        LocalDate fechaDevolucion = LocalDate.now();
        long diasPrestamo = ChronoUnit.DAYS.between(fechaPrestamo, fechaDevolucion);

        double multaporDia = 1.5;
        double multaTotal = (diasPrestamo - diasAtraso) * multaporDia;

        return multaTotal > 0 ? multaTotal : 0;
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Titulo de la Pelicula: " +titulo);
        System.out.println("Director: " +director);
        System.out.println("Genero: " +genero);
        System.out.println("Fecha de Prestamo: " +(fechaPrestamo !=null ? fechaPrestamo : "No prestada"));
    }
}
