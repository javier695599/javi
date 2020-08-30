package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CordrCsellingStateLangS database table.
 */
@Entity
@NamedQuery(name = "CordrCsellingStateLang.findAll", query = "SELECT c FROM CordrCsellingStateLang c")
@Table(name = "CORDR_CSELLING_STATE_LANG")
public class CordrCsellingStateLang implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(length = 80, name = "CUSL_DS_CSELLING_STATE_LANG")
    private String cuslDsCsellingStateLang;

    @Column(length = 40, name = "CUSL_NA_CSELLING_STATE_LANG", nullable = false)
    private String cuslNaCsellingStateLang;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(insertable = false, name = "CSST_ID_CSELLING_STATE", nullable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingState corddCsellingState;
    @EmbeddedId
    private CordrCsellingStateLangPK id;

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

    public CorddCsellingState getCorddCsellingState() {
        return this.corddCsellingState;
    }

    public void setCorddCsellingState(CorddCsellingState corddCsellingState) {
        this.corddCsellingState = corddCsellingState;
    }

    public CordrCsellingStateLangPK getId() {
        return this.id;
    }

    public void setId(CordrCsellingStateLangPK id) {
        this.id = id;
    }

}
