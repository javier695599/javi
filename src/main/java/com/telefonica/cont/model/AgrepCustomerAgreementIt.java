package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the AgrepCustomerAgreementItS database table.
 */
@Entity
@NamedQuery(name = "AgrepCustomerAgreementIt.findAll", query = "SELECT a FROM AgrepCustomerAgreementIt a")
@Table(name = "AGREP_CUSTOMER_AGREEMENT_IT")
public class AgrepCustomerAgreementIt implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BIIT_ID_CUSTOMER_AGREEMENT_IT", nullable = false, precision = 38, unique = true)
    @Id
    private BigDecimal biitIdCustomerAgreementIt;

    @Column(length = 20, name = "CAIT_CO_CUSTOMER_AGREEMENT_IT")
    private String caitCoCustomerAgreementIt;

    @Column(columnDefinition = "DATE", name = "CAIT_DA_CREATION_CAGRRE_ITEM", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date caitDaCreationCagrreItem;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "BUIN_ID_CUSTOMER_AGREEMENT", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private AgrepCustomerAgreement agrepCustomerAgreement;
    @OneToMany(mappedBy = "agrepCustomerAgreementIt")
    private List<AgrerCagreeItemGoverned> agrerCagreeItemGoverneds;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "BIIT_ID_CUSTOMER_AGREEMENT_IT")
    private CordpCustomerSellingItem cordpCustomerSellingItem;

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

    public BigDecimal getBiitIdCustomerAgreementIt() {
        return this.biitIdCustomerAgreementIt;
    }

    public void setBiitIdCustomerAgreementIt(BigDecimal biitIdCustomerAgreementIt) {
        this.biitIdCustomerAgreementIt = biitIdCustomerAgreementIt;
    }

    public String getCaitCoCustomerAgreementIt() {
        return this.caitCoCustomerAgreementIt;
    }

    public void setCaitCoCustomerAgreementIt(String caitCoCustomerAgreementIt) {
        this.caitCoCustomerAgreementIt = caitCoCustomerAgreementIt;
    }

    public Date getCaitDaCreationCagrreItem() {
        if (this.caitDaCreationCagrreItem != null)
            return (Date) this.caitDaCreationCagrreItem.clone ();
        else
            return null;
    }

    public void setCaitDaCreationCagrreItem(Date caitDaCreationCagrreItem) {
        if (caitDaCreationCagrreItem != null)
            this.caitDaCreationCagrreItem = (Date) caitDaCreationCagrreItem.clone ();
        else
            this.caitDaCreationCagrreItem = caitDaCreationCagrreItem;
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

    public CordpCustomerSellingItem getCordpCustomerSellingItem() {
        return this.cordpCustomerSellingItem;
    }

    public void setCordpCustomerSellingItem(CordpCustomerSellingItem cordpCustomerSellingItem) {
        this.cordpCustomerSellingItem = cordpCustomerSellingItem;
    }

}
