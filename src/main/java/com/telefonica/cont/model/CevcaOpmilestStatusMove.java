package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CevcaOpmilestStatusMoveS database table.
 */
@Entity
@NamedQuery(name = "CevcaOpmilestStatusMove.findAll", query = "SELECT c FROM CevcaOpmilestStatusMove c")
@Table(name = "CEVCA_OPMILEST_STATUS_MOVE",
        uniqueConstraints = {@UniqueConstraint(columnNames = {"OPEL_ID_OPLAN_MILESTON", "OPHS_TI_START_VALIDITY"})})
public class CevcaOpmilestStatusMove implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "OPHS_ID_OPMILEST_STATUS_MOVE", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal ophsIdOpmilestStatusMove;

    @Column(name = "OPHS_TI_END_VALIDITY")
    private Timestamp ophsTiEndValidity;

    @Column(name = "OPHS_TI_START_VALIDITY", nullable = false)
    private Timestamp ophsTiStartValidity;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "OPMS_ID_OPMILEST_STATUS", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcdOpmilestStatus cevcdOpmilestStatus;
    @JoinColumn(name = "OPEL_ID_OPLAN_MILESTON", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcpOplanMileston cevcpOplanMileston;

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

    public BigDecimal getOphsIdOpmilestStatusMove() {
        return this.ophsIdOpmilestStatusMove;
    }

    public void setOphsIdOpmilestStatusMove(BigDecimal ophsIdOpmilestStatusMove) {
        this.ophsIdOpmilestStatusMove = ophsIdOpmilestStatusMove;
    }

    public Timestamp getOphsTiEndValidity() {
        if (this.ophsTiEndValidity != null)
            return (Timestamp) this.ophsTiEndValidity.clone ();
        else
            return null;
    }

    public void setOphsTiEndValidity(Timestamp ophsTiEndValidity) {
        if (ophsTiEndValidity != null)
            this.ophsTiEndValidity = (Timestamp) ophsTiEndValidity.clone ();
        else
            this.ophsTiEndValidity = ophsTiEndValidity;
    }

    public Timestamp getOphsTiStartValidity() {
        if (this.ophsTiStartValidity != null)
            return (Timestamp) this.ophsTiStartValidity.clone ();
        else
            return null;
    }

    public void setOphsTiStartValidity(Timestamp ophsTiStartValidity) {
        if (ophsTiStartValidity != null)
            this.ophsTiStartValidity = (Timestamp) ophsTiStartValidity.clone ();
        else
            this.ophsTiStartValidity = ophsTiStartValidity;
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

    public CevcdOpmilestStatus getCevcdOpmilestStatus() {
        return this.cevcdOpmilestStatus;
    }

    public void setCevcdOpmilestStatus(CevcdOpmilestStatus cevcdOpmilestStatus) {
        this.cevcdOpmilestStatus = cevcdOpmilestStatus;
    }

    public CevcpOplanMileston getCevcpOplanMileston() {
        return this.cevcpOplanMileston;
    }

    public void setCevcpOplanMileston(CevcpOplanMileston cevcpOplanMileston) {
        this.cevcpOplanMileston = cevcpOplanMileston;
    }

}
