package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the AgrepCagreeTermOrCondS database table.
 */
@Entity
@NamedQuery(name = "AgrepCagreeTermOrCond.findAll", query = "SELECT a FROM AgrepCagreeTermOrCond a")
@Table(name = "AGREP_CAGREE_TERM_OR_COND")
public class AgrepCagreeTermOrCond implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(length = 20, name = "ATOC_CO_CAGREE_TERM_OR_COND")
    private String atocCoCagreeTermOrCond;

    @Column(columnDefinition = "DATE", name = "ATOC_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date atocDaEndValidity;

    @Column(name = "ATOC_DA_SPEC_REFERENCE", nullable = false)
    private Timestamp atocDaSpecReference;

    @Column(columnDefinition = "DATE", name = "ATOC_DA_START_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date atocDaStartValidity;

    @Column(name = "ATOC_ID_CAGREE_TERM_OR_COND", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal atocIdCagreeTermOrCond;

    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "POFP_ID_PRODUCT_OFFERING_PRICE", precision = 7)
    private Long pofpIdProductOfferingPrice;

    @Column(name = "POTE_ID_PRODUCT_OFFERING_TERM", nullable = false, precision = 6)
    private Long poteIdProductOfferingTerm;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "BUIN_ID_CUSTOMER_AGREEMENT", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private AgrepCustomerAgreement agrepCustomerAgreement;
    @OneToMany(mappedBy = "agrepCagreeTermOrCond")
    private List<AgrerCagreeItemGoverned> agrerCagreeItemGoverneds;

    public String getAtocCoCagreeTermOrCond() {
        return this.atocCoCagreeTermOrCond;
    }

    public void setAtocCoCagreeTermOrCond(String atocCoCagreeTermOrCond) {
        this.atocCoCagreeTermOrCond = atocCoCagreeTermOrCond;
    }

    public Date getAtocDaEndValidity() {
        if (this.atocDaEndValidity != null)
            return (Date) this.atocDaEndValidity.clone ();
        else
            return null;
    }

    public void setAtocDaEndValidity(Date atocDaEndValidity) {
        if (atocDaEndValidity != null)
            this.atocDaEndValidity = (Date) atocDaEndValidity.clone ();
        else
            this.atocDaEndValidity = atocDaEndValidity;
    }

    public Timestamp getAtocDaSpecReference() {
        if (this.atocDaSpecReference != null)
            return (Timestamp) this.atocDaSpecReference.clone ();
        else
            return null;
    }

    public void setAtocDaSpecReference(Timestamp atocDaSpecReference) {
        if (atocDaSpecReference != null)
            this.atocDaSpecReference = (Timestamp) atocDaSpecReference.clone ();
        else
            this.atocDaSpecReference = atocDaSpecReference;
    }

    public Date getAtocDaStartValidity() {
        if (this.atocDaStartValidity != null)
            return (Date) this.atocDaStartValidity.clone ();
        else
            return null;
    }

    public void setAtocDaStartValidity(Date atocDaStartValidity) {
        if (atocDaStartValidity != null)
            this.atocDaStartValidity = (Date) atocDaStartValidity.clone ();
        else
            this.atocDaStartValidity = atocDaStartValidity;
    }

    public BigDecimal getAtocIdCagreeTermOrCond() {
        return this.atocIdCagreeTermOrCond;
    }

    public void setAtocIdCagreeTermOrCond(BigDecimal atocIdCagreeTermOrCond) {
        this.atocIdCagreeTermOrCond = atocIdCagreeTermOrCond;
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

    public Long getPofpIdProductOfferingPrice() {
        return this.pofpIdProductOfferingPrice;
    }

    public void setPofpIdProductOfferingPrice(Long pofpIdProductOfferingPrice) {
        this.pofpIdProductOfferingPrice = pofpIdProductOfferingPrice;
    }

    public Long getPoteIdProductOfferingTerm() {
        return this.poteIdProductOfferingTerm;
    }

    public void setPoteIdProductOfferingTerm(Long poteIdProductOfferingTerm) {
        this.poteIdProductOfferingTerm = poteIdProductOfferingTerm;
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

    public AgrepCustomerAgreement getAgrepCustomerAgreement() {
        return this.agrepCustomerAgreement;
    }

    public void setAgrepCustomerAgreement(AgrepCustomerAgreement agrepCustomerAgreement) {
        this.agrepCustomerAgreement = agrepCustomerAgreement;
    }

    public List<AgrerCagreeItemGoverned> getAgrerCagreeItemGoverneds() {
        return this.agrerCagreeItemGoverneds;
    }

    public void setAgrerCagreeItemGoverneds(List<AgrerCagreeItemGoverned> agrerCagreeItemGoverneds) {
        this.agrerCagreeItemGoverneds = agrerCagreeItemGoverneds;
    }

    public void addAgrerCagreeItemGoverneds(AgrerCagreeItemGoverned agrerCagreeItemGoverned) {
        if (this.agrerCagreeItemGoverneds == null)
            this.agrerCagreeItemGoverneds = new ArrayList<AgrerCagreeItemGoverned> ();
        this.agrerCagreeItemGoverneds.add ( agrerCagreeItemGoverned );
    }

    public void removeAgrerCagreeItemGoverneds(AgrerCagreeItemGoverned agrerCagreeItemGovernedToRemove) {
        if (agrerCagreeItemGovernedToRemove != null)
            this.agrerCagreeItemGoverneds.remove ( agrerCagreeItemGovernedToRemove );
    }

}
