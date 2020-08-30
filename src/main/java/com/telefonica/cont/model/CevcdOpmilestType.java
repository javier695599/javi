package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the CevcdOpmilestTypeS database table.
 */
@Entity
@NamedQuery(name = "CevcdOpmilestType.findAll", query = "SELECT c FROM CevcdOpmilestType c")
@Table(name = "CEVCD_OPMILEST_TYPE")
public class CevcdOpmilestType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "OPMT_ID_OPMILEST_TYPE", nullable = false, precision = 2, unique = true)
    @Id
    private Long opmtIdOpmilestType;

    @Column(length = 50, name = "OPMT_NA_OPMILEST_TYPE", nullable = false)
    private String opmtNaOpmilestType;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "cevcdOpmilestType")
    private List<CevcpOplanMileston> cevcpOplanMilestons;

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

    public Long getOpmtIdOpmilestType() {
        return this.opmtIdOpmilestType;
    }

    public void setOpmtIdOpmilestType(Long opmtIdOpmilestType) {
        this.opmtIdOpmilestType = opmtIdOpmilestType;
    }

    public String getOpmtNaOpmilestType() {
        return this.opmtNaOpmilestType;
    }

    public void setOpmtNaOpmilestType(String opmtNaOpmilestType) {
        this.opmtNaOpmilestType = opmtNaOpmilestType;
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

    public List<CevcpOplanMileston> getCevcpOplanMilestons() {
        return this.cevcpOplanMilestons;
    }

    public void setCevcpOplanMilestons(List<CevcpOplanMileston> cevcpOplanMilestons) {
        this.cevcpOplanMilestons = cevcpOplanMilestons;
    }

    public void addCevcpOplanMilestons(CevcpOplanMileston cevcpOplanMileston) {
        if (this.cevcpOplanMilestons == null)
            this.cevcpOplanMilestons = new ArrayList<CevcpOplanMileston> ();
        this.cevcpOplanMilestons.add ( cevcpOplanMileston );
    }

    public void removeCevcpOplanMilestons(CevcpOplanMileston cevcpOplanMilestonToRemove) {
        if (cevcpOplanMilestonToRemove != null)
            this.cevcpOplanMilestons.remove ( cevcpOplanMilestonToRemove );
    }

}
