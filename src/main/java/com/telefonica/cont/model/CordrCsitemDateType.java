package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the CordrCsitemDateTypeS database table.
 */
@Entity
@NamedQuery(name = "CordrCsitemDateType.findAll", query = "SELECT c FROM CordrCsitemDateType c")
@Table(name = "CORDR_CSITEM_DATE_TYPE", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "CSIT_ID_CSELLING_ITEM_TYPE", "DAST_ID_DATE_SCHEDULE_TYPE"})})
public class CordrCsitemDateType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "DBAS_ID_CSITEM_DATE_TYPE", nullable = false, precision = 6, unique = true)
    @GeneratedValue(generator = "CORDR_CSITEM_DATE_TYPE_DBASIDCSITEMDATETYPE_GENERATOR")
    @Id
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "CORDR_CSITEM_DATE_TYPE_DBASIDCSITEMDATETYPE_GENERATOR", sequenceName = "CORD_DATECSTYPEASSO_SEQ")
    private Long dbasIdCsitemDateType;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "CSIT_ID_CSELLING_ITEM_TYPE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingItemType corddCsellingItemType;
    @JoinColumn(name = "DAST_ID_DATE_SCHEDULE_TYPE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddDateScheduleType corddDateScheduleType;
    @OneToMany(mappedBy = "cordrCsitemDateType")
    private List<CordrCsellingItemSchedule> cordrCsellingItemSchedules;

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

    public Long getDbasIdCsitemDateType() {
        return this.dbasIdCsitemDateType;
    }

    public void setDbasIdCsitemDateType(Long dbasIdCsitemDateType) {
        this.dbasIdCsitemDateType = dbasIdCsitemDateType;
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

    public CorddCsellingItemType getCorddCsellingItemType() {
        return this.corddCsellingItemType;
    }

    public void setCorddCsellingItemType(CorddCsellingItemType corddCsellingItemType) {
        this.corddCsellingItemType = corddCsellingItemType;
    }

    public CorddDateScheduleType getCorddDateScheduleType() {
        return this.corddDateScheduleType;
    }

    public void setCorddDateScheduleType(CorddDateScheduleType corddDateScheduleType) {
        this.corddDateScheduleType = corddDateScheduleType;
    }

    public List<CordrCsellingItemSchedule> getCordrCsellingItemSchedules() {
        return this.cordrCsellingItemSchedules;
    }

    public void setCordrCsellingItemSchedules(List<CordrCsellingItemSchedule> cordrCsellingItemSchedules) {
        this.cordrCsellingItemSchedules = cordrCsellingItemSchedules;
    }

    public void addCordrCsellingItemSchedules(CordrCsellingItemSchedule cordrCsellingItemSchedule) {
        if (this.cordrCsellingItemSchedules == null)
            this.cordrCsellingItemSchedules = new ArrayList<CordrCsellingItemSchedule> ();
        this.cordrCsellingItemSchedules.add ( cordrCsellingItemSchedule );
    }

    public void removeCordrCsellingItemSchedules(CordrCsellingItemSchedule cordrCsellingItemScheduleToRemove) {
        if (cordrCsellingItemScheduleToRemove != null)
            this.cordrCsellingItemSchedules.remove ( cordrCsellingItemScheduleToRemove );
    }

}
