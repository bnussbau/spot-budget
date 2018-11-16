/**
 * This file is auto-generated. All changes will be overwritten.
 */
package at.benjaminnussbaum.spotbudget.types.itemtypes;

import at.benjaminnussbaum.spotbudget.types.itemtypes.Account;
import at.benjaminnussbaum.spotbudget.types.itemtypes.Payee;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import io.spotnext.infrastructure.annotation.Accessor;
import io.spotnext.infrastructure.annotation.ItemType;
import io.spotnext.infrastructure.annotation.Property;
import io.spotnext.infrastructure.type.Item;

import java.lang.Double;
import java.lang.String;

import java.time.LocalDateTime;

import javax.validation.constraints.NotNull;


@SuppressFBWarnings({"MF_CLASS_MASKS_FIELD",
    "EI_EXPOSE_REP",
    "EI_EXPOSE_REP2"
})
@ItemType(persistable = true, typeCode = "transaction")
public class Transaction extends Item {
    /** Default serialVersionUID value. */
    private static final long serialVersionUID = 1L;
    public static final String TYPECODE = "transaction";
    public static final String PROPERTY_PAYEE = "payee";
    public static final String PROPERTY_ACCOUNT = "account";
    public static final String PROPERTY_AMOUNT = "amount";
    public static final String PROPERTY_DATE = "date";

    /**
     * Unique Payee name
     */
    @NotNull
    @Property(readable = true, writable = true)
    protected Payee payee;

    /**
     * Transaction account
     */
    @Property(readable = true, writable = true)
    protected Account account;

    /**
     * Transaction amount
     */
    @Property(readable = true, writable = true)
    protected Double amount;

    /**
     * Tansaction date
     */
    @Property(readable = true, writable = true)
    protected LocalDateTime date;

    /**
     * Unique Payee name
     */
    @Accessor(propertyName = "payee", type = io.spotnext.infrastructure.type.AccessorType.get)
    public Payee getPayee() {
        return this.payee;
    }

    /**
     * Tansaction date
     */
    @Accessor(propertyName = "date", type = io.spotnext.infrastructure.type.AccessorType.get)
    public LocalDateTime getDate() {
        return this.date;
    }

    /**
     * Transaction amount
     */
    @Accessor(propertyName = "amount", type = io.spotnext.infrastructure.type.AccessorType.get)
    public Double getAmount() {
        return this.amount;
    }

    /**
     * Tansaction date
     */
    @Accessor(propertyName = "date", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    /**
     * Transaction account
     */
    @Accessor(propertyName = "account", type = io.spotnext.infrastructure.type.AccessorType.get)
    public Account getAccount() {
        return this.account;
    }

    /**
     * Unique Payee name
     */
    @Accessor(propertyName = "payee", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setPayee(Payee payee) {
        this.payee = payee;
    }

    /**
     * Transaction amount
     */
    @Accessor(propertyName = "amount", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * Transaction account
     */
    @Accessor(propertyName = "account", type = io.spotnext.infrastructure.type.AccessorType.set)
    public void setAccount(Account account) {
        this.account = account;
    }
}
