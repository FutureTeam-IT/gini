package it.futurecraft.gini.database;

/**
 * A repository for a specific schema.
 * <p>A repository is a structure responsible of data manipulation for a certain schema (or table).</p>
 *
 * @param <I> The schema primary key type.
 * @param <T> The schema type.
 */
public interface Repository<I, T extends Schema<I>> {
    /**
     * Find a tuple in the schema by its primary key.
     *
     * @param id The primary key.
     * @return The tuple.
     */
    T findById(I id);

    /**
     * Create a new tuple in the schema.
     *
     * @param data The data to insert.
     * @return True if the operation was successful, false otherwise.
     */
    boolean create(T data);

    /**
     * Update a tuple in the schema.
     *
     * @param data The data to update.
     * @return True if the operation was successful, false otherwise.
     */
    boolean update(T data);

    /**
     * Delete a tuple in the schema.
     *
     * @param data The data to delete.
     * @return True if the operation was successful, false otherwise.
     */
    boolean delete(T data);
}
