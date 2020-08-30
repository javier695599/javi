package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CevcaOplanStatusMoveS database table.
 */
@Entity
@NamedQuery(name = "CevcaOplanStatusMove.findAll", query = "SELECT c FROM CevcaOplanStatusMove c")
@Table(name = "CEVCA_OPLAN_STATUS_MOVE", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "ORPL_ID_ORCHESTRATION_PLAN", "OPSM_TI_START_VALIDITY"})})
public class CevcaOplanStatusMove implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "OPSM_ID_OPLAN_STATUS_MOVE", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal opsmIdOplanStatusMove;

    @Column(name = "OPSM_TI_END_VALIDITY")
    private Timestamp opsmTiEndValidity;

    @Column(name = "OPSM_TI_START_VALIDITY", nullable = false)
    private Timestamp opsmTiStartValidity;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "OPLS_ID_OPLAN_STATUS", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcdOplanStatus cevcdOplanStatus;
    @JoinColumn(name = "ORPL_ID_ORCHESTRATION_PLAN", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcpOrchestrationPlan cevcpOrchestrationPlan;

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

    public BigDecimal getOpsmIdOplanStatusMove() {
        return this.opsmIdOplanStatusMove;
    }

    public void setOpsmIdOplanStatusMove(BigDecimal opsmIdOplanStatusMove) {
        this.opsmIdOplanStatusMove = opsmIdOplanStatusMove;
    }

    public Timestamp getOpsmTiEndValidity() {
        if (this.opsmTiEndValidity != null)
            return (Timestamp) this.opsmTiEndValidity.clone ();
        else
            return null;
    }

    public void setOpsmTiEndValidity(Timestamp opsmTiEndValidity) {
        if (opsmTiEndValidity != null)
            this.opsmTiEndValidity = (Timestamp) opsmTiEndValidity.clone ();
        else
            this.opsmTiEndValidity = opsmTiEndValidity;
    }

    public Timestamp getOpsmTiStartValidity() {
        if (this.opsmTiStartValidity != null)
            return (Timestamp) this.opsmTiStartValidity.clone ();
        else
            return null;
    }

    public void setOpsmTiStartValidity(Timestamp opsmTiStartValidity) {
        if (opsmTiStartValidity != null)
            this.opsmTiStartValidity = (Timestamp) opsmTiStartValidity.clone ();
        else
            this.opsmTiStartValidity = opsmTiStartValidity;
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

    public CevcdOplanStatus getCevcdOplanStatus() {
        return this.cevcdOplanStatus;
    }

    public void setCevcdOplanStatus(CevcdOplanStatus cevcdOplanStatus) {
        this.cevcdOplanStatus = cevcdOplanStatus;
    }

    public CevcpOrchestrationPlan getCevcpOrchestrationPlan() {
        return this.cevcpOrchestrationPlan;
    }

    public void setCevcpOrchestrationPlan(CevcpOrchestrationPlan cevcpOrchestrationPlan) {
        this.cevcpOrchestrationPlan = cevcpOrchestrationPlan;
    }

}
