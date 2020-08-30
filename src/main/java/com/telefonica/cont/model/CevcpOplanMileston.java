package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the CevcpOplanMilestonS database table.
 */
@Entity
@NamedQuery(name = "CevcpOplanMileston.findAll", query = "SELECT c FROM CevcpOplanMileston c")
@Table(name = "CEVCP_OPLAN_MILESTON")
public class CevcpOplanMileston implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "OPEL_ID_OPLAN_MILESTON", nullable = false, precision = 38, unique = true)
    @Id
    private BigDecimal opelIdOplanMileston;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "cevcpOplanMileston")
    private List<CevcaOpmilestStatusMove> cevcaOpmilestStatusMoves;
    @JoinColumn(name = "OPMT_ID_OPMILEST_TYPE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcdOpmilestType cevcdOpmilestType;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "OPEL_ID_OPLAN_MILESTON")
    private CevcpOplanElement cevcpOplanElement;
    @OneToMany(mappedBy = "cevcpOplanMileston1")
    private List<CevcrOpmilestEvent> cevcrOpmilestEvents1;
    @OneToMany(mappedBy = "cevcpOplanMileston2")
    private List<CevcrOpmilestEvent> cevcrOpmilestEvents2;
    @OneToMany(mappedBy = "cevcpOplanMileston")
    private List<CevcrOpmilestItemsSpec> cevcrOpmilestItemsSpecs;

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

    public BigDecimal getOpelIdOplanMileston() {
        return this.opelIdOplanMileston;
    }

    public void setOpelIdOplanMileston(BigDecimal opelIdOplanMileston) {
        this.opelIdOplanMileston = opelIdOplanMileston;
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

    public List<CevcaOpmilestStatusMove> getCevcaOpmilestStatusMoves() {
        return this.cevcaOpmilestStatusMoves;
    }

    public void setCevcaOpmilestStatusMoves(List<CevcaOpmilestStatusMove> cevcaOpmilestStatusMoves) {
        this.cevcaOpmilestStatusMoves = cevcaOpmilestStatusMoves;
    }

    public void addCevcaOpmilestStatusMoves(CevcaOpmilestStatusMove cevcaOpmilestStatusMove) {
        if (this.cevcaOpmilestStatusMoves == null)
            this.cevcaOpmilestStatusMoves = new ArrayList<CevcaOpmilestStatusMove> ();
        this.cevcaOpmilestStatusMoves.add ( cevcaOpmilestStatusMove );
    }

    public void removeCevcaOpmilestStatusMoves(CevcaOpmilestStatusMove cevcaOpmilestStatusMoveToRemove) {
        if (cevcaOpmilestStatusMoveToRemove != null)
            this.cevcaOpmilestStatusMoves.remove ( cevcaOpmilestStatusMoveToRemove );
    }

    public CevcdOpmilestType getCevcdOpmilestType() {
        return this.cevcdOpmilestType;
    }

    public void setCevcdOpmilestType(CevcdOpmilestType cevcdOpmilestType) {
        this.cevcdOpmilestType = cevcdOpmilestType;
    }

    public CevcpOplanElement getCevcpOplanElement() {
        return this.cevcpOplanElement;
    }

    public void setCevcpOplanElement(CevcpOplanElement cevcpOplanElement) {
        this.cevcpOplanElement = cevcpOplanElement;
    }

    public List<CevcrOpmilestEvent> getCevcrOpmilestEvents1() {
        return this.cevcrOpmilestEvents1;
    }

    public void setCevcrOpmilestEvents1(List<CevcrOpmilestEvent> cevcrOpmilestEvents1) {
        this.cevcrOpmilestEvents1 = cevcrOpmilestEvents1;
    }

    public void addCevcrOpmilestEvents1(CevcrOpmilestEvent cevcrOpmilestEvent) {
        if (this.cevcrOpmilestEvents1 == null)
            this.cevcrOpmilestEvents1 = new ArrayList<CevcrOpmilestEvent> ();
        this.cevcrOpmilestEvents1.add ( cevcrOpmilestEvent );
    }

    public void removeCevcrOpmilestEvents1(CevcrOpmilestEvent cevcrOpmilestEventToRemove) {
        if (cevcrOpmilestEventToRemove != null)
            this.cevcrOpmilestEvents1.remove ( cevcrOpmilestEventToRemove );
    }

    public List<CevcrOpmilestEvent> getCevcrOpmilestEvents2() {
        return this.cevcrOpmilestEvents2;
    }

    public void setCevcrOpmilestEvents2(List<CevcrOpmilestEvent> cevcrOpmilestEvents2) {
        this.cevcrOpmilestEvents2 = cevcrOpmilestEvents2;
    }

    public void addCevcrOpmilestEvents2(CevcrOpmilestEvent cevcrOpmilestEvent) {
        if (this.cevcrOpmilestEvents2 == null)
            this.cevcrOpmilestEvents2 = new ArrayList<CevcrOpmilestEvent> ();
        this.cevcrOpmilestEvents2.add ( cevcrOpmilestEvent );
    }

    public void removeCevcrOpmilestEvents2(CevcrOpmilestEvent cevcrOpmilestEventToRemove) {
        if (cevcrOpmilestEventToRemove != null)
            this.cevcrOpmilestEvents2.remove ( cevcrOpmilestEventToRemove );
    }

    public List<CevcrOpmilestItemsSpec> getCevcrOpmilestItemsSpecs() {
        return this.cevcrOpmilestItemsSpecs;
    }

    public void setCevcrOpmilestItemsSpecs(List<CevcrOpmilestItemsSpec> cevcrOpmilestItemsSpecs) {
        this.cevcrOpmilestItemsSpecs = cevcrOpmilestItemsSpecs;
    }

    public void addCevcrOpmilestItemsSpecs(CevcrOpmilestItemsSpec cevcrOpmilestItemsSpec) {
        if (this.cevcrOpmilestItemsSpecs == null)
            this.cevcrOpmilestItemsSpecs = new ArrayList<CevcrOpmilestItemsSpec> ();
        this.cevcrOpmilestItemsSpecs.add ( cevcrOpmilestItemsSpec );
    }

    public void removeCevcrOpmilestItemsSpecs(CevcrOpmilestItemsSpec cevcrOpmilestItemsSpecToRemove) {
        if (cevcrOpmilestItemsSpecToRemove != null)
            this.cevcrOpmilestItemsSpecs.remove ( cevcrOpmilestItemsSpecToRemove );
    }

}
