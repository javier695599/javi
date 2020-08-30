package com.telefonica.cont.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * The persistent class for the CuinpCustomerQuoteItemS database table.
 */
@Entity
@NamedQuery(name = "CuinpCustomerQuoteItem.findAll", query = "SELECT c FROM CuinpCustomerQuoteItem c")
@Table(name = "CUINP_CUSTOMER_QUOTE_ITEM")
public class CuinpCustomerQuoteItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BIIT_ID_CUSTOMER_QUOTE_ITEM", nullable = false, precision = 38, unique = true)
    @Id
    private BigDecimal biitIdCustomerQuoteItem;

    @Column(name = "CHAT_ID_CHANNEL_TYPE", precision = 2)
    private Long chatIdChannelType;

    @Column(name = "GENA_ID_APPLICATION", precision = 4)
    private Long genaIdApplication;

    @Column(name = "PRCA_ID_PRODUCT_CATALOG", nullable = false, precision = 4)
    private Long prcaIdProductCatalog;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "PORT_ID_PORTABIL_PROCESS_TYPE")
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddPortabilProcessType corddPortabilProcessType;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "BIIT_ID_CUSTOMER_QUOTE_ITEM")
    private CordpCustomerSellingItem cordpCustomerSellingItem;
    @JoinColumn(name = "CQIS_ID_CQITEM_SOURCE_TYPE")
    @ManyToOne(fetch = FetchType.LAZY)
    private CuindCqitemSourceType cuindCqitemSourceType;
    @OneToMany(mappedBy = "cuinpCustomerQuoteItem")
    private List<CuinpCqitemPrice> cuinpCqitemPrices;
    @JoinColumn(name = "BUIN_ID_CUSTOMER_QUOTE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CuinpCustomerQuote cuinpCustomerQuote;
    @OneToMany(mappedBy = "cuinpCustomerQuoteItem")
    private List<CuinrCqitemCustomerBill> cuinrCqitemCustomerBills;
    @OneToOne(mappedBy = "cuinpCustomerQuoteItem")
    private CuinrCqitemRelaShopCartIt cuinrCqitemRelaShopCartIt;
    @OneToMany(mappedBy = "cuinpCustomerQuoteItem")
    private List<CuinrCqitemRelatedWork> cuinrCqitemRelatedWorks;
    @OneToMany(mappedBy = "cuinpCustomerQuoteItem")
    private List<CuinrCqitemRelProdPromoted> cuinrCqitemRelProdPromoteds;
    @OneToMany(mappedBy = "cuinpCustomerQuoteItem")
    private List<CuinrCquoteInvolvesPoterm> cuinrCquoteInvolvesPoterms;

    public Timestamp getAudiTiCreation() {
        if (this.audiTiCreation != null)
            return (Timestamp) this.audiTiCreation.clone();
        else
            return null;
    }

    public void setAudiTiCreation(Timestamp audiTiCreation) {
        if (audiTiCreation != null)
            this.audiTiCreation = (Timestamp) audiTiCreation.clone();
        else
            this.audiTiCreation = audiTiCreation;
    }

    public Timestamp getAudiTiUpdate() {
        if (this.audiTiUpdate != null)
            return (Timestamp) this.audiTiUpdate.clone();
        else
            return null;
    }

    public void setAudiTiUpdate(Timestamp audiTiUpdate) {
        if (audiTiUpdate != null)
            this.audiTiUpdate = (Timestamp) audiTiUpdate.clone();
        else
            this.audiTiUpdate = audiTiUpdate;
    }

    public BigDecimal getBiitIdCustomerQuoteItem() {
        return this.biitIdCustomerQuoteItem;
    }

    public void setBiitIdCustomerQuoteItem(BigDecimal biitIdCustomerQuoteItem) {
        this.biitIdCustomerQuoteItem = biitIdCustomerQuoteItem;
    }

    public Long getChatIdChannelType() {
        return this.chatIdChannelType;
    }

    public void setChatIdChannelType(Long chatIdChannelType) {
        this.chatIdChannelType = chatIdChannelType;
    }

    public Long getGenaIdApplication() {
        return this.genaIdApplication;
    }

    public void setGenaIdApplication(Long genaIdApplication) {
        this.genaIdApplication = genaIdApplication;
    }

    public Long getPrcaIdProductCatalog() {
        return this.prcaIdProductCatalog;
    }

    public void setPrcaIdProductCatalog(Long prcaIdProductCatalog) {
        this.prcaIdProductCatalog = prcaIdProductCatalog;
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

    public CorddPortabilProcessType getCorddPortabilProcessType() {
        return this.corddPortabilProcessType;
    }

    public void setCorddPortabilProcessType(CorddPortabilProcessType corddPortabilProcessType) {
        this.corddPortabilProcessType = corddPortabilProcessType;
    }

    public CordpCustomerSellingItem getCordpCustomerSellingItem() {
        return this.cordpCustomerSellingItem;
    }

    public void setCordpCustomerSellingItem(CordpCustomerSellingItem cordpCustomerSellingItem) {
        this.cordpCustomerSellingItem = cordpCustomerSellingItem;
    }

    public CuindCqitemSourceType getCuindCqitemSourceType() {
        return this.cuindCqitemSourceType;
    }

    public void setCuindCqitemSourceType(CuindCqitemSourceType cuindCqitemSourceType) {
        this.cuindCqitemSourceType = cuindCqitemSourceType;
    }

    public List<CuinpCqitemPrice> getCuinpCqitemPrices() {
        return this.cuinpCqitemPrices;
    }

    public void setCuinpCqitemPrices(List<CuinpCqitemPrice> cuinpCqitemPrices) {
        this.cuinpCqitemPrices = cuinpCqitemPrices;
    }

    public void addCuinpCqitemPrices(CuinpCqitemPrice cuinpCqitemPrice) {
        if (this.cuinpCqitemPrices == null)
            this.cuinpCqitemPrices = new ArrayList<CuinpCqitemPrice>();
        this.cuinpCqitemPrices.add(cuinpCqitemPrice);
    }

    public void removeCuinpCqitemPrices(CuinpCqitemPrice cuinpCqitemPriceToRemove) {
        if (cuinpCqitemPriceToRemove != null)
            this.cuinpCqitemPrices.remove(cuinpCqitemPriceToRemove);
    }

    public CuinpCustomerQuote getCuinpCustomerQuote() {
        return this.cuinpCustomerQuote;
    }

    public void setCuinpCustomerQuote(CuinpCustomerQuote cuinpCustomerQuote) {
        this.cuinpCustomerQuote = cuinpCustomerQuote;
    }

    public List<CuinrCqitemCustomerBill> getCuinrCqitemCustomerBills() {
        return this.cuinrCqitemCustomerBills;
    }

    public void setCuinrCqitemCustomerBills(List<CuinrCqitemCustomerBill> cuinrCqitemCustomerBills) {
        this.cuinrCqitemCustomerBills = cuinrCqitemCustomerBills;
    }

    public void addCuinrCqitemCustomerBills(CuinrCqitemCustomerBill cuinrCqitemCustomerBill) {
        if (this.cuinrCqitemCustomerBills == null)
            this.cuinrCqitemCustomerBills = new ArrayList<CuinrCqitemCustomerBill>();
        this.cuinrCqitemCustomerBills.add(cuinrCqitemCustomerBill);
    }

    public void removeCuinrCqitemCustomerBills(CuinrCqitemCustomerBill cuinrCqitemCustomerBillToRemove) {
        if (cuinrCqitemCustomerBillToRemove != null)
            this.cuinrCqitemCustomerBills.remove(cuinrCqitemCustomerBillToRemove);
    }

    public CuinrCqitemRelaShopCartIt getCuinrCqitemRelaShopCartIt() {
        return this.cuinrCqitemRelaShopCartIt;
    }

    public void setCuinrCqitemRelaShopCartIt(CuinrCqitemRelaShopCartIt cuinrCqitemRelaShopCartIt) {
        this.cuinrCqitemRelaShopCartIt = cuinrCqitemRelaShopCartIt;
    }

    public List<CuinrCqitemRelatedWork> getCuinrCqitemRelatedWorks() {
        return this.cuinrCqitemRelatedWorks;
    }

    public void setCuinrCqitemRelatedWorks(List<CuinrCqitemRelatedWork> cuinrCqitemRelatedWorks) {
        this.cuinrCqitemRelatedWorks = cuinrCqitemRelatedWorks;
    }

    public void addCuinrCqitemRelatedWorks(CuinrCqitemRelatedWork cuinrCqitemRelatedWork) {
        if (this.cuinrCqitemRelatedWorks == null)
            this.cuinrCqitemRelatedWorks = new ArrayList<CuinrCqitemRelatedWork>();
        this.cuinrCqitemRelatedWorks.add(cuinrCqitemRelatedWork);
    }

    public void removeCuinrCqitemRelatedWorks(CuinrCqitemRelatedWork cuinrCqitemRelatedWorkToRemove) {
        if (cuinrCqitemRelatedWorkToRemove != null)
            this.cuinrCqitemRelatedWorks.remove(cuinrCqitemRelatedWorkToRemove);
    }

    public List<CuinrCqitemRelProdPromoted> getCuinrCqitemRelProdPromoteds() {
        return this.cuinrCqitemRelProdPromoteds;
    }

    public void setCuinrCqitemRelProdPromoteds(List<CuinrCqitemRelProdPromoted> cuinrCqitemRelProdPromoteds) {
        this.cuinrCqitemRelProdPromoteds = cuinrCqitemRelProdPromoteds;
    }

    public void addCuinrCqitemRelProdPromoteds(CuinrCqitemRelProdPromoted cuinrCqitemRelProdPromoted) {
        if (this.cuinrCqitemRelProdPromoteds == null)
            this.cuinrCqitemRelProdPromoteds = new ArrayList<CuinrCqitemRelProdPromoted>();
        this.cuinrCqitemRelProdPromoteds.add(cuinrCqitemRelProdPromoted);
    }

    public void removeCuinrCqitemRelProdPromoteds(CuinrCqitemRelProdPromoted cuinrCqitemRelProdPromotedToRemove) {
        if (cuinrCqitemRelProdPromotedToRemove != null)
            this.cuinrCqitemRelProdPromoteds.remove(cuinrCqitemRelProdPromotedToRemove);
    }

    public List<CuinrCquoteInvolvesPoterm> getCuinrCquoteInvolvesPoterms() {
        return this.cuinrCquoteInvolvesPoterms;
    }

    public void setCuinrCquoteInvolvesPoterms(List<CuinrCquoteInvolvesPoterm> cuinrCquoteInvolvesPoterms) {
        this.cuinrCquoteInvolvesPoterms = cuinrCquoteInvolvesPoterms;
    }

    public void addCuinrCquoteInvolvesPoterms(CuinrCquoteInvolvesPoterm cuinrCquoteInvolvesPoterm) {
        if (this.cuinrCquoteInvolvesPoterms == null)
            this.cuinrCquoteInvolvesPoterms = new ArrayList<CuinrCquoteInvolvesPoterm>();
        this.cuinrCquoteInvolvesPoterms.add(cuinrCquoteInvolvesPoterm);
    }

    public void removeCuinrCquoteInvolvesPoterms(CuinrCquoteInvolvesPoterm cuinrCquoteInvolvesPotermToRemove) {
        if (cuinrCquoteInvolvesPotermToRemove != null)
            this.cuinrCquoteInvolvesPoterms.remove(cuinrCquoteInvolvesPotermToRemove);
    }

}
