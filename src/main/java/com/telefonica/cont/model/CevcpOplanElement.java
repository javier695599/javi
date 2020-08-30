package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the CevcpOplanElementS database table.
 */
@Entity
@NamedQuery(name = "CevcpOplanElement.findAll", query = "SELECT c FROM CevcpOplanElement c")
@Table(name = "CEVCP_OPLAN_ELEMENT")
public class CevcpOplanElement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "OPEL_ID_OPLAN_ELEMENT", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal opelIdOplanElement;

    @Column(length = 50, name = "OPEL_NA_OPLAN_ELEMENT", nullable = false)
    private String opelNaOplanElement;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "OPET_ID_OPELEMENT_TYPE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcdOpelementType cevcdOpelementType;
    @OneToOne(mappedBy = "cevcpOplanElement")
    private CevcpOplanMileston cevcpOplanMileston;
    @OneToOne(mappedBy = "cevcpOplanElement")
    private CevcpOplanTask cevcpOplanTask;
    @JoinColumn(name = "ORPL_ID_ORCHESTRATION_PLAN", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcpOrchestrationPlan cevcpOrchestrationPlan;
    @OneToMany(mappedBy = "cevcpOplanElement1")
    private List<CevcrOpelementAfterFinish> cevcrOpelementAfterFinishs1;
    @OneToMany(mappedBy = "cevcpOplanElement2")
    private List<CevcrOpelementAfterFinish> cevcrOpelementAfterFinishs2;
    @OneToMany(mappedBy = "cevcpOplanElement")
    private List<CevcrOpelementCuorItem> cevcrOpelementCuorItems;

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

    public BigDecimal getOpelIdOplanElement() {
        return this.opelIdOplanElement;
    }

    public void setOpelIdOplanElement(BigDecimal opelIdOplanElement) {
        this.opelIdOplanElement = opelIdOplanElement;
    }

    public String getOpelNaOplanElement() {
        return this.opelNaOplanElement;
    }

    public void setOpelNaOplanElement(String opelNaOplanElement) {
        this.opelNaOplanElement = opelNaOplanElement;
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

    public CevcdOpelementType getCevcdOpelementType() {
        return this.cevcdOpelementType;
    }

    public void setCevcdOpelementType(CevcdOpelementType cevcdOpelementType) {
        this.cevcdOpelementType = cevcdOpelementType;
    }

    public CevcpOplanMileston getCevcpOplanMileston() {
        return this.cevcpOplanMileston;
    }

    public void setCevcpOplanMileston(CevcpOplanMileston cevcpOplanMileston) {
        this.cevcpOplanMileston = cevcpOplanMileston;
    }

    public CevcpOplanTask getCevcpOplanTask() {
        return this.cevcpOplanTask;
    }

    public void setCevcpOplanTask(CevcpOplanTask cevcpOplanTask) {
        this.cevcpOplanTask = cevcpOplanTask;
    }

    public CevcpOrchestrationPlan getCevcpOrchestrationPlan() {
        return this.cevcpOrchestrationPlan;
    }

    public void setCevcpOrchestrationPlan(CevcpOrchestrationPlan cevcpOrchestrationPlan) {
        this.cevcpOrchestrationPlan = cevcpOrchestrationPlan;
    }

    public List<CevcrOpelementAfterFinish> getCevcrOpelementAfterFinishs1() {
        return this.cevcrOpelementAfterFinishs1;
    }

    public void setCevcrOpelementAfterFinishs1(List<CevcrOpelementAfterFinish> cevcrOpelementAfterFinishs1) {
        this.cevcrOpelementAfterFinishs1 = cevcrOpelementAfterFinishs1;
    }

    public void addCevcrOpelementAfterFinishs1(CevcrOpelementAfterFinish cevcrOpelementAfterFinish) {
        if (this.cevcrOpelementAfterFinishs1 == null)
            this.cevcrOpelementAfterFinishs1 = new ArrayList<CevcrOpelementAfterFinish> ();
        this.cevcrOpelementAfterFinishs1.add ( cevcrOpelementAfterFinish );
    }

    public void removeCevcrOpelementAfterFinishs1(CevcrOpelementAfterFinish cevcrOpelementAfterFinishToRemove) {
        if (cevcrOpelementAfterFinishToRemove != null)
            this.cevcrOpelementAfterFinishs1.remove ( cevcrOpelementAfterFinishToRemove );
    }

    public List<CevcrOpelementAfterFinish> getCevcrOpelementAfterFinishs2() {
        return this.cevcrOpelementAfterFinishs2;
    }

    public void setCevcrOpelementAfterFinishs2(List<CevcrOpelementAfterFinish> cevcrOpelementAfterFinishs2) {
        this.cevcrOpelementAfterFinishs2 = cevcrOpelementAfterFinishs2;
    }

    public void addCevcrOpelementAfterFinishs2(CevcrOpelementAfterFinish cevcrOpelementAfterFinish) {
        if (this.cevcrOpelementAfterFinishs2 == null)
            this.cevcrOpelementAfterFinishs2 = new ArrayList<CevcrOpelementAfterFinish> ();
        this.cevcrOpelementAfterFinishs2.add ( cevcrOpelementAfterFinish );
    }

    public void removeCevcrOpelementAfterFinishs2(CevcrOpelementAfterFinish cevcrOpelementAfterFinishToRemove) {
        if (cevcrOpelementAfterFinishToRemove != null)
            this.cevcrOpelementAfterFinishs2.remove ( cevcrOpelementAfterFinishToRemove );
    }

    public List<CevcrOpelementCuorItem> getCevcrOpelementCuorItems() {
        return this.cevcrOpelementCuorItems;
    }

    public void setCevcrOpelementCuorItems(List<CevcrOpelementCuorItem> cevcrOpelementCuorItems) {
        this.cevcrOpelementCuorItems = cevcrOpelementCuorItems;
    }

    public void addCevcrOpelementCuorItems(CevcrOpelementCuorItem cevcrOpelementCuorItem) {
        if (this.cevcrOpelementCuorItems == null)
            this.cevcrOpelementCuorItems = new ArrayList<CevcrOpelementCuorItem> ();
        this.cevcrOpelementCuorItems.add ( cevcrOpelementCuorItem );
    }

    public void removeCevcrOpelementCuorItems(CevcrOpelementCuorItem cevcrOpelementCuorItemToRemove) {
        if (cevcrOpelementCuorItemToRemove != null)
            this.cevcrOpelementCuorItems.remove ( cevcrOpelementCuorItemToRemove );
    }

}
