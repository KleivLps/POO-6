package GestionBiblioteca;

public class Libros extends ItemsDeBiblioteca implements Catalogable{
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

    public String getNombreRevista() {
        return nombreLibro;
    }

    public void setNombreRevista(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    @Override
    public void prestar() {
        if (cantidadEjemplares > 0) {
            cantidadEjemplares--;
            System.out.println("Libro prestado. Ejemplares restantes: " +cantidadEjemplares);
        } else {
            System.out.println("No hay mas ejemplares disponibles para prestar.");
        }
    }

    @Override
    public void devolver() {
        cantidadEjemplares++;
        System.out.println("Libro devuleto. Ejemplares ahora disponibles: " +cantidadEjemplares);
    }

    @Override
    public double calcularMultas(int diasAtraso) {
        double multaPorDia = 4.0;
        return multaPorDia;
    }

    @Override
    public void obtenerInformacion() {
        System.out.println("Nombre del Libro: " +nombreLibro);
        System.out.println("Número de Edición: " +nroEdicion);
        System.out.println("Cantidad de Ejemplares: " +cantidadEjemplares);
    }
}
