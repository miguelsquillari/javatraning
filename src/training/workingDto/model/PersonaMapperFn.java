package training.workingDto.model;

import java.util.function.Function;

public class PersonaMapperFn implements Function<Persona, PersonaDto> {
    @Override
    public PersonaDto apply(Persona persona) {
         return new PersonaDto();
    }
}
