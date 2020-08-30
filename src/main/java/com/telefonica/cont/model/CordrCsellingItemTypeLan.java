package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CordrCsellingItemTypeLanS database table.
 */
@Entity
@NamedQuery(name = "CordrCsellingItemTypeLan.findAll", query = "SELECT c FROM CordrCsellingItemTypeLan c")
@Table(name = "CORDR_CSELLING_ITEM_TYPE_LAN")
public class CordrCsellingItemTypeLan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(length = 400, name = "CIYL_DS_CSELLING_ITEM_TYPE_LAN", nullable = false)
    private String ciylDsCsellingItemTypeLan;

    @Column(length = 50, name = "CIYL_NA_CSELLING_ITEM_TYPE_LAN", nullable = false)
    private String ciylNaCsellingItemTypeLan;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(insertable = false, name = "CSIT_ID_CSELLING_ITEM_TYPE", nullable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingItemType corddCsellingItemType;
    @EmbeddedId
    private CordrCsellingItemTypeLanPK id;

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

    public String getCiylDsCsellingItemTypeLan() {
        return this.ciylDsCsellingItemTypeLan;
    }

    public void setCiylDsCsellingItemTypeLan(String ciylDsCsellingItemTypeLan) {
        this.ciylDsCsellingItemTypeLan = ciylDsCsellingItemTypeLan;
    }

    public String getCiylNaCsellingItemTypeLan() {
        return this.ciylNaCsellingItemTypeLan;
    }

    public void setCiylNaCsellingItemTypeLan(String ciylNaCsellingItemTypeLan) {
        this.ciylNaCsellingItemTypeLan = ciylNaCsellingItemTypeLan;
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

    public CorddCsellingItemType getCorddCsellingItemType() {
        return this.corddCsellingItemType;
    }

    public void setCorddCsellingItemType(CorddCsellingItemType corddCsellingItemType) {
        this.corddCsellingItemType = corddCsellingItemType;
    }

    public CordrCsellingItemTypeLanPK getId() {
        return this.id;
    }

    public void setId(CordrCsellingItemTypeLanPK id) {
        this.id = id;
    }

}
