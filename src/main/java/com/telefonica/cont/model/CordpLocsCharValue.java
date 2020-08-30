package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CordpLocsCharValueS database table.
 */
@Entity
@NamedQuery(name = "CordpLocsCharValue.findAll", query = "SELECT c FROM CordpLocsCharValue c")
@Table(name = "CORDP_LOCS_CHAR_VALUE", uniqueConstraints = {@UniqueConstraint(columnNames = {"CHSP_ID_CHAR_SPEC",
        "ROEN_ID_LEGA_OCS_MESSA"})})
public class CordpLocsCharValue implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "CHVA_ID_CHARAC_VALUE", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal chvaIdCharacValue;

    @Column(length = 250, name = "CHVA_NA_CHARAC_VALUE", nullable = false)
    private String chvaNaCharacValue;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "ROEN_ID_LEGA_OCS_MESSA", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CordaLegacyOcsMessage cordaLegacyOcsMessage;
    @JoinColumn(name = "CHSP_ID_CHAR_SPEC", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpLocsCharSpec cordpLocsCharSpec;

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

    public BigDecimal getChvaIdCharacValue() {
        return this.chvaIdCharacValue;
    }

    public void setChvaIdCharacValue(BigDecimal chvaIdCharacValue) {
        this.chvaIdCharacValue = chvaIdCharacValue;
    }

    public String getChvaNaCharacValue() {
        return this.chvaNaCharacValue;
    }

    public void setChvaNaCharacValue(String chvaNaCharacValue) {
        this.chvaNaCharacValue = chvaNaCharacValue;
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

    public CordaLegacyOcsMessage getCordaLegacyOcsMessage() {
        return this.cordaLegacyOcsMessage;
    }

    public void setCordaLegacyOcsMessage(CordaLegacyOcsMessage cordaLegacyOcsMessage) {
        this.cordaLegacyOcsMessage = cordaLegacyOcsMessage;
    }

    public CordpLocsCharSpec getCordpLocsCharSpec() {
        return this.cordpLocsCharSpec;
    }

    public void setCordpLocsCharSpec(CordpLocsCharSpec cordpLocsCharSpec) {
        this.cordpLocsCharSpec = cordpLocsCharSpec;
    }

}
