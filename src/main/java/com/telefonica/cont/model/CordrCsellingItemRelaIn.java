package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the CordrCsellingItemRelaInS database table.
 */
@Entity
@NamedQuery(name = "CordrCsellingItemRelaIn.findAll", query = "SELECT c FROM CordrCsellingItemRelaIn c")
@Table(name = "CORDR_CSELLING_ITEM_RELA_IN", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BIIT_ID_CUSTOMER_SELLING_ITEM", "CSIT_ID_CSELLING_ITEM_TYPE", "BIIT_ID_CUSTOMER_SELLING_ITEMR",
        "CSIT_ID_CSELLING_ITEM_TYPE_RE", "CIRT_ID_CSITEM_RELA_TYPE"})})
public class CordrCsellingItemRelaIn implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "CSIR_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csirDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CSIR_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csirDaStartValidity;

    @Column(name = "CSIR_ID_CSELLING_ITEM_RELA_IN", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal csirIdCsellingItemRelaIn;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumns({
            @JoinColumn(referencedColumnName = "BIIT_ID_CUSTOMER_SELLING_ITEM", nullable = false, name = "BIIT_ID_CUSTOMER_SELLING_ITEMR"),
            @JoinColumn(referencedColumnName = "CSIT_ID_CSELLING_ITEM_TYPE", nullable = false, name = "CSIT_ID_CSELLING_ITEM_TYPE_RE")})
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpCustomerSellingItem cordpCustomerSellingItem1;
    @JoinColumns({
            @JoinColumn(referencedColumnName = "BIIT_ID_CUSTOMER_SELLING_ITEM", nullable = false, name = "BIIT_ID_CUSTOMER_SELLING_ITEM"),
            @JoinColumn(referencedColumnName = "CSIT_ID_CSELLING_ITEM_TYPE", nullable = false, name = "CSIT_ID_CSELLING_ITEM_TYPE")})
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpCustomerSellingItem cordpCustomerSellingItem2;
    @JoinColumns({
            @JoinColumn(referencedColumnName = "CIRT_ID_CSITEM_RELA_TYPE", nullable = false, name = "CIRT_ID_CSITEM_RELA_TYPE"),
            @JoinColumn(referencedColumnName = "CSIT_ID_CSELLING_ITEM_TYPE", nullable = false, name = "CSIT_ID_CSELLING_ITEM_TYPE", updatable = false, insertable = false),
            @JoinColumn(referencedColumnName = "CSIT_ID_CSELLING_ITEM_TYPE_RE", nullable = false, name = "CSIT_ID_CSELLING_ITEM_TYPE_RE", updatable = false, insertable = false)})
    @ManyToOne(fetch = FetchType.LAZY)
    private CordrCsitemRelaType cordrCsitemRelaType;

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

    public Date getCsirDaEndValidity() {
        if (this.csirDaEndValidity != null)
            return (Date) this.csirDaEndValidity.clone ();
        else
            return null;
    }

    public void setCsirDaEndValidity(Date csirDaEndValidity) {
        if (csirDaEndValidity != null)
            this.csirDaEndValidity = (Date) csirDaEndValidity.clone ();
        else
            this.csirDaEndValidity = csirDaEndValidity;
    }

    public Date getCsirDaStartValidity() {
        if (this.csirDaStartValidity != null)
            return (Date) this.csirDaStartValidity.clone ();
        else
            return null;
    }

    public void setCsirDaStartValidity(Date csirDaStartValidity) {
        if (csirDaStartValidity != null)
            this.csirDaStartValidity = (Date) csirDaStartValidity.clone ();
        else
            this.csirDaStartValidity = csirDaStartValidity;
    }

    public BigDecimal getCsirIdCsellingItemRelaIn() {
        return this.csirIdCsellingItemRelaIn;
    }

    public void setCsirIdCsellingItemRelaIn(BigDecimal csirIdCsellingItemRelaIn) {
        this.csirIdCsellingItemRelaIn = csirIdCsellingItemRelaIn;
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

    public CordpCustomerSellingItem getCordpCustomerSellingItem1() {
        return this.cordpCustomerSellingItem1;
    }

    public void setCordpCustomerSellingItem1(CordpCustomerSellingItem cordpCustomerSellingItem1) {
        this.cordpCustomerSellingItem1 = cordpCustomerSellingItem1;
    }

    public CordpCustomerSellingItem getCordpCustomerSellingItem2() {
        return this.cordpCustomerSellingItem2;
    }

    public void setCordpCustomerSellingItem2(CordpCustomerSellingItem cordpCustomerSellingItem2) {
        this.cordpCustomerSellingItem2 = cordpCustomerSellingItem2;
    }

    public CordrCsitemRelaType getCordrCsitemRelaType() {
        return this.cordrCsitemRelaType;
    }

    public void setCordrCsitemRelaType(CordrCsitemRelaType cordrCsitemRelaType) {
        this.cordrCsitemRelaType = cordrCsitemRelaType;
    }

}
