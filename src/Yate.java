//Clase que hereda los atributos de 'Embarcación' e implemeta la interfaz 'Caracterizador'
public class Yate extends Embarcacion implements Caracterizador{
    private int numCamarotes;

    public Yate(double precioBase, double valorAdicional, int anioFabricacion, int longitud, int numCamarotes, Capitan capitan) {
        super( precioBase, anioFabricacion, longitud, capitan);
        this.numCamarotes = numCamarotes;
    }

    public int getNumCamarotes() {
        return numCamarotes;
    }

    public void setNumCamarotes(int numCamarotes) {
        this.numCamarotes = numCamarotes;
    }

    //Hago uso de la interfaz y devuelvo un Booleano
    @Override
    public Boolean evaluar() {
        return numCamarotes > 7;
    }

}
