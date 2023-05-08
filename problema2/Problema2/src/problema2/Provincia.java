package problema2;

public class Provincia {
    private String nombreProv;
    private int numHabit;
    public Provincia(){}
    public Provincia(String nombreProv, int numHabit){
        this.nombreProv = nombreProv;
        this.numHabit = numHabit;
    }
    public void setNombreProv(String nombreProv){
        this.nombreProv = nombreProv;
    }
    public void setNumHabit(int numHabit){
        this.numHabit = numHabit;
    }
    public String getNombreProv(){
        return nombreProv;
    }

    public int getNumHabit() {
        return numHabit;
    }
    public String toString(){
        return String.format("\nProvincia:%s"
                +"\nNumero de habitantes:%d"
                , getNombreProv()
                ,getNumHabit());
    }
}
