package it.futurecraft.gini.transactions;

import it.futurecraft.gini.database.Repository;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDateTime;
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
    @NotNull
    List<Transaction> findBySender(String sender);

    /**
     * Lists all the transaction for a given receiver.
     *
     * @param receiver the receiver.
     * @return the list of transactions.
     */
    @NotNull
    List<Transaction> findByReceiver(String receiver);

    /**
     * Lists all the transaction before a given date.
     *
     * @param date the date.
     * @return the list of transactions.
     */
    @NotNull
    List<Transaction> findBefore(LocalDateTime date);

    /**
     * Lists all the transaction after a given date.
     *
     * @param date the date.
     * @return the list of transactions.
     */
    @NotNull
    List<Transaction> findAfter(LocalDateTime date);
}
