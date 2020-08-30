package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CordpCustomerSellingItemS database table.
 */
@Entity
@NamedQuery(name = "CordpCustomerSellingItem.findAll", query = "SELECT c FROM CordpCustomerSellingItem c")
@Table(name = "CORDP_CUSTOMER_SELLING_ITEM", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BIIT_ID_CUSTOMER_SELLING_ITEM", "CSIT_ID_CSELLING_ITEM_TYPE"})})
public class CordpCustomerSellingItem implements Serializable {
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

    @Column(name = "PROD_ID_PRODUCT", precision = 38)
    private BigDecimal prodIdProduct;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToOne(mappedBy = "cordpCustomerSellingItem")
    private AgrepCustomerAgreementIt agrepCustomerAgreementIt;
    @OneToMany(mappedBy = "cordpCustomerSellingItem")
    private List<CordaCsellingItemCharVal> cordaCsellingItemCharVals;
    @OneToMany(mappedBy = "cordpCustomerSellingItem")
    private List<CordaCsitemStateMove> cordaCsitemStateMoves;
    @OneToMany(mappedBy = "cordpCustomerSellingItem")
    private List<CordaCsitemSubstatMove> cordaCsitemSubstatMoves;
    @JoinColumn(name = "CSIT_ID_CSELLING_ITEM_TYPE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingItemType corddCsellingItemType;
    @JoinColumn(name = "EXMO_ID_EXECUTION_MODE")
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddExecutionMode corddExecutionMode;
    @JoinColumn(name = "UNME_ID_UNIT_MEASURE")
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddUnitMeasure corddUnitMeasure;
    @OneToOne(mappedBy = "cordpCustomerSellingItem")
    private CordpCustomerOrderItem cordpCustomerOrderItem;
    @OneToMany(mappedBy = "cordpCustomerSellingItem")
    private List<CordrCsellingItemBiAssoc> cordrCsellingItemBiAssocs;
    @OneToMany(mappedBy = "cordpCustomerSellingItem")
    private List<CordrCsellingItemIncident> cordrCsellingItemIncidents;
    @OneToMany(mappedBy = "cordpCustomerSellingItem1")
    private List<CordrCsellingItemRelaIn> cordrCsellingItemRelaIns1;
    @OneToMany(mappedBy = "cordpCustomerSellingItem2")
    private List<CordrCsellingItemRelaIn> cordrCsellingItemRelaIns2;
    @OneToMany(mappedBy = "cordpCustomerSellingItem")
    private List<CordrCsellingItemRelaOut> cordrCsellingItemRelaOuts;
    @OneToMany(mappedBy = "cordpCustomerSellingItem")
    private List<CordrCsellingItemSchedule> cordrCsellingItemSchedules;
    @OneToMany(mappedBy = "cordpCustomerSellingItem")
    private List<CordrCsellingRoleAssoc> cordrCsellingRoleAssocs;
    @OneToOne(mappedBy = "cordpCustomerSellingItem")
    private CuinpCustomerQuoteItem cuinpCustomerQuoteItem;

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

    public BigDecimal getProdIdProduct() {
        return this.prodIdProduct;
    }

    public void setProdIdProduct(BigDecimal prodIdProduct) {
        this.prodIdProduct = prodIdProduct;
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

    public AgrepCustomerAgreementIt getAgrepCustomerAgreementIt() {
        return this.agrepCustomerAgreementIt;
    }

    public void setAgrepCustomerAgreementIt(AgrepCustomerAgreementIt agrepCustomerAgreementIt) {
        this.agrepCustomerAgreementIt = agrepCustomerAgreementIt;
    }

    public List<CordaCsellingItemCharVal> getCordaCsellingItemCharVals() {
        return this.cordaCsellingItemCharVals;
    }

    public void setCordaCsellingItemCharVals(List<CordaCsellingItemCharVal> cordaCsellingItemCharVals) {
        this.cordaCsellingItemCharVals = cordaCsellingItemCharVals;
    }

    public void addCordaCsellingItemCharVals(CordaCsellingItemCharVal cordaCsellingItemCharVal) {
        if (this.cordaCsellingItemCharVals == null)
            this.cordaCsellingItemCharVals = new ArrayList<CordaCsellingItemCharVal> ();
        this.cordaCsellingItemCharVals.add ( cordaCsellingItemCharVal );
    }

    public void removeCordaCsellingItemCharVals(CordaCsellingItemCharVal cordaCsellingItemCharValToRemove) {
        if (cordaCsellingItemCharValToRemove != null)
            this.cordaCsellingItemCharVals.remove ( cordaCsellingItemCharValToRemove );
    }

    public List<CordaCsitemStateMove> getCordaCsitemStateMoves() {
        return this.cordaCsitemStateMoves;
    }

    public void setCordaCsitemStateMoves(List<CordaCsitemStateMove> cordaCsitemStateMoves) {
        this.cordaCsitemStateMoves = cordaCsitemStateMoves;
    }

    public void addCordaCsitemStateMoves(CordaCsitemStateMove cordaCsitemStateMove) {
        if (this.cordaCsitemStateMoves == null)
            this.cordaCsitemStateMoves = new ArrayList<CordaCsitemStateMove> ();
        this.cordaCsitemStateMoves.add ( cordaCsitemStateMove );
    }

    public void removeCordaCsitemStateMoves(CordaCsitemStateMove cordaCsitemStateMoveToRemove) {
        if (cordaCsitemStateMoveToRemove != null)
            this.cordaCsitemStateMoves.remove ( cordaCsitemStateMoveToRemove );
    }

    public List<CordaCsitemSubstatMove> getCordaCsitemSubstatMoves() {
        return this.cordaCsitemSubstatMoves;
    }

    public void setCordaCsitemSubstatMoves(List<CordaCsitemSubstatMove> cordaCsitemSubstatMoves) {
        this.cordaCsitemSubstatMoves = cordaCsitemSubstatMoves;
    }

    public void addCordaCsitemSubstatMoves(CordaCsitemSubstatMove cordaCsitemSubstatMove) {
        if (this.cordaCsitemSubstatMoves == null)
            this.cordaCsitemSubstatMoves = new ArrayList<CordaCsitemSubstatMove> ();
        this.cordaCsitemSubstatMoves.add ( cordaCsitemSubstatMove );
    }

    public void removeCordaCsitemSubstatMoves(CordaCsitemSubstatMove cordaCsitemSubstatMoveToRemove) {
        if (cordaCsitemSubstatMoveToRemove != null)
            this.cordaCsitemSubstatMoves.remove ( cordaCsitemSubstatMoveToRemove );
    }

    public CorddCsellingItemType getCorddCsellingItemType() {
        return this.corddCsellingItemType;
    }

    public void setCorddCsellingItemType(CorddCsellingItemType corddCsellingItemType) {
        this.corddCsellingItemType = corddCsellingItemType;
    }

    public CorddExecutionMode getCorddExecutionMode() {
        return this.corddExecutionMode;
    }

    public void setCorddExecutionMode(CorddExecutionMode corddExecutionMode) {
        this.corddExecutionMode = corddExecutionMode;
    }

    public CorddUnitMeasure getCorddUnitMeasure() {
        return this.corddUnitMeasure;
    }

    public void setCorddUnitMeasure(CorddUnitMeasure corddUnitMeasure) {
        this.corddUnitMeasure = corddUnitMeasure;
    }

    public CordpCustomerOrderItem getCordpCustomerOrderItem() {
        return this.cordpCustomerOrderItem;
    }

    public void setCordpCustomerOrderItem(CordpCustomerOrderItem cordpCustomerOrderItem) {
        this.cordpCustomerOrderItem = cordpCustomerOrderItem;
    }

    public List<CordrCsellingItemBiAssoc> getCordrCsellingItemBiAssocs() {
        return this.cordrCsellingItemBiAssocs;
    }

    public void setCordrCsellingItemBiAssocs(List<CordrCsellingItemBiAssoc> cordrCsellingItemBiAssocs) {
        this.cordrCsellingItemBiAssocs = cordrCsellingItemBiAssocs;
    }

    public void addCordrCsellingItemBiAssocs(CordrCsellingItemBiAssoc cordrCsellingItemBiAssoc) {
        if (this.cordrCsellingItemBiAssocs == null)
            this.cordrCsellingItemBiAssocs = new ArrayList<CordrCsellingItemBiAssoc> ();
        this.cordrCsellingItemBiAssocs.add ( cordrCsellingItemBiAssoc );
    }

    public void removeCordrCsellingItemBiAssocs(CordrCsellingItemBiAssoc cordrCsellingItemBiAssocToRemove) {
        if (cordrCsellingItemBiAssocToRemove != null)
            this.cordrCsellingItemBiAssocs.remove ( cordrCsellingItemBiAssocToRemove );
    }

    public List<CordrCsellingItemIncident> getCordrCsellingItemIncidents() {
        return this.cordrCsellingItemIncidents;
    }

    public void setCordrCsellingItemIncidents(List<CordrCsellingItemIncident> cordrCsellingItemIncidents) {
        this.cordrCsellingItemIncidents = cordrCsellingItemIncidents;
    }

    public void addCordrCsellingItemIncidents(CordrCsellingItemIncident cordrCsellingItemIncident) {
        if (this.cordrCsellingItemIncidents == null)
            this.cordrCsellingItemIncidents = new ArrayList<CordrCsellingItemIncident> ();
        this.cordrCsellingItemIncidents.add ( cordrCsellingItemIncident );
    }

    public void removeCordrCsellingItemIncidents(CordrCsellingItemIncident cordrCsellingItemIncidentToRemove) {
        if (cordrCsellingItemIncidentToRemove != null)
            this.cordrCsellingItemIncidents.remove ( cordrCsellingItemIncidentToRemove );
    }

    public List<CordrCsellingItemRelaIn> getCordrCsellingItemRelaIns1() {
        return this.cordrCsellingItemRelaIns1;
    }

    public void setCordrCsellingItemRelaIns1(List<CordrCsellingItemRelaIn> cordrCsellingItemRelaIns1) {
        this.cordrCsellingItemRelaIns1 = cordrCsellingItemRelaIns1;
    }

    public void addCordrCsellingItemRelaIns1(CordrCsellingItemRelaIn cordrCsellingItemRelaIn) {
        if (this.cordrCsellingItemRelaIns1 == null)
            this.cordrCsellingItemRelaIns1 = new ArrayList<CordrCsellingItemRelaIn> ();
        this.cordrCsellingItemRelaIns1.add ( cordrCsellingItemRelaIn );
    }

    public void removeCordrCsellingItemRelaIns1(CordrCsellingItemRelaIn cordrCsellingItemRelaInToRemove) {
        if (cordrCsellingItemRelaInToRemove != null)
            this.cordrCsellingItemRelaIns1.remove ( cordrCsellingItemRelaInToRemove );
    }

    public List<CordrCsellingItemRelaIn> getCordrCsellingItemRelaIns2() {
        return this.cordrCsellingItemRelaIns2;
    }

    public void setCordrCsellingItemRelaIns2(List<CordrCsellingItemRelaIn> cordrCsellingItemRelaIns2) {
        this.cordrCsellingItemRelaIns2 = cordrCsellingItemRelaIns2;
    }

    public void addCordrCsellingItemRelaIns2(CordrCsellingItemRelaIn cordrCsellingItemRelaIn) {
        if (this.cordrCsellingItemRelaIns2 == null)
            this.cordrCsellingItemRelaIns2 = new ArrayList<CordrCsellingItemRelaIn> ();
        this.cordrCsellingItemRelaIns2.add ( cordrCsellingItemRelaIn );
    }

    public void removeCordrCsellingItemRelaIns2(CordrCsellingItemRelaIn cordrCsellingItemRelaInToRemove) {
        if (cordrCsellingItemRelaInToRemove != null)
            this.cordrCsellingItemRelaIns2.remove ( cordrCsellingItemRelaInToRemove );
    }

    public List<CordrCsellingItemRelaOut> getCordrCsellingItemRelaOuts() {
        return this.cordrCsellingItemRelaOuts;
    }

    public void setCordrCsellingItemRelaOuts(List<CordrCsellingItemRelaOut> cordrCsellingItemRelaOuts) {
        this.cordrCsellingItemRelaOuts = cordrCsellingItemRelaOuts;
    }

    public void addCordrCsellingItemRelaOuts(CordrCsellingItemRelaOut cordrCsellingItemRelaOut) {
        if (this.cordrCsellingItemRelaOuts == null)
            this.cordrCsellingItemRelaOuts = new ArrayList<CordrCsellingItemRelaOut> ();
        this.cordrCsellingItemRelaOuts.add ( cordrCsellingItemRelaOut );
    }

    public void removeCordrCsellingItemRelaOuts(CordrCsellingItemRelaOut cordrCsellingItemRelaOutToRemove) {
        if (cordrCsellingItemRelaOutToRemove != null)
            this.cordrCsellingItemRelaOuts.remove ( cordrCsellingItemRelaOutToRemove );
    }

    public List<CordrCsellingItemSchedule> getCordrCsellingItemSchedules() {
        return this.cordrCsellingItemSchedules;
    }

    public void setCordrCsellingItemSchedules(List<CordrCsellingItemSchedule> cordrCsellingItemSchedules) {
        this.cordrCsellingItemSchedules = cordrCsellingItemSchedules;
    }

    public void addCordrCsellingItemSchedules(CordrCsellingItemSchedule cordrCsellingItemSchedule) {
        if (this.cordrCsellingItemSchedules == null)
            this.cordrCsellingItemSchedules = new ArrayList<CordrCsellingItemSchedule> ();
        this.cordrCsellingItemSchedules.add ( cordrCsellingItemSchedule );
    }

    public void removeCordrCsellingItemSchedules(CordrCsellingItemSchedule cordrCsellingItemScheduleToRemove) {
        if (cordrCsellingItemScheduleToRemove != null)
            this.cordrCsellingItemSchedules.remove ( cordrCsellingItemScheduleToRemove );
    }

    public List<CordrCsellingRoleAssoc> getCordrCsellingRoleAssocs() {
        return this.cordrCsellingRoleAssocs;
    }

    public void setCordrCsellingRoleAssocs(List<CordrCsellingRoleAssoc> cordrCsellingRoleAssocs) {
        this.cordrCsellingRoleAssocs = cordrCsellingRoleAssocs;
    }

    public void addCordrCsellingRoleAssocs(CordrCsellingRoleAssoc cordrCsellingRoleAssoc) {
        if (this.cordrCsellingRoleAssocs == null)
            this.cordrCsellingRoleAssocs = new ArrayList<CordrCsellingRoleAssoc> ();
        this.cordrCsellingRoleAssocs.add ( cordrCsellingRoleAssoc );
    }

    public void removeCordrCsellingRoleAssocs(CordrCsellingRoleAssoc cordrCsellingRoleAssocToRemove) {
        if (cordrCsellingRoleAssocToRemove != null)
            this.cordrCsellingRoleAssocs.remove ( cordrCsellingRoleAssocToRemove );
    }

    public CuinpCustomerQuoteItem getCuinpCustomerQuoteItem() {
        return this.cuinpCustomerQuoteItem;
    }

    public void setCuinpCustomerQuoteItem(CuinpCustomerQuoteItem cuinpCustomerQuoteItem) {
        this.cuinpCustomerQuoteItem = cuinpCustomerQuoteItem;
    }

}
