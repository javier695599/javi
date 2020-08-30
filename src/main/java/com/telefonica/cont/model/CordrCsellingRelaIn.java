package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the CordrCsellingRelaInS database table.
 */
@Entity
@NamedQuery(name = "CordrCsellingRelaIn.findAll", query = "SELECT c FROM CordrCsellingRelaIn c")
@Table(name = "CORDR_CSELLING_RELA_IN", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BUIN_ID_CUSTOMER_SELLING", "BINT_ID_CSELLING_TYPE", "BUIN_ID_CUSTOMER_SELLING_RE", "BINT_ID_CSELLING_TYPE_RE",
        "CSRT_ID_CSELLING_RELA_TYPE"})})
public class CordrCsellingRelaIn implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "CSRS_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csrsDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CSRS_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csrsDaStartValidity;

    @Column(name = "CSRS_ID_CSELLING_RELA_IN", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal csrsIdCsellingRelaIn;

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
            @JoinColumn(referencedColumnName = "BINT_ID_CSELLING_TYPE", nullable = false, name = "BINT_ID_CSELLING_TYPE_RE"),
            @JoinColumn(referencedColumnName = "BUIN_ID_CUSTOMER_SELLING", nullable = false, name = "BUIN_ID_CUSTOMER_SELLING_RE")})
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpCustomerSelling cordpCustomerSelling2;
    @JoinColumns({
            @JoinColumn(referencedColumnName = "BINT_ID_CSELLING_TYPE", nullable = false, name = "BINT_ID_CSELLING_TYPE", updatable = false, insertable = false),
            @JoinColumn(referencedColumnName = "BINT_ID_CSELLING_TYPE_RE", nullable = false, name = "BINT_ID_CSELLING_TYPE_RE", updatable = false, insertable = false),
            @JoinColumn(referencedColumnName = "CSRT_ID_CSELLING_RELA_TYPE", nullable = false, name = "CSRT_ID_CSELLING_RELA_TYPE")})
    @ManyToOne(fetch = FetchType.LAZY)
    private CordrCsellingRelaType cordrCsellingRelaType;

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

    public Date getCsrsDaEndValidity() {
        if (this.csrsDaEndValidity != null)
            return (Date) this.csrsDaEndValidity.clone ();
        else
            return null;
    }

    public void setCsrsDaEndValidity(Date csrsDaEndValidity) {
        if (csrsDaEndValidity != null)
            this.csrsDaEndValidity = (Date) csrsDaEndValidity.clone ();
        else
            this.csrsDaEndValidity = csrsDaEndValidity;
    }

    public Date getCsrsDaStartValidity() {
        if (this.csrsDaStartValidity != null)
            return (Date) this.csrsDaStartValidity.clone ();
        else
            return null;
    }

    public void setCsrsDaStartValidity(Date csrsDaStartValidity) {
        if (csrsDaStartValidity != null)
            this.csrsDaStartValidity = (Date) csrsDaStartValidity.clone ();
        else
            this.csrsDaStartValidity = csrsDaStartValidity;
    }

    public BigDecimal getCsrsIdCsellingRelaIn() {
        return this.csrsIdCsellingRelaIn;
    }

    public void setCsrsIdCsellingRelaIn(BigDecimal csrsIdCsellingRelaIn) {
        this.csrsIdCsellingRelaIn = csrsIdCsellingRelaIn;
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

    public CordrCsellingRelaType getCordrCsellingRelaType() {
        return this.cordrCsellingRelaType;
    }

    public void setCordrCsellingRelaType(CordrCsellingRelaType cordrCsellingRelaType) {
        this.cordrCsellingRelaType = cordrCsellingRelaType;
    }

}
