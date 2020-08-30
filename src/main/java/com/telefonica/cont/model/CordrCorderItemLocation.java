package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CordrCorderItemLocationS database table.
 */
@Entity
@NamedQuery(name = "CordrCorderItemLocation.findAll", query = "SELECT c FROM CordrCorderItemLocation c")
@Table(name = "CORDR_CORDER_ITEM_LOCATION", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BIIT_ID_CUSTOMER_ORDER_ITEM", "COLO_ID_CORDER_LOCATION"})})
public class CordrCorderItemLocation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "COIL_ID_CORDER_ITEM_LOCATION", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal coilIdCorderItemLocation;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "BIIT_ID_CUSTOMER_ORDER_ITEM", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpCustomerOrderItem cordpCustomerOrderItem;
    @JoinColumn(name = "COLO_ID_CORDER_LOCATION", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CordrCorderLocation cordrCorderLocation;

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

    public BigDecimal getCoilIdCorderItemLocation() {
        return this.coilIdCorderItemLocation;
    }

    public void setCoilIdCorderItemLocation(BigDecimal coilIdCorderItemLocation) {
        this.coilIdCorderItemLocation = coilIdCorderItemLocation;
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

    public CordrCorderLocation getCordrCorderLocation() {
        return this.cordrCorderLocation;
    }

    public void setCordrCorderLocation(CordrCorderLocation cordrCorderLocation) {
        this.cordrCorderLocation = cordrCorderLocation;
    }

}
