package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CorddCsellingRoleTypeS database table.
 */
@Entity
@NamedQuery(name = "CorddCsellingRoleType.findAll", query = "SELECT c FROM CorddCsellingRoleType c")
@Table(name = "CORDD_CSELLING_ROLE_TYPE")
public class CorddCsellingRoleType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(length = 100, name = "CRLA_DS_CSELLING_ROLE_TYPE_LAN")
    private String crlaDsCsellingRoleTypeLan;

    @Column(length = 40, name = "CRLA_NA_CSELLING_ROLE_TYPE_LAN", nullable = false)
    private String crlaNaCsellingRoleTypeLan;

    @Column(columnDefinition = "DATE", name = "CROT_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date crotDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CROT_DA_START_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date crotDaStartValidity;

    @Column(name = "CROT_ID_CSELLING_ROLE_TYPE", nullable = false, precision = 3, unique = true)
    @Id
    private Long crotIdCsellingRoleType;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "BINT_ID_CSELLING_TYPE")
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingType corddCsellingType;
    @OneToMany(mappedBy = "corddCsellingRoleType")
    private List<CordpCustomerSellingRole> cordpCustomerSellingRoles;
    @OneToMany(mappedBy = "corddCsellingRoleType")
    private List<CordrCsellingRoleTypeLan> cordrCsellingRoleTypeLans;

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

    public String getCrlaDsCsellingRoleTypeLan() {
        return this.crlaDsCsellingRoleTypeLan;
    }

    public void setCrlaDsCsellingRoleTypeLan(String crlaDsCsellingRoleTypeLan) {
        this.crlaDsCsellingRoleTypeLan = crlaDsCsellingRoleTypeLan;
    }

    public String getCrlaNaCsellingRoleTypeLan() {
        return this.crlaNaCsellingRoleTypeLan;
    }

    public void setCrlaNaCsellingRoleTypeLan(String crlaNaCsellingRoleTypeLan) {
        this.crlaNaCsellingRoleTypeLan = crlaNaCsellingRoleTypeLan;
    }

    public Date getCrotDaEndValidity() {
        if (this.crotDaEndValidity != null)
            return (Date) this.crotDaEndValidity.clone ();
        else
            return null;
    }

    public void setCrotDaEndValidity(Date crotDaEndValidity) {
        if (crotDaEndValidity != null)
            this.crotDaEndValidity = (Date) crotDaEndValidity.clone ();
        else
            this.crotDaEndValidity = crotDaEndValidity;
    }

    public Date getCrotDaStartValidity() {
        if (this.crotDaStartValidity != null)
            return (Date) this.crotDaStartValidity.clone ();
        else
            return null;
    }

    public void setCrotDaStartValidity(Date crotDaStartValidity) {
        if (crotDaStartValidity != null)
            this.crotDaStartValidity = (Date) crotDaStartValidity.clone ();
        else
            this.crotDaStartValidity = crotDaStartValidity;
    }

    public Long getCrotIdCsellingRoleType() {
        return this.crotIdCsellingRoleType;
    }

    public void setCrotIdCsellingRoleType(Long crotIdCsellingRoleType) {
        this.crotIdCsellingRoleType = crotIdCsellingRoleType;
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

    public CorddCsellingType getCorddCsellingType() {
        return this.corddCsellingType;
    }

    public void setCorddCsellingType(CorddCsellingType corddCsellingType) {
        this.corddCsellingType = corddCsellingType;
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

    public List<CordrCsellingRoleTypeLan> getCordrCsellingRoleTypeLans() {
        return this.cordrCsellingRoleTypeLans;
    }

    public void setCordrCsellingRoleTypeLans(List<CordrCsellingRoleTypeLan> cordrCsellingRoleTypeLans) {
        this.cordrCsellingRoleTypeLans = cordrCsellingRoleTypeLans;
    }

    public void addCordrCsellingRoleTypeLans(CordrCsellingRoleTypeLan cordrCsellingRoleTypeLan) {
        if (this.cordrCsellingRoleTypeLans == null)
            this.cordrCsellingRoleTypeLans = new ArrayList<CordrCsellingRoleTypeLan> ();
        this.cordrCsellingRoleTypeLans.add ( cordrCsellingRoleTypeLan );
    }

    public void removeCordrCsellingRoleTypeLans(CordrCsellingRoleTypeLan cordrCsellingRoleTypeLanToRemove) {
        if (cordrCsellingRoleTypeLanToRemove != null)
            this.cordrCsellingRoleTypeLans.remove ( cordrCsellingRoleTypeLanToRemove );
    }

}
