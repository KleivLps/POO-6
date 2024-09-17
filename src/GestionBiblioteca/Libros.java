package GestionBiblioteca;

public class Libros extends ItemsDeBiblioteca implements Catalogable {
    private int nroEdicion;
    private int cantidadEjemplares;
    private String nombreLibro;

    public Libros(int nroEdicion, int cantidadEjemplares, String nombreLibro) {
        this.nroEdicion = nroEdicion;
        this.cantidadEjemplares = cantidadEjemplares;
        this.nombreLibro = nombreLibro;
    }

    public int getNroEdicion() {
        return nroEdicion;
    }

    public void setNroEdicion(int nroEdicion) {
        this.nroEdicion = nroEdicion;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    @Override
    public void prestar() {
        if (cantidadEjemplares > 0) {
            cantidadEjemplares--;
            System.out.println("Libro prestado. Ejemplares restantes: " + cantidadEjemplares);
        } else {
            System.out.println("No hay más ejemplares disponibles para prestar.");
        }
    }

    @Override
    public void devolver() {
        cantidadEjemplares++;
        System.out.println("Libro devuelto. Ejemplares ahora disponibles: " + cantidadEjemplares);
    }

    @Override
    public double calcularMultas(int diasAtraso) {
        double multaPorDia = 4.0;
        return multaPorDia * diasAtraso;
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Nombre del Libro: " + nombreLibro);
        System.out.println("Número de Edición: " + nroEdicion);
        System.out.println("Cantidad de Ejemplares: " + cantidadEjemplares);
    }
}
