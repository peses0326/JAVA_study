package pkg;

public class ModifierTest {

    private void messageInside() {
        System.out.println("this is private modifier");
    }

    public void messageOutside() {
        System.out.println("this is public modifier");
        messageInside();
    }

    protected void messageProtected() {
        System.out.println("this is protected modifier");
    }

    void messagePackagePrivate(){
        System.out.println("This is pkg private modifier");
    }

}
