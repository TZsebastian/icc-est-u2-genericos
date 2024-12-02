import models.Persona;
import models.genericos.Caja;
import models.genericos.Par;

public class App {
    public static void main(String[] args) throws Exception {
        Caja<String> cajaString = new Caja <>();
        Caja<Integer> cajaInteger = new Caja <>();
        Caja<Persona> cajaPersona = new Caja<>();

        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setEdad(30);

        Par<String, Integer> par = new Par<>();
        par.guardarClave("Hola");
        par.guardarValor(1234);

        cajaString.guardar("Guardo un String");
        cajaInteger.guardar(10);
        cajaPersona.guardar(persona);




        System.out.println(cajaString.obtener());
        System.out.println(cajaInteger.obtener());
        System.out.println(cajaPersona.obtener());
        System.out.println(par.obtenerClave());
        System.out.println(par.obtenerValor());
    }
}
