class Calcu {
    int add(int a, int b) {
        return a + b;
    }

    int sub(int a, int b, int c) {
        return a + b + c;
    }

    int mul(double a, double b) {
        return (int) (a + b);
    }
}

class Student {
    String name;
    int age;

    Student() {
        name = "UNKNOWN";
        age = 0;
    }

    Student(String n, int a) {
        name = n;
        age = a;
    }

    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    Student getStudent() {
        return this;
    }
}

public class FunctionDemo {
    public static void main(String[] args) {

        Calcu cal = new Calcu();

        System.out.println("Add two integers = " + cal.add(11, 22));
        System.out.println("Add three integers = " + cal.sub(5, 11, 22));
        System.out.println("Add two doubles = " + cal.mul(1.1, 2.2));

        Student s1 = new Student();
        Student s2 = new Student("Parag", 22);
        Student s3 = new Student(s2);

        s1.display();
        s2.display();
        s3.display();
    }
}
