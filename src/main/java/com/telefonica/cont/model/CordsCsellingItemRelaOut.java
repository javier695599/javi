package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the CordsCsellingItemRelaOutS database table.
 */
@Entity
@NamedQuery(name = "CordsCsellingItemRelaOut.findAll", query = "SELECT c FROM CordsCsellingItemRelaOut c")
@Table(name = "CORDS_CSELLING_ITEM_RELA_OUT", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BIIT_ID_CUSTOMER_SELLING_ITEM", "CSIT_ID_CSELLING_ITEM_TYPE", "BIIT_ID_BUSI_INTERAC_ITEM",
        "BIIT_ID_BUSI_INTERAC_ITEM_TYPE", "CIRT_ID_CSITEM_RELA_TYPE"})})
public class CordsCsellingItemRelaOut implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BIIT_ID_BUSI_INTERAC_ITEM", nullable = false, precision = 38)
    private BigDecimal biitIdBusiInteracItem;

    @Column(name = "BIIT_ID_BUSI_INTERAC_ITEM_TYPE", nullable = false, precision = 3)
    private Long biitIdBusiInteracItemType;

    @Column(name = "BIIT_ID_CUSTOMER_SELLING_ITEM", nullable = false, precision = 38)
    private BigDecimal biitIdCustomerSellingItem;

    @Column(name = "CIRT_ID_CSITEM_RELA_TYPE", nullable = false, precision = 3)
    private Long cirtIdCsitemRelaType;

    @Column(name = "CSIT_ID_CSELLING_ITEM_TYPE", nullable = false, precision = 3)
    private Long csitIdCsellingItemType;

    @Column(columnDefinition = "DATE", name = "CSOU_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csouDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CSOU_DA_START_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csouDaStartValidity;

    @Column(name = "CSOU_ID_CSELLING_ITEM_RELA_OUT", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal csouIdCsellingItemRelaOut;

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

    public BigDecimal getBiitIdBusiInteracItem() {
        return this.biitIdBusiInteracItem;
    }

    public void setBiitIdBusiInteracItem(BigDecimal biitIdBusiInteracItem) {
        this.biitIdBusiInteracItem = biitIdBusiInteracItem;
    }

    public Long getBiitIdBusiInteracItemType() {
        return this.biitIdBusiInteracItemType;
    }

    public void setBiitIdBusiInteracItemType(Long biitIdBusiInteracItemType) {
        this.biitIdBusiInteracItemType = biitIdBusiInteracItemType;
    }

    public BigDecimal getBiitIdCustomerSellingItem() {
        return this.biitIdCustomerSellingItem;
    }

    public void setBiitIdCustomerSellingItem(BigDecimal biitIdCustomerSellingItem) {
        this.biitIdCustomerSellingItem = biitIdCustomerSellingItem;
    }

    public Long getCirtIdCsitemRelaType() {
        return this.cirtIdCsitemRelaType;
    }

    public void setCirtIdCsitemRelaType(Long cirtIdCsitemRelaType) {
        this.cirtIdCsitemRelaType = cirtIdCsitemRelaType;
    }

    public Long getCsitIdCsellingItemType() {
        return this.csitIdCsellingItemType;
    }

    public void setCsitIdCsellingItemType(Long csitIdCsellingItemType) {
        this.csitIdCsellingItemType = csitIdCsellingItemType;
    }

    public Date getCsouDaEndValidity() {
        if (this.csouDaEndValidity != null)
            return (Date) this.csouDaEndValidity.clone ();
        else
            return null;
    }

    public void setCsouDaEndValidity(Date csouDaEndValidity) {
        if (csouDaEndValidity != null)
            this.csouDaEndValidity = (Date) csouDaEndValidity.clone ();
        else
            this.csouDaEndValidity = csouDaEndValidity;
    }

    public Date getCsouDaStartValidity() {
        if (this.csouDaStartValidity != null)
            return (Date) this.csouDaStartValidity.clone ();
        else
            return null;
    }

    public void setCsouDaStartValidity(Date csouDaStartValidity) {
        if (csouDaStartValidity != null)
            this.csouDaStartValidity = (Date) csouDaStartValidity.clone ();
        else
            this.csouDaStartValidity = csouDaStartValidity;
    }

    public BigDecimal getCsouIdCsellingItemRelaOut() {
        return this.csouIdCsellingItemRelaOut;
    }

    public void setCsouIdCsellingItemRelaOut(BigDecimal csouIdCsellingItemRelaOut) {
        this.csouIdCsellingItemRelaOut = csouIdCsellingItemRelaOut;
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
