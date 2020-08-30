package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the CuindCqitemRelatWorkTypeS database table.
 */
@Entity
@NamedQuery(name = "CuindCqitemRelatWorkType.findAll", query = "SELECT c FROM CuindCqitemRelatWorkType c")
@Table(name = "CUIND_CQITEM_RELAT_WORK_TYPE")
public class CuindCqitemRelatWorkType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "CQRT_ID_CQITEM_RELAT_WORK_TYPE", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal cqrtIdCqitemRelatWorkType;

    @Column(length = 100, name = "CQRT_NA_CQITEM_RELAT_WORK_TYPE", nullable = false)
    private String cqrtNaCqitemRelatWorkType;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "cuindCqitemRelatWorkType")
    private List<CuinrCqitemRelatedWork> cuinrCqitemRelatedWorks;

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

    public BigDecimal getCqrtIdCqitemRelatWorkType() {
        return this.cqrtIdCqitemRelatWorkType;
    }

    public void setCqrtIdCqitemRelatWorkType(BigDecimal cqrtIdCqitemRelatWorkType) {
        this.cqrtIdCqitemRelatWorkType = cqrtIdCqitemRelatWorkType;
    }

    public String getCqrtNaCqitemRelatWorkType() {
        return this.cqrtNaCqitemRelatWorkType;
    }

    public void setCqrtNaCqitemRelatWorkType(String cqrtNaCqitemRelatWorkType) {
        this.cqrtNaCqitemRelatWorkType = cqrtNaCqitemRelatWorkType;
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

    public List<CuinrCqitemRelatedWork> getCuinrCqitemRelatedWorks() {
        return this.cuinrCqitemRelatedWorks;
    }

    public void setCuinrCqitemRelatedWorks(List<CuinrCqitemRelatedWork> cuinrCqitemRelatedWorks) {
        this.cuinrCqitemRelatedWorks = cuinrCqitemRelatedWorks;
    }

    public void addCuinrCqitemRelatedWorks(CuinrCqitemRelatedWork cuinrCqitemRelatedWork) {
        if (this.cuinrCqitemRelatedWorks == null)
            this.cuinrCqitemRelatedWorks = new ArrayList<CuinrCqitemRelatedWork> ();
        this.cuinrCqitemRelatedWorks.add ( cuinrCqitemRelatedWork );
    }

    public void removeCuinrCqitemRelatedWorks(CuinrCqitemRelatedWork cuinrCqitemRelatedWorkToRemove) {
        if (cuinrCqitemRelatedWorkToRemove != null)
            this.cuinrCqitemRelatedWorks.remove ( cuinrCqitemRelatedWorkToRemove );
    }

}
