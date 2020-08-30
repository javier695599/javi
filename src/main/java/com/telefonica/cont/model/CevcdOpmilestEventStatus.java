package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CevcdOpmilestEventStatusS database table.
 */
@Entity
@NamedQuery(name = "CevcdOpmilestEventStatus.findAll", query = "SELECT c FROM CevcdOpmilestEventStatus c")
@Table(name = "CEVCD_OPMILEST_EVENT_STATUS")
public class CevcdOpmilestEventStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "OEST_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date oestDaEndValidity;

    @Column(columnDefinition = "DATE", name = "OEST_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date oestDaStartValidity;

    @Column(name = "OEST_ID_OPMILEST_EVENT_STATUS", nullable = false, precision = 2, unique = true)
    @Id
    private Long oestIdOpmilestEventStatus;

    @Column(length = 50, name = "OEST_NA_OPMILEST_EVENT_STATUS", nullable = false)
    private String oestNaOpmilestEventStatus;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "cevcdOpmilestEventStatus")
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

    public Date getOestDaEndValidity() {
        if (this.oestDaEndValidity != null)
            return (Date) this.oestDaEndValidity.clone ();
        else
            return null;
    }

    public void setOestDaEndValidity(Date oestDaEndValidity) {
        if (oestDaEndValidity != null)
            this.oestDaEndValidity = (Date) oestDaEndValidity.clone ();
        else
            this.oestDaEndValidity = oestDaEndValidity;
    }

    public Date getOestDaStartValidity() {
        if (this.oestDaStartValidity != null)
            return (Date) this.oestDaStartValidity.clone ();
        else
            return null;
    }

    public void setOestDaStartValidity(Date oestDaStartValidity) {
        if (oestDaStartValidity != null)
            this.oestDaStartValidity = (Date) oestDaStartValidity.clone ();
        else
            this.oestDaStartValidity = oestDaStartValidity;
    }

    public Long getOestIdOpmilestEventStatus() {
        return this.oestIdOpmilestEventStatus;
    }

    public void setOestIdOpmilestEventStatus(Long oestIdOpmilestEventStatus) {
        this.oestIdOpmilestEventStatus = oestIdOpmilestEventStatus;
    }

    public String getOestNaOpmilestEventStatus() {
        return this.oestNaOpmilestEventStatus;
    }

    public void setOestNaOpmilestEventStatus(String oestNaOpmilestEventStatus) {
        this.oestNaOpmilestEventStatus = oestNaOpmilestEventStatus;
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
