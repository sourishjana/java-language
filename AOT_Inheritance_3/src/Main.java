public class Main {
    static class Member{
        String name;
        int age;
        String phoneNumber;
        String address;
        int salary;

        public Member(String name, int age, String phoneNumber, String address, int salary) {
            this.name = name;
            this.age = age;
            this.phoneNumber = phoneNumber;
            this.address = address;
            this.salary = salary;
        }

        void printSalary() {
            System.out.println("Salary is " + this.salary);
        }
    }
    static class Employee extends Member{
        String specialization;
        String department;
        public Employee(String name, int age, String phoneNumber, String address, int salary, String specialization, String department) {
            super(name, age, phoneNumber, address, salary);
            this.specialization = specialization;
            this.department = department;
        }
    }
    static class Manager extends Member{
        String specialization;
        String department;
        public Manager(String name, int age, String phoneNumber, String address, int salary, String specialization, String department) {
            super(name, age, phoneNumber, address, salary);
            this.specialization = specialization;
            this.department = department;
        }
    }

    public static void main(String[] args) {
        Employee a=new Employee("a employee",56,"88723873","a employee address",8732, "yds", "jsd");
        System.out.println(a.name+" "+a.address+" "+a.age+" "+a.phoneNumber+" "+a.salary);

        Manager b=new Manager("b employee",96,"7237633","b employee address",97732, "dshs", "jhahajd");
        System.out.println(b.name+" "+b.address+" "+b.age+" "+b.phoneNumber+" "+b.salary);
    }
}
