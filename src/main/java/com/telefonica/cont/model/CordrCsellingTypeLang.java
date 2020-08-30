package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CordrCsellingTypeLangS database table.
 */
@Entity
@NamedQuery(name = "CordrCsellingTypeLang.findAll", query = "SELECT c FROM CordrCsellingTypeLang c")
@Table(name = "CORDR_CSELLING_TYPE_LANG")
public class CordrCsellingTypeLang implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(length = 400, name = "CTYL_DS_CSELLING_TYPE_LANG")
    private String ctylDsCsellingTypeLang;

    @Column(length = 50, name = "CTYL_NA_CSELLING_TYPE_LANG", nullable = false)
    private String ctylNaCsellingTypeLang;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(insertable = false, name = "BINT_ID_CSELLING_TYPE", nullable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingType corddCsellingType;
    @EmbeddedId
    private CordrCsellingTypeLangPK id;

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

    public String getCtylDsCsellingTypeLang() {
        return this.ctylDsCsellingTypeLang;
    }

    public void setCtylDsCsellingTypeLang(String ctylDsCsellingTypeLang) {
        this.ctylDsCsellingTypeLang = ctylDsCsellingTypeLang;
    }

    public String getCtylNaCsellingTypeLang() {
        return this.ctylNaCsellingTypeLang;
    }

    public void setCtylNaCsellingTypeLang(String ctylNaCsellingTypeLang) {
        this.ctylNaCsellingTypeLang = ctylNaCsellingTypeLang;
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

    public CorddCsellingType getCorddCsellingType() {
        return this.corddCsellingType;
    }

    public void setCorddCsellingType(CorddCsellingType corddCsellingType) {
        this.corddCsellingType = corddCsellingType;
    }

    public CordrCsellingTypeLangPK getId() {
        return this.id;
    }

    public void setId(CordrCsellingTypeLangPK id) {
        this.id = id;
    }

}
