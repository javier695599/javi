package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CorddCsellingItemStateS database table.
 */
@Entity
@NamedQuery(name = "CorddCsellingItemState.findAll", query = "SELECT c FROM CorddCsellingItemState c")
@Table(name = "CORDD_CSELLING_ITEM_STATE")
public class CorddCsellingItemState implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "CSIS_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csisDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CSIS_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csisDaStartValidity;

    @Column(name = "CSIS_ID_CSELLING_ITEM_STATE", nullable = false, precision = 3, unique = true)
    @Id
    private Long csisIdCsellingItemState;

    @Column(length = 100, name = "CSSL_DS_CSITEM_STATE_LANG")
    private String csslDsCsitemStateLang;

    @Column(length = 40, name = "CSSL_NA_CSITEM_STATE_LANG", nullable = false)
    private String csslNaCsitemStateLang;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "corddCsellingItemState")
    private List<CordrCsitemStateLang> cordrCsitemStateLangs;
    @OneToMany(mappedBy = "corddCsellingItemState")
    private List<CordrCsitemTypeAssoc> cordrCsitemTypeAssocs;
    @OneToMany(mappedBy = "corddCsellingItemState")
    private List<CuinrCsellingStateInvolve> cuinrCsellingStateInvolves;

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

    public Date getCsisDaEndValidity() {
        if (this.csisDaEndValidity != null)
            return (Date) this.csisDaEndValidity.clone ();
        else
            return null;
    }

    public void setCsisDaEndValidity(Date csisDaEndValidity) {
        if (csisDaEndValidity != null)
            this.csisDaEndValidity = (Date) csisDaEndValidity.clone ();
        else
            this.csisDaEndValidity = csisDaEndValidity;
    }

    public Date getCsisDaStartValidity() {
        if (this.csisDaStartValidity != null)
            return (Date) this.csisDaStartValidity.clone ();
        else
            return null;
    }

    public void setCsisDaStartValidity(Date csisDaStartValidity) {
        if (csisDaStartValidity != null)
            this.csisDaStartValidity = (Date) csisDaStartValidity.clone ();
        else
            this.csisDaStartValidity = csisDaStartValidity;
    }

    public Long getCsisIdCsellingItemState() {
        return this.csisIdCsellingItemState;
    }

    public void setCsisIdCsellingItemState(Long csisIdCsellingItemState) {
        this.csisIdCsellingItemState = csisIdCsellingItemState;
    }

    public String getCsslDsCsitemStateLang() {
        return this.csslDsCsitemStateLang;
    }

    public void setCsslDsCsitemStateLang(String csslDsCsitemStateLang) {
        this.csslDsCsitemStateLang = csslDsCsitemStateLang;
    }

    public String getCsslNaCsitemStateLang() {
        return this.csslNaCsitemStateLang;
    }

    public void setCsslNaCsitemStateLang(String csslNaCsitemStateLang) {
        this.csslNaCsitemStateLang = csslNaCsitemStateLang;
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

    public List<CordrCsitemStateLang> getCordrCsitemStateLangs() {
        return this.cordrCsitemStateLangs;
    }

    public void setCordrCsitemStateLangs(List<CordrCsitemStateLang> cordrCsitemStateLangs) {
        this.cordrCsitemStateLangs = cordrCsitemStateLangs;
    }

    public void addCordrCsitemStateLangs(CordrCsitemStateLang cordrCsitemStateLang) {
        if (this.cordrCsitemStateLangs == null)
            this.cordrCsitemStateLangs = new ArrayList<CordrCsitemStateLang> ();
        this.cordrCsitemStateLangs.add ( cordrCsitemStateLang );
    }

    public void removeCordrCsitemStateLangs(CordrCsitemStateLang cordrCsitemStateLangToRemove) {
        if (cordrCsitemStateLangToRemove != null)
            this.cordrCsitemStateLangs.remove ( cordrCsitemStateLangToRemove );
    }

    public List<CordrCsitemTypeAssoc> getCordrCsitemTypeAssocs() {
        return this.cordrCsitemTypeAssocs;
    }

    public void setCordrCsitemTypeAssocs(List<CordrCsitemTypeAssoc> cordrCsitemTypeAssocs) {
        this.cordrCsitemTypeAssocs = cordrCsitemTypeAssocs;
    }

    public void addCordrCsitemTypeAssocs(CordrCsitemTypeAssoc cordrCsitemTypeAssoc) {
        if (this.cordrCsitemTypeAssocs == null)
            this.cordrCsitemTypeAssocs = new ArrayList<CordrCsitemTypeAssoc> ();
        this.cordrCsitemTypeAssocs.add ( cordrCsitemTypeAssoc );
    }

    public void removeCordrCsitemTypeAssocs(CordrCsitemTypeAssoc cordrCsitemTypeAssocToRemove) {
        if (cordrCsitemTypeAssocToRemove != null)
            this.cordrCsitemTypeAssocs.remove ( cordrCsitemTypeAssocToRemove );
    }

    public List<CuinrCsellingStateInvolve> getCuinrCsellingStateInvolves() {
        return this.cuinrCsellingStateInvolves;
    }

    public void setCuinrCsellingStateInvolves(List<CuinrCsellingStateInvolve> cuinrCsellingStateInvolves) {
        this.cuinrCsellingStateInvolves = cuinrCsellingStateInvolves;
    }

    public void addCuinrCsellingStateInvolves(CuinrCsellingStateInvolve cuinrCsellingStateInvolve) {
        if (this.cuinrCsellingStateInvolves == null)
            this.cuinrCsellingStateInvolves = new ArrayList<CuinrCsellingStateInvolve> ();
        this.cuinrCsellingStateInvolves.add ( cuinrCsellingStateInvolve );
    }

    public void removeCuinrCsellingStateInvolves(CuinrCsellingStateInvolve cuinrCsellingStateInvolveToRemove) {
        if (cuinrCsellingStateInvolveToRemove != null)
            this.cuinrCsellingStateInvolves.remove ( cuinrCsellingStateInvolveToRemove );
    }

}
