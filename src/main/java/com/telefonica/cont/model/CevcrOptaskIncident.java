package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CevcrOptaskIncidentS database table.
 */
@Entity
@NamedQuery(name = "CevcrOptaskIncident.findAll", query = "SELECT c FROM CevcrOptaskIncident c")
@Table(name = "CEVCR_OPTASK_INCIDENT", uniqueConstraints = {@UniqueConstraint(columnNames = {"OPEL_ID_OPLAN_TASK",
        "INCI_ID_INCIDENT"})})
public class CevcrOptaskIncident implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "INCI_ID_INCIDENT", nullable = false, precision = 14)
    private Long inciIdIncident;

    @Column(name = "OPTI_ID_OPTASK_INCIDENT", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal optiIdOptaskIncident;

    @Column(name = "OPTI_IN_RAISES_SUSCRIBES", nullable = false, precision = 1)
    private Long optiInRaisesSuscribes;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "OPEL_ID_OPLAN_TASK", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcpOplanTask cevcpOplanTask;

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

    public Long getInciIdIncident() {
        return this.inciIdIncident;
    }

    public void setInciIdIncident(Long inciIdIncident) {
        this.inciIdIncident = inciIdIncident;
    }

    public BigDecimal getOptiIdOptaskIncident() {
        return this.optiIdOptaskIncident;
    }

    public void setOptiIdOptaskIncident(BigDecimal optiIdOptaskIncident) {
        this.optiIdOptaskIncident = optiIdOptaskIncident;
    }

    public Long getOptiInRaisesSuscribes() {
        return this.optiInRaisesSuscribes;
    }

    public void setOptiInRaisesSuscribes(Long optiInRaisesSuscribes) {
        this.optiInRaisesSuscribes = optiInRaisesSuscribes;
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

    public CevcpOplanTask getCevcpOplanTask() {
        return this.cevcpOplanTask;
    }

    public void setCevcpOplanTask(CevcpOplanTask cevcpOplanTask) {
        this.cevcpOplanTask = cevcpOplanTask;
    }

}
