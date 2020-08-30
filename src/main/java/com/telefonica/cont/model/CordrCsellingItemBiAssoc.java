package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the CordrCsellingItemBiAssocS database table.
 */
@Entity
@NamedQuery(name = "CordrCsellingItemBiAssoc.findAll", query = "SELECT c FROM CordrCsellingItemBiAssoc c")
@Table(name = "CORDR_CSELLING_ITEM_BI_ASSOC", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BIIT_ID_CUSTOMER_SELLING_ITEM", "CSIT_ID_CSELLING_ITEM_TYPE", "BUIN_ID_BUSINESS_INTERAC",
        "BINT_ID_BUSINESS_INTERAC_TYPE"})})
public class CordrCsellingItemBiAssoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BUIN_ID_BUSINESS_INTERAC", nullable = false, precision = 38)
    private BigDecimal buinIdBusinessInterac;

    @Column(columnDefinition = "DATE", name = "CSIB_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csibDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CSIB_DA_START_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csibDaStartValidity;

    @Column(name = "CSIB_ID_CSELLING_ITEM_BI_ASSOC", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal csibIdCsellingItemBiAssoc;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumns({
            @JoinColumn(referencedColumnName = "BIIT_ID_CUSTOMER_SELLING_ITEM", nullable = false, name = "BIIT_ID_CUSTOMER_SELLING_ITEM"),
            @JoinColumn(referencedColumnName = "CSIT_ID_CSELLING_ITEM_TYPE", nullable = false, name = "CSIT_ID_CSELLING_ITEM_TYPE")})
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpCustomerSellingItem cordpCustomerSellingItem;
    @JoinColumns({
            @JoinColumn(referencedColumnName = "BINT_ID_CSELLING_TYPE", nullable = false, name = "BINT_ID_BUSINESS_INTERAC_TYPE"),
            @JoinColumn(referencedColumnName = "CSIT_ID_CSELLING_ITEM_TYPE", nullable = false, name = "CSIT_ID_CSELLING_ITEM_TYPE", updatable = false, insertable = false)})
    @ManyToOne(fetch = FetchType.LAZY)
    private CordrCsellingItemBiType cordrCsellingItemBiType;

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

    public Date getCsibDaEndValidity() {
        if (this.csibDaEndValidity != null)
            return (Date) this.csibDaEndValidity.clone ();
        else
            return null;
    }

    public void setCsibDaEndValidity(Date csibDaEndValidity) {
        if (csibDaEndValidity != null)
            this.csibDaEndValidity = (Date) csibDaEndValidity.clone ();
        else
            this.csibDaEndValidity = csibDaEndValidity;
    }

    public Date getCsibDaStartValidity() {
        if (this.csibDaStartValidity != null)
            return (Date) this.csibDaStartValidity.clone ();
        else
            return null;
    }

    public void setCsibDaStartValidity(Date csibDaStartValidity) {
        if (csibDaStartValidity != null)
            this.csibDaStartValidity = (Date) csibDaStartValidity.clone ();
        else
            this.csibDaStartValidity = csibDaStartValidity;
    }

    public BigDecimal getCsibIdCsellingItemBiAssoc() {
        return this.csibIdCsellingItemBiAssoc;
    }

    public void setCsibIdCsellingItemBiAssoc(BigDecimal csibIdCsellingItemBiAssoc) {
        this.csibIdCsellingItemBiAssoc = csibIdCsellingItemBiAssoc;
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

    public CordrCsellingItemBiType getCordrCsellingItemBiType() {
        return this.cordrCsellingItemBiType;
    }

    public void setCordrCsellingItemBiType(CordrCsellingItemBiType cordrCsellingItemBiType) {
        this.cordrCsellingItemBiType = cordrCsellingItemBiType;
    }

}
