package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the CordsCsellingItemRelaInS database table.
 */
@Entity
@NamedQuery(name = "CordsCsellingItemRelaIn.findAll", query = "SELECT c FROM CordsCsellingItemRelaIn c")
@Table(name = "CORDS_CSELLING_ITEM_RELA_IN", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BIIT_ID_CUSTOMER_SELLING_ITEM", "CSIT_ID_CSELLING_ITEM_TYPE", "BIIT_ID_CUSTOMER_SELLING_ITEMR",
        "CSIT_ID_CSELLING_ITEM_TYPE_RE", "CIRT_ID_CSITEM_RELA_TYPE"})})
public class CordsCsellingItemRelaIn implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BIIT_ID_CUSTOMER_SELLING_ITEM", nullable = false, precision = 38)
    private BigDecimal biitIdCustomerSellingItem;

    @Column(name = "BIIT_ID_CUSTOMER_SELLING_ITEMR", nullable = false, precision = 38)
    private BigDecimal biitIdCustomerSellingItemr;

    @Column(name = "CIRT_ID_CSITEM_RELA_TYPE", nullable = false, precision = 3)
    private Long cirtIdCsitemRelaType;

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

    @Column(name = "CSIT_ID_CSELLING_ITEM_TYPE", nullable = false, precision = 3)
    private Long csitIdCsellingItemType;

    @Column(name = "CSIT_ID_CSELLING_ITEM_TYPE_RE", nullable = false, precision = 3)
    private Long csitIdCsellingItemTypeRe;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

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

    public BigDecimal getBiitIdCustomerSellingItem() {
        return this.biitIdCustomerSellingItem;
    }

    public void setBiitIdCustomerSellingItem(BigDecimal biitIdCustomerSellingItem) {
        this.biitIdCustomerSellingItem = biitIdCustomerSellingItem;
    }

    public BigDecimal getBiitIdCustomerSellingItemr() {
        return this.biitIdCustomerSellingItemr;
    }

    public void setBiitIdCustomerSellingItemr(BigDecimal biitIdCustomerSellingItemr) {
        this.biitIdCustomerSellingItemr = biitIdCustomerSellingItemr;
    }

    public Long getCirtIdCsitemRelaType() {
        return this.cirtIdCsitemRelaType;
    }

    public void setCirtIdCsitemRelaType(Long cirtIdCsitemRelaType) {
        this.cirtIdCsitemRelaType = cirtIdCsitemRelaType;
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

    public Long getCsitIdCsellingItemType() {
        return this.csitIdCsellingItemType;
    }

    public void setCsitIdCsellingItemType(Long csitIdCsellingItemType) {
        this.csitIdCsellingItemType = csitIdCsellingItemType;
    }

    public Long getCsitIdCsellingItemTypeRe() {
        return this.csitIdCsellingItemTypeRe;
    }

    public void setCsitIdCsellingItemTypeRe(Long csitIdCsellingItemTypeRe) {
        this.csitIdCsellingItemTypeRe = csitIdCsellingItemTypeRe;
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

}
