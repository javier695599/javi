package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CuinrCqitemCustomerBillS database table.
 */
@Entity
@NamedQuery(name = "CuinrCqitemCustomerBill.findAll", query = "SELECT c FROM CuinrCqitemCustomerBill c")
@Table(name = "CUINR_CQITEM_CUSTOMER_BILL", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BIIT_ID_CUSTOMER_QUOTE_ITEM", "CULL_ID_CUSTOMER_BILL"})})
public class CuinrCqitemCustomerBill implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "CQCB_ID_CQITEM_CUSTOMER_BILL", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal cqcbIdCqitemCustomerBill;

    @Column(name = "CULL_ID_CUSTOMER_BILL", nullable = false, precision = 30)
    private BigDecimal cullIdCustomerBill;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "BIIT_ID_CUSTOMER_QUOTE_ITEM", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CuinpCustomerQuoteItem cuinpCustomerQuoteItem;

    public Timestamp getAudiTiCreation() {
        if (this.audiTiCreation != null)
            return (Timestamp) this.audiTiCreation.clone ();
        else
            return null;
    }

    public void setAudiTiCreation(Timestamp audiTiCreation) {
        if (audiTiCreation != null)
            this.audiTiCreation = (Timestamp) audiTiCreation.clone ();
        else
            this.audiTiCreation = audiTiCreation;
    }

    public Timestamp getAudiTiUpdate() {
        if (this.audiTiUpdate != null)
            return (Timestamp) this.audiTiUpdate.clone ();
        else
            return null;
    }

    public void setAudiTiUpdate(Timestamp audiTiUpdate) {
        if (audiTiUpdate != null)
            this.audiTiUpdate = (Timestamp) audiTiUpdate.clone ();
        else
            this.audiTiUpdate = audiTiUpdate;
    }

    public BigDecimal getCqcbIdCqitemCustomerBill() {
        return this.cqcbIdCqitemCustomerBill;
    }

    public void setCqcbIdCqitemCustomerBill(BigDecimal cqcbIdCqitemCustomerBill) {
        this.cqcbIdCqitemCustomerBill = cqcbIdCqitemCustomerBill;
    }

    public BigDecimal getCullIdCustomerBill() {
        return this.cullIdCustomerBill;
    }

    public void setCullIdCustomerBill(BigDecimal cullIdCustomerBill) {
        this.cullIdCustomerBill = cullIdCustomerBill;
    }

    public BigDecimal getUserIdCreatorParty() {
        return this.userIdCreatorParty;
    }

    public void setUserIdCreatorParty(BigDecimal userIdCreatorParty) {
        this.userIdCreatorParty = userIdCreatorParty;
    }

    public BigDecimal getUserIdUpdaterParty() {
        return this.userIdUpdaterParty;
    }

    public void setUserIdUpdaterParty(BigDecimal userIdUpdaterParty) {
        this.userIdUpdaterParty = userIdUpdaterParty;
    }

    public CuinpCustomerQuoteItem getCuinpCustomerQuoteItem() {
        return this.cuinpCustomerQuoteItem;
    }

    public void setCuinpCustomerQuoteItem(CuinpCustomerQuoteItem cuinpCustomerQuoteItem) {
        this.cuinpCustomerQuoteItem = cuinpCustomerQuoteItem;
    }

}