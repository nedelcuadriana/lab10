package Command;

public class Main {
    public static void main(String[] args) {
        OperatiuneBancara a1 = new AlimentareCont("RO1234", 500);
        OperatiuneBancara p1 = new Plata(1000, "RO4321");
        OperatiuneBancara p2 = new Plata(300, "RO5624");

        ServerOpBancare server = new ServerOpBancare();
        server.inregistrareOperatiune(a1);
        server.inregistrareOperatiune(p1);
        server.inregistrareOperatiune(p2);
        server.efectuareOperatiuniInregistrate();
    }
}
