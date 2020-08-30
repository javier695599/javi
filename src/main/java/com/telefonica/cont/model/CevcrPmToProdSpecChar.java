package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CevcrPmToProdSpecCharS database table.
 */
@Entity
@NamedQuery(name = "CevcrPmToProdSpecChar.findAll", query = "SELECT c FROM CevcrPmToProdSpecChar c")
@Table(name = "CEVCR_PM_TO_PROD_SPEC_CHAR", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "PMVU_ID_PROC_MARK_VALUE_USE", "PWCH_ID_PROD_SPEC_CHAR"})})
public class CevcrPmToProdSpecChar implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "PWCH_ID_PROD_SPEC_CHAR", nullable = false, precision = 4)
    private Long pwchIdProdSpecChar;

    @Column(name = "TPSC_ID_PM_TO_PROD_SPEC_CHAR", nullable = false, precision = 7, unique = true)
    @GeneratedValue(generator = "CEVCR_PM_TO_PROD_SPEC_CHAR_TPSCIDPMTOPRODSPECCHAR_GENERATOR")
    @Id
    @SequenceGenerator(allocationSize = 1, initialValue = 1,
            name = "CEVCR_PM_TO_PROD_SPEC_CHAR_TPSCIDPMTOPRODSPECCHAR_GENERATOR",
            sequenceName = "CEVC_PMTOPRODSPECCHAR_SEQ")
    private Long tpscIdPmToProdSpecChar;

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

    public Long getPwchIdProdSpecChar() {
        return this.pwchIdProdSpecChar;
    }

    public void setPwchIdProdSpecChar(Long pwchIdProdSpecChar) {
        this.pwchIdProdSpecChar = pwchIdProdSpecChar;
    }

    public Long getTpscIdPmToProdSpecChar() {
        return this.tpscIdPmToProdSpecChar;
    }

    public void setTpscIdPmToProdSpecChar(Long tpscIdPmToProdSpecChar) {
        this.tpscIdPmToProdSpecChar = tpscIdPmToProdSpecChar;
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
