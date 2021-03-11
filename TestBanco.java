package CuentaBancaria;

public class TestBanco {
    public static void main(String[] args) {
        Persona p = new Persona("47411154N");//La verdad estuve tanto tiempo con lo de comprobar si es morosa que no he comprobado el DNI asi que si lo olvida te quedas sin cuentas
        boolean cuenta1 = p.crearCuenta( 0.0);
        boolean cuenta2 = p.crearCuenta( 700);
        //boolean cuenta3 = p.crearCuenta(100);
        p.comprobar(1001);
        p.comprobar(1002);
        System.out.println(p);
        p.depositar(1001, 1100);
        p.retirar(1002, 750);
        p.transferencia(1001, 1002, 500);
        p.comprobar(1001);
        p.comprobar(1002);
        System.out.println(p);
        p.depositar(1002,200);
        p.comprobar(1001);
        p.comprobar(1002);
        System.out.println(p);
    }
}

