import java.util.function.Supplier;

/**
 * Java 8 way.
 * Much more elegant
 *
 * @author Cihad G&uuml;zel
 */
public class MyStrategyImplementation {

    private final Supplier<String> supplier;

    private MyStrategyImplementation(Supplier<String> supplier) {
        this.supplier = supplier;
    }

    public static MyStrategyImplementation of(Supplier<String> supplier) {
        return new MyStrategyImplementation(supplier);
    }

    public void doSomething() {
        System.out.println("a");
        System.out.println("a");
        System.out.println("a");
        System.out.println(supplier.get());
        System.out.println("b");
        System.out.println("b");
    }

    public static void main(String[] args) {
        MyStrategyImplementation.of(() -> "c").doSomething();
        System.out.println("--------");
        MyStrategyImplementation.of(() -> "d").doSomething();
    }
}
