package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CuinrCqitemRelatedWorkS database table.
 */
@Entity
@NamedQuery(name = "CuinrCqitemRelatedWork.findAll", query = "SELECT c FROM CuinrCqitemRelatedWork c")
@Table(name = "CUINR_CQITEM_RELATED_WORK", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BIIT_ID_CUSTOMER_QUOTE_ITEM", "WORK_ID_WORK"})})
public class CuinrCqitemRelatedWork implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "CQRW_DA_END_VALIDITY")
    private Timestamp cqrwDaEndValidity;

    @Column(name = "CQRW_DA_START_VALIDITY", nullable = false)
    private Timestamp cqrwDaStartValidity;

    @Column(name = "CQRW_ID_CQITEM_RELATED_WORK", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal cqrwIdCqitemRelatedWork;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @Column(name = "WORK_ID_WORK", nullable = false, precision = 38)
    private BigDecimal workIdWork;

    @JoinColumn(name = "CQRT_ID_CQITEM_RELAT_WORK_TYPE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CuindCqitemRelatWorkType cuindCqitemRelatWorkType;
    @JoinColumn(name = "BIIT_ID_CUSTOMER_QUOTE_ITEM", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CuinpCustomerQuoteItem cuinpCustomerQuoteItem;

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

    public Timestamp getCqrwDaEndValidity() {
        if (this.cqrwDaEndValidity != null)
            return (Timestamp) this.cqrwDaEndValidity.clone ();
        else
            return null;
    }

    public void setCqrwDaEndValidity(Timestamp cqrwDaEndValidity) {
        if (cqrwDaEndValidity != null)
            this.cqrwDaEndValidity = (Timestamp) cqrwDaEndValidity.clone ();
        else
            this.cqrwDaEndValidity = cqrwDaEndValidity;
    }

    public Timestamp getCqrwDaStartValidity() {
        if (this.cqrwDaStartValidity != null)
            return (Timestamp) this.cqrwDaStartValidity.clone ();
        else
            return null;
    }

    public void setCqrwDaStartValidity(Timestamp cqrwDaStartValidity) {
        if (cqrwDaStartValidity != null)
            this.cqrwDaStartValidity = (Timestamp) cqrwDaStartValidity.clone ();
        else
            this.cqrwDaStartValidity = cqrwDaStartValidity;
    }

    public BigDecimal getCqrwIdCqitemRelatedWork() {
        return this.cqrwIdCqitemRelatedWork;
    }

    public void setCqrwIdCqitemRelatedWork(BigDecimal cqrwIdCqitemRelatedWork) {
        this.cqrwIdCqitemRelatedWork = cqrwIdCqitemRelatedWork;
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

    public BigDecimal getWorkIdWork() {
        return this.workIdWork;
    }

    public void setWorkIdWork(BigDecimal workIdWork) {
        this.workIdWork = workIdWork;
    }

    public CuindCqitemRelatWorkType getCuindCqitemRelatWorkType() {
        return this.cuindCqitemRelatWorkType;
    }

    public void setCuindCqitemRelatWorkType(CuindCqitemRelatWorkType cuindCqitemRelatWorkType) {
        this.cuindCqitemRelatWorkType = cuindCqitemRelatWorkType;
    }

    public CuinpCustomerQuoteItem getCuinpCustomerQuoteItem() {
        return this.cuinpCustomerQuoteItem;
    }

    public void setCuinpCustomerQuoteItem(CuinpCustomerQuoteItem cuinpCustomerQuoteItem) {
        this.cuinpCustomerQuoteItem = cuinpCustomerQuoteItem;
    }

}
