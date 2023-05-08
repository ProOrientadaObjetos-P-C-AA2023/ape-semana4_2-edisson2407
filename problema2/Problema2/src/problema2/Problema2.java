package problema2;
public class Problema2 {
    public static void main(String[] args) {
        Profesores profesor1 = new Profesores("Fabricio", "Alverca", 687.55, "1950001733");
        Provincia provincia1 = new Provincia("Zamora Chinchipe", 121606);
        profesor1.calcularSueldo();
        profesor1.setProvincia(provincia1);
        System.out.println(profesor1);
    }
    
}
