package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CordpCustomerOrderS database table.
 */
@Entity
@NamedQuery(name = "CordpCustomerOrder.findAll", query = "SELECT c FROM CordpCustomerOrder c")
@Table(name = "CORDP_CUSTOMER_ORDER", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"BUIN_ID_CUSTOMER_ORDER", "BINT_ID_CUST_ORDER_TYPE"})})
public class CordpCustomerOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BISP_ID_BUSINESS_INTE_SPEC_CAT", nullable = false, precision = 2)
    private Long bispIdBusinessInteSpecCat;

    @Column(name = "BUIN_ID_CUSTOMER_ORDER", nullable = false, precision = 38)
    @Id
    private BigDecimal buinIdCustomerOrder;

    @Column(name = "BUIN_TI_CUST_ORDER_CLOSE")
    private Timestamp buinTiCustOrderClose;

    @Column(columnDefinition = "DATE", name = "CORD_DA_CUST_ORDER_DUE")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date cordDaCustOrderDue;

    @Column(name = "CORD_NU_CUST_ORDER_PRIORITY", precision = 5)
    private Long cordNuCustOrderPriority;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "cordpCustomerOrder")
    private List<CevcpOrchestrationPlan> cevcpOrchestrationPlans;
    @OneToOne(mappedBy = "cordpCustomerOrder", fetch = FetchType.LAZY)
    private CordaLockingLog cordaLockingLog;
    @JoinColumn(name = "BINT_ID_CUST_ORDER_TYPE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingType corddCsellingType;
    @OneToMany(mappedBy = "cordpCustomerOrder")
    private List<CordpCustomerOrderItem> cordpCustomerOrderItems;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "BUIN_ID_CUSTOMER_ORDER")
    private CordpCustomerSelling cordpCustomerSelling;
    @OneToOne(mappedBy = "cordpCustomerOrder")
    private CordrCorderLegacyRestReq cordrCorderLegacyRestReq;
    @OneToMany(mappedBy = "cordpCustomerOrder")
    private List<CordrCorderLocation> cordrCorderLocations;

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

    public BigDecimal getBuinIdCustomerOrder() {
        return this.buinIdCustomerOrder;
    }

    public void setBuinIdCustomerOrder(BigDecimal buinIdCustomerOrder) {
        this.buinIdCustomerOrder = buinIdCustomerOrder;
    }

    public Timestamp getBuinTiCustOrderClose() {
        if (this.buinTiCustOrderClose != null)
            return (Timestamp) this.buinTiCustOrderClose.clone ();
        else
            return null;
    }

    public void setBuinTiCustOrderClose(Timestamp buinTiCustOrderClose) {
        if (buinTiCustOrderClose != null)
            this.buinTiCustOrderClose = (Timestamp) buinTiCustOrderClose.clone ();
        else
            this.buinTiCustOrderClose = buinTiCustOrderClose;
    }

    public Date getCordDaCustOrderDue() {
        if (this.cordDaCustOrderDue != null)
            return (Date) this.cordDaCustOrderDue.clone ();
        else
            return null;
    }

    public void setCordDaCustOrderDue(Date cordDaCustOrderDue) {
        if (cordDaCustOrderDue != null)
            this.cordDaCustOrderDue = (Date) cordDaCustOrderDue.clone ();
        else
            this.cordDaCustOrderDue = cordDaCustOrderDue;
    }

    public Long getCordNuCustOrderPriority() {
        return this.cordNuCustOrderPriority;
    }

    public void setCordNuCustOrderPriority(Long cordNuCustOrderPriority) {
        this.cordNuCustOrderPriority = cordNuCustOrderPriority;
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

    public List<CevcpOrchestrationPlan> getCevcpOrchestrationPlans() {
        return this.cevcpOrchestrationPlans;
    }

    public void setCevcpOrchestrationPlans(List<CevcpOrchestrationPlan> cevcpOrchestrationPlans) {
        this.cevcpOrchestrationPlans = cevcpOrchestrationPlans;
    }

    public void addCevcpOrchestrationPlans(CevcpOrchestrationPlan cevcpOrchestrationPlan) {
        if (this.cevcpOrchestrationPlans == null)
            this.cevcpOrchestrationPlans = new ArrayList<CevcpOrchestrationPlan> ();
        this.cevcpOrchestrationPlans.add ( cevcpOrchestrationPlan );
    }

    public void removeCevcpOrchestrationPlans(CevcpOrchestrationPlan cevcpOrchestrationPlanToRemove) {
        if (cevcpOrchestrationPlanToRemove != null)
            this.cevcpOrchestrationPlans.remove ( cevcpOrchestrationPlanToRemove );
    }

    public CordaLockingLog getCordaLockingLog() {
        return this.cordaLockingLog;
    }

    public void setCordaLockingLog(CordaLockingLog cordaLockingLog) {
        this.cordaLockingLog = cordaLockingLog;
    }

    public CorddCsellingType getCorddCsellingType() {
        return this.corddCsellingType;
    }

    public void setCorddCsellingType(CorddCsellingType corddCsellingType) {
        this.corddCsellingType = corddCsellingType;
    }

    public List<CordpCustomerOrderItem> getCordpCustomerOrderItems() {
        return this.cordpCustomerOrderItems;
    }

    public void setCordpCustomerOrderItems(List<CordpCustomerOrderItem> cordpCustomerOrderItems) {
        this.cordpCustomerOrderItems = cordpCustomerOrderItems;
    }

    public void addCordpCustomerOrderItems(CordpCustomerOrderItem cordpCustomerOrderItem) {
        if (this.cordpCustomerOrderItems == null)
            this.cordpCustomerOrderItems = new ArrayList<CordpCustomerOrderItem> ();
        this.cordpCustomerOrderItems.add ( cordpCustomerOrderItem );
    }

    public void removeCordpCustomerOrderItems(CordpCustomerOrderItem cordpCustomerOrderItemToRemove) {
        if (cordpCustomerOrderItemToRemove != null)
            this.cordpCustomerOrderItems.remove ( cordpCustomerOrderItemToRemove );
    }

    public CordpCustomerSelling getCordpCustomerSelling() {
        return this.cordpCustomerSelling;
    }

    public void setCordpCustomerSelling(CordpCustomerSelling cordpCustomerSelling) {
        this.cordpCustomerSelling = cordpCustomerSelling;
    }

    public CordrCorderLegacyRestReq getCordrCorderLegacyRestReq() {
        return this.cordrCorderLegacyRestReq;
    }

    public void setCordrCorderLegacyRestReq(CordrCorderLegacyRestReq cordrCorderLegacyRestReq) {
        this.cordrCorderLegacyRestReq = cordrCorderLegacyRestReq;
    }

    public List<CordrCorderLocation> getCordrCorderLocations() {
        return this.cordrCorderLocations;
    }

    public void setCordrCorderLocations(List<CordrCorderLocation> cordrCorderLocations) {
        this.cordrCorderLocations = cordrCorderLocations;
    }

    public void addCordrCorderLocations(CordrCorderLocation cordrCorderLocation) {
        if (this.cordrCorderLocations == null)
            this.cordrCorderLocations = new ArrayList<CordrCorderLocation> ();
        this.cordrCorderLocations.add ( cordrCorderLocation );
    }

    public void removeCordrCorderLocations(CordrCorderLocation cordrCorderLocationToRemove) {
        if (cordrCorderLocationToRemove != null)
            this.cordrCorderLocations.remove ( cordrCorderLocationToRemove );
    }

}
