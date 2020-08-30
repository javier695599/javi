package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the CordsCustomerSellingItemS database table.
 */
@Entity
@NamedQuery(name = "CordsCustomerSellingItem.findAll", query = "SELECT c FROM CordsCustomerSellingItem c")
@Table(name = "CORDS_CUSTOMER_SELLING_ITEM", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"BIIT_ID_CUSTOMER_SELLING_ITEM", "CSIT_ID_CSELLING_ITEM_TYPE"})})
public class CordsCustomerSellingItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BIIT_ID_CUSTOMER_SELLING_ITEM", nullable = false, precision = 38)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal biitIdCustomerSellingItem;

    @Column(name = "BIIT_QU_CUST_SELL_ITEM", precision = 5)
    private Long biitQuCustSellItem;

    @Column(name = "BISI_ID_BI_SPEC_ITEM", precision = 8)
    private Long bisiIdBiSpecItem;

    @Column(columnDefinition = "DATE", name = "CSIM_DA_END_CSITEM")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csimDaEndCsitem;

    @Column(columnDefinition = "DATE", name = "CSIM_DA_START_CSITEM")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csimDaStartCsitem;

    @Column(name = "CSIT_ID_CSELLING_ITEM_TYPE", nullable = false, precision = 3)
    private Long csitIdCsellingItemType;

    @Column(name = "EXMO_ID_EXECUTION_MODE", precision = 3)
    private Long exmoIdExecutionMode;

    @Column(name = "PROD_ID_PRODUCT", precision = 38)
    private BigDecimal prodIdProduct;

    @Column(name = "UNME_ID_UNIT_MEASURE", precision = 3)
    private Long unmeIdUnitMeasure;

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

    public Long getBiitQuCustSellItem() {
        return this.biitQuCustSellItem;
    }

    public void setBiitQuCustSellItem(Long biitQuCustSellItem) {
        this.biitQuCustSellItem = biitQuCustSellItem;
    }

    public Long getBisiIdBiSpecItem() {
        return this.bisiIdBiSpecItem;
    }

    public void setBisiIdBiSpecItem(Long bisiIdBiSpecItem) {
        this.bisiIdBiSpecItem = bisiIdBiSpecItem;
    }

    public Date getCsimDaEndCsitem() {
        if (this.csimDaEndCsitem != null)
            return (Date) this.csimDaEndCsitem.clone ();
        else
            return null;
    }

    public void setCsimDaEndCsitem(Date csimDaEndCsitem) {
        if (csimDaEndCsitem != null)
            this.csimDaEndCsitem = (Date) csimDaEndCsitem.clone ();
        else
            this.csimDaEndCsitem = csimDaEndCsitem;
    }

    public Date getCsimDaStartCsitem() {
        if (this.csimDaStartCsitem != null)
            return (Date) this.csimDaStartCsitem.clone ();
        else
            return null;
    }

    public void setCsimDaStartCsitem(Date csimDaStartCsitem) {
        if (csimDaStartCsitem != null)
            this.csimDaStartCsitem = (Date) csimDaStartCsitem.clone ();
        else
            this.csimDaStartCsitem = csimDaStartCsitem;
    }

    public Long getCsitIdCsellingItemType() {
        return this.csitIdCsellingItemType;
    }

    public void setCsitIdCsellingItemType(Long csitIdCsellingItemType) {
        this.csitIdCsellingItemType = csitIdCsellingItemType;
    }

    public Long getExmoIdExecutionMode() {
        return this.exmoIdExecutionMode;
    }

    public void setExmoIdExecutionMode(Long exmoIdExecutionMode) {
        this.exmoIdExecutionMode = exmoIdExecutionMode;
    }

    public BigDecimal getProdIdProduct() {
        return this.prodIdProduct;
    }

    public void setProdIdProduct(BigDecimal prodIdProduct) {
        this.prodIdProduct = prodIdProduct;
    }

    public Long getUnmeIdUnitMeasure() {
        return this.unmeIdUnitMeasure;
    }

    public void setUnmeIdUnitMeasure(Long unmeIdUnitMeasure) {
        this.unmeIdUnitMeasure = unmeIdUnitMeasure;
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
