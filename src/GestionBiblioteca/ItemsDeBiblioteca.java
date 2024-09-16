package GestionBiblioteca;

public abstract class ItemsDeBiblioteca {
    public abstract void prestar();
    public abstract void devolver();
    public abstract double calcularMultas(int diasAtraso);
}
