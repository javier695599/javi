package com.telefonica.cont.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the CorddUnitMeasureS database table.
 */
@Entity
@NamedQuery(name = "CorddUnitMeasure.findAll", query = "SELECT c FROM CorddUnitMeasure c")
@Table(name = "CORDD_UNIT_MEASURE")
public class CorddUnitMeasure implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "UNME_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date unmeDaEndValidity;

    @Column(columnDefinition = "DATE", name = "UNME_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date unmeDaStartValidity;

    @Column(name = "UNME_ID_UNIT_MEASURE", nullable = false, precision = 3, unique = true)
    @Id
    private Long unmeIdUnitMeasure;

    @Column(length = 40, name = "UNME_NA_UNIT_MEASURE")
    private String unmeNaUnitMeasure;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "corddUnitMeasure")
    private List<CordpCustomerSellingItem> cordpCustomerSellingItems;
    @OneToMany(mappedBy = "corddUnitMeasure1")
    private List<CuinpCqitemPriceAlteration> cuinpCqitemPriceAlterations1;
    @OneToMany(mappedBy = "corddUnitMeasure2")
    private List<CuinpCqitemPriceAlteration> cuinpCqitemPriceAlterations2;
    @OneToMany(mappedBy = "corddUnitMeasure1")
    private List<CuinpCqitemPrice> cuinpCqitemPrices1;
    @OneToMany(mappedBy = "corddUnitMeasure2")
    private List<CuinpCqitemPrice> cuinpCqitemPrices2;

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

    public Date getUnmeDaEndValidity() {
        if (this.unmeDaEndValidity != null)
            return (Date) this.unmeDaEndValidity.clone();
        else
            return null;
    }

    public void setUnmeDaEndValidity(Date unmeDaEndValidity) {
        if (unmeDaEndValidity != null)
            this.unmeDaEndValidity = (Date) unmeDaEndValidity.clone();
        else
            this.unmeDaEndValidity = unmeDaEndValidity;
    }

    public Date getUnmeDaStartValidity() {
        if (this.unmeDaStartValidity != null)
            return (Date) this.unmeDaStartValidity.clone();
        else
            return null;
    }

    public void setUnmeDaStartValidity(Date unmeDaStartValidity) {
        if (unmeDaStartValidity != null)
            this.unmeDaStartValidity = (Date) unmeDaStartValidity.clone();
        else
            this.unmeDaStartValidity = unmeDaStartValidity;
    }

    public Long getUnmeIdUnitMeasure() {
        return this.unmeIdUnitMeasure;
    }

    public void setUnmeIdUnitMeasure(Long unmeIdUnitMeasure) {
        this.unmeIdUnitMeasure = unmeIdUnitMeasure;
    }

    public String getUnmeNaUnitMeasure() {
        return this.unmeNaUnitMeasure;
    }

    public void setUnmeNaUnitMeasure(String unmeNaUnitMeasure) {
        this.unmeNaUnitMeasure = unmeNaUnitMeasure;
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

    public List<CordpCustomerSellingItem> getCordpCustomerSellingItems() {
        return this.cordpCustomerSellingItems;
    }

    public void setCordpCustomerSellingItems(List<CordpCustomerSellingItem> cordpCustomerSellingItems) {
        this.cordpCustomerSellingItems = cordpCustomerSellingItems;
    }

    public void addCordpCustomerSellingItems(CordpCustomerSellingItem cordpCustomerSellingItem) {
        if (this.cordpCustomerSellingItems == null)
            this.cordpCustomerSellingItems = new ArrayList<CordpCustomerSellingItem>();
        this.cordpCustomerSellingItems.add(cordpCustomerSellingItem);
    }

    public void removeCordpCustomerSellingItems(CordpCustomerSellingItem cordpCustomerSellingItemToRemove) {
        if (cordpCustomerSellingItemToRemove != null)
            this.cordpCustomerSellingItems.remove(cordpCustomerSellingItemToRemove);
    }

    public List<CuinpCqitemPriceAlteration> getCuinpCqitemPriceAlterations1() {
        return this.cuinpCqitemPriceAlterations1;
    }

    public void setCuinpCqitemPriceAlterations1(List<CuinpCqitemPriceAlteration> cuinpCqitemPriceAlterations1) {
        this.cuinpCqitemPriceAlterations1 = cuinpCqitemPriceAlterations1;
    }

    public void addCuinpCqitemPriceAlterations1(CuinpCqitemPriceAlteration cuinpCqitemPriceAlteration) {
        if (this.cuinpCqitemPriceAlterations1 == null)
            this.cuinpCqitemPriceAlterations1 = new ArrayList<CuinpCqitemPriceAlteration>();
        this.cuinpCqitemPriceAlterations1.add(cuinpCqitemPriceAlteration);
    }

    public void removeCuinpCqitemPriceAlterations1(CuinpCqitemPriceAlteration cuinpCqitemPriceAlterationToRemove) {
        if (cuinpCqitemPriceAlterationToRemove != null)
            this.cuinpCqitemPriceAlterations1.remove(cuinpCqitemPriceAlterationToRemove);
    }

    public List<CuinpCqitemPriceAlteration> getCuinpCqitemPriceAlterations2() {
        return this.cuinpCqitemPriceAlterations2;
    }

    public void setCuinpCqitemPriceAlterations2(List<CuinpCqitemPriceAlteration> cuinpCqitemPriceAlterations2) {
        this.cuinpCqitemPriceAlterations2 = cuinpCqitemPriceAlterations2;
    }

    public void addCuinpCqitemPriceAlterations2(CuinpCqitemPriceAlteration cuinpCqitemPriceAlteration) {
        if (this.cuinpCqitemPriceAlterations2 == null)
            this.cuinpCqitemPriceAlterations2 = new ArrayList<CuinpCqitemPriceAlteration>();
        this.cuinpCqitemPriceAlterations2.add(cuinpCqitemPriceAlteration);
    }

    public void removeCuinpCqitemPriceAlterations2(CuinpCqitemPriceAlteration cuinpCqitemPriceAlterationToRemove) {
        if (cuinpCqitemPriceAlterationToRemove != null)
            this.cuinpCqitemPriceAlterations2.remove(cuinpCqitemPriceAlterationToRemove);
    }

    public List<CuinpCqitemPrice> getCuinpCqitemPrices1() {
        return this.cuinpCqitemPrices1;
    }

    public void setCuinpCqitemPrices1(List<CuinpCqitemPrice> cuinpCqitemPrices1) {
        this.cuinpCqitemPrices1 = cuinpCqitemPrices1;
    }

    public void addCuinpCqitemPrices1(CuinpCqitemPrice cuinpCqitemPrice) {
        if (this.cuinpCqitemPrices1 == null)
            this.cuinpCqitemPrices1 = new ArrayList<CuinpCqitemPrice>();
        this.cuinpCqitemPrices1.add(cuinpCqitemPrice);
    }

    public void removeCuinpCqitemPrices1(CuinpCqitemPrice cuinpCqitemPriceToRemove) {
        if (cuinpCqitemPriceToRemove != null)
            this.cuinpCqitemPrices1.remove(cuinpCqitemPriceToRemove);
    }

    public List<CuinpCqitemPrice> getCuinpCqitemPrices2() {
        return this.cuinpCqitemPrices2;
    }

    public void setCuinpCqitemPrices2(List<CuinpCqitemPrice> cuinpCqitemPrices2) {
        this.cuinpCqitemPrices2 = cuinpCqitemPrices2;
    }

    public void addCuinpCqitemPrices2(CuinpCqitemPrice cuinpCqitemPrice) {
        if (this.cuinpCqitemPrices2 == null)
            this.cuinpCqitemPrices2 = new ArrayList<CuinpCqitemPrice>();
        this.cuinpCqitemPrices2.add(cuinpCqitemPrice);
    }

    public void removeCuinpCqitemPrices2(CuinpCqitemPrice cuinpCqitemPriceToRemove) {
        if (cuinpCqitemPriceToRemove != null)
            this.cuinpCqitemPrices2.remove(cuinpCqitemPriceToRemove);
    }

}
