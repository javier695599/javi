package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CorddCsellingItemTypeS database table.
 */
@Entity
@NamedQuery(name = "CorddCsellingItemType.findAll", query = "SELECT c FROM CorddCsellingItemType c")
@Table(name = "CORDD_CSELLING_ITEM_TYPE")
public class CorddCsellingItemType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(length = 400, name = "CIYL_DS_CSELLING_ITEM_TYPE_LAN", nullable = false)
    private String ciylDsCsellingItemTypeLan;

    @Column(length = 50, name = "CIYL_NA_CSELLING_ITEM_TYPE_LAN", nullable = false)
    private String ciylNaCsellingItemTypeLan;

    @Column(columnDefinition = "DATE", name = "CSIT_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csitDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CSIT_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csitDaStartValidity;

    @Column(name = "CSIT_ID_CSELLING_ITEM_TYPE", nullable = false, precision = 3, unique = true)
    @Id
    private Long csitIdCsellingItemType;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "BINT_ID_CSELLING_TYPE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingType corddCsellingType;
    @OneToMany(mappedBy = "corddCsellingItemType")
    private List<CordpCustomerSellingItem> cordpCustomerSellingItems;
    @OneToMany(mappedBy = "corddCsellingItemType")
    private List<CordrCsellingItemBiType> cordrCsellingItemBiTypes;
    @OneToMany(mappedBy = "corddCsellingItemType")
    private List<CordrCsellingItemTypeLan> cordrCsellingItemTypeLans;
    @OneToMany(mappedBy = "corddCsellingItemType")
    private List<CordrCsitemDateType> cordrCsitemDateTypes;
    @OneToMany(mappedBy = "corddCsellingItemType1")
    private List<CordrCsitemRelaType> cordrCsitemRelaTypes1;
    @OneToMany(mappedBy = "corddCsellingItemType2")
    private List<CordrCsitemRelaType> cordrCsitemRelaTypes2;
    @OneToMany(mappedBy = "corddCsellingItemType")
    private List<CordrCsitemTypeAssoc> cordrCsitemTypeAssocs;

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

    public String getCiylDsCsellingItemTypeLan() {
        return this.ciylDsCsellingItemTypeLan;
    }

    public void setCiylDsCsellingItemTypeLan(String ciylDsCsellingItemTypeLan) {
        this.ciylDsCsellingItemTypeLan = ciylDsCsellingItemTypeLan;
    }

    public String getCiylNaCsellingItemTypeLan() {
        return this.ciylNaCsellingItemTypeLan;
    }

    public void setCiylNaCsellingItemTypeLan(String ciylNaCsellingItemTypeLan) {
        this.ciylNaCsellingItemTypeLan = ciylNaCsellingItemTypeLan;
    }

    public Date getCsitDaEndValidity() {
        if (this.csitDaEndValidity != null)
            return (Date) this.csitDaEndValidity.clone ();
        else
            return null;
    }

    public void setCsitDaEndValidity(Date csitDaEndValidity) {
        if (csitDaEndValidity != null)
            this.csitDaEndValidity = (Date) csitDaEndValidity.clone ();
        else
            this.csitDaEndValidity = csitDaEndValidity;
    }

    public Date getCsitDaStartValidity() {
        if (this.csitDaStartValidity != null)
            return (Date) this.csitDaStartValidity.clone ();
        else
            return null;
    }

    public void setCsitDaStartValidity(Date csitDaStartValidity) {
        if (csitDaStartValidity != null)
            this.csitDaStartValidity = (Date) csitDaStartValidity.clone ();
        else
            this.csitDaStartValidity = csitDaStartValidity;
    }

    public Long getCsitIdCsellingItemType() {
        return this.csitIdCsellingItemType;
    }

    public void setCsitIdCsellingItemType(Long csitIdCsellingItemType) {
        this.csitIdCsellingItemType = csitIdCsellingItemType;
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

    public CorddCsellingType getCorddCsellingType() {
        return this.corddCsellingType;
    }

    public void setCorddCsellingType(CorddCsellingType corddCsellingType) {
        this.corddCsellingType = corddCsellingType;
    }

    public List<CordpCustomerSellingItem> getCordpCustomerSellingItems() {
        return this.cordpCustomerSellingItems;
    }

    public void setCordpCustomerSellingItems(List<CordpCustomerSellingItem> cordpCustomerSellingItems) {
        this.cordpCustomerSellingItems = cordpCustomerSellingItems;
    }

    public void addCordpCustomerSellingItems(CordpCustomerSellingItem cordpCustomerSellingItem) {
        if (this.cordpCustomerSellingItems == null)
            this.cordpCustomerSellingItems = new ArrayList<CordpCustomerSellingItem> ();
        this.cordpCustomerSellingItems.add ( cordpCustomerSellingItem );
    }

    public void removeCordpCustomerSellingItems(CordpCustomerSellingItem cordpCustomerSellingItemToRemove) {
        if (cordpCustomerSellingItemToRemove != null)
            this.cordpCustomerSellingItems.remove ( cordpCustomerSellingItemToRemove );
    }

    public List<CordrCsellingItemBiType> getCordrCsellingItemBiTypes() {
        return this.cordrCsellingItemBiTypes;
    }

    public void setCordrCsellingItemBiTypes(List<CordrCsellingItemBiType> cordrCsellingItemBiTypes) {
        this.cordrCsellingItemBiTypes = cordrCsellingItemBiTypes;
    }

    public void addCordrCsellingItemBiTypes(CordrCsellingItemBiType cordrCsellingItemBiType) {
        if (this.cordrCsellingItemBiTypes == null)
            this.cordrCsellingItemBiTypes = new ArrayList<CordrCsellingItemBiType> ();
        this.cordrCsellingItemBiTypes.add ( cordrCsellingItemBiType );
    }

    public void removeCordrCsellingItemBiTypes(CordrCsellingItemBiType cordrCsellingItemBiTypeToRemove) {
        if (cordrCsellingItemBiTypeToRemove != null)
            this.cordrCsellingItemBiTypes.remove ( cordrCsellingItemBiTypeToRemove );
    }

    public List<CordrCsellingItemTypeLan> getCordrCsellingItemTypeLans() {
        return this.cordrCsellingItemTypeLans;
    }

    public void setCordrCsellingItemTypeLans(List<CordrCsellingItemTypeLan> cordrCsellingItemTypeLans) {
        this.cordrCsellingItemTypeLans = cordrCsellingItemTypeLans;
    }

    public void addCordrCsellingItemTypeLans(CordrCsellingItemTypeLan cordrCsellingItemTypeLan) {
        if (this.cordrCsellingItemTypeLans == null)
            this.cordrCsellingItemTypeLans = new ArrayList<CordrCsellingItemTypeLan> ();
        this.cordrCsellingItemTypeLans.add ( cordrCsellingItemTypeLan );
    }

    public void removeCordrCsellingItemTypeLans(CordrCsellingItemTypeLan cordrCsellingItemTypeLanToRemove) {
        if (cordrCsellingItemTypeLanToRemove != null)
            this.cordrCsellingItemTypeLans.remove ( cordrCsellingItemTypeLanToRemove );
    }

    public List<CordrCsitemDateType> getCordrCsitemDateTypes() {
        return this.cordrCsitemDateTypes;
    }

    public void setCordrCsitemDateTypes(List<CordrCsitemDateType> cordrCsitemDateTypes) {
        this.cordrCsitemDateTypes = cordrCsitemDateTypes;
    }

    public void addCordrCsitemDateTypes(CordrCsitemDateType cordrCsitemDateType) {
        if (this.cordrCsitemDateTypes == null)
            this.cordrCsitemDateTypes = new ArrayList<CordrCsitemDateType> ();
        this.cordrCsitemDateTypes.add ( cordrCsitemDateType );
    }

    public void removeCordrCsitemDateTypes(CordrCsitemDateType cordrCsitemDateTypeToRemove) {
        if (cordrCsitemDateTypeToRemove != null)
            this.cordrCsitemDateTypes.remove ( cordrCsitemDateTypeToRemove );
    }

    public List<CordrCsitemRelaType> getCordrCsitemRelaTypes1() {
        return this.cordrCsitemRelaTypes1;
    }

    public void setCordrCsitemRelaTypes1(List<CordrCsitemRelaType> cordrCsitemRelaTypes1) {
        this.cordrCsitemRelaTypes1 = cordrCsitemRelaTypes1;
    }

    public void addCordrCsitemRelaTypes1(CordrCsitemRelaType cordrCsitemRelaType) {
        if (this.cordrCsitemRelaTypes1 == null)
            this.cordrCsitemRelaTypes1 = new ArrayList<CordrCsitemRelaType> ();
        this.cordrCsitemRelaTypes1.add ( cordrCsitemRelaType );
    }

    public void removeCordrCsitemRelaTypes1(CordrCsitemRelaType cordrCsitemRelaTypeToRemove) {
        if (cordrCsitemRelaTypeToRemove != null)
            this.cordrCsitemRelaTypes1.remove ( cordrCsitemRelaTypeToRemove );
    }

    public List<CordrCsitemRelaType> getCordrCsitemRelaTypes2() {
        return this.cordrCsitemRelaTypes2;
    }

    public void setCordrCsitemRelaTypes2(List<CordrCsitemRelaType> cordrCsitemRelaTypes2) {
        this.cordrCsitemRelaTypes2 = cordrCsitemRelaTypes2;
    }

    public void addCordrCsitemRelaTypes2(CordrCsitemRelaType cordrCsitemRelaType) {
        if (this.cordrCsitemRelaTypes2 == null)
            this.cordrCsitemRelaTypes2 = new ArrayList<CordrCsitemRelaType> ();
        this.cordrCsitemRelaTypes2.add ( cordrCsitemRelaType );
    }

    public void removeCordrCsitemRelaTypes2(CordrCsitemRelaType cordrCsitemRelaTypeToRemove) {
        if (cordrCsitemRelaTypeToRemove != null)
            this.cordrCsitemRelaTypes2.remove ( cordrCsitemRelaTypeToRemove );
    }

    public List<CordrCsitemTypeAssoc> getCordrCsitemTypeAssocs() {
        return this.cordrCsitemTypeAssocs;
    }

    public void setCordrCsitemTypeAssocs(List<CordrCsitemTypeAssoc> cordrCsitemTypeAssocs) {
        this.cordrCsitemTypeAssocs = cordrCsitemTypeAssocs;
    }

    public void addCordrCsitemTypeAssocs(CordrCsitemTypeAssoc cordrCsitemTypeAssoc) {
        if (this.cordrCsitemTypeAssocs == null)
            this.cordrCsitemTypeAssocs = new ArrayList<CordrCsitemTypeAssoc> ();
        this.cordrCsitemTypeAssocs.add ( cordrCsitemTypeAssoc );
    }

    public void removeCordrCsitemTypeAssocs(CordrCsitemTypeAssoc cordrCsitemTypeAssocToRemove) {
        if (cordrCsitemTypeAssocToRemove != null)
            this.cordrCsitemTypeAssocs.remove ( cordrCsitemTypeAssocToRemove );
    }

}
