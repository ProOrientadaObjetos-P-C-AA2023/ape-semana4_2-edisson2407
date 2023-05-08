package problema4;
public class Problema4 {
    public static void main(String[] args) {
        Cheques cheque1 = new Cheques("Matias Macas", "Bancho Pichincha", 999.99);
        cheque1.calcularComision();
        System.out.println(cheque1);
    }
    
}
