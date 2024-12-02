import java.util.ArrayList;
import java.util.List;
import models.Persona;
import models.Personas;
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


        //------------------------
                // Ejemplo de uso de Caja con distintos tipos
                Par<String, Integer> par2Par = new Par<>("Hola", 1234);
        
                System.out.println("Par clave: " + par2Par.obtenerClave());
                System.out.println("Par valor: " + par2Par.obtenerValor());
        
                // Lista de Personas
                Personas[] personas = {
                    new Personas("Juan", 15),
                    new Personas("Pedro", 28),
                    new Personas("Maria", 8),
                    new Personas("Jose", 42),
                    new Personas("Mateo", 21),
                    new Personas("Roberto", 25),
                    new Personas("Juliana", 12),
                    new Personas("Alberto", 56),
                    new Personas("Sara", 35),
                    new Personas("Ana", 40),
                };
                int personasMayores = 0;
                int personasMenores = 0;
        
                for (int i = 0; i < personas.length; i++) {
                    if(personas[i].getEdad() >= 18){
                        personasMayores++;
                    } else{
                        personasMenores++;
                    }
                }
                Par<String,Integer>[] mayores = new Par[personasMayores];
                Par<Integer,String>[] menores = new Par[personasMenores];
        
                int contadorMayores = 0;
                int contadorMenores = 0;
                for (int i = 0; i < personas.length; i++) {
                    if (personas[i].getEdad() >= 18) {
                        mayores[contadorMayores] = new Par<String, Integer>();
                        mayores[contadorMayores].guardarClave(personas[i].getNombre());
                        mayores[contadorMayores].guardarValor(personas[i].getEdad());
                        contadorMayores++;
                    }else{
                        menores[contadorMenores] = new Par<Integer, String>();
                        menores[contadorMenores].guardarClave(personas[i].getEdad());
                        menores[contadorMenores].guardarValor(personas[i].getNombre());
                        contadorMenores++;
                    }
                }
                System.out.println("MAYORES DE EDAD");
                for (Par<String, Integer> par2 : mayores) {
                    System.out.println(par2.obtenerClave() + " - " + par2.obtenerValor());
                }
                System.out.println("MENORES DE EDAD");
                for(Par<Integer, String> par2 : menores){
                    System.out.println(par2.obtenerClave() + " - " + par2.obtenerValor());
                }
            }
        }
        

        