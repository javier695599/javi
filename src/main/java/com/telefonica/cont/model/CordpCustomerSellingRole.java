package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CordpCustomerSellingRoleS database table.
 */
@Entity
@NamedQuery(name = "CordpCustomerSellingRole.findAll", query = "SELECT c FROM CordpCustomerSellingRole c")
@Table(name = "CORDP_CUSTOMER_SELLING_ROLE")
public class CordpCustomerSellingRole implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "CSIO_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csioDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CSIO_DA_START_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csioDaStartValidity;

    @Column(name = "CSIO_ID_CLASS_ROLE", nullable = false, precision = 38)
    private BigDecimal csioIdClassRole;

    @Column(name = "CSIO_ID_CUSTOMER_SELLING_ROLE", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal csioIdCustomerSellingRole;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "cordpCustomerSellingRole")
    private List<AgreaCagreeAuthoriza> agreaCagreeAuthorizas;
    @JoinColumn(name = "CROC_ID_CSELLING_ROLE_CLASS", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingRoleClass corddCsellingRoleClass;
    @JoinColumn(name = "CROT_ID_CSELLING_ROLE_TYPE")
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingRoleType corddCsellingRoleType;
    @JoinColumns({@JoinColumn(referencedColumnName = "BINT_ID_CSELLING_TYPE", name = "BINT_ID_CSELLING_TYPE"),
            @JoinColumn(referencedColumnName = "BUIN_ID_CUSTOMER_SELLING", name = "BUIN_ID_CUSTOMER_SELLING")})
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpCustomerSelling cordpCustomerSelling;
    @OneToMany(mappedBy = "cordpCustomerSellingRole")
    private List<CordrCsellingRoleAssoc> cordrCsellingRoleAssocs;

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

    public Date getCsioDaEndValidity() {
        if (this.csioDaEndValidity != null)
            return (Date) this.csioDaEndValidity.clone ();
        else
            return null;
    }

    public void setCsioDaEndValidity(Date csioDaEndValidity) {
        if (csioDaEndValidity != null)
            this.csioDaEndValidity = (Date) csioDaEndValidity.clone ();
        else
            this.csioDaEndValidity = csioDaEndValidity;
    }

    public Date getCsioDaStartValidity() {
        if (this.csioDaStartValidity != null)
            return (Date) this.csioDaStartValidity.clone ();
        else
            return null;
    }

    public void setCsioDaStartValidity(Date csioDaStartValidity) {
        if (csioDaStartValidity != null)
            this.csioDaStartValidity = (Date) csioDaStartValidity.clone ();
        else
            this.csioDaStartValidity = csioDaStartValidity;
    }

    public BigDecimal getCsioIdClassRole() {
        return this.csioIdClassRole;
    }

    public void setCsioIdClassRole(BigDecimal csioIdClassRole) {
        this.csioIdClassRole = csioIdClassRole;
    }

    public BigDecimal getCsioIdCustomerSellingRole() {
        return this.csioIdCustomerSellingRole;
    }

    public void setCsioIdCustomerSellingRole(BigDecimal csioIdCustomerSellingRole) {
        this.csioIdCustomerSellingRole = csioIdCustomerSellingRole;
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

    public CorddCsellingRoleClass getCorddCsellingRoleClass() {
        return this.corddCsellingRoleClass;
    }

    public void setCorddCsellingRoleClass(CorddCsellingRoleClass corddCsellingRoleClass) {
        this.corddCsellingRoleClass = corddCsellingRoleClass;
    }

    public CorddCsellingRoleType getCorddCsellingRoleType() {
        return this.corddCsellingRoleType;
    }

    public void setCorddCsellingRoleType(CorddCsellingRoleType corddCsellingRoleType) {
        this.corddCsellingRoleType = corddCsellingRoleType;
    }

    public CordpCustomerSelling getCordpCustomerSelling() {
        return this.cordpCustomerSelling;
    }

    public void setCordpCustomerSelling(CordpCustomerSelling cordpCustomerSelling) {
        this.cordpCustomerSelling = cordpCustomerSelling;
    }

    public List<CordrCsellingRoleAssoc> getCordrCsellingRoleAssocs() {
        return this.cordrCsellingRoleAssocs;
    }

    public void setCordrCsellingRoleAssocs(List<CordrCsellingRoleAssoc> cordrCsellingRoleAssocs) {
        this.cordrCsellingRoleAssocs = cordrCsellingRoleAssocs;
    }

    public void addCordrCsellingRoleAssocs(CordrCsellingRoleAssoc cordrCsellingRoleAssoc) {
        if (this.cordrCsellingRoleAssocs == null)
            this.cordrCsellingRoleAssocs = new ArrayList<CordrCsellingRoleAssoc> ();
        this.cordrCsellingRoleAssocs.add ( cordrCsellingRoleAssoc );
    }

    public void removeCordrCsellingRoleAssocs(CordrCsellingRoleAssoc cordrCsellingRoleAssocToRemove) {
        if (cordrCsellingRoleAssocToRemove != null)
            this.cordrCsellingRoleAssocs.remove ( cordrCsellingRoleAssocToRemove );
    }

}
