package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CorddCsitemSubstateS database table.
 */
@Entity
@NamedQuery(name = "CorddCsitemSubstate.findAll", query = "SELECT c FROM CorddCsitemSubstate c")
@Table(name = "CORDD_CSITEM_SUBSTATE")
public class CorddCsitemSubstate implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "CSSB_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date cssbDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CSSB_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date cssbDaStartValidity;

    @Column(name = "CSSB_ID_CSITEM_SUBSTATE", nullable = false, precision = 3, unique = true)
    @Id
    private Long cssbIdCsitemSubstate;

    @Column(length = 300, name = "CSUL_DS_CSITEM_SUBSTATE_LANG")
    private String csulDsCsitemSubstateLang;

    @Column(length = 100, name = "CSUL_NA_CSITEM_SUBSTATE_LANG", nullable = false)
    private String csulNaCsitemSubstateLang;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "corddCsitemSubstate")
    private List<CordrCsitemSubstateAsso> cordrCsitemSubstateAssos;
    @OneToMany(mappedBy = "corddCsitemSubstate")
    private List<CordrCsitemSubstateLang> cordrCsitemSubstateLangs;

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

    public Date getCssbDaEndValidity() {
        if (this.cssbDaEndValidity != null)
            return (Date) this.cssbDaEndValidity.clone ();
        else
            return null;
    }

    public void setCssbDaEndValidity(Date cssbDaEndValidity) {
        if (cssbDaEndValidity != null)
            this.cssbDaEndValidity = (Date) cssbDaEndValidity.clone ();
        else
            this.cssbDaEndValidity = cssbDaEndValidity;
    }

    public Date getCssbDaStartValidity() {
        if (this.cssbDaStartValidity != null)
            return (Date) this.cssbDaStartValidity.clone ();
        else
            return null;
    }

    public void setCssbDaStartValidity(Date cssbDaStartValidity) {
        if (cssbDaStartValidity != null)
            this.cssbDaStartValidity = (Date) cssbDaStartValidity.clone ();
        else
            this.cssbDaStartValidity = cssbDaStartValidity;
    }

    public Long getCssbIdCsitemSubstate() {
        return this.cssbIdCsitemSubstate;
    }

    public void setCssbIdCsitemSubstate(Long cssbIdCsitemSubstate) {
        this.cssbIdCsitemSubstate = cssbIdCsitemSubstate;
    }

    public String getCsulDsCsitemSubstateLang() {
        return this.csulDsCsitemSubstateLang;
    }

    public void setCsulDsCsitemSubstateLang(String csulDsCsitemSubstateLang) {
        this.csulDsCsitemSubstateLang = csulDsCsitemSubstateLang;
    }

    public String getCsulNaCsitemSubstateLang() {
        return this.csulNaCsitemSubstateLang;
    }

    public void setCsulNaCsitemSubstateLang(String csulNaCsitemSubstateLang) {
        this.csulNaCsitemSubstateLang = csulNaCsitemSubstateLang;
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

    public List<CordrCsitemSubstateAsso> getCordrCsitemSubstateAssos() {
        return this.cordrCsitemSubstateAssos;
    }

    public void setCordrCsitemSubstateAssos(List<CordrCsitemSubstateAsso> cordrCsitemSubstateAssos) {
        this.cordrCsitemSubstateAssos = cordrCsitemSubstateAssos;
    }

    public void addCordrCsitemSubstateAssos(CordrCsitemSubstateAsso cordrCsitemSubstateAsso) {
        if (this.cordrCsitemSubstateAssos == null)
            this.cordrCsitemSubstateAssos = new ArrayList<CordrCsitemSubstateAsso> ();
        this.cordrCsitemSubstateAssos.add ( cordrCsitemSubstateAsso );
    }

    public void removeCordrCsitemSubstateAssos(CordrCsitemSubstateAsso cordrCsitemSubstateAssoToRemove) {
        if (cordrCsitemSubstateAssoToRemove != null)
            this.cordrCsitemSubstateAssos.remove ( cordrCsitemSubstateAssoToRemove );
    }

    public List<CordrCsitemSubstateLang> getCordrCsitemSubstateLangs() {
        return this.cordrCsitemSubstateLangs;
    }

    public void setCordrCsitemSubstateLangs(List<CordrCsitemSubstateLang> cordrCsitemSubstateLangs) {
        this.cordrCsitemSubstateLangs = cordrCsitemSubstateLangs;
    }

    public void addCordrCsitemSubstateLangs(CordrCsitemSubstateLang cordrCsitemSubstateLang) {
        if (this.cordrCsitemSubstateLangs == null)
            this.cordrCsitemSubstateLangs = new ArrayList<CordrCsitemSubstateLang> ();
        this.cordrCsitemSubstateLangs.add ( cordrCsitemSubstateLang );
    }

    public void removeCordrCsitemSubstateLangs(CordrCsitemSubstateLang cordrCsitemSubstateLangToRemove) {
        if (cordrCsitemSubstateLangToRemove != null)
            this.cordrCsitemSubstateLangs.remove ( cordrCsitemSubstateLangToRemove );
    }

}
