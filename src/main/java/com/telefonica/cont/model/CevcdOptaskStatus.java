package com.telefonica.cont.model;

import org.eclipse.persistence.annotations.Convert;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CevcdOptaskStatusS database table.
 */
@Entity
@NamedQuery(name = "CevcdOptaskStatus.findAll", query = "SELECT c FROM CevcdOptaskStatus c")
@Table(name = "CEVCD_OPTASK_STATUS")
public class CevcdOptaskStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "OPTS_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date optsDaEndValidity;

    @Column(columnDefinition = "DATE", name = "OPTS_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date optsDaStartValidity;

    @Column(name = "OPTS_ID_OPTASK_STATUS", nullable = false, precision = 2, unique = true)
    @Id
    private Long optsIdOptaskStatus;

    @Column(name = "OPTS_IN_FINAL_STATE", nullable = false)
    @Convert("BigDecimalBooleanConverter")
    private Boolean optsInFinalState;

    @Column(length = 50, name = "OPTS_NA_OPTASK_STATUS", nullable = false)
    private String optsNaOptaskStatus;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "cevcdOptaskStatus")
    private List<CevcaOptaskStatusMove> cevcaOptaskStatusMoves;

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

    public Date getOptsDaEndValidity() {
        if (this.optsDaEndValidity != null)
            return (Date) this.optsDaEndValidity.clone ();
        else
            return null;
    }

    public void setOptsDaEndValidity(Date optsDaEndValidity) {
        if (optsDaEndValidity != null)
            this.optsDaEndValidity = (Date) optsDaEndValidity.clone ();
        else
            this.optsDaEndValidity = optsDaEndValidity;
    }

    public Date getOptsDaStartValidity() {
        if (this.optsDaStartValidity != null)
            return (Date) this.optsDaStartValidity.clone ();
        else
            return null;
    }

    public void setOptsDaStartValidity(Date optsDaStartValidity) {
        if (optsDaStartValidity != null)
            this.optsDaStartValidity = (Date) optsDaStartValidity.clone ();
        else
            this.optsDaStartValidity = optsDaStartValidity;
    }

    public Long getOptsIdOptaskStatus() {
        return this.optsIdOptaskStatus;
    }

    public void setOptsIdOptaskStatus(Long optsIdOptaskStatus) {
        this.optsIdOptaskStatus = optsIdOptaskStatus;
    }

    public Boolean getOptsInFinalState() {
        return this.optsInFinalState;
    }

    public void setOptsInFinalState(Boolean optsInFinalState) {
        this.optsInFinalState = optsInFinalState;
    }

    public String getOptsNaOptaskStatus() {
        return this.optsNaOptaskStatus;
    }

    public void setOptsNaOptaskStatus(String optsNaOptaskStatus) {
        this.optsNaOptaskStatus = optsNaOptaskStatus;
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

}
