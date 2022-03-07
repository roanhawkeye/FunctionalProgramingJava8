package com.exercises.fp;

public class FunctionsAsData {
    protected static class Person {
        private String name;
        private Integer age;

        public Person(String name, Integer age){
            this.name = name;
            this.age = age;
        }
    }

    protected static class DataLoader {
        public NoArgsFunction<Person> loadPerson;

        public DataLoader(Boolean isDevelopment){
            this.loadPerson = isDevelopment
                    ? this::loadPersonFake
                    : this::loadPersonReal;
        }

        private Person loadPersonReal(){
            System.out.println("Loading person...");
            return new Person("Real Person", 30);
        }

        private Person loadPersonFake(){
            System.out.println("Returning fake person...");
            return new Person("Fake Persona", 100);
        }
    }

    public static void main(String[] args) {
        Boolean IS_DEVELOPMENT = false;
        DataLoader dataLoader = new DataLoader(IS_DEVELOPMENT);
        System.out.println(dataLoader.loadPerson.apply());
    }
}
