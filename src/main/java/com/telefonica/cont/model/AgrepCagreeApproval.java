package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the AgrepCagreeApprovalS database table.
 */
@Entity
@NamedQuery(name = "AgrepCagreeApproval.findAll", query = "SELECT a FROM AgrepCagreeApproval a")
@Table(name = "AGREP_CAGREE_APPROVAL")
public class AgrepCagreeApproval implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BUIN_ID_CAGREE_APPROVAL", nullable = false, precision = 38, unique = true)
    @Id
    private BigDecimal buinIdCagreeApproval;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "agrepCagreeApproval")
    private List<AgreaCagreeAuthoriza> agreaCagreeAuthorizas;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "BUIN_ID_CAGREE_APPROVAL")
    private CordpCustomerSelling cordpCustomerSelling;

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

    public BigDecimal getBuinIdCagreeApproval() {
        return this.buinIdCagreeApproval;
    }

    public void setBuinIdCagreeApproval(BigDecimal buinIdCagreeApproval) {
        this.buinIdCagreeApproval = buinIdCagreeApproval;
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

    public List<AgreaCagreeAuthoriza> getAgreaCagreeAuthorizas() {
        return this.agreaCagreeAuthorizas;
    }

    public void setAgreaCagreeAuthorizas(List<AgreaCagreeAuthoriza> agreaCagreeAuthorizas) {
        this.agreaCagreeAuthorizas = agreaCagreeAuthorizas;
    }

    public void addAgreaCagreeAuthorizas(AgreaCagreeAuthoriza agreaCagreeAuthoriza) {
        if (this.agreaCagreeAuthorizas == null)
            this.agreaCagreeAuthorizas = new ArrayList<AgreaCagreeAuthoriza> ();
        this.agreaCagreeAuthorizas.add ( agreaCagreeAuthoriza );
    }

    public void removeAgreaCagreeAuthorizas(AgreaCagreeAuthoriza agreaCagreeAuthorizaToRemove) {
        if (agreaCagreeAuthorizaToRemove != null)
            this.agreaCagreeAuthorizas.remove ( agreaCagreeAuthorizaToRemove );
    }

    public CordpCustomerSelling getCordpCustomerSelling() {
        return this.cordpCustomerSelling;
    }

    public void setCordpCustomerSelling(CordpCustomerSelling cordpCustomerSelling) {
        this.cordpCustomerSelling = cordpCustomerSelling;
    }

}
