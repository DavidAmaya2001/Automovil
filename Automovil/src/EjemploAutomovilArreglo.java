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
        System.out.println("=============================================================\n");
        System.out.println(auto);
        System.out.println("-------------------------------------------");
        if(auto.getColor() != null){
            System.out.println("Color: " + auto.getColor());
        }
        else{
            System.out.print("\n");
        }
        if(auto.getTipo() != null){
            System.out.println("-------------------------------------------");
            System.out.println("Tipo de auto: " + auto.getTipo());
        }
        else{
            System.out.print("\n");
        }
        if(auto.getConductor() != null){
            System.out.println("-------------------------------------------");
            System.out.println("Conductor del auto: " + auto.getConductor());
        }
        else{
            System.out.print("\n");
        }
        if(auto.getMotor() != null){
            System.out.println("-------------------------------------------");
            System.out.println("Cilindrada del motor: " + auto.getMotor().getCilindrada());
            System.out.println("Tipo de motor: " + auto.getMotor().getTipo());
        }
        else{
            System.out.print("\n");
        }
        System.out.println("-------------------------------------------");
        System.out.println("Capacidad del tanque de gasolina: " + auto.getEstanque().getCapacidad());
        System.out.println("-------------------------------------------");
        for(Rueda r: auto.getRuedas()){
            if(r != null){
                System.out.println("-------------------------------------------");
                System.out.println("Fabricante de los neumaticos: " + r.getFabricante());
                System.out.println("Tamaño del aro: " + r.getAro());
                System.out.println("Ancho de los neumaticos: " + r.getAncho());
            }
            else{
                System.out.print("\n");

            }
        }


    }
}
