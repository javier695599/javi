package com.telefonica.cont.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the CuinrCqitemRelProdPromotedS database table.
 */
@Entity
@NamedQuery(name = "CuinrCqitemRelProdPromoted.findAll", query = "SELECT c FROM CuinrCqitemRelProdPromoted c")
@Table(name = "CUINR_CQITEM_REL_PROD_PROMOTED")
public class CuinrCqitemRelProdPromoted implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "BIIT_ID_CUSTOMER_QUOTE_ITEM", nullable = false, insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CuinpCustomerQuoteItem cuinpCustomerQuoteItem;
    @EmbeddedId
    private CuinrCqitemRelProdPromotedPK id;

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

    public CuinrCqitemRelProdPromotedPK getId() {
        return this.id;
    }

    public void setId(CuinrCqitemRelProdPromotedPK id) {
        this.id = id;
    }

}
