package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CevcdDateScheduleTypeS database table.
 */
@Entity
@NamedQuery(name = "CevcdDateScheduleType.findAll", query = "SELECT c FROM CevcdDateScheduleType c")
@Table(name = "CEVCD_DATE_SCHEDULE_TYPE")
public class CevcdDateScheduleType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "DSCT_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date dsctDaEndValidity;

    @Column(columnDefinition = "DATE", name = "DSCT_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date dsctDaStartValidity;

    @Column(length = 250, name = "DSCT_DS_DATE_SCHEDULE_TYPE")
    private String dsctDsDateScheduleType;

    @Column(name = "DSCT_ID_DATE_SCHEDULE_TYPE", nullable = false, precision = 3, unique = true)
    @Id
    private Long dsctIdDateScheduleType;

    @Column(length = 60, name = "DSCT_NA_DATE_SCHEDULE_TYPE", nullable = false)
    private String dsctNaDateScheduleType;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "cevcdDateScheduleType")
    private List<CevcrOptaskSchedule> cevcrOptaskSchedules;

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

    public Date getDsctDaEndValidity() {
        if (this.dsctDaEndValidity != null)
            return (Date) this.dsctDaEndValidity.clone ();
        else
            return null;
    }

    public void setDsctDaEndValidity(Date dsctDaEndValidity) {
        if (dsctDaEndValidity != null)
            this.dsctDaEndValidity = (Date) dsctDaEndValidity.clone ();
        else
            this.dsctDaEndValidity = dsctDaEndValidity;
    }

    public Date getDsctDaStartValidity() {
        if (this.dsctDaStartValidity != null)
            return (Date) this.dsctDaStartValidity.clone ();
        else
            return null;
    }

    public void setDsctDaStartValidity(Date dsctDaStartValidity) {
        if (dsctDaStartValidity != null)
            this.dsctDaStartValidity = (Date) dsctDaStartValidity.clone ();
        else
            this.dsctDaStartValidity = dsctDaStartValidity;
    }

    public String getDsctDsDateScheduleType() {
        return this.dsctDsDateScheduleType;
    }

    public void setDsctDsDateScheduleType(String dsctDsDateScheduleType) {
        this.dsctDsDateScheduleType = dsctDsDateScheduleType;
    }

    public Long getDsctIdDateScheduleType() {
        return this.dsctIdDateScheduleType;
    }

    public void setDsctIdDateScheduleType(Long dsctIdDateScheduleType) {
        this.dsctIdDateScheduleType = dsctIdDateScheduleType;
    }

    public String getDsctNaDateScheduleType() {
        return this.dsctNaDateScheduleType;
    }

    public void setDsctNaDateScheduleType(String dsctNaDateScheduleType) {
        this.dsctNaDateScheduleType = dsctNaDateScheduleType;
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

    public List<CevcrOptaskSchedule> getCevcrOptaskSchedules() {
        return this.cevcrOptaskSchedules;
    }

    public void setCevcrOptaskSchedules(List<CevcrOptaskSchedule> cevcrOptaskSchedules) {
        this.cevcrOptaskSchedules = cevcrOptaskSchedules;
    }

    public void addCevcrOptaskSchedules(CevcrOptaskSchedule cevcrOptaskSchedule) {
        if (this.cevcrOptaskSchedules == null)
            this.cevcrOptaskSchedules = new ArrayList<CevcrOptaskSchedule> ();
        this.cevcrOptaskSchedules.add ( cevcrOptaskSchedule );
    }

    public void removeCevcrOptaskSchedules(CevcrOptaskSchedule cevcrOptaskScheduleToRemove) {
        if (cevcrOptaskScheduleToRemove != null)
            this.cevcrOptaskSchedules.remove ( cevcrOptaskScheduleToRemove );
    }

}
