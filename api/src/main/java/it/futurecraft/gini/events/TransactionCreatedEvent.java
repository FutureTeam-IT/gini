package it.futurecraft.gini.events;

import it.futurecraft.gini.transactions.Transaction;

/**
 * The event is notified when a transaction is created.
 *
 * @see Transaction
 */
public interface TransactionCreatedEvent {
    /**
     * The transaction created in this event.
     *
     * @return The transaction.
     */
    Transaction transaction();
}
