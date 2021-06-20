package vip.ikkyu.factoryMethod;

public class PersonStaticFactory {


    public static Person  getPerson(int age){
        Person person = new Person();
        person.setId(age);
        person.setName("法外狂徒--张三");
        return person;
    }

    public static Person getPerson(String name){
         Person person = new  Person();
        person.setId(1);
        person.setName(name);
        return person;
    }

    public static  Person getPerson(String name, int id){
         Person person = new  Person();
        person.setId(id);
        person.setName(name);
        return person;
    }
}