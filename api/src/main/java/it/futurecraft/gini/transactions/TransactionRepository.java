package it.futurecraft.gini.transactions;

import it.futurecraft.gini.database.Repository;

import java.util.List;

/**
 * The repository for transactions.
 *
 * @see Transaction
 */
public interface TransactionRepository extends Repository<Integer, Transaction> {
    /**
     * Lists all the transaction for a given sender.
     *
     * @param sender the sender.
     * @return the list of transactions.
     */
    List<Transaction> findBySender(String sender);

    /**
     * Lists all the transaction for a given receiver.
     *
     * @param receiver the receiver.
     * @return the list of transactions.
     */
    List<Transaction> findByReceiver(String receiver);
}
