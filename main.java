public class main {
    public static void main(String[] args){
        System.out.println("Java Master Project from Zero to End");

        //Inner class Concept
        Person person = new Person();
        Person.Bad badInstance = person.new Bad();
        badInstance.setCharacter("Bad Boy");
        System.out.println(badInstance.getCharacter());

    }
}
