/**
 * Prefer Strategy pattern over Template pattern
 *
 * @author Cihad G&uuml;zel
 */
public abstract class MyTemplateMethodImplementation {

    public void doSomething() {
        System.out.println("a");
        System.out.println("a");
        System.out.println("a");
        System.out.println(getString());
        System.out.println("b");
        System.out.println("b");
    }

    protected abstract String getString();

    public static void main(String[] args) {
        new OneTemplateImpl().doSomething();
    }
}

class OneTemplateImpl extends MyTemplateMethodImplementation {

    @Override
    protected String getString() {
        return "c";
    }
}