package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CevcrOpmilestEventStMoveS database table.
 */
@Entity
@NamedQuery(name = "CevcrOpmilestEventStMove.findAll", query = "SELECT c FROM CevcrOpmilestEventStMove c")
@Table(name = "CEVCR_OPMILEST_EVENT_ST_MOVE", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "OPME_ID_OPMILESTON_EVENT", "OEHS_TI_START_VALIDITY"})})
public class CevcrOpmilestEventStMove implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "OEHS_ID_OPMILEST_EVENT_ST_MOVE", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal oehsIdOpmilestEventStMove;

    @Column(name = "OEHS_TI_END_VALIDITY")
    private Timestamp oehsTiEndValidity;

    @Column(name = "OEHS_TI_START_VALIDITY", nullable = false)
    private Timestamp oehsTiStartValidity;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "OEST_ID_OPMILEST_EVENT_STATUS", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcdOpmilestEventStatus cevcdOpmilestEventStatus;
    @JoinColumn(name = "OPME_ID_OPMILESTON_EVENT", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcrOpmilestEvent cevcrOpmilestEvent;

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

    public BigDecimal getOehsIdOpmilestEventStMove() {
        return this.oehsIdOpmilestEventStMove;
    }

    public void setOehsIdOpmilestEventStMove(BigDecimal oehsIdOpmilestEventStMove) {
        this.oehsIdOpmilestEventStMove = oehsIdOpmilestEventStMove;
    }

    public Timestamp getOehsTiEndValidity() {
        if (this.oehsTiEndValidity != null)
            return (Timestamp) this.oehsTiEndValidity.clone ();
        else
            return null;
    }

    public void setOehsTiEndValidity(Timestamp oehsTiEndValidity) {
        if (oehsTiEndValidity != null)
            this.oehsTiEndValidity = (Timestamp) oehsTiEndValidity.clone ();
        else
            this.oehsTiEndValidity = oehsTiEndValidity;
    }

    public Timestamp getOehsTiStartValidity() {
        if (this.oehsTiStartValidity != null)
            return (Timestamp) this.oehsTiStartValidity.clone ();
        else
            return null;
    }

    public void setOehsTiStartValidity(Timestamp oehsTiStartValidity) {
        if (oehsTiStartValidity != null)
            this.oehsTiStartValidity = (Timestamp) oehsTiStartValidity.clone ();
        else
            this.oehsTiStartValidity = oehsTiStartValidity;
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

    public CevcdOpmilestEventStatus getCevcdOpmilestEventStatus() {
        return this.cevcdOpmilestEventStatus;
    }

    public void setCevcdOpmilestEventStatus(CevcdOpmilestEventStatus cevcdOpmilestEventStatus) {
        this.cevcdOpmilestEventStatus = cevcdOpmilestEventStatus;
    }

    public CevcrOpmilestEvent getCevcrOpmilestEvent() {
        return this.cevcrOpmilestEvent;
    }

    public void setCevcrOpmilestEvent(CevcrOpmilestEvent cevcrOpmilestEvent) {
        this.cevcrOpmilestEvent = cevcrOpmilestEvent;
    }

}
