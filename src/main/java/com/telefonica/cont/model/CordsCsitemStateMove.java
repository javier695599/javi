package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the CordsCsitemStateMoveS database table.
 */
@Entity
@NamedQuery(name = "CordsCsitemStateMove.findAll", query = "SELECT c FROM CordsCsitemStateMove c")
@Table(name = "CORDS_CSITEM_STATE_MOVE", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BIIT_ID_CUSTOMER_SELLING_ITEM", "AUDI_TI_CREATION"})})
public class CordsCsitemStateMove implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BIIT_ID_CUSTOMER_SELLING_ITEM", nullable = false, precision = 38)
    private BigDecimal biitIdCustomerSellingItem;

    @Column(columnDefinition = "DATE", name = "CISM_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date cismDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CISM_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date cismDaStartValidity;

    @Column(name = "CISM_ID_CSITEM_STATE_MOVE", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal cismIdCsitemStateMove;

    @Column(name = "CSCH_ID_CSELLING_STATE_REASON", precision = 3)
    private Long cschIdCsellingStateReason;

    @Column(name = "CSIS_ID_CSELLING_ITEM_STATE", nullable = false, precision = 3)
    private Long csisIdCsellingItemState;

    @Column(name = "CSIT_ID_CSELLING_ITEM_TYPE", nullable = false, precision = 3)
    private Long csitIdCsellingItemType;

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

    public BigDecimal getBiitIdCustomerSellingItem() {
        return this.biitIdCustomerSellingItem;
    }

    public void setBiitIdCustomerSellingItem(BigDecimal biitIdCustomerSellingItem) {
        this.biitIdCustomerSellingItem = biitIdCustomerSellingItem;
    }

    public Date getCismDaEndValidity() {
        if (this.cismDaEndValidity != null)
            return (Date) this.cismDaEndValidity.clone ();
        else
            return null;
    }

    public void setCismDaEndValidity(Date cismDaEndValidity) {
        if (cismDaEndValidity != null)
            this.cismDaEndValidity = (Date) cismDaEndValidity.clone ();
        else
            this.cismDaEndValidity = cismDaEndValidity;
    }

    public Date getCismDaStartValidity() {
        if (this.cismDaStartValidity != null)
            return (Date) this.cismDaStartValidity.clone ();
        else
            return null;
    }

    public void setCismDaStartValidity(Date cismDaStartValidity) {
        if (cismDaStartValidity != null)
            this.cismDaStartValidity = (Date) cismDaStartValidity.clone ();
        else
            this.cismDaStartValidity = cismDaStartValidity;
    }

    public BigDecimal getCismIdCsitemStateMove() {
        return this.cismIdCsitemStateMove;
    }

    public void setCismIdCsitemStateMove(BigDecimal cismIdCsitemStateMove) {
        this.cismIdCsitemStateMove = cismIdCsitemStateMove;
    }

    public Long getCschIdCsellingStateReason() {
        return this.cschIdCsellingStateReason;
    }

    public void setCschIdCsellingStateReason(Long cschIdCsellingStateReason) {
        this.cschIdCsellingStateReason = cschIdCsellingStateReason;
    }

    public Long getCsisIdCsellingItemState() {
        return this.csisIdCsellingItemState;
    }

    public void setCsisIdCsellingItemState(Long csisIdCsellingItemState) {
        this.csisIdCsellingItemState = csisIdCsellingItemState;
    }

    public Long getCsitIdCsellingItemType() {
        return this.csitIdCsellingItemType;
    }

    public void setCsitIdCsellingItemType(Long csitIdCsellingItemType) {
        this.csitIdCsellingItemType = csitIdCsellingItemType;
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
