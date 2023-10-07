//Clase que hereda los atributos de 'Embarcación' e implemeta la interfaz 'Caracterizador'
public class Velero extends Embarcacion implements Caracterizador {
    private int numMastiles;

    public Velero(double precioBase, double valorAdicional, int anioFabricacion, int longitud, int numMastiles, Capitan capitan) {
        super(precioBase, anioFabricacion, longitud, capitan);
        this.numMastiles = numMastiles;
    }

    public int getNumMastiles() {
        return numMastiles;
    }

    public void setNumMastiles(int numMastiles) {
        this.numMastiles = numMastiles;
    }

    //Hago uso de la interfaz y devuelvo un Booleano
    @Override
    public Boolean evaluar() {
        return numMastiles > 4; //Devuelve true si numMastiles es mayor que 4, de lo contrario, false
    }
}
