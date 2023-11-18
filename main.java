import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Java Master Project from Zero to End");

        //Inner class Concept

//        Person person = new Person();
//        Person.Bad badInstance = person.new Bad();
//        badInstance.setCharacter("Bad Boy");
//        System.out.println(badInstance.getCharacter());

        // Exception Handling
//        try {
//            int a[] = null;
//            System.out.println("Access element three :" + a[3]);
//        }
//        catch (NullPointerException p){
//            System.out.println("Null Pointer Exception" + p);
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Exception thrown  :" + e);
//        }
//        finally {
//            System.out.println("Finally Block is closed");
//        }
//        System.out.println("Out of the block");

        //MultiThereading

//        MultiThreading multiThreading = new MultiThreading();
//        multiThreading.lpopo();
//
//        multiThreading.setThread1(new Thread(new Runnable() {
//            public void run() {
//            }
//        }));
//        System.out.println(multiThreading.getThread1());

//        Person<String> person = new Person<>();
//        person.setName("John");
//        System.out.println(person.getName());

        Comparator<Person> com = new Comparator<Person>(){
            public int compare(Person i , Person j){
                if(i.getAge()>j.getAge()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
//        List<Integer> ints = new ArrayList<>();
//        ints.add(21);
//        ints.add(234);
//        ints.add(212);
//        ints.add(03);
//        Collections.sort(ints,com);
//        System.out.println(ints);

//        List<Person> persons = new ArrayList<Person>();
//        Person<String> person1 = new Person<String>();
//        Person<String> person2 = new Person<String>();
//
//        person1.setName("John");
//        person1.setAge(88);
//
//        person2.setName("Mohn");
//        person2.setAge(8);
//        persons.add(person1);
//        persons.add(person2);
//
//        Collections.sort(persons, com);
//        for(Person person:persons){
//            System.out.println(person.getAge());
//        }

//        enum Color{
//            Red,
//            Black,
//            Blue
//        }
//        System.out.println(Color.Red);

//    Person<String> person1 = new Person<String>();
//    person1.setName("ZAIN");
//    person1.setAge(12);
//        Person<String> person2 = (Person<String>) person1.clone();

//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("My");
//        stringBuilder.append(person1.getName());
//        stringBuilder.append("is zain");
//        System.out.println(stringBuilder.);

//        Date date = new Date();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        String dateString = dateFormat.format(date);
//        System.out.println(dateString);
    }

}
