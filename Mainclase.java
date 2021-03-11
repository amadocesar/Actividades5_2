package PaqueteCoche;

public class Mainclase {

    public static void main(String [] args){
        Coche Batmovil = new Coche("Batmovil", "Militar","Unico", "Negro",
                "no tiene es el Batmovil", 502, 2);
        System.out.println(Batmovil);

        Coche Temporal = new Coche("Coche de viaje temporal", "DMC", "DeLorean DMC-12",
                "Plateado", "OUTATIME", 132, 2);
        System.out.println(Temporal);

        Coche GhostBusters = new Coche ("Cazafantasmas", "Cadillac", "Cadillac Miller-Meteor",
                "Blanco con trazar rojas", "ECTO-1", 300, 4);
        System.out.println(GhostBusters);

        Coche Volador = new Coche ("Coche mágico", "Ford", "Anglia 105E", "Turquesa",
                "7990 TD", 50, 2);
        System.out.println(Volador);

        Coche MysteryMachine = new Coche("Máquina del Misterio", "Volkswagen", "Volkswagen Combi",
                "Chartreuse con olas Cian y flores Naranja", "SCOOBY", 34, 3);
        System.out.println(MysteryMachine);
        System.out.println("Voy a cambiar el color de 3 coches");

        Batmovil.setColor("Morado");
        Temporal.setColor("Dorado");
        Volador.setColor("Celeste");
        System.out.println(Batmovil);
        System.out.println(Temporal);
        System.out.println(Volador);
    }
}
