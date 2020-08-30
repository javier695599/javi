package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CevcrPmRelToProdOffS database table.
 */
@Entity
@NamedQuery(name = "CevcrPmRelToProdOff.findAll", query = "SELECT c FROM CevcrPmRelToProdOff c")
@Table(name = "CEVCR_PM_REL_TO_PROD_OFF", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "PMVU_ID_PROC_MARK_VALUE_USE", "PROF_ID_PRODUCT_OFFERING"})})
public class CevcrPmRelToProdOff implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "PROF_ID_PRODUCT_OFFERING", nullable = false, precision = 5)
    private Long profIdProductOffering;

    @Column(name = "TPOF_ID_PM_REL_TO_PROD_OFF", nullable = false, precision = 6, unique = true)
    @GeneratedValue(generator = "CEVCR_PM_REL_TO_PROD_OFF_TPOFIDPMRELTOPRODOFF_GENERATOR")
    @Id
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "CEVCR_PM_REL_TO_PROD_OFF_TPOFIDPMRELTOPRODOFF_GENERATOR", sequenceName = "CEVC_PMRELTOPRODOFF_SEQ")
    private Long tpofIdPmRelToProdOff;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "PMVU_ID_PROC_MARK_VALUE_USE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcrProcMarkValueUse cevcrProcMarkValueUse;

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

    public Long getProfIdProductOffering() {
        return this.profIdProductOffering;
    }

    public void setProfIdProductOffering(Long profIdProductOffering) {
        this.profIdProductOffering = profIdProductOffering;
    }

    public Long getTpofIdPmRelToProdOff() {
        return this.tpofIdPmRelToProdOff;
    }

    public void setTpofIdPmRelToProdOff(Long tpofIdPmRelToProdOff) {
        this.tpofIdPmRelToProdOff = tpofIdPmRelToProdOff;
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

    public CevcrProcMarkValueUse getCevcrProcMarkValueUse() {
        return this.cevcrProcMarkValueUse;
    }

    public void setCevcrProcMarkValueUse(CevcrProcMarkValueUse cevcrProcMarkValueUse) {
        this.cevcrProcMarkValueUse = cevcrProcMarkValueUse;
    }

}
