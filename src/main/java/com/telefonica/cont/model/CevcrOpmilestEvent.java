package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the CevcrOpmilestEventS database table.
 */
@Entity
@NamedQuery(name = "CevcrOpmilestEvent.findAll", query = "SELECT c FROM CevcrOpmilestEvent c")
@Table(name = "CEVCR_OPMILEST_EVENT")
public class CevcrOpmilestEvent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "IWME_ID_IWFLOW_SP_MILEST_EVENT", nullable = false, precision = 8)
    private Long iwmeIdIwflowSpMilestEvent;

    @Column(name = "OPME_ID_OPMILEST_EVENT", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal opmeIdOpmilestEvent;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "OPEL_ID_OPLAN_MILESTON_WAIT")
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcpOplanMileston cevcpOplanMileston1;
    @JoinColumn(name = "OPEL_ID_OPLAN_MILESTON_SEND")
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcpOplanMileston cevcpOplanMileston2;
    @OneToMany(mappedBy = "cevcrOpmilestEvent")
    private List<CevcrOpmilestEventStMove> cevcrOpmilestEventStMoves;

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

    public Long getIwmeIdIwflowSpMilestEvent() {
        return this.iwmeIdIwflowSpMilestEvent;
    }

    public void setIwmeIdIwflowSpMilestEvent(Long iwmeIdIwflowSpMilestEvent) {
        this.iwmeIdIwflowSpMilestEvent = iwmeIdIwflowSpMilestEvent;
    }

    public BigDecimal getOpmeIdOpmilestEvent() {
        return this.opmeIdOpmilestEvent;
    }

    public void setOpmeIdOpmilestEvent(BigDecimal opmeIdOpmilestEvent) {
        this.opmeIdOpmilestEvent = opmeIdOpmilestEvent;
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

    public CevcpOplanMileston getCevcpOplanMileston1() {
        return this.cevcpOplanMileston1;
    }

    public void setCevcpOplanMileston1(CevcpOplanMileston cevcpOplanMileston1) {
        this.cevcpOplanMileston1 = cevcpOplanMileston1;
    }

    public CevcpOplanMileston getCevcpOplanMileston2() {
        return this.cevcpOplanMileston2;
    }

    public void setCevcpOplanMileston2(CevcpOplanMileston cevcpOplanMileston2) {
        this.cevcpOplanMileston2 = cevcpOplanMileston2;
    }

    public List<CevcrOpmilestEventStMove> getCevcrOpmilestEventStMoves() {
        return this.cevcrOpmilestEventStMoves;
    }

    public void setCevcrOpmilestEventStMoves(List<CevcrOpmilestEventStMove> cevcrOpmilestEventStMoves) {
        this.cevcrOpmilestEventStMoves = cevcrOpmilestEventStMoves;
    }

    public void addCevcrOpmilestEventStMoves(CevcrOpmilestEventStMove cevcrOpmilestEventStMove) {
        if (this.cevcrOpmilestEventStMoves == null)
            this.cevcrOpmilestEventStMoves = new ArrayList<CevcrOpmilestEventStMove> ();
        this.cevcrOpmilestEventStMoves.add ( cevcrOpmilestEventStMove );
    }

    public void removeCevcrOpmilestEventStMoves(CevcrOpmilestEventStMove cevcrOpmilestEventStMoveToRemove) {
        if (cevcrOpmilestEventStMoveToRemove != null)
            this.cevcrOpmilestEventStMoves.remove ( cevcrOpmilestEventStMoveToRemove );
    }

}
