package it.futurecraft.gini;

import it.futurecraft.gini.database.ConnectionFactory;

public interface GiniAPI {
    /**
     * Get the connection factory.
     *
     * @return the connection factory.
     */
    ConnectionFactory connectionFactory();
}
