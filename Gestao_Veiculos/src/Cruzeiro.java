public class Cruzeiro extends Barco{

    private int numeroQuartos;
    private int numeroPisos;
    private String nomeBarco;

    public Cruzeiro() {
        this.numeroQuartos = 20;
        this.numeroPisos = 4;
        this.nomeBarco = "A";
    }

    public Cruzeiro(int numeroQuartos, int numeroPisos, String nomeBarco) {
        this.numeroQuartos = 0;
        this.numeroPisos = 0;
        this.nomeBarco = "";
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }
    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }
    public int getNumeroPisos() {
        return numeroPisos;
    }
    public void setNumeroPisos(int numeroPisos) {
        this.numeroPisos = numeroPisos;
    }
    public String getNomeBarco() {
        return nomeBarco;
    }
    public void setNomeBarco(String nomeBarco) {
        this.nomeBarco = nomeBarco;
    }

    public void mostrarInfoCruzeiro() {
        super.mostrarInfo();
        System.out.print("-> Numero de Quartos: ");
        System.out.println(numeroQuartos);
        System.out.print("-> Numero de Pisos: ");
        System.out.println(numeroPisos);
        System.out.print("-> Nome Barco: ");
        System.out.println(nomeBarco);
    }
}
