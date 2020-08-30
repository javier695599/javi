package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the AgredAgreeSignatRepresentS database table.
 */
@Entity
@NamedQuery(name = "AgredAgreeSignatRepresent.findAll", query = "SELECT a FROM AgredAgreeSignatRepresent a")
@Table(name = "AGRED_AGREE_SIGNAT_REPRESENT")
public class AgredAgreeSignatRepresent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(length = 300, name = "AGSR_DS_AGREE_SIGNAT_REPRESENT")
    private String agsrDsAgreeSignatRepresent;

    @Column(name = "AGSR_ID_AGREE_SIGNAT_REPRESENT", nullable = false, precision = 3, unique = true)
    @Id
    private Long agsrIdAgreeSignatRepresent;

    @Column(length = 100, name = "AGSR_NA_AGREE_SIGNAT_REPRESENT", nullable = false)
    private String agsrNaAgreeSignatRepresent;

    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "agredAgreeSignatRepresent")
    private List<AgreaCagreeAuthoriza> agreaCagreeAuthorizas;

    public String getAgsrDsAgreeSignatRepresent() {
        return this.agsrDsAgreeSignatRepresent;
    }

    public void setAgsrDsAgreeSignatRepresent(String agsrDsAgreeSignatRepresent) {
        this.agsrDsAgreeSignatRepresent = agsrDsAgreeSignatRepresent;
    }

    public Long getAgsrIdAgreeSignatRepresent() {
        return this.agsrIdAgreeSignatRepresent;
    }

    public void setAgsrIdAgreeSignatRepresent(Long agsrIdAgreeSignatRepresent) {
        this.agsrIdAgreeSignatRepresent = agsrIdAgreeSignatRepresent;
    }

    public String getAgsrNaAgreeSignatRepresent() {
        return this.agsrNaAgreeSignatRepresent;
    }

    public void setAgsrNaAgreeSignatRepresent(String agsrNaAgreeSignatRepresent) {
        this.agsrNaAgreeSignatRepresent = agsrNaAgreeSignatRepresent;
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
