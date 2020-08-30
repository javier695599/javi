package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the CuinpCustomerQuoteS database table.
 */
@Entity
@NamedQuery(name = "CuinpCustomerQuote.findAll", query = "SELECT c FROM CuinpCustomerQuote c")
@Table(name = "CUINP_CUSTOMER_QUOTE")
public class CuinpCustomerQuote implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BISP_ID_BUSINESS_INTE_SPEC_CAT", nullable = false, precision = 2)
    private Long bispIdBusinessInteSpecCat;

    @Column(name = "BUIN_ID_CUSTOMER_QUOTE", nullable = false, precision = 38, unique = true)
    @Id
    private BigDecimal buinIdCustomerQuote;

    @Column(name = "CIMT_ID_CUST_INQUIRY_SUBTYPE", nullable = false, precision = 3)
    private Long cimtIdCustInquirySubtype;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "BUIN_ID_CUSTOMER_QUOTE")
    private CordpCustomerSelling cordpCustomerSelling;
    @OneToMany(mappedBy = "cuinpCustomerQuote")
    private List<CuinpCustomerQuoteItem> cuinpCustomerQuoteItems;

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

    public Long getBispIdBusinessInteSpecCat() {
        return this.bispIdBusinessInteSpecCat;
    }

    public void setBispIdBusinessInteSpecCat(Long bispIdBusinessInteSpecCat) {
        this.bispIdBusinessInteSpecCat = bispIdBusinessInteSpecCat;
    }

    public BigDecimal getBuinIdCustomerQuote() {
        return this.buinIdCustomerQuote;
    }

    public void setBuinIdCustomerQuote(BigDecimal buinIdCustomerQuote) {
        this.buinIdCustomerQuote = buinIdCustomerQuote;
    }

    public Long getCimtIdCustInquirySubtype() {
        return this.cimtIdCustInquirySubtype;
    }

    public void setCimtIdCustInquirySubtype(Long cimtIdCustInquirySubtype) {
        this.cimtIdCustInquirySubtype = cimtIdCustInquirySubtype;
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

    public List<CuinpCustomerQuoteItem> getCuinpCustomerQuoteItems() {
        return this.cuinpCustomerQuoteItems;
    }

    public void setCuinpCustomerQuoteItems(List<CuinpCustomerQuoteItem> cuinpCustomerQuoteItems) {
        this.cuinpCustomerQuoteItems = cuinpCustomerQuoteItems;
    }

    public void addCuinpCustomerQuoteItems(CuinpCustomerQuoteItem cuinpCustomerQuoteItem) {
        if (this.cuinpCustomerQuoteItems == null)
            this.cuinpCustomerQuoteItems = new ArrayList<CuinpCustomerQuoteItem> ();
        this.cuinpCustomerQuoteItems.add ( cuinpCustomerQuoteItem );
    }

    public void removeCuinpCustomerQuoteItems(CuinpCustomerQuoteItem cuinpCustomerQuoteItemToRemove) {
        if (cuinpCustomerQuoteItemToRemove != null)
            this.cuinpCustomerQuoteItems.remove ( cuinpCustomerQuoteItemToRemove );
    }

}
