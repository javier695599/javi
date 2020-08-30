package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CorddCsellingRoleClassS database table.
 */
@Entity
@NamedQuery(name = "CorddCsellingRoleClass.findAll", query = "SELECT c FROM CorddCsellingRoleClass c")
@Table(name = "CORDD_CSELLING_ROLE_CLASS")
public class CorddCsellingRoleClass implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "CROC_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date crocDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CROC_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date crocDaStartValidity;

    @Column(length = 100, name = "CROC_DS_CSELLING_ROLE_CLASS")
    private String crocDsCsellingRoleClass;

    @Column(name = "CROC_ID_CSELLING_ROLE_CLASS", nullable = false, precision = 3, unique = true)
    @Id
    private Long crocIdCsellingRoleClass;

    @Column(length = 40, name = "CROC_NA_CSELLING_ROLE_CLASS", nullable = false)
    private String crocNaCsellingRoleClass;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "corddCsellingRoleClass")
    private List<CordpCustomerSellingRole> cordpCustomerSellingRoles;

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

    public Date getCrocDaEndValidity() {
        if (this.crocDaEndValidity != null)
            return (Date) this.crocDaEndValidity.clone ();
        else
            return null;
    }

    public void setCrocDaEndValidity(Date crocDaEndValidity) {
        if (crocDaEndValidity != null)
            this.crocDaEndValidity = (Date) crocDaEndValidity.clone ();
        else
            this.crocDaEndValidity = crocDaEndValidity;
    }

    public Date getCrocDaStartValidity() {
        if (this.crocDaStartValidity != null)
            return (Date) this.crocDaStartValidity.clone ();
        else
            return null;
    }

    public void setCrocDaStartValidity(Date crocDaStartValidity) {
        if (crocDaStartValidity != null)
            this.crocDaStartValidity = (Date) crocDaStartValidity.clone ();
        else
            this.crocDaStartValidity = crocDaStartValidity;
    }

    public String getCrocDsCsellingRoleClass() {
        return this.crocDsCsellingRoleClass;
    }

    public void setCrocDsCsellingRoleClass(String crocDsCsellingRoleClass) {
        this.crocDsCsellingRoleClass = crocDsCsellingRoleClass;
    }

    public Long getCrocIdCsellingRoleClass() {
        return this.crocIdCsellingRoleClass;
    }

    public void setCrocIdCsellingRoleClass(Long crocIdCsellingRoleClass) {
        this.crocIdCsellingRoleClass = crocIdCsellingRoleClass;
    }

    public String getCrocNaCsellingRoleClass() {
        return this.crocNaCsellingRoleClass;
    }

    public void setCrocNaCsellingRoleClass(String crocNaCsellingRoleClass) {
        this.crocNaCsellingRoleClass = crocNaCsellingRoleClass;
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

    public List<CordpCustomerSellingRole> getCordpCustomerSellingRoles() {
        return this.cordpCustomerSellingRoles;
    }

    public void setCordpCustomerSellingRoles(List<CordpCustomerSellingRole> cordpCustomerSellingRoles) {
        this.cordpCustomerSellingRoles = cordpCustomerSellingRoles;
    }

    public void addCordpCustomerSellingRoles(CordpCustomerSellingRole cordpCustomerSellingRole) {
        if (this.cordpCustomerSellingRoles == null)
            this.cordpCustomerSellingRoles = new ArrayList<CordpCustomerSellingRole> ();
        this.cordpCustomerSellingRoles.add ( cordpCustomerSellingRole );
    }

    public void removeCordpCustomerSellingRoles(CordpCustomerSellingRole cordpCustomerSellingRoleToRemove) {
        if (cordpCustomerSellingRoleToRemove != null)
            this.cordpCustomerSellingRoles.remove ( cordpCustomerSellingRoleToRemove );
    }

}
