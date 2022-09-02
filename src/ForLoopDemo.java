import java.util.Scanner;

public class ForLoopDemo {

    public static void main(String[] args) {

        // Print 1 - 5
        // int 1 - initilization - where the loop will start
        // i <= 5 - condition - where the loop will stop/end
        // i++ - post value increment
//        for (int i = 1; i <= 5; i++) {
//
//            System.out.println("Hi!");
//        }
//
//        System.out.println("End!");

        // Print even numbers from 1 - 100
//        for (int i = 1; i <= 100; i++) {
//
//            // print even numbers
//            if(i%2 == 0) {
//                System.out.println(i);
//            }
//        }

// ------------------------------------------------------------------------

//         // sum
//        int sum = 0;
//
//            for (int i = 1; i <= 10; i++) {
//               if(i % 2 == 0) {
//                  sum = sum + i;
//               }
//            }
//
//            System.out.println(sum);

// ------------------------------------------------------------------------

//        // product
//        int product = 1;
//
//        for (int i = 1; i <= 10; i++) {
//
//                product = product * i;
//
//        }
//
//        System.out.println(product);

// ------------------------------------------------------------------------

//        // fibnocci series 0 1 1 2 3
//        // 0 1 1 2 3
//
//        // first number
//        int a = 0;
//        // second number
//        int b = 1;
//        // amount of numbers you want in the series
//        int n = 10;
//
//        System.out.println(a);
//        System.out.println(b);
//
//        // printing from third number to last left number
//        for (int i = 1; i <= 8; i++) {
//            // number that adds the first and second number
//            int c = a+b;
//            System.out.println(c);
//            // changing the value of a and b
//            a=b;
//            b=c;
//
//        }

// ------------------------------------------------------------------------

//        // factorial series 5! = 5*4*3*2*1
//        // 0 1 1 2 3
//
//        int factorial = 1;
//
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }

// ------------------------------------------------------------------------

//        // PATTERN RELATED
//        // task to print 10 rows
//        for (int i =1; i <= 10; i++) {
//
//            // task to print each column - 5 columns
//            // fixed number of columns for each row
//            for (int j = 1; j <= 5; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

// -------------------------------------------------------------------------

//        // task to print 10 rows
//        for (int i =1; i <= 10; i++) {
//
//            // task to print each column - same as the number of the row
//            // dynamic
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

// ------------------------------------------------------------------------

//        // to print
//        // 1
//        // 2 2
//        // 3 3 3
//        // 4 4 4 4
//        // task to print 4 rows
//        for (int i =1; i <= 4; i++) {
//
//            // depends on row number
//            // dynamic
//            for (int j = 1; j <= i; j++) {
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }

//      ------------------------------------------------------------------------

//        // to print
//        // 1
//        // 1 2
//        // 1 2 3
//        // 1 2 3 4
//        // task to print 4 rows
//        for (int i =1; i <= 4; i++) {
//
//            // depends on column number
//            // dynamic
//            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }

// ------------------------------------------------------------------------

//        // While loop - infinite loop
//        // can help when you don't know the number of iterations
//
//        // int = 1; - initializer
//        // i<=10 - condition
//        // i++ - post value increment
//        int i = 1;
//        while(i<=10) {
//            System.out.println(i++);
//        }

// ------------------------------------------------------------------------

//        // While loop - when we don't know the number of iterations
//        // Number guessing game
//        // inbuilt method Math - all static methods
//
//        int random = (int)(Math.random()*10);
//        System.out.println(random);
//
//        Scanner sc = new Scanner(System.in);
//        boolean flag = true;
//
//        while(flag) {
//            System.out.println("Guess the number: ");
//            int anInt = sc.nextInt();
//            if(random == anInt) {
//                System.out.println("Right guess!!! You win");
//                flag = false;
//            }
//            else {
//                System.out.println("Try again...");
//            }
//        }

// ------------------------------------------------------------------------

        // Number of days in a month

        int month = 1;
        switch (month) {
            case 1:
            case 3:
                System.out.println("31 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            case 4:
                System.out.println("30 days");
                break;
            default:
                System.out.println(" Invalid input");
                break;
        }
        System.out.println("End");












// ------------------------------------------------------------------------
// ------------------------------------------------------------------------
// ------------------------------------------------------------------------
// ------------------------------------------------------------------------
// ------------------------------------------------------------------------



    }
}
