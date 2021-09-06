/**
 * Serialization is complex to do properly. If we use enum we have serialization impl. for free
 * <p>
 * JVM guarantees that only one instance allowed for enum
 *
 * @author Cihad G&uuml;zel
 */
public enum Singleton {
    INSTANCE;
}
