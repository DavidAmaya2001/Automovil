import java.util.Arrays;
public class EjemploAutomovilArreglo {
    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Luci", "Martinez");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.GASOLINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);

        Persona pato = new Persona("Pato", "Rodriguez");
        Automovil mazda = new Automovil("Mazada", "BT-50", Color.ROJO, new Motor(3.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(pato);

        Persona bea = new Persona("Bea", "Gonzalez");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS, new Motor(4.0, TipoMotor.DIESEL), new Estanque());
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);

        Persona lalo = new Persona("Lalo", "Mena");
        Automovil suzuki = new Automovil("Suzuki", "Vitara", Color.GRIS, new Motor(1.6, TipoMotor.GASOLINA), new Estanque(50));
        suzuki.setConductor(lalo);
        suzuki.setColor(Color.AMARILLO);
        suzuki.setTipo(TipoAutomovil.SUV);
        Automovil.setColorPatente(Color.AZUL);

        Automovil audi = new Automovil("Audi", "A3");
        audi.setConductor(new Persona("Jano", "Perez"));

        Automovil[] autos = new Automovil[5];
        autos[0] = subaru;
        autos[1] = mazda;
        autos[2] = nissan;
        autos[3] = suzuki;
        autos[4] = audi;

        Arrays.sort(autos);
        for (Automovil auto : autos) {
            ImprimirDetalle(auto);
        }
    }

    static public void ImprimirDetalle(Automovil auto){
        String color, tipo, conductor, motor,gasolina,ruedas = "";
        int i = 0;

        System.out.println("=============================================================\n");
        System.out.println(auto);
        System.out.println("-------------------------------------------");
        color = auto.getColor() != null ? "Color del auto: " + auto.getColor() + "\n" : "\n";
        System.out.print(color);

        System.out.println("-------------------------------------------");
        tipo = auto.getTipo() != null ? "Tipo de auto: " + auto.getTipo() + "\n" : "\n";
        System.out.print(tipo);

        System.out.println("-------------------------------------------");
        conductor = auto.getConductor() != null ? "Conductor del auto: " + auto.getConductor() + "\n" : "\n";
        System.out.print(conductor);

        System.out.println("-------------------------------------------");
        motor = auto.getMotor() != null ? "Cilindrada del motor: " + auto.getMotor().getCilindrada() + "\n" +
                                          "Tipo de motor: " + auto.getMotor().getTipo() + "\n" : "\n";
        System.out.print(motor);

        System.out.println("-------------------------------------------");
        gasolina = auto.getEstanque() != null ? "Capacidad del tanque de gasolina: " + auto.getEstanque().getCapacidad() + "\n" : "\n";
        System.out.print(gasolina);

        System.out.println("-------------------------------------------");
        for(Rueda r: auto.getRuedas()){
            ruedas = r !=null ? "Fabricante del neumático " + i + ": " + r.getFabricante() + "\n" +
                                "Tamaño del aro " + i + ": " + r.getAro() + "\n" +
                                "Ancho del neumático " + i + ": " + r.getAncho() + "\n" : "\n";
            i++;
        }
        System.out.print(ruedas);

    }
}
