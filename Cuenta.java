package CuentaBancaria;

public class Cuenta {
    private int numeroCuenta;
    private double saldo;
    private boolean pobre;

    public Cuenta(int cuenta, double dine,boolean negativo) {
        numeroCuenta = cuenta;
        saldo = dine;
        pobre = negativo;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
    }

    public void retirar(double cantidad) { saldo -= cantidad; }

    public double saldo() { return saldo; }

    public int numeroCuenta(){ return numeroCuenta;}

    public boolean comprobar(){
        double comp = 0.0;
        if (Double.compare(saldo, comp) == 0 ){
            pobre = true;
            return this.pobre;
        }else{
            pobre = false;
            return this.pobre;
        }
    }
    public boolean pobre(){ return pobre; }

    public String toString() {
        if (pobre == true) {
            return "La cuenta: " + numeroCuenta + " tiene " + saldo + "€ por lo tanto es morosa";
        }else{
            return "La cuenta: " + numeroCuenta + " tiene " + saldo + "€";

        }
    }

}