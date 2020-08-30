package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CorddDateScheduleTypeS database table.
 */
@Entity
@NamedQuery(name = "CorddDateScheduleType.findAll", query = "SELECT c FROM CorddDateScheduleType c")
@Table(name = "CORDD_DATE_SCHEDULE_TYPE")
public class CorddDateScheduleType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "DAST_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date dastDaEndValidity;

    @Column(columnDefinition = "DATE", name = "DAST_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date dastDaStartValidity;

    @Column(length = 250, name = "DAST_DS_DATE_SCHEDULE_TYPE")
    private String dastDsDateScheduleType;

    @Column(name = "DAST_ID_DATE_SCHEDULE_TYPE", nullable = false, precision = 3, unique = true)
    @Id
    private Long dastIdDateScheduleType;

    @Column(length = 60, name = "DAST_NA_DATE_SCHEDULE_TYPE", nullable = false)
    private String dastNaDateScheduleType;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "corddDateScheduleType")
    private List<CordrCsitemDateType> cordrCsitemDateTypes;

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

    public Date getDastDaEndValidity() {
        if (this.dastDaEndValidity != null)
            return (Date) this.dastDaEndValidity.clone ();
        else
            return null;
    }

    public void setDastDaEndValidity(Date dastDaEndValidity) {
        if (dastDaEndValidity != null)
            this.dastDaEndValidity = (Date) dastDaEndValidity.clone ();
        else
            this.dastDaEndValidity = dastDaEndValidity;
    }

    public Date getDastDaStartValidity() {
        if (this.dastDaStartValidity != null)
            return (Date) this.dastDaStartValidity.clone ();
        else
            return null;
    }

    public void setDastDaStartValidity(Date dastDaStartValidity) {
        if (dastDaStartValidity != null)
            this.dastDaStartValidity = (Date) dastDaStartValidity.clone ();
        else
            this.dastDaStartValidity = dastDaStartValidity;
    }

    public String getDastDsDateScheduleType() {
        return this.dastDsDateScheduleType;
    }

    public void setDastDsDateScheduleType(String dastDsDateScheduleType) {
        this.dastDsDateScheduleType = dastDsDateScheduleType;
    }

    public Long getDastIdDateScheduleType() {
        return this.dastIdDateScheduleType;
    }

    public void setDastIdDateScheduleType(Long dastIdDateScheduleType) {
        this.dastIdDateScheduleType = dastIdDateScheduleType;
    }

    public String getDastNaDateScheduleType() {
        return this.dastNaDateScheduleType;
    }

    public void setDastNaDateScheduleType(String dastNaDateScheduleType) {
        this.dastNaDateScheduleType = dastNaDateScheduleType;
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

    public List<CordrCsitemDateType> getCordrCsitemDateTypes() {
        return this.cordrCsitemDateTypes;
    }

    public void setCordrCsitemDateTypes(List<CordrCsitemDateType> cordrCsitemDateTypes) {
        this.cordrCsitemDateTypes = cordrCsitemDateTypes;
    }

    public void addCordrCsitemDateTypes(CordrCsitemDateType cordrCsitemDateType) {
        if (this.cordrCsitemDateTypes == null)
            this.cordrCsitemDateTypes = new ArrayList<CordrCsitemDateType> ();
        this.cordrCsitemDateTypes.add ( cordrCsitemDateType );
    }

    public void removeCordrCsitemDateTypes(CordrCsitemDateType cordrCsitemDateTypeToRemove) {
        if (cordrCsitemDateTypeToRemove != null)
            this.cordrCsitemDateTypes.remove ( cordrCsitemDateTypeToRemove );
    }

}
