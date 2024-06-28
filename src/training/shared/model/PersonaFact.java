package training.shared.model;

import java.util.Random;

public class PersonaFact {

        private int dni;
        private String nombre;
        private String apellido;
        private String ocupacion;

        public PersonaFact(int dni, String nombre, String apellido, String ocupacion) {
            this.dni = dni;
            this.nombre = nombre;
            this.apellido = apellido;
            this.ocupacion = ocupacion;
        }

        public int getDni() {
            return dni;
        }

        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public String getOcupacion() {
            return ocupacion;
        }

        public static void main(String[] args) {
            String[] nombres = {"Juan", "María", "Pedro", "Ana", "Luis"};
            String[] apellidos = {"Gómez", "Rodríguez", "López", "Martínez", "Fernández"};
            String[] ocupaciones = {"Programador", "Diseñador", "Abogado", "Docente", "Arquitecto"};
            Random random = new Random();

            PersonaFact[] personas = new PersonaFact[150];

            for (int i = 0; i < 150; i++) {
                int dni = random.nextInt(1000000000); // Genera un número aleatorio de DNI
                String nombre = nombres[random.nextInt(nombres.length)]; // Elige un nombre aleatorio de la lista
                String apellido = apellidos[random.nextInt(apellidos.length)]; // Elige un apellido aleatorio de la lista
                String ocupacion = ocupaciones[random.nextInt(ocupaciones.length)]; // Elige una ocupación aleatoria de la lista

                personas[i] = new PersonaFact(dni, nombre, apellido, ocupacion);
            }

            // Imprimir los datos de las personas creadas
            for (PersonaFact persona : personas) {
                System.out.println("DNI: " + persona.getDni() + ", Nombre: " + persona.getNombre() + " " + persona.getApellido() + ", Ocupación: " + persona.getOcupacion());
            }
        }
    }

