package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CevcrOptaskScheduleS database table.
 */
@Entity
@NamedQuery(name = "CevcrOptaskSchedule.findAll", query = "SELECT c FROM CevcrOptaskSchedule c")
@Table(name = "CEVCR_OPTASK_SCHEDULE", uniqueConstraints = {@UniqueConstraint(columnNames = {"OPEL_ID_OPLAN_TASK",
        "DSCT_ID_DATE_SCHEDULE_TYPE"})})
public class CevcrOptaskSchedule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "OPSC_ID_OPTASK_SCHEDULE", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal opscIdOptaskSchedule;

    @Column(name = "OPSC_TI_OPTASK_SCHEDULE", nullable = false)
    private Timestamp opscTiOptaskSchedule;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "DSCT_ID_DATE_SCHEDULE_TYPE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcdDateScheduleType cevcdDateScheduleType;
    @JoinColumn(name = "OPEL_ID_OPLAN_TASK", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcpOplanTask cevcpOplanTask;

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

    public BigDecimal getOpscIdOptaskSchedule() {
        return this.opscIdOptaskSchedule;
    }

    public void setOpscIdOptaskSchedule(BigDecimal opscIdOptaskSchedule) {
        this.opscIdOptaskSchedule = opscIdOptaskSchedule;
    }

    public Timestamp getOpscTiOptaskSchedule() {
        if (this.opscTiOptaskSchedule != null)
            return (Timestamp) this.opscTiOptaskSchedule.clone ();
        else
            return null;
    }

    public void setOpscTiOptaskSchedule(Timestamp opscTiOptaskSchedule) {
        if (opscTiOptaskSchedule != null)
            this.opscTiOptaskSchedule = (Timestamp) opscTiOptaskSchedule.clone ();
        else
            this.opscTiOptaskSchedule = opscTiOptaskSchedule;
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

    public CevcdDateScheduleType getCevcdDateScheduleType() {
        return this.cevcdDateScheduleType;
    }

    public void setCevcdDateScheduleType(CevcdDateScheduleType cevcdDateScheduleType) {
        this.cevcdDateScheduleType = cevcdDateScheduleType;
    }

    public CevcpOplanTask getCevcpOplanTask() {
        return this.cevcpOplanTask;
    }

    public void setCevcpOplanTask(CevcpOplanTask cevcpOplanTask) {
        this.cevcpOplanTask = cevcpOplanTask;
    }

}
