import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        System.out.println("start");
        int s = sum(2, 3);
        System.out.println(s);

        System.out.println("end");
        System.out.println(s);

    }
    public static int sum(int a , int b) {
        return a+b;
    }




    public static void main3(String[] args) {

        // normal type of variable
        int x = 2;
        System.out.println(x);

        System.out.println("start");
        // call to another method
        greet();
        System.out.println("end");

//      Student. - static level can see public methods outside the class

    }

        // not normal type of variable
        // "new" keyword creates an object
        // object is an instance
        // INTERVIEW Q ~ class in the blueprint to create that instance
//      Student s = new Student();
        //object ^      class ^

//            //V instance
//        Demo demo = new Demo();
//    }


    // main2 is called upon
    // public is an access specifier public means something that isn't hidden
//     anyone outside the class can see this
    // static thats that are loaded at the blueprint level
    // void is return type doesn't return any data - the method won't return anything to JVM
//    if you want it to return value then change to int or String or char etc
    // main2 is method name it is grayed out till called upon
    // in () we define what the method does


    public static void greet() {
        System.out.println("good morning");
    }

//    // static level
      // we don't need object here as things are already included in static
//    public static void main2(String[] args) {
//        int x = 1111111;
//        int b = 9;
//    }

//    // instance level
      // we need object for this instance method to work
//    public void main2(String[] args) {
//        int x = 1111111;
//        int b = 9;
//    }

        // premetive - directly hold value
//        int x = 2;
//
//        //non premetive - object gets created/stored in heep area and
//          reference area is stored in stack area(stack area contains all local variables)
//        Scanner sc = new Scanner(System.in);




}
