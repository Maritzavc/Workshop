public class Main {
    public static void main(String[] args) {
        //Creación de Instancias
        //El valor de 'valorAdicional' por defecto es 0. En el constructor se hace una validación y se le asigna un nuevo valor
        Yate y1 = new Yate(4250000, 0, 2019, 15, 4, new Capitan("Juan", "Montes", "A182PXS"));
        System.out.println(y1);
        System.out.println("El valor adicional es: " + y1.getValorAdicional());
        System.out.println("Precio final: " + y1.calcMontAlquiler());
        boolean evaluacion = y1.evaluar();
        if (evaluacion) {
            System.out.println("Es un yate de Lujo.");
        } else {
            System.out.println("Es un Yate Estandar");
        }

        System.out.println("_______________________________________________________________________________");

        Velero v1 = new Velero(5100000,0, 2022, 25, 5, new Capitan("Mateo", "Espinosa", "B128MNU"));
        System.out.println(v1);
        System.out.println("El valor adicional es: " + v1.getValorAdicional());
        System.out.println("Precio final: " + v1.calcMontAlquiler());
        boolean evaluacion1 = v1.evaluar();
        if (evaluacion1) {
            System.out.println("Es un Velero grande.");
        } else {
            System.out.println("Es un velero Estandar");
        }

        System.out.println("___________________________________________________________________________");


    }
}