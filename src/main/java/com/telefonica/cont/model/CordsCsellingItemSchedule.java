package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CordsCsellingItemScheduleS database table.
 */
@Entity
@NamedQuery(name = "CordsCsellingItemSchedule.findAll", query = "SELECT c FROM CordsCsellingItemSchedule c")
@Table(name = "CORDS_CSELLING_ITEM_SCHEDULE", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BIIT_ID_CUSTOMER_SELLING_ITEM", "DAST_ID_DATE_SCHEDULE_TYPE"})})
public class CordsCsellingItemSchedule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BIIT_ID_CUSTOMER_SELLING_ITEM", nullable = false, precision = 38)
    private BigDecimal biitIdCustomerSellingItem;

    @Column(name = "CSIT_ID_CSELLING_ITEM_TYPE", nullable = false, precision = 3)
    private Long csitIdCsellingItemType;

    @Column(name = "DAST_ID_DATE_SCHEDULE_TYPE", nullable = false, precision = 3)
    private Long dastIdDateScheduleType;

    @Column(name = "SCHE_ID_CSELLING_ITEM_SCHEDULE", nullable = false, precision = 10, unique = true)
    @Id
    private Long scheIdCsellingItemSchedule;

    @Column(name = "SCHE_TI_CSELLING_ITEM_SCHEDULE", nullable = false)
    private Timestamp scheTiCsellingItemSchedule;

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

    public Long getCsitIdCsellingItemType() {
        return this.csitIdCsellingItemType;
    }

    public void setCsitIdCsellingItemType(Long csitIdCsellingItemType) {
        this.csitIdCsellingItemType = csitIdCsellingItemType;
    }

    public Long getDastIdDateScheduleType() {
        return this.dastIdDateScheduleType;
    }

    public void setDastIdDateScheduleType(Long dastIdDateScheduleType) {
        this.dastIdDateScheduleType = dastIdDateScheduleType;
    }

    public Long getScheIdCsellingItemSchedule() {
        return this.scheIdCsellingItemSchedule;
    }

    public void setScheIdCsellingItemSchedule(Long scheIdCsellingItemSchedule) {
        this.scheIdCsellingItemSchedule = scheIdCsellingItemSchedule;
    }

    public Timestamp getScheTiCsellingItemSchedule() {
        if (this.scheTiCsellingItemSchedule != null)
            return (Timestamp) this.scheTiCsellingItemSchedule.clone ();
        else
            return null;
    }

    public void setScheTiCsellingItemSchedule(Timestamp scheTiCsellingItemSchedule) {
        if (scheTiCsellingItemSchedule != null)
            this.scheTiCsellingItemSchedule = (Timestamp) scheTiCsellingItemSchedule.clone ();
        else
            this.scheTiCsellingItemSchedule = scheTiCsellingItemSchedule;
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
