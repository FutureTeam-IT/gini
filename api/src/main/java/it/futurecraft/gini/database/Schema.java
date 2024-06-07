package it.futurecraft.gini.database;

import org.jetbrains.annotations.NotNull;

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
    @NotNull
    I id();

    /**
     * Publish the schema to the database.
     */
    void publish();
}
