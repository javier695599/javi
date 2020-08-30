package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CevcdOpelementTypeS database table.
 */
@Entity
@NamedQuery(name = "CevcdOpelementType.findAll", query = "SELECT c FROM CevcdOpelementType c")
@Table(name = "CEVCD_OPELEMENT_TYPE")
public class CevcdOpelementType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "OPET_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date opetDaEndValidity;

    @Column(columnDefinition = "DATE", name = "OPET_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date opetDaStartValidity;

    @Column(name = "OPET_ID_OPELEMENT_TYPE", nullable = false, precision = 3, unique = true)
    @Id
    private Long opetIdOpelementType;

    @Column(length = 100, name = "OPET_NA_OPELEMENT_TYPE", nullable = false)
    private String opetNaOpelementType;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "cevcdOpelementType")
    private List<CevcpOplanElement> cevcpOplanElements;

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

    public Date getOpetDaEndValidity() {
        if (this.opetDaEndValidity != null)
            return (Date) this.opetDaEndValidity.clone ();
        else
            return null;
    }

    public void setOpetDaEndValidity(Date opetDaEndValidity) {
        if (opetDaEndValidity != null)
            this.opetDaEndValidity = (Date) opetDaEndValidity.clone ();
        else
            this.opetDaEndValidity = opetDaEndValidity;
    }

    public Date getOpetDaStartValidity() {
        if (this.opetDaStartValidity != null)
            return (Date) this.opetDaStartValidity.clone ();
        else
            return null;
    }

    public void setOpetDaStartValidity(Date opetDaStartValidity) {
        if (opetDaStartValidity != null)
            this.opetDaStartValidity = (Date) opetDaStartValidity.clone ();
        else
            this.opetDaStartValidity = opetDaStartValidity;
    }

    public Long getOpetIdOpelementType() {
        return this.opetIdOpelementType;
    }

    public void setOpetIdOpelementType(Long opetIdOpelementType) {
        this.opetIdOpelementType = opetIdOpelementType;
    }

    public String getOpetNaOpelementType() {
        return this.opetNaOpelementType;
    }

    public void setOpetNaOpelementType(String opetNaOpelementType) {
        this.opetNaOpelementType = opetNaOpelementType;
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

    public List<CevcpOplanElement> getCevcpOplanElements() {
        return this.cevcpOplanElements;
    }

    public void setCevcpOplanElements(List<CevcpOplanElement> cevcpOplanElements) {
        this.cevcpOplanElements = cevcpOplanElements;
    }

    public void addCevcpOplanElements(CevcpOplanElement cevcpOplanElement) {
        if (this.cevcpOplanElements == null)
            this.cevcpOplanElements = new ArrayList<CevcpOplanElement> ();
        this.cevcpOplanElements.add ( cevcpOplanElement );
    }

    public void removeCevcpOplanElements(CevcpOplanElement cevcpOplanElementToRemove) {
        if (cevcpOplanElementToRemove != null)
            this.cevcpOplanElements.remove ( cevcpOplanElementToRemove );
    }

}
