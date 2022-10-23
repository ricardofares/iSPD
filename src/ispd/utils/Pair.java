package ispd.utils;

/**
 * The {@link Pair} is used to store two, possibly, different type values.
 * <p>
 * This class provide an easy way to access the stored values in this pair. For
 * instance, let be the following pair
 * <pre>{@code
 *      Pair pair = new Pair<Integer, Integer>(2, 3);
 * }</pre>
 * Therefore, we say that the first pair's value is {@code 2} and the second
 * pair's value is {@code 3}. Moreover, these values can be accessed by
 * {@link #first ()} and {@link #second ()} methods, respectively.
 *
 * @param <T>    the first value type
 * @param <U>    the second value type
 * @param first  The first pair's value.
 * @param second The second pair's value.
 */
public record Pair<T, U>(T first, U second) {
}
