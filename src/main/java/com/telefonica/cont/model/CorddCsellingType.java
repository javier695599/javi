package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CorddCsellingTypeS database table.
 */
@Entity
@NamedQuery(name = "CorddCsellingType.findAll", query = "SELECT c FROM CorddCsellingType c")
@Table(name = "CORDD_CSELLING_TYPE")
public class CorddCsellingType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BINT_ID_CSELLING_TYPE", nullable = false, precision = 3, unique = true)
    @Id
    private Long bintIdCsellingType;

    @Column(name = "BSTY_ID_BI_SPEC_TYPE", precision = 2)
    private Long bstyIdBiSpecType;

    @Column(name = "CSTI_QU_CSINTE_VERSION", precision = 3)
    private Long cstiQuCsinteVersion;

    @Column(columnDefinition = "DATE", name = "CSTY_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date cstyDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CSTY_DA_START_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date cstyDaStartValidity;

    @Column(length = 400, name = "CTYL_DS_CSELLING_TYPE_LANG")
    private String ctylDsCsellingTypeLang;

    @Column(length = 50, name = "CTYL_NA_CSELLING_TYPE_LANG", nullable = false)
    private String ctylNaCsellingTypeLang;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "corddCsellingType")
    private List<CorddCsellingItemType> corddCsellingItemTypes;
    @OneToMany(mappedBy = "corddCsellingType")
    private List<CorddCsellingRoleType> corddCsellingRoleTypes;
    @JoinColumn(name = "BINT_ID_CSELLING_TYPE_RE")
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingType corddCsellingType;
    @OneToMany(mappedBy = "corddCsellingType")
    private List<CorddCsellingType> corddCsellingTypes;
    @OneToMany(mappedBy = "corddCsellingType")
    private List<CordpCustomerOrder> cordpCustomerOrders;
    @OneToMany(mappedBy = "corddCsellingType")
    private List<CordpCustomerSelling> cordpCustomerSellings;
    @OneToMany(mappedBy = "corddCsellingType")
    private List<CordrCsellingItemBiType> cordrCsellingItemBiTypes;
    @OneToMany(mappedBy = "corddCsellingType1")
    private List<CordrCsellingRelaType> cordrCsellingRelaTypes1;
    @OneToMany(mappedBy = "corddCsellingType2")
    private List<CordrCsellingRelaType> cordrCsellingRelaTypes2;
    @OneToMany(mappedBy = "corddCsellingType")
    private List<CordrCsellingStateRela> cordrCsellingStateRelas;
    @OneToMany(mappedBy = "corddCsellingType")
    private List<CordrCsellingTypeLang> cordrCsellingTypeLangs;
    @OneToMany(mappedBy = "corddCsellingType")
    private List<CordrCsellingVersionType> cordrCsellingVersionTypes;

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

    public Long getBintIdCsellingType() {
        return this.bintIdCsellingType;
    }

    public void setBintIdCsellingType(Long bintIdCsellingType) {
        this.bintIdCsellingType = bintIdCsellingType;
    }

    public Long getBstyIdBiSpecType() {
        return this.bstyIdBiSpecType;
    }

    public void setBstyIdBiSpecType(Long bstyIdBiSpecType) {
        this.bstyIdBiSpecType = bstyIdBiSpecType;
    }

    public Long getCstiQuCsinteVersion() {
        return this.cstiQuCsinteVersion;
    }

    public void setCstiQuCsinteVersion(Long cstiQuCsinteVersion) {
        this.cstiQuCsinteVersion = cstiQuCsinteVersion;
    }

    public Date getCstyDaEndValidity() {
        if (this.cstyDaEndValidity != null)
            return (Date) this.cstyDaEndValidity.clone ();
        else
            return null;
    }

    public void setCstyDaEndValidity(Date cstyDaEndValidity) {
        if (cstyDaEndValidity != null)
            this.cstyDaEndValidity = (Date) cstyDaEndValidity.clone ();
        else
            this.cstyDaEndValidity = cstyDaEndValidity;
    }

    public Date getCstyDaStartValidity() {
        if (this.cstyDaStartValidity != null)
            return (Date) this.cstyDaStartValidity.clone ();
        else
            return null;
    }

    public void setCstyDaStartValidity(Date cstyDaStartValidity) {
        if (cstyDaStartValidity != null)
            this.cstyDaStartValidity = (Date) cstyDaStartValidity.clone ();
        else
            this.cstyDaStartValidity = cstyDaStartValidity;
    }

    public String getCtylDsCsellingTypeLang() {
        return this.ctylDsCsellingTypeLang;
    }

    public void setCtylDsCsellingTypeLang(String ctylDsCsellingTypeLang) {
        this.ctylDsCsellingTypeLang = ctylDsCsellingTypeLang;
    }

    public String getCtylNaCsellingTypeLang() {
        return this.ctylNaCsellingTypeLang;
    }

    public void setCtylNaCsellingTypeLang(String ctylNaCsellingTypeLang) {
        this.ctylNaCsellingTypeLang = ctylNaCsellingTypeLang;
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

    public List<CorddCsellingItemType> getCorddCsellingItemTypes() {
        return this.corddCsellingItemTypes;
    }

    public void setCorddCsellingItemTypes(List<CorddCsellingItemType> corddCsellingItemTypes) {
        this.corddCsellingItemTypes = corddCsellingItemTypes;
    }

    public void addCorddCsellingItemTypes(CorddCsellingItemType corddCsellingItemType) {
        if (this.corddCsellingItemTypes == null)
            this.corddCsellingItemTypes = new ArrayList<CorddCsellingItemType> ();
        this.corddCsellingItemTypes.add ( corddCsellingItemType );
    }

    public void removeCorddCsellingItemTypes(CorddCsellingItemType corddCsellingItemTypeToRemove) {
        if (corddCsellingItemTypeToRemove != null)
            this.corddCsellingItemTypes.remove ( corddCsellingItemTypeToRemove );
    }

    public List<CorddCsellingRoleType> getCorddCsellingRoleTypes() {
        return this.corddCsellingRoleTypes;
    }

    public void setCorddCsellingRoleTypes(List<CorddCsellingRoleType> corddCsellingRoleTypes) {
        this.corddCsellingRoleTypes = corddCsellingRoleTypes;
    }

    public void addCorddCsellingRoleTypes(CorddCsellingRoleType corddCsellingRoleType) {
        if (this.corddCsellingRoleTypes == null)
            this.corddCsellingRoleTypes = new ArrayList<CorddCsellingRoleType> ();
        this.corddCsellingRoleTypes.add ( corddCsellingRoleType );
    }

    public void removeCorddCsellingRoleTypes(CorddCsellingRoleType corddCsellingRoleTypeToRemove) {
        if (corddCsellingRoleTypeToRemove != null)
            this.corddCsellingRoleTypes.remove ( corddCsellingRoleTypeToRemove );
    }

    public CorddCsellingType getCorddCsellingType() {
        return this.corddCsellingType;
    }

    public void setCorddCsellingType(CorddCsellingType corddCsellingType) {
        this.corddCsellingType = corddCsellingType;
    }

    public List<CorddCsellingType> getCorddCsellingTypes() {
        return this.corddCsellingTypes;
    }

    public void setCorddCsellingTypes(List<CorddCsellingType> corddCsellingTypes) {
        this.corddCsellingTypes = corddCsellingTypes;
    }

    public void addCorddCsellingTypes(CorddCsellingType corddCsellingType) {
        if (this.corddCsellingTypes == null)
            this.corddCsellingTypes = new ArrayList<CorddCsellingType> ();
        this.corddCsellingTypes.add ( corddCsellingType );
    }

    public void removeCorddCsellingTypes(CorddCsellingType corddCsellingTypeToRemove) {
        if (corddCsellingTypeToRemove != null)
            this.corddCsellingTypes.remove ( corddCsellingTypeToRemove );
    }

    public List<CordpCustomerOrder> getCordpCustomerOrders() {
        return this.cordpCustomerOrders;
    }

    public void setCordpCustomerOrders(List<CordpCustomerOrder> cordpCustomerOrders) {
        this.cordpCustomerOrders = cordpCustomerOrders;
    }

    public void addCordpCustomerOrders(CordpCustomerOrder cordpCustomerOrder) {
        if (this.cordpCustomerOrders == null)
            this.cordpCustomerOrders = new ArrayList<CordpCustomerOrder> ();
        this.cordpCustomerOrders.add ( cordpCustomerOrder );
    }

    public void removeCordpCustomerOrders(CordpCustomerOrder cordpCustomerOrderToRemove) {
        if (cordpCustomerOrderToRemove != null)
            this.cordpCustomerOrders.remove ( cordpCustomerOrderToRemove );
    }

    public List<CordpCustomerSelling> getCordpCustomerSellings() {
        return this.cordpCustomerSellings;
    }

    public void setCordpCustomerSellings(List<CordpCustomerSelling> cordpCustomerSellings) {
        this.cordpCustomerSellings = cordpCustomerSellings;
    }

    public void addCordpCustomerSellings(CordpCustomerSelling cordpCustomerSelling) {
        if (this.cordpCustomerSellings == null)
            this.cordpCustomerSellings = new ArrayList<CordpCustomerSelling> ();
        this.cordpCustomerSellings.add ( cordpCustomerSelling );
    }

    public void removeCordpCustomerSellings(CordpCustomerSelling cordpCustomerSellingToRemove) {
        if (cordpCustomerSellingToRemove != null)
            this.cordpCustomerSellings.remove ( cordpCustomerSellingToRemove );
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

    public List<CordrCsellingRelaType> getCordrCsellingRelaTypes1() {
        return this.cordrCsellingRelaTypes1;
    }

    public void setCordrCsellingRelaTypes1(List<CordrCsellingRelaType> cordrCsellingRelaTypes1) {
        this.cordrCsellingRelaTypes1 = cordrCsellingRelaTypes1;
    }

    public void addCordrCsellingRelaTypes1(CordrCsellingRelaType cordrCsellingRelaType) {
        if (this.cordrCsellingRelaTypes1 == null)
            this.cordrCsellingRelaTypes1 = new ArrayList<CordrCsellingRelaType> ();
        this.cordrCsellingRelaTypes1.add ( cordrCsellingRelaType );
    }

    public void removeCordrCsellingRelaTypes1(CordrCsellingRelaType cordrCsellingRelaTypeToRemove) {
        if (cordrCsellingRelaTypeToRemove != null)
            this.cordrCsellingRelaTypes1.remove ( cordrCsellingRelaTypeToRemove );
    }

    public List<CordrCsellingRelaType> getCordrCsellingRelaTypes2() {
        return this.cordrCsellingRelaTypes2;
    }

    public void setCordrCsellingRelaTypes2(List<CordrCsellingRelaType> cordrCsellingRelaTypes2) {
        this.cordrCsellingRelaTypes2 = cordrCsellingRelaTypes2;
    }

    public void addCordrCsellingRelaTypes2(CordrCsellingRelaType cordrCsellingRelaType) {
        if (this.cordrCsellingRelaTypes2 == null)
            this.cordrCsellingRelaTypes2 = new ArrayList<CordrCsellingRelaType> ();
        this.cordrCsellingRelaTypes2.add ( cordrCsellingRelaType );
    }

    public void removeCordrCsellingRelaTypes2(CordrCsellingRelaType cordrCsellingRelaTypeToRemove) {
        if (cordrCsellingRelaTypeToRemove != null)
            this.cordrCsellingRelaTypes2.remove ( cordrCsellingRelaTypeToRemove );
    }

    public List<CordrCsellingStateRela> getCordrCsellingStateRelas() {
        return this.cordrCsellingStateRelas;
    }

    public void setCordrCsellingStateRelas(List<CordrCsellingStateRela> cordrCsellingStateRelas) {
        this.cordrCsellingStateRelas = cordrCsellingStateRelas;
    }

    public void addCordrCsellingStateRelas(CordrCsellingStateRela cordrCsellingStateRela) {
        if (this.cordrCsellingStateRelas == null)
            this.cordrCsellingStateRelas = new ArrayList<CordrCsellingStateRela> ();
        this.cordrCsellingStateRelas.add ( cordrCsellingStateRela );
    }

    public void removeCordrCsellingStateRelas(CordrCsellingStateRela cordrCsellingStateRelaToRemove) {
        if (cordrCsellingStateRelaToRemove != null)
            this.cordrCsellingStateRelas.remove ( cordrCsellingStateRelaToRemove );
    }

    public List<CordrCsellingTypeLang> getCordrCsellingTypeLangs() {
        return this.cordrCsellingTypeLangs;
    }

    public void setCordrCsellingTypeLangs(List<CordrCsellingTypeLang> cordrCsellingTypeLangs) {
        this.cordrCsellingTypeLangs = cordrCsellingTypeLangs;
    }

    public void addCordrCsellingTypeLangs(CordrCsellingTypeLang cordrCsellingTypeLang) {
        if (this.cordrCsellingTypeLangs == null)
            this.cordrCsellingTypeLangs = new ArrayList<CordrCsellingTypeLang> ();
        this.cordrCsellingTypeLangs.add ( cordrCsellingTypeLang );
    }

    public void removeCordrCsellingTypeLangs(CordrCsellingTypeLang cordrCsellingTypeLangToRemove) {
        if (cordrCsellingTypeLangToRemove != null)
            this.cordrCsellingTypeLangs.remove ( cordrCsellingTypeLangToRemove );
    }

    public List<CordrCsellingVersionType> getCordrCsellingVersionTypes() {
        return this.cordrCsellingVersionTypes;
    }

    public void setCordrCsellingVersionTypes(List<CordrCsellingVersionType> cordrCsellingVersionTypes) {
        this.cordrCsellingVersionTypes = cordrCsellingVersionTypes;
    }

    public void addCordrCsellingVersionTypes(CordrCsellingVersionType cordrCsellingVersionType) {
        if (this.cordrCsellingVersionTypes == null)
            this.cordrCsellingVersionTypes = new ArrayList<CordrCsellingVersionType> ();
        this.cordrCsellingVersionTypes.add ( cordrCsellingVersionType );
    }

    public void removeCordrCsellingVersionTypes(CordrCsellingVersionType cordrCsellingVersionTypeToRemove) {
        if (cordrCsellingVersionTypeToRemove != null)
            this.cordrCsellingVersionTypes.remove ( cordrCsellingVersionTypeToRemove );
    }

}
