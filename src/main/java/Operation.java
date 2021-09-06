import java.util.function.IntBinaryOperator;

/**
 * We could provide polymorphic feature with enum with limited instantiability
 * @author Cihad G&uuml;zel
 */
public enum Operation {
    ADD (Addition::apply), // if lambda is complex to be elegant then use another class and use method references
    SUBTRACT ((x, y) -> x - y),
    MULTIPLY ((x, y) -> x * y),
    DIVIDE ((x, y) -> x / y);

    private final IntBinaryOperator operator;

    Operation(IntBinaryOperator operator) {
        this.operator = operator;
    }

    public int apply(int x, int y) {
        return operator.applyAsInt(x, y);
    }
}
