package Advanced_Software_Design.lab10_proxyPattern;

public class VirtualProxy implements Subject{
    Subject realSub;
    @Override
    public void veryComplicatedTask() throws InterruptedException {
        if (realSub==null){
            realSub=new ComplexClass();
        }
        realSub.veryComplicatedTask();
    }
}
