package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CordrCsitemStateLangS database table.
 */
@Entity
@NamedQuery(name = "CordrCsitemStateLang.findAll", query = "SELECT c FROM CordrCsitemStateLang c")
@Table(name = "CORDR_CSITEM_STATE_LANG")
public class CordrCsitemStateLang implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(length = 100, name = "CSSL_DS_CSITEM_STATE_LANG")
    private String csslDsCsitemStateLang;

    @Column(length = 40, name = "CSSL_NA_CSITEM_STATE_LANG", nullable = false)
    private String csslNaCsitemStateLang;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(insertable = false, name = "CSIS_ID_CSELLING_ITEM_STATE", nullable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingItemState corddCsellingItemState;
    @EmbeddedId
    private CordrCsitemStateLangPK id;

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

    public CorddCsellingItemState getCorddCsellingItemState() {
        return this.corddCsellingItemState;
    }

    public void setCorddCsellingItemState(CorddCsellingItemState corddCsellingItemState) {
        this.corddCsellingItemState = corddCsellingItemState;
    }

    public CordrCsitemStateLangPK getId() {
        return this.id;
    }

    public void setId(CordrCsitemStateLangPK id) {
        this.id = id;
    }

}
