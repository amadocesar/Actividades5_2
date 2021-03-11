package CuentaBancaria;

public class Persona {
    private String dni;
    private int ppl;
    private int unca;
    private Cuenta[] cnta;
    private boolean ntv;

    public Persona (String st){
        cnta = new Cuenta[3];
        dni = st;
        ppl = 0;
        unca = 1001;
    }

    public boolean crearCuenta(double dine){
        if (ppl >= cnta.length) {
            throw new RuntimeException("Se ha alcanzado el maximo de cuentas permitidas");
        }else{
            cnta[ppl] = new Cuenta(unca, dine, ntv);
            ppl++;
            unca++;
            return true;
        }
    }

    private int numeroDeCuenta(int num) {
        int pos = 0;
        boolean esta = false;
        for (int i = 0; i < ppl; i++) {
            if (cnta[i].numeroCuenta() == num) pos = i;
            esta = true;
        }
        if (!esta) throw new RuntimeException("No existe la cuenta dada");
        return pos;
    }

    public void depositar(int numeroDeCuenta, double dine) {
        int pos = numeroDeCuenta(numeroDeCuenta);
        cnta[pos].depositar(dine);
    }

    public double retirar(int numeroDeCuenta, double dine) {
        double dineroCargado;
        int pos = numeroDeCuenta(numeroDeCuenta);
        cnta[pos].retirar(dine);
        dineroCargado = dine;
        return dineroCargado;
    }

    public void comprobar(int numeroDeCuenta){
        int pos = numeroDeCuenta(numeroDeCuenta);
        cnta[pos].comprobar();
    }

    public double saldo(int numeroDeCuenta) {
        int pos = numeroDeCuenta(numeroDeCuenta);
        return cnta[pos].saldo();
    }

    public double transferencia(int cuenta1, int cuenta2, double dine){
        double dinerotransferencia = this.retirar(cuenta1, dine);
        this.depositar(cuenta2, dinerotransferencia);
        return dinerotransferencia;
    }
    public String toString() {
        String res = "Cuentas de " + dni + ": [  ";
        for (int i = 0; i < ppl; i++) {
            res = res + "\n" + cnta[i].toString();
        }
        return res;
    }
}

