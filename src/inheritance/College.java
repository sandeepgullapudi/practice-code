package inheritance;
interface College {
    void Teach();
}

class Student1 {
    void Learn() {
        System.out.println("Bird is flying.");
    }
}

abstract class Faculty extends Student1 implements College {
    public void Teach() {
        System.out.println(" Teaching.");
    }
}
