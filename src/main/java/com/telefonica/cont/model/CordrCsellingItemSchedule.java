package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CordrCsellingItemScheduleS database table.
 */
@Entity
@NamedQuery(name = "CordrCsellingItemSchedule.findAll", query = "SELECT c FROM CordrCsellingItemSchedule c")
@Table(name = "CORDR_CSELLING_ITEM_SCHEDULE", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BIIT_ID_CUSTOMER_SELLING_ITEM", "DAST_ID_DATE_SCHEDULE_TYPE"})})
public class CordrCsellingItemSchedule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "SCHE_ID_CSELLING_ITEM_SCHEDULE", nullable = false, precision = 10, unique = true)
    @GeneratedValue(generator = "CORDR_CSELLING_ITEM_SCHEDULE_SCHEIDCSELLINGITEMSCHEDULE_GENERATOR")
    @Id
    @SequenceGenerator(allocationSize = 1, initialValue = 1,
            name = "CORDR_CSELLING_ITEM_SCHEDULE_SCHEIDCSELLINGITEMSCHEDULE_GENERATOR",
            sequenceName = "CORDA_CUSTSELLSCHEDULITEM_SEQ")
    private Long scheIdCsellingItemSchedule;

    @Column(name = "SCHE_TI_CSELLING_ITEM_SCHEDULE", nullable = false)
    private Timestamp scheTiCsellingItemSchedule;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumns({
            @JoinColumn(referencedColumnName = "BIIT_ID_CUSTOMER_SELLING_ITEM", nullable = false,
                    name = "BIIT_ID_CUSTOMER_SELLING_ITEM"),
            @JoinColumn(referencedColumnName = "CSIT_ID_CSELLING_ITEM_TYPE", nullable = false,
                    name = "CSIT_ID_CSELLING_ITEM_TYPE")})
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpCustomerSellingItem cordpCustomerSellingItem;
    @JoinColumns({
            @JoinColumn(referencedColumnName = "CSIT_ID_CSELLING_ITEM_TYPE", nullable = false, name = "CSIT_ID_CSELLING_ITEM_TYPE", updatable = false, insertable = false),
            @JoinColumn(referencedColumnName = "DAST_ID_DATE_SCHEDULE_TYPE", nullable = false, name = "DAST_ID_DATE_SCHEDULE_TYPE")})
    @ManyToOne(fetch = FetchType.LAZY)
    private CordrCsitemDateType cordrCsitemDateType;

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

    public CordpCustomerSellingItem getCordpCustomerSellingItem() {
        return this.cordpCustomerSellingItem;
    }

    public void setCordpCustomerSellingItem(CordpCustomerSellingItem cordpCustomerSellingItem) {
        this.cordpCustomerSellingItem = cordpCustomerSellingItem;
    }

    public CordrCsitemDateType getCordrCsitemDateType() {
        return this.cordrCsitemDateType;
    }

    public void setCordrCsitemDateType(CordrCsitemDateType cordrCsitemDateType) {
        this.cordrCsitemDateType = cordrCsitemDateType;
    }

}
