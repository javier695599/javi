package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the AgredCagreeAuthorizStatusS database table.
 */
@Entity
@NamedQuery(name = "AgredCagreeAuthorizStatus.findAll", query = "SELECT a FROM AgredCagreeAuthorizStatus a")
@Table(name = "AGRED_CAGREE_AUTHORIZ_STATUS")
public class AgredCagreeAuthorizStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "CAAS_ID_CAGREE_AUTHORIZ_STATUS", nullable = false, precision = 3, unique = true)
    @Id
    private Long caasIdCagreeAuthorizStatus;

    @Column(length = 100, name = "CAAS_NA_CAGREE_AUTHORIZ_STATUS", nullable = false)
    private String caasNaCagreeAuthorizStatus;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "agredCagreeAuthorizStatus")
    private List<AgreaCagreeAuthoriza> agreaCagreeAuthorizas;

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

    public Long getCaasIdCagreeAuthorizStatus() {
        return this.caasIdCagreeAuthorizStatus;
    }

    public void setCaasIdCagreeAuthorizStatus(Long caasIdCagreeAuthorizStatus) {
        this.caasIdCagreeAuthorizStatus = caasIdCagreeAuthorizStatus;
    }

    public String getCaasNaCagreeAuthorizStatus() {
        return this.caasNaCagreeAuthorizStatus;
    }

    public void setCaasNaCagreeAuthorizStatus(String caasNaCagreeAuthorizStatus) {
        this.caasNaCagreeAuthorizStatus = caasNaCagreeAuthorizStatus;
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

}
