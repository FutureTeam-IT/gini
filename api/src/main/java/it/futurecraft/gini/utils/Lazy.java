package it.futurecraft.gini.utils;

/**
 * A lazy initialized variable.
 * <p>A lazy-init variable is a special type of variable which the value is initialized only when read for the first time.</p>
 *
 * @param <T> the type of the variable.
 */
public interface Lazy<T> {
    /**
     * Get the value of the variable.
     * <p>If none, the value is initialized.</p>
     *
     * @return the value.
     */
    T get();

    /**
     * Set the value of the variable.
     *
     * @param value the value.
     */
    void set(T value);
}
