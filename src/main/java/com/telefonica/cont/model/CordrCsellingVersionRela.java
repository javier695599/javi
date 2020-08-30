package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CordrCsellingVersionRelaS database table.
 */
@Entity
@NamedQuery(name = "CordrCsellingVersionRela.findAll", query = "SELECT c FROM CordrCsellingVersionRela c")
@Table(name = "CORDR_CSELLING_VERSION_RELA", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BUIN_ID_CUSTOMER_SELLING", "BUIN_ID_CUSTOMER_SELLING_RE"})})
public class CordrCsellingVersionRela implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "CSVE_ID_CSELLING_VERSION_RELA", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal csveIdCsellingVersionRela;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumns({
            @JoinColumn(referencedColumnName = "BINT_ID_CSELLING_TYPE", nullable = false, name = "BINT_ID_CSELLING_TYPE"),
            @JoinColumn(referencedColumnName = "BUIN_ID_CUSTOMER_SELLING", nullable = false, name = "BUIN_ID_CUSTOMER_SELLING")})
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpCustomerSelling cordpCustomerSelling1;
    @JoinColumns({
            @JoinColumn(referencedColumnName = "BINT_ID_CSELLING_TYPE", nullable = false, name = "BINT_ID_CSELLING_TYPE", updatable = false, insertable = false),
            @JoinColumn(referencedColumnName = "BUIN_ID_CUSTOMER_SELLING", nullable = false, name = "BUIN_ID_CUSTOMER_SELLING_RE")})
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpCustomerSelling cordpCustomerSelling2;
    @JoinColumns({
            @JoinColumn(referencedColumnName = "BINT_ID_CSELLING_TYPE", nullable = false, name = "BINT_ID_CSELLING_TYPE", updatable = false, insertable = false),
            @JoinColumn(referencedColumnName = "CSVR_ID_CSELLING_VERS_REASON", nullable = false, name = "CSVR_ID_CSELLING_VERS_REASON")})
    @ManyToOne(fetch = FetchType.LAZY)
    private CordrCsellingVersionType cordrCsellingVersionType;

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

    public BigDecimal getCsveIdCsellingVersionRela() {
        return this.csveIdCsellingVersionRela;
    }

    public void setCsveIdCsellingVersionRela(BigDecimal csveIdCsellingVersionRela) {
        this.csveIdCsellingVersionRela = csveIdCsellingVersionRela;
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

    public CordpCustomerSelling getCordpCustomerSelling1() {
        return this.cordpCustomerSelling1;
    }

    public void setCordpCustomerSelling1(CordpCustomerSelling cordpCustomerSelling1) {
        this.cordpCustomerSelling1 = cordpCustomerSelling1;
    }

    public CordpCustomerSelling getCordpCustomerSelling2() {
        return this.cordpCustomerSelling2;
    }

    public void setCordpCustomerSelling2(CordpCustomerSelling cordpCustomerSelling2) {
        this.cordpCustomerSelling2 = cordpCustomerSelling2;
    }

    public CordrCsellingVersionType getCordrCsellingVersionType() {
        return this.cordrCsellingVersionType;
    }

    public void setCordrCsellingVersionType(CordrCsellingVersionType cordrCsellingVersionType) {
        this.cordrCsellingVersionType = cordrCsellingVersionType;
    }
}
