package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the AgrerCagreeItemGovernedS database table.
 */
@Entity
@NamedQuery(name = "AgrerCagreeItemGoverned.findAll", query = "SELECT a FROM AgrerCagreeItemGoverned a")
@Table(name = "AGRER_CAGREE_ITEM_GOVERNED", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"BIIT_ID_CUSTOMER_AGREEMENT_IT", "ATOC_ID_CAGREE_TERM_OR_COND"})})
public class AgrerCagreeItemGoverned implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AIGB_ID_CAGREE_ITEM_GOVERNED", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal aigbIdCagreeItemGoverned;

    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "ATOC_ID_CAGREE_TERM_OR_COND", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private AgrepCagreeTermOrCond agrepCagreeTermOrCond;
    @JoinColumn(name = "BIIT_ID_CUSTOMER_AGREEMENT_IT", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private AgrepCustomerAgreementIt agrepCustomerAgreementIt;

    public BigDecimal getAigbIdCagreeItemGoverned() {
        return this.aigbIdCagreeItemGoverned;
    }

    public void setAigbIdCagreeItemGoverned(BigDecimal aigbIdCagreeItemGoverned) {
        this.aigbIdCagreeItemGoverned = aigbIdCagreeItemGoverned;
    }

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

    public AgrepCagreeTermOrCond getAgrepCagreeTermOrCond() {
        return this.agrepCagreeTermOrCond;
    }

    public void setAgrepCagreeTermOrCond(AgrepCagreeTermOrCond agrepCagreeTermOrCond) {
        this.agrepCagreeTermOrCond = agrepCagreeTermOrCond;
    }

    public AgrepCustomerAgreementIt getAgrepCustomerAgreementIt() {
        return this.agrepCustomerAgreementIt;
    }

    public void setAgrepCustomerAgreementIt(AgrepCustomerAgreementIt agrepCustomerAgreementIt) {
        this.agrepCustomerAgreementIt = agrepCustomerAgreementIt;
    }

}
