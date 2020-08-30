package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CevcdOpmilestStatusS database table.
 */
@Entity
@NamedQuery(name = "CevcdOpmilestStatus.findAll", query = "SELECT c FROM CevcdOpmilestStatus c")
@Table(name = "CEVCD_OPMILEST_STATUS")
public class CevcdOpmilestStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "OPMS_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date opmsDaEndValidity;

    @Column(columnDefinition = "DATE", name = "OPMS_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date opmsDaStartValidity;

    @Column(name = "OPMS_ID_OPMILEST_STATUS", nullable = false, precision = 2, unique = true)
    @Id
    private Long opmsIdOpmilestStatus;

    @Column(length = 50, name = "OPMS_NA_OPMILEST_STATUS", nullable = false)
    private String opmsNaOpmilestStatus;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "cevcdOpmilestStatus")
    private List<CevcaOpmilestStatusMove> cevcaOpmilestStatusMoves;

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

    public Date getOpmsDaEndValidity() {
        if (this.opmsDaEndValidity != null)
            return (Date) this.opmsDaEndValidity.clone ();
        else
            return null;
    }

    public void setOpmsDaEndValidity(Date opmsDaEndValidity) {
        if (opmsDaEndValidity != null)
            this.opmsDaEndValidity = (Date) opmsDaEndValidity.clone ();
        else
            this.opmsDaEndValidity = opmsDaEndValidity;
    }

    public Date getOpmsDaStartValidity() {
        if (this.opmsDaStartValidity != null)
            return (Date) this.opmsDaStartValidity.clone ();
        else
            return null;
    }

    public void setOpmsDaStartValidity(Date opmsDaStartValidity) {
        if (opmsDaStartValidity != null)
            this.opmsDaStartValidity = (Date) opmsDaStartValidity.clone ();
        else
            this.opmsDaStartValidity = opmsDaStartValidity;
    }

    public Long getOpmsIdOpmilestStatus() {
        return this.opmsIdOpmilestStatus;
    }

    public void setOpmsIdOpmilestStatus(Long opmsIdOpmilestStatus) {
        this.opmsIdOpmilestStatus = opmsIdOpmilestStatus;
    }

    public String getOpmsNaOpmilestStatus() {
        return this.opmsNaOpmilestStatus;
    }

    public void setOpmsNaOpmilestStatus(String opmsNaOpmilestStatus) {
        this.opmsNaOpmilestStatus = opmsNaOpmilestStatus;
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

}
