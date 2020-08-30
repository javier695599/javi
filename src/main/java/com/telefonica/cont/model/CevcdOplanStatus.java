package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CevcdOplanStatusS database table.
 */
@Entity
@NamedQuery(name = "CevcdOplanStatus.findAll", query = "SELECT c FROM CevcdOplanStatus c")
@Table(name = "CEVCD_OPLAN_STATUS")
public class CevcdOplanStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "OPLS_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date oplsDaEndValidity;

    @Column(columnDefinition = "DATE", name = "OPLS_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date oplsDaStartValidity;

    @Column(name = "OPLS_ID_OPLAN_STATUS", nullable = false, precision = 2, unique = true)
    @Id
    private Long oplsIdOplanStatus;

    @Column(length = 50, name = "OPLS_NA_OPLAN_STATUS", nullable = false)
    private String oplsNaOplanStatus;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "cevcdOplanStatus")
    private List<CevcaOplanStatusMove> cevcaOplanStatusMoves;

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

    public Date getOplsDaEndValidity() {
        if (this.oplsDaEndValidity != null)
            return (Date) this.oplsDaEndValidity.clone ();
        else
            return null;
    }

    public void setOplsDaEndValidity(Date oplsDaEndValidity) {
        if (oplsDaEndValidity != null)
            this.oplsDaEndValidity = (Date) oplsDaEndValidity.clone ();
        else
            this.oplsDaEndValidity = oplsDaEndValidity;
    }

    public Date getOplsDaStartValidity() {
        if (this.oplsDaStartValidity != null)
            return (Date) this.oplsDaStartValidity.clone ();
        else
            return null;
    }

    public void setOplsDaStartValidity(Date oplsDaStartValidity) {
        if (oplsDaStartValidity != null)
            this.oplsDaStartValidity = (Date) oplsDaStartValidity.clone ();
        else
            this.oplsDaStartValidity = oplsDaStartValidity;
    }

    public Long getOplsIdOplanStatus() {
        return this.oplsIdOplanStatus;
    }

    public void setOplsIdOplanStatus(Long oplsIdOplanStatus) {
        this.oplsIdOplanStatus = oplsIdOplanStatus;
    }

    public String getOplsNaOplanStatus() {
        return this.oplsNaOplanStatus;
    }

    public void setOplsNaOplanStatus(String oplsNaOplanStatus) {
        this.oplsNaOplanStatus = oplsNaOplanStatus;
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

}
