package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the AgrepCustomerAgreementS database table.
 */
@Entity
@NamedQuery(name = "AgrepCustomerAgreement.findAll", query = "SELECT a FROM AgrepCustomerAgreement a")
@Table(name = "AGREP_CUSTOMER_AGREEMENT")
public class AgrepCustomerAgreement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(length = 20, name = "AGRE_CO_AGREEMENT", nullable = false, unique = true)
    private String agreCoAgreement;

    @Column(columnDefinition = "DATE", name = "AGRE_DA_END_PERIOD")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date agreDaEndPeriod;

    @Column(columnDefinition = "DATE", name = "AGRE_DA_START_PERIOD")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date agreDaStartPeriod;

    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BUIN_ID_CUSTOMER_AGREEMENT", nullable = false, precision = 38, unique = true)
    @Id
    private BigDecimal buinIdCustomerAgreement;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "agrepCustomerAgreement")
    private List<AgrepCagreeTermOrCond> agrepCagreeTermOrConds;
    @OneToMany(mappedBy = "agrepCustomerAgreement")
    private List<AgrepCustomerAgreementIt> agrepCustomerAgreementIts;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "BUIN_ID_CUSTOMER_AGREEMENT")
    private CordpCustomerSelling cordpCustomerSelling;

    public String getAgreCoAgreement() {
        return this.agreCoAgreement;
    }

    public void setAgreCoAgreement(String agreCoAgreement) {
        this.agreCoAgreement = agreCoAgreement;
    }

    public Date getAgreDaEndPeriod() {
        if (this.agreDaEndPeriod != null)
            return (Date) this.agreDaEndPeriod.clone ();
        else
            return null;
    }

    public void setAgreDaEndPeriod(Date agreDaEndPeriod) {
        if (agreDaEndPeriod != null)
            this.agreDaEndPeriod = (Date) agreDaEndPeriod.clone ();
        else
            this.agreDaEndPeriod = agreDaEndPeriod;
    }

    public Date getAgreDaStartPeriod() {
        if (this.agreDaStartPeriod != null)
            return (Date) this.agreDaStartPeriod.clone ();
        else
            return null;
    }

    public void setAgreDaStartPeriod(Date agreDaStartPeriod) {
        if (agreDaStartPeriod != null)
            this.agreDaStartPeriod = (Date) agreDaStartPeriod.clone ();
        else
            this.agreDaStartPeriod = agreDaStartPeriod;
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

    public BigDecimal getBuinIdCustomerAgreement() {
        return this.buinIdCustomerAgreement;
    }

    public void setBuinIdCustomerAgreement(BigDecimal buinIdCustomerAgreement) {
        this.buinIdCustomerAgreement = buinIdCustomerAgreement;
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

    public List<AgrepCagreeTermOrCond> getAgrepCagreeTermOrConds() {
        return this.agrepCagreeTermOrConds;
    }

    public void setAgrepCagreeTermOrConds(List<AgrepCagreeTermOrCond> agrepCagreeTermOrConds) {
        this.agrepCagreeTermOrConds = agrepCagreeTermOrConds;
    }

    public void addAgrepCagreeTermOrConds(AgrepCagreeTermOrCond agrepCagreeTermOrCond) {
        if (this.agrepCagreeTermOrConds == null)
            this.agrepCagreeTermOrConds = new ArrayList<AgrepCagreeTermOrCond> ();
        this.agrepCagreeTermOrConds.add ( agrepCagreeTermOrCond );
    }

    public void removeAgrepCagreeTermOrConds(AgrepCagreeTermOrCond agrepCagreeTermOrCondToRemove) {
        if (agrepCagreeTermOrCondToRemove != null)
            this.agrepCagreeTermOrConds.remove ( agrepCagreeTermOrCondToRemove );
    }

    public List<AgrepCustomerAgreementIt> getAgrepCustomerAgreementIts() {
        return this.agrepCustomerAgreementIts;
    }

    public void setAgrepCustomerAgreementIts(List<AgrepCustomerAgreementIt> agrepCustomerAgreementIts) {
        this.agrepCustomerAgreementIts = agrepCustomerAgreementIts;
    }

    public void addAgrepCustomerAgreementIts(AgrepCustomerAgreementIt agrepCustomerAgreementIt) {
        if (this.agrepCustomerAgreementIts == null)
            this.agrepCustomerAgreementIts = new ArrayList<AgrepCustomerAgreementIt> ();
        this.agrepCustomerAgreementIts.add ( agrepCustomerAgreementIt );
    }

    public void removeAgrepCustomerAgreementIts(AgrepCustomerAgreementIt agrepCustomerAgreementItToRemove) {
        if (agrepCustomerAgreementItToRemove != null)
            this.agrepCustomerAgreementIts.remove ( agrepCustomerAgreementItToRemove );
    }

    public CordpCustomerSelling getCordpCustomerSelling() {
        return this.cordpCustomerSelling;
    }

    public void setCordpCustomerSelling(CordpCustomerSelling cordpCustomerSelling) {
        this.cordpCustomerSelling = cordpCustomerSelling;
    }

}
