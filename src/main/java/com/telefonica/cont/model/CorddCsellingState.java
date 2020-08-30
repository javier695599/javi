package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CorddCsellingStateS database table.
 */
@Entity
@NamedQuery(name = "CorddCsellingState.findAll", query = "SELECT c FROM CorddCsellingState c")
@Table(name = "CORDD_CSELLING_STATE")
public class CorddCsellingState implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "CSST_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csstDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CSST_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csstDaStartValidity;

    @Column(name = "CSST_ID_CSELLING_STATE", nullable = false, precision = 3, unique = true)
    @Id
    private Long csstIdCsellingState;

    @Column(length = 80, name = "CUSL_DS_CSELLING_STATE_LANG")
    private String cuslDsCsellingStateLang;

    @Column(length = 40, name = "CUSL_NA_CSELLING_STATE_LANG", nullable = false)
    private String cuslNaCsellingStateLang;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "corddCsellingState")
    private List<CordrCsellingStateLang> cordrCsellingStateLangs;
    @OneToMany(mappedBy = "corddCsellingState")
    private List<CordrCsellingStateRela> cordrCsellingStateRelas;
    @OneToMany(mappedBy = "corddCsellingState")
    private List<CuinrCsellingTypeState> cuinrCsellingTypeStates;

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

    public Date getCsstDaEndValidity() {
        if (this.csstDaEndValidity != null)
            return (Date) this.csstDaEndValidity.clone ();
        else
            return null;
    }

    public void setCsstDaEndValidity(Date csstDaEndValidity) {
        if (csstDaEndValidity != null)
            this.csstDaEndValidity = (Date) csstDaEndValidity.clone ();
        else
            this.csstDaEndValidity = csstDaEndValidity;
    }

    public Date getCsstDaStartValidity() {
        if (this.csstDaStartValidity != null)
            return (Date) this.csstDaStartValidity.clone ();
        else
            return null;
    }

    public void setCsstDaStartValidity(Date csstDaStartValidity) {
        if (csstDaStartValidity != null)
            this.csstDaStartValidity = (Date) csstDaStartValidity.clone ();
        else
            this.csstDaStartValidity = csstDaStartValidity;
    }

    public Long getCsstIdCsellingState() {
        return this.csstIdCsellingState;
    }

    public void setCsstIdCsellingState(Long csstIdCsellingState) {
        this.csstIdCsellingState = csstIdCsellingState;
    }

    public String getCuslDsCsellingStateLang() {
        return this.cuslDsCsellingStateLang;
    }

    public void setCuslDsCsellingStateLang(String cuslDsCsellingStateLang) {
        this.cuslDsCsellingStateLang = cuslDsCsellingStateLang;
    }

    public String getCuslNaCsellingStateLang() {
        return this.cuslNaCsellingStateLang;
    }

    public void setCuslNaCsellingStateLang(String cuslNaCsellingStateLang) {
        this.cuslNaCsellingStateLang = cuslNaCsellingStateLang;
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

    public List<CordrCsellingStateLang> getCordrCsellingStateLangs() {
        return this.cordrCsellingStateLangs;
    }

    public void setCordrCsellingStateLangs(List<CordrCsellingStateLang> cordrCsellingStateLangs) {
        this.cordrCsellingStateLangs = cordrCsellingStateLangs;
    }

    public void addCordrCsellingStateLangs(CordrCsellingStateLang cordrCsellingStateLang) {
        if (this.cordrCsellingStateLangs == null)
            this.cordrCsellingStateLangs = new ArrayList<CordrCsellingStateLang> ();
        this.cordrCsellingStateLangs.add ( cordrCsellingStateLang );
    }

    public void removeCordrCsellingStateLangs(CordrCsellingStateLang cordrCsellingStateLangToRemove) {
        if (cordrCsellingStateLangToRemove != null)
            this.cordrCsellingStateLangs.remove ( cordrCsellingStateLangToRemove );
    }

    public List<CordrCsellingStateRela> getCordrCsellingStateRelas() {
        return this.cordrCsellingStateRelas;
    }

    public void setCordrCsellingStateRelas(List<CordrCsellingStateRela> cordrCsellingStateRelas) {
        this.cordrCsellingStateRelas = cordrCsellingStateRelas;
    }

    public void addCordrCsellingStateRelas(CordrCsellingStateRela cordrCsellingStateRela) {
        if (this.cordrCsellingStateRelas == null)
            this.cordrCsellingStateRelas = new ArrayList<CordrCsellingStateRela> ();
        this.cordrCsellingStateRelas.add ( cordrCsellingStateRela );
    }

    public void removeCordrCsellingStateRelas(CordrCsellingStateRela cordrCsellingStateRelaToRemove) {
        if (cordrCsellingStateRelaToRemove != null)
            this.cordrCsellingStateRelas.remove ( cordrCsellingStateRelaToRemove );
    }

    public List<CuinrCsellingTypeState> getCuinrCsellingTypeStates() {
        return this.cuinrCsellingTypeStates;
    }

    public void setCuinrCsellingTypeStates(List<CuinrCsellingTypeState> cuinrCsellingTypeStates) {
        this.cuinrCsellingTypeStates = cuinrCsellingTypeStates;
    }

    public void addCuinrCsellingTypeStates(CuinrCsellingTypeState cuinrCsellingTypeState) {
        if (this.cuinrCsellingTypeStates == null)
            this.cuinrCsellingTypeStates = new ArrayList<CuinrCsellingTypeState> ();
        this.cuinrCsellingTypeStates.add ( cuinrCsellingTypeState );
    }

    public void removeCuinrCsellingTypeStates(CuinrCsellingTypeState cuinrCsellingTypeStateToRemove) {
        if (cuinrCsellingTypeStateToRemove != null)
            this.cuinrCsellingTypeStates.remove ( cuinrCsellingTypeStateToRemove );
    }

}
