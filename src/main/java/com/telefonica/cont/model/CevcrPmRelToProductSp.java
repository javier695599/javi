package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CevcrPmRelToProductSpS database table.
 */
@Entity
@NamedQuery(name = "CevcrPmRelToProductSp.findAll", query = "SELECT c FROM CevcrPmRelToProductSp c")
@Table(name = "CEVCR_PM_REL_TO_PRODUCT_SP", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "PMVU_ID_PROC_MARK_VALUE_USE", "PRSP_ID_PRODUCT_NUMBER"})})
public class CevcrPmRelToProductSp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "PRSP_ID_PRODUCT_NUMBER", nullable = false, precision = 5)
    private Long prspIdProductNumber;

    @Column(name = "TPSP_ID_PM_REL_TO_PRODUCT_SP", nullable = false, precision = 6, unique = true)
    @GeneratedValue(generator = "CEVCR_PM_REL_TO_PRODUCT_SP_TPSPIDPMRELTOPRODUCTSP_GENERATOR")
    @Id
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "CEVCR_PM_REL_TO_PRODUCT_SP_TPSPIDPMRELTOPRODUCTSP_GENERATOR", sequenceName = "CEVC_PMRELTOPRODUCTSP_SEQ")
    private Long tpspIdPmRelToProductSp;

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

    public Long getPrspIdProductNumber() {
        return this.prspIdProductNumber;
    }

    public void setPrspIdProductNumber(Long prspIdProductNumber) {
        this.prspIdProductNumber = prspIdProductNumber;
    }

    public Long getTpspIdPmRelToProductSp() {
        return this.tpspIdPmRelToProductSp;
    }

    public void setTpspIdPmRelToProductSp(Long tpspIdPmRelToProductSp) {
        this.tpspIdPmRelToProductSp = tpspIdPmRelToProductSp;
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
