package PaqueteCoche;

public class Coche {
    private String tipo, modelo, marca, color,matricula;
    private int caballos, puertas;

    public Coche (String tipo, String modelo, String marca, String color, String matricula, int caballos, int puertas) {
        super();
        this.tipo = tipo;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.matricula = matricula;
        this.caballos = caballos;
        this.puertas = puertas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCaballos() {
        return caballos;
    }

    public void setCaballos(int caballos) {
        this.caballos = caballos;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    @Override
    public String toString() {
        return "Es un " + tipo + " su modelo es " + modelo + " de la marca " + marca + " de color " + color +
                " con la matricula " + matricula + " con una potencia de " + caballos + " caballos y "
                + puertas + " puertas.";
    }
}
