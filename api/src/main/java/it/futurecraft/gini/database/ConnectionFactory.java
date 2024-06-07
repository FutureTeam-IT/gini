package it.futurecraft.gini.database;

import java.io.Closeable;
import java.sql.Connection;

/**
 * A factory for creating connections to a database.
 */
public interface ConnectionFactory extends Closeable {
    /**
     * Gets a connection from the connection pool.
     *
     * @return The connection.
     */
    Connection connection();
}
