package it.futurecraft.gini.events;

import it.futurecraft.gini.transactions.Transaction;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

/**
 * The event is notified when a transaction is deleted.
 *
 * @see Transaction
 */
public final class TransactionDeletedEvent extends Event {
    private static final HandlerList HANDLERS = new HandlerList();

    public static @NotNull HandlerList getHandlerList() {
        return HANDLERS;
    }

    private final Transaction transaction;

    public TransactionDeletedEvent(Transaction transaction) {
        this.transaction = transaction;
    }

    /**
     * The transaction deleted in this event.
     *
     * @return The transaction.
     */
    public @NotNull Transaction transaction() {
        return this.transaction;
    }

    @Override
    public @NotNull HandlerList getHandlers() {
        return HANDLERS;
    }
}
