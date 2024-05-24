package training.optionals;

import training.model.Persona;

import java.util.Optional;

public class OptionalPerson {

    public OptionalPerson() {
        withOutOptional();
        withOptional();
    }

    private void withOptional(){
        // opcion 1 using get
        Optional<Persona> optionalPersona = findPersonaoptional();

        // using get is better use the is ifPresent method first

            optionalPersona.ifPresent(persona -> System.out.println("Ocupation option using get: " + persona.getOccupation()));
        // usinig orElse

        System.out.println("Occupation Using orElse: " + optionalPersona.orElse(new Persona("sin nombre", 0, "No Occupation")).getOccupation());

        // using map to transform into another optional.
        System.out.println("Occupation Using map and orElse: " +optionalPersona.map(Persona::getOccupation)
                    .orElse("No occupation !!"));

        // using orElseThrow (throw an exception ;)
        System.out.println("Occupation Using orElseThrow: " + optionalPersona.orElseThrow());
    }


    private Optional<Persona> findPersonaoptional(){
        Persona p = new Persona();
        p.setDni(123456);
        p.setNombre("Miguel");
        p.setOccupation("Programmer");
        p = null;
        return Optional.ofNullable(p);
    }


    private void withOutOptional(){
        Persona p = findPersona();
        System.out.println("Ocupation : " + p.getOccupation());
    }

    private Persona findPersona(){
        Persona p = new Persona();
        p.setDni(123456);
        p.setNombre("Miguel");
        p.setOccupation("Programmer");
        return p;
    }
    
     public static void main(String a []){
         OptionalPerson optionalPerson = new OptionalPerson();
     }
         
    
    
}
