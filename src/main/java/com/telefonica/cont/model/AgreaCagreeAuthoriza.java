package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the AgreaCagreeAuthorizaS database table.
 */
@Entity
@NamedQuery(name = "AgreaCagreeAuthoriza.findAll", query = "SELECT a FROM AgreaCagreeAuthoriza a")
@Table(name = "AGREA_CAGREE_AUTHORIZA", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"BUIN_ID_CAGREE_APPROVAL", "AGAT_TI_START_AGREE_AUTHORIZA"})})
public class AgreaCagreeAuthoriza implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AGAT_TI_END_AGREE_AUTHORIZA")
    private Timestamp agatTiEndAgreeAuthoriza;

    @Column(name = "AGAT_TI_START_AGREE_AUTHORIZA", nullable = false)
    private Timestamp agatTiStartAgreeAuthoriza;

    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "CAUT_ID_CAGREE_AUTHORIZA", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal cautIdCagreeAuthoriza;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "AGSR_ID_AGREE_SIGNAT_REPRESENT")
    @ManyToOne(fetch = FetchType.LAZY)
    private AgredAgreeSignatRepresent agredAgreeSignatRepresent;
    @JoinColumn(name = "CAAS_ID_CAGREE_AUTHORIZ_STATUS", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private AgredCagreeAuthorizStatus agredCagreeAuthorizStatus;
    @JoinColumn(name = "BUIN_ID_CAGREE_APPROVAL", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private AgrepCagreeApproval agrepCagreeApproval;
    @JoinColumn(name = "CSIO_ID_CUSTOMER_SELLING_ROLE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpCustomerSellingRole cordpCustomerSellingRole;

    public Timestamp getAgatTiEndAgreeAuthoriza() {
        if (this.agatTiEndAgreeAuthoriza != null)
            return (Timestamp) this.agatTiEndAgreeAuthoriza.clone ();
        else
            return null;
    }

    public void setAgatTiEndAgreeAuthoriza(Timestamp agatTiEndAgreeAuthoriza) {
        if (agatTiEndAgreeAuthoriza != null)
            this.agatTiEndAgreeAuthoriza = (Timestamp) agatTiEndAgreeAuthoriza.clone ();
        else
            this.agatTiEndAgreeAuthoriza = agatTiEndAgreeAuthoriza;
    }

    public Timestamp getAgatTiStartAgreeAuthoriza() {
        if (this.agatTiStartAgreeAuthoriza != null)
            return (Timestamp) this.agatTiStartAgreeAuthoriza.clone ();
        else
            return null;
    }

    public void setAgatTiStartAgreeAuthoriza(Timestamp agatTiStartAgreeAuthoriza) {
        if (agatTiStartAgreeAuthoriza != null)
            this.agatTiStartAgreeAuthoriza = (Timestamp) agatTiStartAgreeAuthoriza.clone ();
        else
            this.agatTiStartAgreeAuthoriza = agatTiStartAgreeAuthoriza;
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

    public BigDecimal getCautIdCagreeAuthoriza() {
        return this.cautIdCagreeAuthoriza;
    }

    public void setCautIdCagreeAuthoriza(BigDecimal cautIdCagreeAuthoriza) {
        this.cautIdCagreeAuthoriza = cautIdCagreeAuthoriza;
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

    public AgredAgreeSignatRepresent getAgredAgreeSignatRepresent() {
        return this.agredAgreeSignatRepresent;
    }

    public void setAgredAgreeSignatRepresent(AgredAgreeSignatRepresent agredAgreeSignatRepresent) {
        this.agredAgreeSignatRepresent = agredAgreeSignatRepresent;
    }

    public AgredCagreeAuthorizStatus getAgredCagreeAuthorizStatus() {
        return this.agredCagreeAuthorizStatus;
    }

    public void setAgredCagreeAuthorizStatus(AgredCagreeAuthorizStatus agredCagreeAuthorizStatus) {
        this.agredCagreeAuthorizStatus = agredCagreeAuthorizStatus;
    }

    public AgrepCagreeApproval getAgrepCagreeApproval() {
        return this.agrepCagreeApproval;
    }

    public void setAgrepCagreeApproval(AgrepCagreeApproval agrepCagreeApproval) {
        this.agrepCagreeApproval = agrepCagreeApproval;
    }

    public CordpCustomerSellingRole getCordpCustomerSellingRole() {
        return this.cordpCustomerSellingRole;
    }

    public void setCordpCustomerSellingRole(CordpCustomerSellingRole cordpCustomerSellingRole) {
        this.cordpCustomerSellingRole = cordpCustomerSellingRole;
    }

}
