package BasicJavaProgram;

// Parent class
class person {
    void Runing () {
        System.out.println("Person is Running.");
    }
}

// Child class (inherits from Vehicle)
class Shoot extends Person {
    void Shooting() {
        System.out.println("Person is Shooting.");
    }
}

// Main class
public class SingleLevelInheritance {
    public static void main(String[] args) {
        Person MyPerson = new Person();  // Create object of child class

        MyPerson.Running();  // Call inherited method
    }
}