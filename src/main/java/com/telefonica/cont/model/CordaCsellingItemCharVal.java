package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the CordaCsellingItemCharValS database table.
 */
@Entity
@NamedQuery(name = "CordaCsellingItemCharVal.findAll", query = "SELECT c FROM CordaCsellingItemCharVal c")
@Table(name = "CORDA_CSELLING_ITEM_CHAR_VAL")
public class CordaCsellingItemCharVal implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "CCHA_ID_CSELLING_CHARAC", precision = 5)
    private Long cchaIdCsellingCharac;

    @Column(name = "CCHV_ID_CSELLING_CHARAC_VALUE", precision = 6)
    private Long cchvIdCsellingCharacValue;

    @Column(columnDefinition = "DATE", name = "CSCV_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date cscvDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CSCV_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date cscvDaStartValidity;

    @Column(length = 100, name = "CSCV_DS_CSELLING_VALUE")
    private String cscvDsCsellingValue;

    @Column(name = "CSCV_ID_CSELLING_ITEM_CHAR_VAL", nullable = false, precision = 10, unique = true)
    @GeneratedValue(generator = "CORDA_CSELLING_ITEM_CHAR_VAL_CSCVIDCSELLINGITEMCHARVAL_GENERATOR")
    @Id
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "CORDA_CSELLING_ITEM_CHAR_VAL_CSCVIDCSELLINGITEMCHARVAL_GENERATOR", sequenceName = "CORDA_CSELLINGITEMCHARVAL_SEQ")
    private Long cscvIdCsellingItemCharVal;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumns({
            @JoinColumn(referencedColumnName = "BIIT_ID_CUSTOMER_SELLING_ITEM", nullable = false, name = "BIIT_ID_CUSTOMER_SELLING_ITEM"),
            @JoinColumn(referencedColumnName = "CSIT_ID_CSELLING_ITEM_TYPE", nullable = false, name = "CSIT_ID_CSELLING_ITEM_TYPE")})
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpCustomerSellingItem cordpCustomerSellingItem;

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

    public Long getCchaIdCsellingCharac() {
        return this.cchaIdCsellingCharac;
    }

    public void setCchaIdCsellingCharac(Long cchaIdCsellingCharac) {
        this.cchaIdCsellingCharac = cchaIdCsellingCharac;
    }

    public Long getCchvIdCsellingCharacValue() {
        return this.cchvIdCsellingCharacValue;
    }

    public void setCchvIdCsellingCharacValue(Long cchvIdCsellingCharacValue) {
        this.cchvIdCsellingCharacValue = cchvIdCsellingCharacValue;
    }

    public Date getCscvDaEndValidity() {
        if (this.cscvDaEndValidity != null)
            return (Date) this.cscvDaEndValidity.clone ();
        else
            return null;
    }

    public void setCscvDaEndValidity(Date cscvDaEndValidity) {
        if (cscvDaEndValidity != null)
            this.cscvDaEndValidity = (Date) cscvDaEndValidity.clone ();
        else
            this.cscvDaEndValidity = cscvDaEndValidity;
    }

    public Date getCscvDaStartValidity() {
        if (this.cscvDaStartValidity != null)
            return (Date) this.cscvDaStartValidity.clone ();
        else
            return null;
    }

    public void setCscvDaStartValidity(Date cscvDaStartValidity) {
        if (cscvDaStartValidity != null)
            this.cscvDaStartValidity = (Date) cscvDaStartValidity.clone ();
        else
            this.cscvDaStartValidity = cscvDaStartValidity;
    }

    public String getCscvDsCsellingValue() {
        return this.cscvDsCsellingValue;
    }

    public void setCscvDsCsellingValue(String cscvDsCsellingValue) {
        this.cscvDsCsellingValue = cscvDsCsellingValue;
    }

    public Long getCscvIdCsellingItemCharVal() {
        return this.cscvIdCsellingItemCharVal;
    }

    public void setCscvIdCsellingItemCharVal(Long cscvIdCsellingItemCharVal) {
        this.cscvIdCsellingItemCharVal = cscvIdCsellingItemCharVal;
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

}
