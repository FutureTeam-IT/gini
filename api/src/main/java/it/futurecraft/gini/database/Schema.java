package it.futurecraft.gini.database;

/**
 * A database schema.
 * <p>It specifies how the table for a type should be defined.</p>
 *
 * @param <I> the type of the id.
 */
public interface Schema<I> {
    /**
     * The primary key for the schema.
     *
     * @return the primary key.
     */
    I id();

    /**
     * Publish the schema to the database.
     */
    void publish();
}
