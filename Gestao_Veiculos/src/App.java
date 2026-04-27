public class App {
    public static void main(String[] args) throws Exception {
        Viaturas myV = new Viaturas();
        myV.setMaxVel(180);
        myV.setNumRodas(4);
        myV.setTipoViatura("carro");

        myV.mostrarInfo();
    }
}
