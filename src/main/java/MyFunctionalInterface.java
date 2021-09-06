/**
 * It is best practice to add Functional Interface annotation.
 * Because after a long time later, people may add another method.
 * This way it gives an error and prevents that.
 *
 * @author Cihad G&uuml;zel
 */
@FunctionalInterface
public interface MyFunctionalInterface {

    void doSomething();
}
