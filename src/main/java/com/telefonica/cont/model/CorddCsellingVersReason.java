package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CorddCsellingVersReasonS database table.
 */
@Entity
@NamedQuery(name = "CorddCsellingVersReason.findAll", query = "SELECT c FROM CorddCsellingVersReason c")
@Table(name = "CORDD_CSELLING_VERS_REASON")
public class CorddCsellingVersReason implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "CSVR_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csvrDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CSVR_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csvrDaStartValidity;

    @Column(length = 250, name = "CSVR_DS_CSELLING_VERS_REASON")
    private String csvrDsCsellingVersReason;

    @Column(name = "CSVR_ID_CSELLING_VERS_REASON", nullable = false, precision = 3, unique = true)
    @Id
    private Long csvrIdCsellingVersReason;

    @Column(length = 100, name = "CSVR_NA_CSELLING_VERS_REASON", nullable = false)
    private String csvrNaCsellingVersReason;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "corddCsellingVersReason")
    private List<CordrCsellingVersionType> cordrCsellingVersionTypes;

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

    public Date getCsvrDaEndValidity() {
        if (this.csvrDaEndValidity != null)
            return (Date) this.csvrDaEndValidity.clone ();
        else
            return null;
    }

    public void setCsvrDaEndValidity(Date csvrDaEndValidity) {
        if (csvrDaEndValidity != null)
            this.csvrDaEndValidity = (Date) csvrDaEndValidity.clone ();
        else
            this.csvrDaEndValidity = csvrDaEndValidity;
    }

    public Date getCsvrDaStartValidity() {
        if (this.csvrDaStartValidity != null)
            return (Date) this.csvrDaStartValidity.clone ();
        else
            return null;
    }

    public void setCsvrDaStartValidity(Date csvrDaStartValidity) {
        if (csvrDaStartValidity != null)
            this.csvrDaStartValidity = (Date) csvrDaStartValidity.clone ();
        else
            this.csvrDaStartValidity = csvrDaStartValidity;
    }

    public String getCsvrDsCsellingVersReason() {
        return this.csvrDsCsellingVersReason;
    }

    public void setCsvrDsCsellingVersReason(String csvrDsCsellingVersReason) {
        this.csvrDsCsellingVersReason = csvrDsCsellingVersReason;
    }

    public Long getCsvrIdCsellingVersReason() {
        return this.csvrIdCsellingVersReason;
    }

    public void setCsvrIdCsellingVersReason(Long csvrIdCsellingVersReason) {
        this.csvrIdCsellingVersReason = csvrIdCsellingVersReason;
    }

    public String getCsvrNaCsellingVersReason() {
        return this.csvrNaCsellingVersReason;
    }

    public void setCsvrNaCsellingVersReason(String csvrNaCsellingVersReason) {
        this.csvrNaCsellingVersReason = csvrNaCsellingVersReason;
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

    public List<CordrCsellingVersionType> getCordrCsellingVersionTypes() {
        return this.cordrCsellingVersionTypes;
    }

    public void setCordrCsellingVersionTypes(List<CordrCsellingVersionType> cordrCsellingVersionTypes) {
        this.cordrCsellingVersionTypes = cordrCsellingVersionTypes;
    }

    public void addCordrCsellingVersionTypes(CordrCsellingVersionType cordrCsellingVersionType) {
        if (this.cordrCsellingVersionTypes == null)
            this.cordrCsellingVersionTypes = new ArrayList<CordrCsellingVersionType> ();
        this.cordrCsellingVersionTypes.add ( cordrCsellingVersionType );
    }

    public void removeCordrCsellingVersionTypes(CordrCsellingVersionType cordrCsellingVersionTypeToRemove) {
        if (cordrCsellingVersionTypeToRemove != null)
            this.cordrCsellingVersionTypes.remove ( cordrCsellingVersionTypeToRemove );
    }

}
