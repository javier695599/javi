package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CordsCustomerOrderItemS database table.
 */
@Entity
@NamedQuery(name = "CordsCustomerOrderItem.findAll", query = "SELECT c FROM CordsCustomerOrderItem c")
@Table(name = "CORDS_CUSTOMER_ORDER_ITEM")
public class CordsCustomerOrderItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BIIT_ID_CUSTOMER_ORDER_ITEM", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal biitIdCustomerOrderItem;

    @Column(name = "BRSP_ID_RESTRICTION_SPEC", precision = 4)
    private Long brspIdRestrictionSpec;

    @Column(name = "BUIN_ID_CUSTOMER_ORDER", nullable = false, precision = 38)
    private BigDecimal buinIdCustomerOrder;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

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

    public BigDecimal getBiitIdCustomerOrderItem() {
        return this.biitIdCustomerOrderItem;
    }

    public void setBiitIdCustomerOrderItem(BigDecimal biitIdCustomerOrderItem) {
        this.biitIdCustomerOrderItem = biitIdCustomerOrderItem;
    }

    public Long getBrspIdRestrictionSpec() {
        return this.brspIdRestrictionSpec;
    }

    public void setBrspIdRestrictionSpec(Long brspIdRestrictionSpec) {
        this.brspIdRestrictionSpec = brspIdRestrictionSpec;
    }

    public BigDecimal getBuinIdCustomerOrder() {
        return this.buinIdCustomerOrder;
    }

    public void setBuinIdCustomerOrder(BigDecimal buinIdCustomerOrder) {
        this.buinIdCustomerOrder = buinIdCustomerOrder;
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

}
