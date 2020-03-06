package lesson19;

public class MayThred  extends Thread{
    public MayThred(Runnable target, String name) {
        super(target);
        setName(name);
    }
}

