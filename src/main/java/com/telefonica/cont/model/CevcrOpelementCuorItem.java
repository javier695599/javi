package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CevcrOpelementCuorItemS database table.
 */
@Entity
@NamedQuery(name = "CevcrOpelementCuorItem.findAll", query = "SELECT c FROM CevcrOpelementCuorItem c")
@Table(name = "CEVCR_OPELEMENT_CUOR_ITEM", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BIIT_ID_CUSTOMER_ORDER_ITEM", "OPEL_ID_OPLAN_ELEMENT"})})
public class CevcrOpelementCuorItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "OCOI_ID_OPELEMENT_CUOR_ITEM", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal ocoiIdOpelementCuorItem;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "OPEL_ID_OPLAN_ELEMENT", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcpOplanElement cevcpOplanElement;
    @JoinColumn(name = "BIIT_ID_CUSTOMER_ORDER_ITEM", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpCustomerOrderItem cordpCustomerOrderItem;

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

    public BigDecimal getOcoiIdOpelementCuorItem() {
        return this.ocoiIdOpelementCuorItem;
    }

    public void setOcoiIdOpelementCuorItem(BigDecimal ocoiIdOpelementCuorItem) {
        this.ocoiIdOpelementCuorItem = ocoiIdOpelementCuorItem;
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

    public CevcpOplanElement getCevcpOplanElement() {
        return this.cevcpOplanElement;
    }

    public void setCevcpOplanElement(CevcpOplanElement cevcpOplanElement) {
        this.cevcpOplanElement = cevcpOplanElement;
    }

    public CordpCustomerOrderItem getCordpCustomerOrderItem() {
        return this.cordpCustomerOrderItem;
    }

    public void setCordpCustomerOrderItem(CordpCustomerOrderItem cordpCustomerOrderItem) {
        this.cordpCustomerOrderItem = cordpCustomerOrderItem;
    }

}
