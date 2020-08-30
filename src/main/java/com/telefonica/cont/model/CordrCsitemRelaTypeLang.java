package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CordrCsitemRelaTypeLangS database table.
 */
@Entity
@NamedQuery(name = "CordrCsitemRelaTypeLang.findAll", query = "SELECT c FROM CordrCsitemRelaTypeLang c")
@Table(name = "CORDR_CSITEM_RELA_TYPE_LANG")
public class CordrCsitemRelaTypeLang implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(length = 80, name = "CLAN_DS_CSITEM_RELA_TYPE_LANG")
    private String clanDsCsitemRelaTypeLang;

    @Column(length = 20, name = "CLAN_NA_CSITEM_RELA_TYPE_LANG", nullable = false)
    private String clanNaCsitemRelaTypeLang;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(insertable = false, name = "CIRT_ID_CSITEM_RELA_TYPE", nullable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CordrCsitemRelaType cordrCsitemRelaType;
    @EmbeddedId
    private CordrCsitemRelaTypeLangPK id;

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

    public String getClanDsCsitemRelaTypeLang() {
        return this.clanDsCsitemRelaTypeLang;
    }

    public void setClanDsCsitemRelaTypeLang(String clanDsCsitemRelaTypeLang) {
        this.clanDsCsitemRelaTypeLang = clanDsCsitemRelaTypeLang;
    }

    public String getClanNaCsitemRelaTypeLang() {
        return this.clanNaCsitemRelaTypeLang;
    }

    public void setClanNaCsitemRelaTypeLang(String clanNaCsitemRelaTypeLang) {
        this.clanNaCsitemRelaTypeLang = clanNaCsitemRelaTypeLang;
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

    public CordrCsitemRelaType getCordrCsitemRelaType() {
        return this.cordrCsitemRelaType;
    }

    public void setCordrCsitemRelaType(CordrCsitemRelaType cordrCsitemRelaType) {
        this.cordrCsitemRelaType = cordrCsitemRelaType;
    }

    public CordrCsitemRelaTypeLangPK getId() {
        return this.id;
    }

    public void setId(CordrCsitemRelaTypeLangPK id) {
        this.id = id;
    }

}
