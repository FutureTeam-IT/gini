package it.futurecraft.gini.account;

import it.futurecraft.gini.database.Repository;

/**
 * The repository for players' bank accounts.
 *
 * @see Account
 */
public interface AccountRepository extends Repository<String, Account> {
    // TODO: Maybe add some other read methods.
}
