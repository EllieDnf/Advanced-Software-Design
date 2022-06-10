package Advanced_Software_Design.lab10_proxyPattern;

public class Application {
    public static void main(String[] args) throws InterruptedException {

        Subject subject = new VirtualProxy();
        Thread.sleep(10000);
        subject.veryComplicatedTask();
    }
}
