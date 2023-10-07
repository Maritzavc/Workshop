public class Embarcacion {
    private double precioBase;
    private double valorAdicional;
    private int anioFabricacion;
    private int longitud;
    //Hago referencia a la clase 'Capitan'
    private Capitan capitan;

    public Embarcacion(double precioBase, int anioFabricacion, int longitud, Capitan capitan) {
        this.precioBase = precioBase;
        this.anioFabricacion = anioFabricacion;
        this.longitud = longitud;
        this.capitan = capitan;
        //Hago validación y asigno valor al atributo 'valorAdicional'
        if(this.anioFabricacion > 2020){
            this.valorAdicional = 20000;
        }else{
            this.valorAdicional = 0;
        }
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public Capitan getCapitan() {
        return capitan;
    }

    public void setCapitan(Capitan c1) {
        this.capitan = c1;
    }

    //Método para calcular el monto del alquiler
    public double calcMontAlquiler(){
        if(this.anioFabricacion > 2020){
            double total = this.precioBase + this.valorAdicional;
            return total;
        }
        return this.precioBase;
    }

    @Override
    public String toString() {
        return "Embarcacion{" +
                "precioBase=" + precioBase +
                ", valorAdicional=" + valorAdicional +
                ", anioFabricacion=" + anioFabricacion +
                ", longitud=" + longitud +
                ", capitan=" + capitan +
                '}';
    }
}
