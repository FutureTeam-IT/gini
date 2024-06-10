package it.futurecraft.gini;

import it.futurecraft.gini.account.AccountRepository;
import it.futurecraft.gini.currency.CurrencyRepository;
import it.futurecraft.gini.database.ConnectionFactory;
import it.futurecraft.gini.transactions.TransactionRepository;

public interface GiniAPI {
    /**
     * Get the connection factory.
     *
     * @return the connection factory.
     */
    ConnectionFactory connectionFactory(); // TODO: Value the sense of this.

    /**
     * Get the transaction repository.
     *
     * @return the transaction repository.
     * @see TransactionRepository
     */
    TransactionRepository transactionRepository();

    /**
     * Get the account repository.
     *
     * @return the account repository.
     * @see AccountRepository
     */
    AccountRepository accountRepository();

    /**
     * Get the currency repository.
     *
     * @return the currency repository.
     * @see CurrencyRepository
     */
    CurrencyRepository currencyRepository();

    /**
     * Get the version of the API.
     *
     * @return the version of the API.
     */
    Version version();
}
