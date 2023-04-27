public class Motocicleta implements Vehiculo{
    private int centimetroCubicos;
    private String marca;

    public Motocicleta() {
    }

    public Motocicleta(int centimetroCubicos, String marca) {
        this.centimetroCubicos = centimetroCubicos;
        this.marca = marca;
    }

    public int getCentimetroCubicos() {
        return centimetroCubicos;
    }

    public void setCentimetroCubicos(int centimetroCubicos) {
        this.centimetroCubicos = centimetroCubicos;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "centimetroCubicos=" + centimetroCubicos +
                ", marca='" + marca + '\'' +
                '}';
    }
    public void hacerCaballito(){
        System.out.println("Haciendo un truco llamado caballito para ser mas pro");
    }

    @Override
    public boolean ecender() {
        System.out.println("encendiendo la moto " + this.marca);
        return true;
    }

    @Override
    public boolean apagar() {
        System.out.println("apagando la moto " + this.marca);
        return true;
    }

    @Override
    public void avanzar() {
        System.out.println("avanzando con la moto de " + this.centimetroCubicos + " C.C");
    }

    @Override
    public void frenar() {
        System.out.println("frenando con la moto de " + this.centimetroCubicos + " C.C");

    }
}
