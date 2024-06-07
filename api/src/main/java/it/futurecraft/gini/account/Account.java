package it.futurecraft.gini.account;

import it.futurecraft.gini.database.Schema;

/**
 * The schema for players' bank accounts.
 *
 * @see Schema
 */
public interface Account extends Schema<String> {
    /**
     * Get the player username.
     *
     * @return the username.
     */
    String username();

    /**
     * Get the player balance.
     *
     * @return the balance.
     */
    double balance();
}
