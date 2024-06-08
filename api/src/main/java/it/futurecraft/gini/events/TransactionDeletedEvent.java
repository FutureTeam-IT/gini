package it.futurecraft.gini.events;

import it.futurecraft.gini.transactions.Transaction;

/**
 * The event is notified when a transaction is deleted.
 *
 * @see Transaction
 */
public interface TransactionDeletedEvent {
    Transaction transaction();
}
