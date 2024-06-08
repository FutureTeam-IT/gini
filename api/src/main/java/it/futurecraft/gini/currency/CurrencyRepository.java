package it.futurecraft.gini.currency;

import it.futurecraft.gini.database.Repository;

import java.util.Optional;

public interface CurrencyRepository extends Repository<Integer, Currency> {
    /**
     * Find a currency by its name.
     *
     * @param name the currency name.
     * @return the currency.
     */
    Optional<Currency> findByName(String name);
}
