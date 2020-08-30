package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CordrCsitemSubstateLangS database table.
 */
@Entity
@NamedQuery(name = "CordrCsitemSubstateLang.findAll", query = "SELECT c FROM CordrCsitemSubstateLang c")
@Table(name = "CORDR_CSITEM_SUBSTATE_LANG")
public class CordrCsitemSubstateLang implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(length = 300, name = "CSUL_DS_CSITEM_SUBSTATE_LANG")
    private String csulDsCsitemSubstateLang;

    @Column(length = 100, name = "CSUL_NA_CSITEM_SUBSTATE_LANG", nullable = false)
    private String csulNaCsitemSubstateLang;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(insertable = false, name = "CSSB_ID_CSITEM_SUBSTATE", nullable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsitemSubstate corddCsitemSubstate;
    @EmbeddedId
    private CordrCsitemSubstateLangPK id;

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

    public CorddCsitemSubstate getCorddCsitemSubstate() {
        return this.corddCsitemSubstate;
    }

    public void setCorddCsitemSubstate(CorddCsitemSubstate corddCsitemSubstate) {
        this.corddCsitemSubstate = corddCsitemSubstate;
    }

    public CordrCsitemSubstateLangPK getId() {
        return this.id;
    }

    public void setId(CordrCsitemSubstateLangPK id) {
        this.id = id;
    }

}
