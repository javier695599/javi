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
 * The persistent class for the CuinrCoitemRelProdPromotedS database table.
 */
@Entity
@NamedQuery(name = "CuinrCoitemRelProdPromoted.findAll", query = "SELECT c FROM CuinrCoitemRelProdPromoted c")
@Table(name = "CUINR_COITEM_REL_PROD_PROMOTED")
public class CuinrCoitemRelProdPromoted implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "BIIT_ID_CUSTOMER_ORDER_ITEM", nullable = false, insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpCustomerOrderItem cordpCustomerOrderItem;
    @EmbeddedId
    private CuinrCoitemRelProdPromotedPK id;

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

    public CordpCustomerOrderItem getCordpCustomerOrderItem() {
        return this.cordpCustomerOrderItem;
    }

    public void setCordpCustomerOrderItem(CordpCustomerOrderItem cordpCustomerOrderItem) {
        this.cordpCustomerOrderItem = cordpCustomerOrderItem;
    }

    public CuinrCoitemRelProdPromotedPK getId() {
        return this.id;
    }

    public void setId(CuinrCoitemRelProdPromotedPK id) {
        this.id = id;
    }

}
