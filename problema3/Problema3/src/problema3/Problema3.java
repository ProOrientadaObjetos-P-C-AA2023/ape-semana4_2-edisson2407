
package problema3;

public class Problema3 {

    public static void main(String[] args) {
        Automotor automotor1 = new Automotor("1123958493", 2006, 25999.99);
        Fabricante fabricante1 = new Fabricante("Toyota", "prefectura de Aichi");
        automotor1.calcularValorMatric();
        automotor1.setFabricante(fabricante1);
        System.out.println(automotor1);
    }
    
}
