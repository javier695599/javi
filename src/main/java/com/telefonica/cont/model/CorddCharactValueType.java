package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CorddCharactValueTypeS database table.
 */
@Entity
@NamedQuery(name = "CorddCharactValueType.findAll", query = "SELECT c FROM CorddCharactValueType c")
@Table(name = "CORDD_CHARACT_VALUE_TYPE")
public class CorddCharactValueType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "CVTY_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date cvtyDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CVTY_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date cvtyDaStartValidity;

    @Column(length = 200, name = "CVTY_DS_CHARACT_VALUE_TYPE")
    private String cvtyDsCharactValueType;

    @Column(name = "CVTY_ID_CHARACT_VALUE_TYPE", nullable = false, precision = 3, unique = true)
    @Id
    private Long cvtyIdCharactValueType;

    @Column(length = 40, name = "CVTY_NA_CHARACT_VALUE_TYPE", nullable = false)
    private String cvtyNaCharactValueType;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "corddCharactValueType")
    private List<CordpLocsCharSpec> cordpLocsCharSpecs;

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

    public Date getCvtyDaEndValidity() {
        if (this.cvtyDaEndValidity != null)
            return (Date) this.cvtyDaEndValidity.clone ();
        else
            return null;
    }

    public void setCvtyDaEndValidity(Date cvtyDaEndValidity) {
        if (cvtyDaEndValidity != null)
            this.cvtyDaEndValidity = (Date) cvtyDaEndValidity.clone ();
        else
            this.cvtyDaEndValidity = cvtyDaEndValidity;
    }

    public Date getCvtyDaStartValidity() {
        if (this.cvtyDaStartValidity != null)
            return (Date) this.cvtyDaStartValidity.clone ();
        else
            return null;
    }

    public void setCvtyDaStartValidity(Date cvtyDaStartValidity) {
        if (cvtyDaStartValidity != null)
            this.cvtyDaStartValidity = (Date) cvtyDaStartValidity.clone ();
        else
            this.cvtyDaStartValidity = cvtyDaStartValidity;
    }

    public String getCvtyDsCharactValueType() {
        return this.cvtyDsCharactValueType;
    }

    public void setCvtyDsCharactValueType(String cvtyDsCharactValueType) {
        this.cvtyDsCharactValueType = cvtyDsCharactValueType;
    }

    public Long getCvtyIdCharactValueType() {
        return this.cvtyIdCharactValueType;
    }

    public void setCvtyIdCharactValueType(Long cvtyIdCharactValueType) {
        this.cvtyIdCharactValueType = cvtyIdCharactValueType;
    }

    public String getCvtyNaCharactValueType() {
        return this.cvtyNaCharactValueType;
    }

    public void setCvtyNaCharactValueType(String cvtyNaCharactValueType) {
        this.cvtyNaCharactValueType = cvtyNaCharactValueType;
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

    public List<CordpLocsCharSpec> getCordpLocsCharSpecs() {
        return this.cordpLocsCharSpecs;
    }

    public void setCordpLocsCharSpecs(List<CordpLocsCharSpec> cordpLocsCharSpecs) {
        this.cordpLocsCharSpecs = cordpLocsCharSpecs;
    }

    public void addCordpLocsCharSpecs(CordpLocsCharSpec cordpLocsCharSpec) {
        if (this.cordpLocsCharSpecs == null)
            this.cordpLocsCharSpecs = new ArrayList<CordpLocsCharSpec> ();
        this.cordpLocsCharSpecs.add ( cordpLocsCharSpec );
    }

    public void removeCordpLocsCharSpecs(CordpLocsCharSpec cordpLocsCharSpecToRemove) {
        if (cordpLocsCharSpecToRemove != null)
            this.cordpLocsCharSpecs.remove ( cordpLocsCharSpecToRemove );
    }

}
