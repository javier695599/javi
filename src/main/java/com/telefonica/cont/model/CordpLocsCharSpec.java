package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the CordpLocsCharSpecS database table.
 */
@Entity
@NamedQuery(name = "CordpLocsCharSpec.findAll", query = "SELECT c FROM CordpLocsCharSpec c")
@Table(name = "CORDP_LOCS_CHAR_SPEC")
public class CordpLocsCharSpec implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "CHSP_ID_CHAR_SPEC", nullable = false, precision = 3, unique = true)
    @Id
    private Long chspIdCharSpec;

    @Column(length = 40, name = "LOCS_NA_CHAR_SPEC", nullable = false)
    private String locsNaCharSpec;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "CVTY_ID_CHARACT_VALUE_TYPE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCharactValueType corddCharactValueType;
    @OneToMany(mappedBy = "cordpLocsCharSpec")
    private List<CordpLocsCharValue> cordpLocsCharValues;

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

    public Long getChspIdCharSpec() {
        return this.chspIdCharSpec;
    }

    public void setChspIdCharSpec(Long chspIdCharSpec) {
        this.chspIdCharSpec = chspIdCharSpec;
    }

    public String getLocsNaCharSpec() {
        return this.locsNaCharSpec;
    }

    public void setLocsNaCharSpec(String locsNaCharSpec) {
        this.locsNaCharSpec = locsNaCharSpec;
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

    public CorddCharactValueType getCorddCharactValueType() {
        return this.corddCharactValueType;
    }

    public void setCorddCharactValueType(CorddCharactValueType corddCharactValueType) {
        this.corddCharactValueType = corddCharactValueType;
    }

    public List<CordpLocsCharValue> getCordpLocsCharValues() {
        return this.cordpLocsCharValues;
    }

    public void setCordpLocsCharValues(List<CordpLocsCharValue> cordpLocsCharValues) {
        this.cordpLocsCharValues = cordpLocsCharValues;
    }

    public void addCordpLocsCharValues(CordpLocsCharValue cordpLocsCharValue) {
        if (this.cordpLocsCharValues == null)
            this.cordpLocsCharValues = new ArrayList<CordpLocsCharValue> ();
        this.cordpLocsCharValues.add ( cordpLocsCharValue );
    }

    public void removeCordpLocsCharValues(CordpLocsCharValue cordpLocsCharValueToRemove) {
        if (cordpLocsCharValueToRemove != null)
            this.cordpLocsCharValues.remove ( cordpLocsCharValueToRemove );
    }

}
