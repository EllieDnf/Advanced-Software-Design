package Advanced_Software_Design.lab10_proxyPattern;

public class ComplexClass implements Subject{

    public ComplexClass() throws InterruptedException {

        super();
        System.out.println("Very complicated Cunstructor...");
        Thread.sleep(10000);

    }

    public void veryComplicatedTask() {

        System.out.println("Very complicated task...");

    }

}
