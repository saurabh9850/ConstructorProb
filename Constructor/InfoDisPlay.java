package Constructor;

class Person {
    String name;
    int age;
    Person() {
        name = "Saurabh";
        age = 24;
        System.out.println("Default constructor called");
    }
    Person(String n, int a) {
        name = n;
        age = a;
        System.out.println("Param constructor called " + name + " " + age);
    }

    void display() {
        System.out.println("Name " + name + " Age " + age);
    }
}

public class InfoDisPlay {
    public static void main(String[] args) {
        Person p1 = new Person();              
        Person p2 = new Person("Sarvesh", 25);   

        p1.display();
        p2.display();
    }
}
