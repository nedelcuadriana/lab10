package Command;

public class Plata implements OperatiuneBancara{

    private String contDestinatie;
    private double suma;

    public Plata(double suma, String contDestinatie) {
        this.suma = suma;
        this.contDestinatie = contDestinatie;
    }

    @Override
    public void efectuareOperatiune(){
        System.out.println("Plata");
    }
}
