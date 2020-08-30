package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the CevcpOrchestrationPlanS database table.
 */
@Entity
@NamedQuery(name = "CevcpOrchestrationPlan.findAll", query = "SELECT c FROM CevcpOrchestrationPlan c")
@Table(name = "CEVCP_ORCHESTRATION_PLAN")
public class CevcpOrchestrationPlan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "ORPL_ID_ORCHESTRATION_PLAN", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal orplIdOrchestrationPlan;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "cevcpOrchestrationPlan")
    private List<CevcaOplanStatusMove> cevcaOplanStatusMoves;
    @OneToMany(mappedBy = "cevcpOrchestrationPlan")
    private List<CevcpOplanElement> cevcpOplanElements;
    @JoinColumn(name = "BUIN_ID_CUSTOMER_ORDER", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpCustomerOrder cordpCustomerOrder;

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

    public BigDecimal getOrplIdOrchestrationPlan() {
        return this.orplIdOrchestrationPlan;
    }

    public void setOrplIdOrchestrationPlan(BigDecimal orplIdOrchestrationPlan) {
        this.orplIdOrchestrationPlan = orplIdOrchestrationPlan;
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

    public List<CevcaOplanStatusMove> getCevcaOplanStatusMoves() {
        return this.cevcaOplanStatusMoves;
    }

    public void setCevcaOplanStatusMoves(List<CevcaOplanStatusMove> cevcaOplanStatusMoves) {
        this.cevcaOplanStatusMoves = cevcaOplanStatusMoves;
    }

    public void addCevcaOplanStatusMoves(CevcaOplanStatusMove cevcaOplanStatusMove) {
        if (this.cevcaOplanStatusMoves == null)
            this.cevcaOplanStatusMoves = new ArrayList<CevcaOplanStatusMove> ();
        this.cevcaOplanStatusMoves.add ( cevcaOplanStatusMove );
    }

    public void removeCevcaOplanStatusMoves(CevcaOplanStatusMove cevcaOplanStatusMoveToRemove) {
        if (cevcaOplanStatusMoveToRemove != null)
            this.cevcaOplanStatusMoves.remove ( cevcaOplanStatusMoveToRemove );
    }

    public List<CevcpOplanElement> getCevcpOplanElements() {
        return this.cevcpOplanElements;
    }

    public void setCevcpOplanElements(List<CevcpOplanElement> cevcpOplanElements) {
        this.cevcpOplanElements = cevcpOplanElements;
    }

    public void addCevcpOplanElements(CevcpOplanElement cevcpOplanElement) {
        if (this.cevcpOplanElements == null)
            this.cevcpOplanElements = new ArrayList<CevcpOplanElement> ();
        this.cevcpOplanElements.add ( cevcpOplanElement );
    }

    public void removeCevcpOplanElements(CevcpOplanElement cevcpOplanElementToRemove) {
        if (cevcpOplanElementToRemove != null)
            this.cevcpOplanElements.remove ( cevcpOplanElementToRemove );
    }

    public CordpCustomerOrder getCordpCustomerOrder() {
        return this.cordpCustomerOrder;
    }

    public void setCordpCustomerOrder(CordpCustomerOrder cordpCustomerOrder) {
        this.cordpCustomerOrder = cordpCustomerOrder;
    }

}
