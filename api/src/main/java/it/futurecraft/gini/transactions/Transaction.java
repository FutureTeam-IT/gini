package it.futurecraft.gini.transactions;

import it.futurecraft.gini.database.Schema;

/**
 * The schema for transactions.
 * <p>A transaction is an instance of bank movement.</p>
 *
 * @see Schema
 */
public interface Transaction extends Schema<Integer> {
    /**
     * Get the transaction amount.
     *
     * @return the amount.
     */
    double amount();

    /**
     * Get the transaction sender.
     *
     * @return the sender.
     */
    String sender();

    /**
     * Get the transaction receiver.
     *
     * @return the receiver.
     */
    String receiver();
}
