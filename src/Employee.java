import java.util.Objects;

public class Employee {

    private long empId;
    private String name;

    public Employee(long empId, String name) {...}

//    public Employee(long empId) {this.empId = empId;}
//
//    public void test() {
//        System.out.println("in test");
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Employee employee = (Employee) o;
//        return empId == employee.empId;
//    }

    @Override
    public String toString() {...}

    public void login() {
        System.out.println("login at 9am");
    }

    public void work() {
        System.out.println("work at 9am");
    }

} // class
