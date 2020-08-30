package com.telefonica.cont.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * The persistent class for the CuinrCqitemRelaShopCartItS database table.
 */
@Entity
@NamedQuery(name = "CuinrCqitemRelaShopCartIt.findAll", query = "SELECT c FROM CuinrCqitemRelaShopCartIt c")
@Table(name = "CUINR_CQITEM_RELA_SHOP_CART_IT")
public class CuinrCqitemRelaShopCartIt implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BIIT_ID_CUSTOMER_QUOTE_ITEM", nullable = false, precision = 38, unique = true)
    @Id
    private BigDecimal biitIdCustomerQuoteItem;

    @Column(name = "CQIE_ID_SHOP_CART_IT", nullable = false, precision = 4)
    private Long cqieIdShopCartIt;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "BIIT_ID_CUSTOMER_QUOTE_ITEM")
    private CuinpCustomerQuoteItem cuinpCustomerQuoteItem;

    public Timestamp getAudiTiCreation() {
        if (this.audiTiCreation != null)
            return (Timestamp) this.audiTiCreation.clone();
        else
            return null;
    }

    public void setAudiTiCreation(Timestamp audiTiCreation) {
        if (audiTiCreation != null)
            this.audiTiCreation = (Timestamp) audiTiCreation.clone();
        else
            this.audiTiCreation = audiTiCreation;
    }

    public Timestamp getAudiTiUpdate() {
        if (this.audiTiUpdate != null)
            return (Timestamp) this.audiTiUpdate.clone();
        else
            return null;
    }

    public void setAudiTiUpdate(Timestamp audiTiUpdate) {
        if (audiTiUpdate != null)
            this.audiTiUpdate = (Timestamp) audiTiUpdate.clone();
        else
            this.audiTiUpdate = audiTiUpdate;
    }

    public BigDecimal getBiitIdCustomerQuoteItem() {
        return this.biitIdCustomerQuoteItem;
    }

    public void setBiitIdCustomerQuoteItem(BigDecimal biitIdCustomerQuoteItem) {
        this.biitIdCustomerQuoteItem = biitIdCustomerQuoteItem;
    }

    public Long getCqieIdShopCartIt() {
        return this.cqieIdShopCartIt;
    }

    public void setCqieIdShopCartIt(Long cqieIdShopCartIt) {
        this.cqieIdShopCartIt = cqieIdShopCartIt;
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
