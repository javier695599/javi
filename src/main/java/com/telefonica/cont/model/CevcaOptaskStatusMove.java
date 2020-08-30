package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CevcaOptaskStatusMoveS database table.
 */
@Entity
@NamedQuery(name = "CevcaOptaskStatusMove.findAll", query = "SELECT c FROM CevcaOptaskStatusMove c")
@Table(name = "CEVCA_OPTASK_STATUS_MOVE", uniqueConstraints = {@UniqueConstraint(columnNames = {"OPEL_ID_OPLAN_TASK",
        "OTHS_TI_START_VALIDITY"})})
public class CevcaOptaskStatusMove implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "OTHS_ID_OPTASK_STATUS_MOVE", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal othsIdOptaskStatusMove;

    @Column(name = "OTHS_TI_END_VALIDITY")
    private Timestamp othsTiEndValidity;

    @Column(name = "OTHS_TI_START_VALIDITY", nullable = false)
    private Timestamp othsTiStartValidity;

    @Column(name = "PARO_ID_FUNCTIONAL_ROLE", precision = 38)
    private BigDecimal paroIdFunctionalRole;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "OPTS_ID_OPTASK_STATUS", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcdOptaskStatus cevcdOptaskStatus;
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

    public BigDecimal getOthsIdOptaskStatusMove() {
        return this.othsIdOptaskStatusMove;
    }

    public void setOthsIdOptaskStatusMove(BigDecimal othsIdOptaskStatusMove) {
        this.othsIdOptaskStatusMove = othsIdOptaskStatusMove;
    }

    public Timestamp getOthsTiEndValidity() {
        if (this.othsTiEndValidity != null)
            return (Timestamp) this.othsTiEndValidity.clone ();
        else
            return null;
    }

    public void setOthsTiEndValidity(Timestamp othsTiEndValidity) {
        if (othsTiEndValidity != null)
            this.othsTiEndValidity = (Timestamp) othsTiEndValidity.clone ();
        else
            this.othsTiEndValidity = othsTiEndValidity;
    }

    public Timestamp getOthsTiStartValidity() {
        if (this.othsTiStartValidity != null)
            return (Timestamp) this.othsTiStartValidity.clone ();
        else
            return null;
    }

    public void setOthsTiStartValidity(Timestamp othsTiStartValidity) {
        if (othsTiStartValidity != null)
            this.othsTiStartValidity = (Timestamp) othsTiStartValidity.clone ();
        else
            this.othsTiStartValidity = othsTiStartValidity;
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

    public CevcdOptaskStatus getCevcdOptaskStatus() {
        return this.cevcdOptaskStatus;
    }

    public void setCevcdOptaskStatus(CevcdOptaskStatus cevcdOptaskStatus) {
        this.cevcdOptaskStatus = cevcdOptaskStatus;
    }

    public CevcpOplanTask getCevcpOplanTask() {
        return this.cevcpOplanTask;
    }

    public void setCevcpOplanTask(CevcpOplanTask cevcpOplanTask) {
        this.cevcpOplanTask = cevcpOplanTask;
    }

}
