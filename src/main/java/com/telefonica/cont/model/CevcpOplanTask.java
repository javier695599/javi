package com.telefonica.cont.model;

import org.eclipse.persistence.annotations.Convert;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the CevcpOplanTaskS database table.
 */
@Entity
@NamedQuery(name = "CevcpOplanTask.findAll", query = "SELECT c FROM CevcpOplanTask c")
@Table(name = "CEVCP_OPLAN_TASK")
public class CevcpOplanTask implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BIRO_ID_FUNCTIONAL_POOL", precision = 38)
    private BigDecimal biroIdFunctionalPool;

    @Column(name = "BUIN_ID_SHIPPING_ORDER", precision = 38)
    private BigDecimal buinIdShippingOrder;

    @Column(name = "OPEL_ID_OPLAN_TASK", nullable = false, precision = 38, unique = true)
    @Id
    private BigDecimal opelIdOplanTask;

    @Column(name = "OPTA_IN_UNDO", nullable = false)
    @Convert("BigDecimalBooleanConverter")
    private Boolean optaInUndo;

    @Column(name = "PARO_ID_FUNCTIONAL_ROLE", precision = 38)
    private BigDecimal paroIdFunctionalRole;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "cevcpOplanTask")
    private List<CevcaOptaskError> cevcaOptaskErrors;
    @OneToMany(mappedBy = "cevcpOplanTask")
    private List<CevcaOptaskStatusMove> cevcaOptaskStatusMoves;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "OPEL_ID_OPLAN_TASK")
    private CevcpOplanElement cevcpOplanElement;
    @OneToMany(mappedBy = "cevcpOplanTask")
    private List<CevcrOptaskIncident> cevcrOptaskIncidents;
    @OneToMany(mappedBy = "cevcpOplanTask")
    private List<CevcrOptaskItemSpec> cevcrOptaskItemSpecs;
    @OneToMany(mappedBy = "cevcpOplanTask1")
    private List<CevcrOptaskRelationship> cevcrOptaskRelationships1;
    @OneToMany(mappedBy = "cevcpOplanTask2")
    private List<CevcrOptaskRelationship> cevcrOptaskRelationships2;
    @OneToMany(mappedBy = "cevcpOplanTask")
    private List<CevcrOptaskSchedule> cevcrOptaskSchedules;
    @OneToMany(mappedBy = "cevcpOplanTask")
    private List<CordaLegacyOcsMessage> cordaLegacyOcsMessages;

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

    public BigDecimal getBiroIdFunctionalPool() {
        return this.biroIdFunctionalPool;
    }

    public void setBiroIdFunctionalPool(BigDecimal biroIdFunctionalPool) {
        this.biroIdFunctionalPool = biroIdFunctionalPool;
    }

    public BigDecimal getBuinIdShippingOrder() {
        return this.buinIdShippingOrder;
    }

    public void setBuinIdShippingOrder(BigDecimal buinIdShippingOrder) {
        this.buinIdShippingOrder = buinIdShippingOrder;
    }

    public BigDecimal getOpelIdOplanTask() {
        return this.opelIdOplanTask;
    }

    public void setOpelIdOplanTask(BigDecimal opelIdOplanTask) {
        this.opelIdOplanTask = opelIdOplanTask;
    }

    public Boolean getOptaInUndo() {
        return this.optaInUndo;
    }

    public void setOptaInUndo(Boolean optaInUndo) {
        this.optaInUndo = optaInUndo;
    }

    public BigDecimal getParoIdFunctionalRole() {
        return this.paroIdFunctionalRole;
    }

    public void setParoIdFunctionalRole(BigDecimal paroIdFunctionalRole) {
        this.paroIdFunctionalRole = paroIdFunctionalRole;
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

    public List<CevcaOptaskError> getCevcaOptaskErrors() {
        return this.cevcaOptaskErrors;
    }

    public void setCevcaOptaskErrors(List<CevcaOptaskError> cevcaOptaskErrors) {
        this.cevcaOptaskErrors = cevcaOptaskErrors;
    }

    public void addCevcaOptaskErrors(CevcaOptaskError cevcaOptaskError) {
        if (this.cevcaOptaskErrors == null)
            this.cevcaOptaskErrors = new ArrayList<CevcaOptaskError> ();
        this.cevcaOptaskErrors.add ( cevcaOptaskError );
    }

    public void removeCevcaOptaskErrors(CevcaOptaskError cevcaOptaskErrorToRemove) {
        if (cevcaOptaskErrorToRemove != null)
            this.cevcaOptaskErrors.remove ( cevcaOptaskErrorToRemove );
    }

    public List<CevcaOptaskStatusMove> getCevcaOptaskStatusMoves() {
        return this.cevcaOptaskStatusMoves;
    }

    public void setCevcaOptaskStatusMoves(List<CevcaOptaskStatusMove> cevcaOptaskStatusMoves) {
        this.cevcaOptaskStatusMoves = cevcaOptaskStatusMoves;
    }

    public void addCevcaOptaskStatusMoves(CevcaOptaskStatusMove cevcaOptaskStatusMove) {
        if (this.cevcaOptaskStatusMoves == null)
            this.cevcaOptaskStatusMoves = new ArrayList<CevcaOptaskStatusMove> ();
        this.cevcaOptaskStatusMoves.add ( cevcaOptaskStatusMove );
    }

    public void removeCevcaOptaskStatusMoves(CevcaOptaskStatusMove cevcaOptaskStatusMoveToRemove) {
        if (cevcaOptaskStatusMoveToRemove != null)
            this.cevcaOptaskStatusMoves.remove ( cevcaOptaskStatusMoveToRemove );
    }

    public CevcpOplanElement getCevcpOplanElement() {
        return this.cevcpOplanElement;
    }

    public void setCevcpOplanElement(CevcpOplanElement cevcpOplanElement) {
        this.cevcpOplanElement = cevcpOplanElement;
    }

    public List<CevcrOptaskIncident> getCevcrOptaskIncidents() {
        return this.cevcrOptaskIncidents;
    }

    public void setCevcrOptaskIncidents(List<CevcrOptaskIncident> cevcrOptaskIncidents) {
        this.cevcrOptaskIncidents = cevcrOptaskIncidents;
    }

    public void addCevcrOptaskIncidents(CevcrOptaskIncident cevcrOptaskIncident) {
        if (this.cevcrOptaskIncidents == null)
            this.cevcrOptaskIncidents = new ArrayList<CevcrOptaskIncident> ();
        this.cevcrOptaskIncidents.add ( cevcrOptaskIncident );
    }

    public void removeCevcrOptaskIncidents(CevcrOptaskIncident cevcrOptaskIncidentToRemove) {
        if (cevcrOptaskIncidentToRemove != null)
            this.cevcrOptaskIncidents.remove ( cevcrOptaskIncidentToRemove );
    }

    public List<CevcrOptaskItemSpec> getCevcrOptaskItemSpecs() {
        return this.cevcrOptaskItemSpecs;
    }

    public void setCevcrOptaskItemSpecs(List<CevcrOptaskItemSpec> cevcrOptaskItemSpecs) {
        this.cevcrOptaskItemSpecs = cevcrOptaskItemSpecs;
    }

    public void addCevcrOptaskItemSpecs(CevcrOptaskItemSpec cevcrOptaskItemSpec) {
        if (this.cevcrOptaskItemSpecs == null)
            this.cevcrOptaskItemSpecs = new ArrayList<CevcrOptaskItemSpec> ();
        this.cevcrOptaskItemSpecs.add ( cevcrOptaskItemSpec );
    }

    public void removeCevcrOptaskItemSpecs(CevcrOptaskItemSpec cevcrOptaskItemSpecToRemove) {
        if (cevcrOptaskItemSpecToRemove != null)
            this.cevcrOptaskItemSpecs.remove ( cevcrOptaskItemSpecToRemove );
    }

    public List<CevcrOptaskRelationship> getCevcrOptaskRelationships1() {
        return this.cevcrOptaskRelationships1;
    }

    public void setCevcrOptaskRelationships1(List<CevcrOptaskRelationship> cevcrOptaskRelationships1) {
        this.cevcrOptaskRelationships1 = cevcrOptaskRelationships1;
    }

    public void addCevcrOptaskRelationships1(CevcrOptaskRelationship cevcrOptaskRelationship) {
        if (this.cevcrOptaskRelationships1 == null)
            this.cevcrOptaskRelationships1 = new ArrayList<CevcrOptaskRelationship> ();
        this.cevcrOptaskRelationships1.add ( cevcrOptaskRelationship );
    }

    public void removeCevcrOptaskRelationships1(CevcrOptaskRelationship cevcrOptaskRelationshipToRemove) {
        if (cevcrOptaskRelationshipToRemove != null)
            this.cevcrOptaskRelationships1.remove ( cevcrOptaskRelationshipToRemove );
    }

    public List<CevcrOptaskRelationship> getCevcrOptaskRelationships2() {
        return this.cevcrOptaskRelationships2;
    }

    public void setCevcrOptaskRelationships2(List<CevcrOptaskRelationship> cevcrOptaskRelationships2) {
        this.cevcrOptaskRelationships2 = cevcrOptaskRelationships2;
    }

    public void addCevcrOptaskRelationships2(CevcrOptaskRelationship cevcrOptaskRelationship) {
        if (this.cevcrOptaskRelationships2 == null)
            this.cevcrOptaskRelationships2 = new ArrayList<CevcrOptaskRelationship> ();
        this.cevcrOptaskRelationships2.add ( cevcrOptaskRelationship );
    }

    public void removeCevcrOptaskRelationships2(CevcrOptaskRelationship cevcrOptaskRelationshipToRemove) {
        if (cevcrOptaskRelationshipToRemove != null)
            this.cevcrOptaskRelationships2.remove ( cevcrOptaskRelationshipToRemove );
    }

    public List<CevcrOptaskSchedule> getCevcrOptaskSchedules() {
        return this.cevcrOptaskSchedules;
    }

    public void setCevcrOptaskSchedules(List<CevcrOptaskSchedule> cevcrOptaskSchedules) {
        this.cevcrOptaskSchedules = cevcrOptaskSchedules;
    }

    public void addCevcrOptaskSchedules(CevcrOptaskSchedule cevcrOptaskSchedule) {
        if (this.cevcrOptaskSchedules == null)
            this.cevcrOptaskSchedules = new ArrayList<CevcrOptaskSchedule> ();
        this.cevcrOptaskSchedules.add ( cevcrOptaskSchedule );
    }

    public void removeCevcrOptaskSchedules(CevcrOptaskSchedule cevcrOptaskScheduleToRemove) {
        if (cevcrOptaskScheduleToRemove != null)
            this.cevcrOptaskSchedules.remove ( cevcrOptaskScheduleToRemove );
    }

    public List<CordaLegacyOcsMessage> getCordaLegacyOcsMessages() {
        return this.cordaLegacyOcsMessages;
    }

    public void setCordaLegacyOcsMessages(List<CordaLegacyOcsMessage> cordaLegacyOcsMessages) {
        this.cordaLegacyOcsMessages = cordaLegacyOcsMessages;
    }

    public void addCordaLegacyOcsMessages(CordaLegacyOcsMessage cordaLegacyOcsMessage) {
        if (this.cordaLegacyOcsMessages == null)
            this.cordaLegacyOcsMessages = new ArrayList<CordaLegacyOcsMessage> ();
        this.cordaLegacyOcsMessages.add ( cordaLegacyOcsMessage );
    }

    public void removeCordaLegacyOcsMessages(CordaLegacyOcsMessage cordaLegacyOcsMessageToRemove) {
        if (cordaLegacyOcsMessageToRemove != null)
            this.cordaLegacyOcsMessages.remove ( cordaLegacyOcsMessageToRemove );
    }

}
