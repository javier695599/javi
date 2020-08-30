package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the CordrCsellingRelaOutS database table.
 */
@Entity
@NamedQuery(name = "CordrCsellingRelaOut.findAll", query = "SELECT c FROM CordrCsellingRelaOut c")
@Table(name = "CORDR_CSELLING_RELA_OUT", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BUIN_ID_CUSTOMER_SELLING", "BINT_ID_CSELLING_TYPE", "BUIN_ID_BUSINESS_INTERAC",
        "BINT_ID_BUSINESS_INTERAC_TYPE", "CSRT_ID_CSELLING_RELA_TYPE"})})
public class CordrCsellingRelaOut implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BUIN_ID_BUSINESS_INTERAC", nullable = false, precision = 38)
    private BigDecimal buinIdBusinessInterac;

    @Column(columnDefinition = "DATE", name = "CSRO_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csroDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CSRO_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csroDaStartValidity;

    @Column(name = "CSRO_ID_CSELLING_RELA_OUT", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal csroIdCsellingRelaOut;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumns({
            @JoinColumn(referencedColumnName = "BINT_ID_CSELLING_TYPE", nullable = false, name = "BINT_ID_CSELLING_TYPE"),
            @JoinColumn(referencedColumnName = "BUIN_ID_CUSTOMER_SELLING", nullable = false, name = "BUIN_ID_CUSTOMER_SELLING")})
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpCustomerSelling cordpCustomerSelling;
    @JoinColumns({
            @JoinColumn(referencedColumnName = "BINT_ID_CSELLING_TYPE_RE", nullable = false, name = "BINT_ID_BUSINESS_INTERAC_TYPE"),
            @JoinColumn(referencedColumnName = "BINT_ID_CSELLING_TYPE", nullable = false, name = "BINT_ID_CSELLING_TYPE", updatable = false, insertable = false),
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

    public BigDecimal getBuinIdBusinessInterac() {
        return this.buinIdBusinessInterac;
    }

    public void setBuinIdBusinessInterac(BigDecimal buinIdBusinessInterac) {
        this.buinIdBusinessInterac = buinIdBusinessInterac;
    }

    public Date getCsroDaEndValidity() {
        if (this.csroDaEndValidity != null)
            return (Date) this.csroDaEndValidity.clone ();
        else
            return null;
    }

    public void setCsroDaEndValidity(Date csroDaEndValidity) {
        if (csroDaEndValidity != null)
            this.csroDaEndValidity = (Date) csroDaEndValidity.clone ();
        else
            this.csroDaEndValidity = csroDaEndValidity;
    }

    public Date getCsroDaStartValidity() {
        if (this.csroDaStartValidity != null)
            return (Date) this.csroDaStartValidity.clone ();
        else
            return null;
    }

    public void setCsroDaStartValidity(Date csroDaStartValidity) {
        if (csroDaStartValidity != null)
            this.csroDaStartValidity = (Date) csroDaStartValidity.clone ();
        else
            this.csroDaStartValidity = csroDaStartValidity;
    }

    public BigDecimal getCsroIdCsellingRelaOut() {
        return this.csroIdCsellingRelaOut;
    }

    public void setCsroIdCsellingRelaOut(BigDecimal csroIdCsellingRelaOut) {
        this.csroIdCsellingRelaOut = csroIdCsellingRelaOut;
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

    public CordpCustomerSelling getCordpCustomerSelling() {
        return this.cordpCustomerSelling;
    }

    public void setCordpCustomerSelling(CordpCustomerSelling cordpCustomerSelling) {
        this.cordpCustomerSelling = cordpCustomerSelling;
    }

    public CordrCsellingRelaType getCordrCsellingRelaType() {
        return this.cordrCsellingRelaType;
    }

    public void setCordrCsellingRelaType(CordrCsellingRelaType cordrCsellingRelaType) {
        this.cordrCsellingRelaType = cordrCsellingRelaType;
    }

}
