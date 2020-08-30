package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CordrCsellingRoleTypeLanS database table.
 */
@Entity
@NamedQuery(name = "CordrCsellingRoleTypeLan.findAll", query = "SELECT c FROM CordrCsellingRoleTypeLan c")
@Table(name = "CORDR_CSELLING_ROLE_TYPE_LAN")
public class CordrCsellingRoleTypeLan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(length = 100, name = "CRLA_DS_CSELLING_ROLE_TYPE_LAN")
    private String crlaDsCsellingRoleTypeLan;

    @Column(length = 40, name = "CRLA_NA_CSELLING_ROLE_TYPE_LAN", nullable = false)
    private String crlaNaCsellingRoleTypeLan;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(insertable = false, name = "CROT_ID_CSELLING_ROLE_TYPE", nullable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingRoleType corddCsellingRoleType;
    @EmbeddedId
    private CordrCsellingRoleTypeLanPK id;

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

    public String getCrlaDsCsellingRoleTypeLan() {
        return this.crlaDsCsellingRoleTypeLan;
    }

    public void setCrlaDsCsellingRoleTypeLan(String crlaDsCsellingRoleTypeLan) {
        this.crlaDsCsellingRoleTypeLan = crlaDsCsellingRoleTypeLan;
    }

    public String getCrlaNaCsellingRoleTypeLan() {
        return this.crlaNaCsellingRoleTypeLan;
    }

    public void setCrlaNaCsellingRoleTypeLan(String crlaNaCsellingRoleTypeLan) {
        this.crlaNaCsellingRoleTypeLan = crlaNaCsellingRoleTypeLan;
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

    public CorddCsellingRoleType getCorddCsellingRoleType() {
        return this.corddCsellingRoleType;
    }

    public void setCorddCsellingRoleType(CorddCsellingRoleType corddCsellingRoleType) {
        this.corddCsellingRoleType = corddCsellingRoleType;
    }

    public CordrCsellingRoleTypeLanPK getId() {
        return this.id;
    }

    public void setId(CordrCsellingRoleTypeLanPK id) {
        this.id = id;
    }

}
