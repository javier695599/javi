package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the CevcrProcessMarkRelS database table.
 */
@Entity
@NamedQuery(name = "CevcrProcessMarkRel.findAll", query = "SELECT c FROM CevcrProcessMarkRel c")
@Table(name = "CEVCR_PROCESS_MARK_REL", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "PRMA_ID_PROCESS_MARK_O", "PRMA_ID_PROCESS_MARK_D"})})
public class CevcrProcessMarkRel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "PMRE_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date pmreDaEndValidity;

    @Column(columnDefinition = "DATE", name = "PMRE_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date pmreDaStartValidity;

    @Column(name = "PMRE_ID_PROCESS_MARK_REL", nullable = false, precision = 3, unique = true)
    @Id
    private Long pmreIdProcessMarkRel;

    @Column(name = "PMRE_NU_SEQUENTIAL_ORDER", precision = 6)
    private Long pmreNuSequentialOrder;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "PRMA_ID_PROCESS_MARK_D", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcpProcessMark cevcpProcessMark1;
    @JoinColumn(name = "PRMA_ID_PROCESS_MARK_O", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcpProcessMark cevcpProcessMark2;

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

    public Date getPmreDaEndValidity() {
        if (this.pmreDaEndValidity != null)
            return (Date) this.pmreDaEndValidity.clone ();
        else
            return null;
    }

    public void setPmreDaEndValidity(Date pmreDaEndValidity) {
        if (pmreDaEndValidity != null)
            this.pmreDaEndValidity = (Date) pmreDaEndValidity.clone ();
        else
            this.pmreDaEndValidity = pmreDaEndValidity;
    }

    public Date getPmreDaStartValidity() {
        if (this.pmreDaStartValidity != null)
            return (Date) this.pmreDaStartValidity.clone ();
        else
            return null;
    }

    public void setPmreDaStartValidity(Date pmreDaStartValidity) {
        if (pmreDaStartValidity != null)
            this.pmreDaStartValidity = (Date) pmreDaStartValidity.clone ();
        else
            this.pmreDaStartValidity = pmreDaStartValidity;
    }

    public Long getPmreIdProcessMarkRel() {
        return this.pmreIdProcessMarkRel;
    }

    public void setPmreIdProcessMarkRel(Long pmreIdProcessMarkRel) {
        this.pmreIdProcessMarkRel = pmreIdProcessMarkRel;
    }

    public Long getPmreNuSequentialOrder() {
        return this.pmreNuSequentialOrder;
    }

    public void setPmreNuSequentialOrder(Long pmreNuSequentialOrder) {
        this.pmreNuSequentialOrder = pmreNuSequentialOrder;
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

    public CevcpProcessMark getCevcpProcessMark1() {
        return this.cevcpProcessMark1;
    }

    public void setCevcpProcessMark1(CevcpProcessMark cevcpProcessMark1) {
        this.cevcpProcessMark1 = cevcpProcessMark1;
    }

    public CevcpProcessMark getCevcpProcessMark2() {
        return this.cevcpProcessMark2;
    }

    public void setCevcpProcessMark2(CevcpProcessMark cevcpProcessMark2) {
        this.cevcpProcessMark2 = cevcpProcessMark2;
    }

}
