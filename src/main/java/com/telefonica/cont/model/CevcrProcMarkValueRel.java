package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the CevcrProcMarkValueRelS database table.
 */
@Entity
@NamedQuery(name = "CevcrProcMarkValueRel.findAll", query = "SELECT c FROM CevcrProcMarkValueRel c")
@Table(name = "CEVCR_PROC_MARK_VALUE_REL", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "PMVA_ID_PROC_MARK_VALUE_O", "PMVA_ID_PROC_MARK_VALUE_D"})})
public class CevcrProcMarkValueRel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "PMVR_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date pmvrDaEndValidity;

    @Column(columnDefinition = "DATE", name = "PMVR_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date pmvrDaStartValidity;

    @Column(name = "PMVR_ID_PROC_MARK_VALUE_REL", nullable = false, precision = 3, unique = true)
    @Id
    private Long pmvrIdProcMarkValueRel;

    @Column(name = "PMVR_NU_SEQUENCE", precision = 6)
    private Long pmvrNuSequence;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "PMVA_ID_PROC_MARK_VALUE_O", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcpProcMarkValue cevcpProcMarkValue1;
    @JoinColumn(name = "PMVA_ID_PROC_MARK_VALUE_D", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcpProcMarkValue cevcpProcMarkValue2;

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

    public Date getPmvrDaEndValidity() {
        if (this.pmvrDaEndValidity != null)
            return (Date) this.pmvrDaEndValidity.clone ();
        else
            return null;
    }

    public void setPmvrDaEndValidity(Date pmvrDaEndValidity) {
        if (pmvrDaEndValidity != null)
            this.pmvrDaEndValidity = (Date) pmvrDaEndValidity.clone ();
        else
            this.pmvrDaEndValidity = pmvrDaEndValidity;
    }

    public Date getPmvrDaStartValidity() {
        if (this.pmvrDaStartValidity != null)
            return (Date) this.pmvrDaStartValidity.clone ();
        else
            return null;
    }

    public void setPmvrDaStartValidity(Date pmvrDaStartValidity) {
        if (pmvrDaStartValidity != null)
            this.pmvrDaStartValidity = (Date) pmvrDaStartValidity.clone ();
        else
            this.pmvrDaStartValidity = pmvrDaStartValidity;
    }

    public Long getPmvrIdProcMarkValueRel() {
        return this.pmvrIdProcMarkValueRel;
    }

    public void setPmvrIdProcMarkValueRel(Long pmvrIdProcMarkValueRel) {
        this.pmvrIdProcMarkValueRel = pmvrIdProcMarkValueRel;
    }

    public Long getPmvrNuSequence() {
        return this.pmvrNuSequence;
    }

    public void setPmvrNuSequence(Long pmvrNuSequence) {
        this.pmvrNuSequence = pmvrNuSequence;
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

    public CevcpProcMarkValue getCevcpProcMarkValue1() {
        return this.cevcpProcMarkValue1;
    }

    public void setCevcpProcMarkValue1(CevcpProcMarkValue cevcpProcMarkValue1) {
        this.cevcpProcMarkValue1 = cevcpProcMarkValue1;
    }

    public CevcpProcMarkValue getCevcpProcMarkValue2() {
        return this.cevcpProcMarkValue2;
    }

    public void setCevcpProcMarkValue2(CevcpProcMarkValue cevcpProcMarkValue2) {
        this.cevcpProcMarkValue2 = cevcpProcMarkValue2;
    }

}
