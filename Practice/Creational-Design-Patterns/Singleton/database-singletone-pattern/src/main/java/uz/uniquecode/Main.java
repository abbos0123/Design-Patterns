package uz.uniquecode;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------Application Started------------------------------");
        Application app1 = new Application();
        Application app2 = new Application();

        app1.doSomeQuery("Select * from students where student.id=:12");
        app2.doSomeQuery("Delete student from students where student.id < 0");
        System.out.println("-------------------------Application Ended-------------------------------");
    }
}