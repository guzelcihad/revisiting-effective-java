/**
 * @author Cihad G&uuml;zel
 */
import java.util.Comparator;
import java.util.Objects;

import static com.google.common.base.Preconditions.checkArgument;
public class PhoneNumber implements Comparable<PhoneNumber> {

    private static final Comparator<PhoneNumber> PHONE_NUMBER_COMPARATOR =
            Comparator.comparingInt((PhoneNumber p) -> p.areaCode)
                .thenComparingInt(p -> p.number);

    private final int areaCode;

    private final int number;

    // minimize mutability, so make it private
    private PhoneNumber(int areaCode, int number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public static PhoneNumber of(int areaCode, int number) {
        checkArgument(areaCode < 100);
        checkArgument(number > 1000);
        // if it is expensive to create objects every time use an internal cache
        // to return object. Flyweight pattern
        return new PhoneNumber(areaCode, number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return areaCode == that.areaCode && number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, number);
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "areaCode=" + areaCode +
                ", number=" + number +
                '}';
    }

    @Override
    public int compareTo(PhoneNumber o) {
        return PHONE_NUMBER_COMPARATOR.compare(this, o);
    }

    public int getAreaCode() {
        return areaCode;
    }

    public int getNumber() {
        return number;
    }
}
