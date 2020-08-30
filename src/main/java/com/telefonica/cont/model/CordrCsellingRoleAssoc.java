package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the CordrCsellingRoleAssocS database table.
 */
@Entity
@NamedQuery(name = "CordrCsellingRoleAssoc.findAll", query = "SELECT c FROM CordrCsellingRoleAssoc c")
@Table(name = "CORDR_CSELLING_ROLE_ASSOC", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "CSIO_ID_CUSTOMER_SELLING_ROLE", "BIIT_ID_CUSTOMER_SELLING_ITEM"})})
public class CordrCsellingRoleAssoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "CSRA_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csraDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CSRA_DA_START_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csraDaStartValidity;

    @Column(name = "CSRA_ID_CSELLING_ROLE_ASSOC", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal csraIdCsellingRoleAssoc;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "BIIT_ID_CUSTOMER_SELLING_ITEM", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpCustomerSellingItem cordpCustomerSellingItem;
    @JoinColumn(name = "CSIO_ID_CUSTOMER_SELLING_ROLE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpCustomerSellingRole cordpCustomerSellingRole;

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

    public Date getCsraDaEndValidity() {
        if (this.csraDaEndValidity != null)
            return (Date) this.csraDaEndValidity.clone ();
        else
            return null;
    }

    public void setCsraDaEndValidity(Date csraDaEndValidity) {
        if (csraDaEndValidity != null)
            this.csraDaEndValidity = (Date) csraDaEndValidity.clone ();
        else
            this.csraDaEndValidity = csraDaEndValidity;
    }

    public Date getCsraDaStartValidity() {
        if (this.csraDaStartValidity != null)
            return (Date) this.csraDaStartValidity.clone ();
        else
            return null;
    }

    public void setCsraDaStartValidity(Date csraDaStartValidity) {
        if (csraDaStartValidity != null)
            this.csraDaStartValidity = (Date) csraDaStartValidity.clone ();
        else
            this.csraDaStartValidity = csraDaStartValidity;
    }

    public BigDecimal getCsraIdCsellingRoleAssoc() {
        return this.csraIdCsellingRoleAssoc;
    }

    public void setCsraIdCsellingRoleAssoc(BigDecimal csraIdCsellingRoleAssoc) {
        this.csraIdCsellingRoleAssoc = csraIdCsellingRoleAssoc;
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

    public CordpCustomerSellingItem getCordpCustomerSellingItem() {
        return this.cordpCustomerSellingItem;
    }

    public void setCordpCustomerSellingItem(CordpCustomerSellingItem cordpCustomerSellingItem) {
        this.cordpCustomerSellingItem = cordpCustomerSellingItem;
    }

    public CordpCustomerSellingRole getCordpCustomerSellingRole() {
        return this.cordpCustomerSellingRole;
    }

    public void setCordpCustomerSellingRole(CordpCustomerSellingRole cordpCustomerSellingRole) {
        this.cordpCustomerSellingRole = cordpCustomerSellingRole;
    }

}
