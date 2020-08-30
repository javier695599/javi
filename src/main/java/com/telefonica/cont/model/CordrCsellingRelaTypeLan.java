package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CordrCsellingRelaTypeLanS database table.
 */
@Entity
@NamedQuery(name = "CordrCsellingRelaTypeLan.findAll", query = "SELECT c FROM CordrCsellingRelaTypeLan c")
@Table(name = "CORDR_CSELLING_RELA_TYPE_LAN")
public class CordrCsellingRelaTypeLan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(length = 500, name = "CTLA_DS_CSELLING_RELA_TYPE_LAN")
    private String ctlaDsCsellingRelaTypeLan;

    @Column(length = 50, name = "CTLA_NA_CSELLING_RELA_TYPE_LAN", nullable = false)
    private String ctlaNaCsellingRelaTypeLan;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(insertable = false, name = "CSRT_ID_CSELLING_RELA_TYPE", nullable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CordrCsellingRelaType cordrCsellingRelaType;
    @EmbeddedId
    private CordrCsellingRelaTypeLanPK id;

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

    public String getCtlaDsCsellingRelaTypeLan() {
        return this.ctlaDsCsellingRelaTypeLan;
    }

    public void setCtlaDsCsellingRelaTypeLan(String ctlaDsCsellingRelaTypeLan) {
        this.ctlaDsCsellingRelaTypeLan = ctlaDsCsellingRelaTypeLan;
    }

    public String getCtlaNaCsellingRelaTypeLan() {
        return this.ctlaNaCsellingRelaTypeLan;
    }

    public void setCtlaNaCsellingRelaTypeLan(String ctlaNaCsellingRelaTypeLan) {
        this.ctlaNaCsellingRelaTypeLan = ctlaNaCsellingRelaTypeLan;
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

    public CordrCsellingRelaType getCordrCsellingRelaType() {
        return this.cordrCsellingRelaType;
    }

    public void setCordrCsellingRelaType(CordrCsellingRelaType cordrCsellingRelaType) {
        this.cordrCsellingRelaType = cordrCsellingRelaType;
    }

    public CordrCsellingRelaTypeLanPK getId() {
        return this.id;
    }

    public void setId(CordrCsellingRelaTypeLanPK id) {
        this.id = id;
    }

}
