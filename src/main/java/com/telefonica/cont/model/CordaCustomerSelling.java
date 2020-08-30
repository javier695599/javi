package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CordaCustomerSellingS database table.
 */
@Entity
@NamedQuery(name = "CordaCustomerSelling.findAll", query = "SELECT c FROM CordaCustomerSelling c")
@Table(name = "CORDA_CUSTOMER_SELLING")
public class CordaCustomerSelling implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BINT_ID_CSELLING_TYPE", nullable = false, precision = 3)
    private Long bintIdCsellingType;

    @Column(name = "BUIN_ID_CUSTOMER_SELLING", nullable = false, precision = 38, unique = true)
    @Id
    private BigDecimal buinIdCustomerSelling;

    @Column(name = "CSIN_TI_DATE_CONSOLIDATION")
    private Timestamp csinTiDateConsolidation;

    @Column(name = "CSIN_TI_DATE_FINAL_STATE", nullable = false)
    private Timestamp csinTiDateFinalState;

    @Column(name = "CSIN_TI_DATE_HISTORIFICATION")
    private Timestamp csinTiDateHistorification;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

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

    public Long getBintIdCsellingType() {
        return this.bintIdCsellingType;
    }

    public void setBintIdCsellingType(Long bintIdCsellingType) {
        this.bintIdCsellingType = bintIdCsellingType;
    }

    public BigDecimal getBuinIdCustomerSelling() {
        return this.buinIdCustomerSelling;
    }

    public void setBuinIdCustomerSelling(BigDecimal buinIdCustomerSelling) {
        this.buinIdCustomerSelling = buinIdCustomerSelling;
    }

    public Timestamp getCsinTiDateConsolidation() {
        if (this.csinTiDateConsolidation != null)
            return (Timestamp) this.csinTiDateConsolidation.clone ();
        else
            return null;
    }

    public void setCsinTiDateConsolidation(Timestamp csinTiDateConsolidation) {
        if (csinTiDateConsolidation != null)
            this.csinTiDateConsolidation = (Timestamp) csinTiDateConsolidation.clone ();
        else
            this.csinTiDateConsolidation = csinTiDateConsolidation;
    }

    public Timestamp getCsinTiDateFinalState() {
        if (this.csinTiDateFinalState != null)
            return (Timestamp) this.csinTiDateFinalState.clone ();
        else
            return null;
    }

    public void setCsinTiDateFinalState(Timestamp csinTiDateFinalState) {
        if (csinTiDateFinalState != null)
            this.csinTiDateFinalState = (Timestamp) csinTiDateFinalState.clone ();
        else
            this.csinTiDateFinalState = csinTiDateFinalState;
    }

    public Timestamp getCsinTiDateHistorification() {
        if (this.csinTiDateHistorification != null)
            return (Timestamp) this.csinTiDateHistorification.clone ();
        else
            return null;
    }

    public void setCsinTiDateHistorification(Timestamp csinTiDateHistorification) {
        if (csinTiDateHistorification != null)
            this.csinTiDateHistorification = (Timestamp) csinTiDateHistorification.clone ();
        else
            this.csinTiDateHistorification = csinTiDateHistorification;
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

}
