package it.futurecraft.gini.currency;

import it.futurecraft.gini.database.Schema;

/**
 * The schema for currencies.
 *
 * @see Schema
 */
public interface Currency extends Schema<Integer> {
    // TODO: Just there for now. Will be implemented in the future.

    /**
     * Get the currency name.
     *
     * @return the name.
     */
    String name();

    /**
     * Get the currency symbol.
     *
     * @return the symbol.
     */
    String symbol();
}
