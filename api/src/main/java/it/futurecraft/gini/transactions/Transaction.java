package it.futurecraft.gini.transactions;

import it.futurecraft.gini.account.Account;
import it.futurecraft.gini.database.Schema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.time.LocalDateTime;

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
    @Nullable
    Account sender();

    /**
     * Get the transaction receiver.
     *
     * @return the receiver.
     */
    @Nullable
    Account receiver();

    /**
     * Get the transaction creation date.
     *
     * @return the creation date.
     */
    @NotNull
    LocalDateTime createdAt();
}
