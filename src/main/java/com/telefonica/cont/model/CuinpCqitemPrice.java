package com.telefonica.cont.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.eclipse.persistence.annotations.Convert;

/**
 * The persistent class for the CuinpCqitemPriceS database table.
 */
@Entity
@NamedQuery(name = "CuinpCqitemPrice.findAll", query = "SELECT c FROM CuinpCqitemPrice c")
@Table(name = "CUINP_CQITEM_PRICE", uniqueConstraints = { @UniqueConstraint(columnNames = { "BIIT_ID_BUSINESS_IT_ITEM",
        "CQPR_ID_CQI_PRICE" }) })
public class CuinpCqitemPrice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "CQPR_AM_FINAL_PRICE", nullable = false, precision = 15, scale = 6)
    private BigDecimal cqprAmFinalPrice;

    @Column(name = "CQPR_AM_INITIAL_PRICE", nullable = false, precision = 15, scale = 6)
    private BigDecimal cqprAmInitialPrice;

    @Column(name = "CQPR_ID_CQI_PRICE", nullable = false, precision = 38)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal cqprIdCqiPrice;

    @Column(name = "CQPR_IN_IS_RECURRING", nullable = false)
    @Convert("BigDecimalBooleanConverter")
    private Boolean cqprInIsRecurring;

    @Column(name = "POFP_ID_PRODUCT_OFFERING_PRICE", nullable = false, precision = 7)
    private Long pofpIdProductOfferingPrice;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "UMEA_ID_INITIAL_UNIT_MEASURE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddUnitMeasure corddUnitMeasure1;
    @JoinColumn(name = "UMEA_ID_FINAL_UNIT_MEASURE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddUnitMeasure corddUnitMeasure2;
    @OneToMany(mappedBy = "cuinpCqitemPrice")
    private List<CuinpCqitemPriceAlteration> cuinpCqitemPriceAlterations;
    @JoinColumn(name = "BIIT_ID_BUSINESS_IT_ITEM", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CuinpCustomerQuoteItem cuinpCustomerQuoteItem;

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

    public BigDecimal getCqprAmFinalPrice() {
        return this.cqprAmFinalPrice;
    }

    public void setCqprAmFinalPrice(BigDecimal cqprAmFinalPrice) {
        this.cqprAmFinalPrice = cqprAmFinalPrice;
    }

    public BigDecimal getCqprAmInitialPrice() {
        return this.cqprAmInitialPrice;
    }

    public void setCqprAmInitialPrice(BigDecimal cqprAmInitialPrice) {
        this.cqprAmInitialPrice = cqprAmInitialPrice;
    }

    public BigDecimal getCqprIdCqiPrice() {
        return this.cqprIdCqiPrice;
    }

    public void setCqprIdCqiPrice(BigDecimal cqprIdCqiPrice) {
        this.cqprIdCqiPrice = cqprIdCqiPrice;
    }

    public Boolean getCqprInIsRecurring() {
        return this.cqprInIsRecurring;
    }

    public void setCqprInIsRecurring(Boolean cqprInIsRecurring) {
        this.cqprInIsRecurring = cqprInIsRecurring;
    }

    public Long getPofpIdProductOfferingPrice() {
        return this.pofpIdProductOfferingPrice;
    }

    public void setPofpIdProductOfferingPrice(Long pofpIdProductOfferingPrice) {
        this.pofpIdProductOfferingPrice = pofpIdProductOfferingPrice;
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

    public CorddUnitMeasure getCorddUnitMeasure1() {
        return this.corddUnitMeasure1;
    }

    public void setCorddUnitMeasure1(CorddUnitMeasure corddUnitMeasure1) {
        this.corddUnitMeasure1 = corddUnitMeasure1;
    }

    public CorddUnitMeasure getCorddUnitMeasure2() {
        return this.corddUnitMeasure2;
    }

    public void setCorddUnitMeasure2(CorddUnitMeasure corddUnitMeasure2) {
        this.corddUnitMeasure2 = corddUnitMeasure2;
    }

    public List<CuinpCqitemPriceAlteration> getCuinpCqitemPriceAlterations() {
        return this.cuinpCqitemPriceAlterations;
    }

    public void setCuinpCqitemPriceAlterations(List<CuinpCqitemPriceAlteration> cuinpCqitemPriceAlterations) {
        this.cuinpCqitemPriceAlterations = cuinpCqitemPriceAlterations;
    }

    public void addCuinpCqitemPriceAlterations(CuinpCqitemPriceAlteration cuinpCqitemPriceAlteration) {
        if (this.cuinpCqitemPriceAlterations == null)
            this.cuinpCqitemPriceAlterations = new ArrayList<CuinpCqitemPriceAlteration>();
        this.cuinpCqitemPriceAlterations.add(cuinpCqitemPriceAlteration);
    }

    public void removeCuinpCqitemPriceAlterations(CuinpCqitemPriceAlteration cuinpCqitemPriceAlterationToRemove) {
        if (cuinpCqitemPriceAlterationToRemove != null)
            this.cuinpCqitemPriceAlterations.remove(cuinpCqitemPriceAlterationToRemove);
    }

    public CuinpCustomerQuoteItem getCuinpCustomerQuoteItem() {
        return this.cuinpCustomerQuoteItem;
    }

    public void setCuinpCustomerQuoteItem(CuinpCustomerQuoteItem cuinpCustomerQuoteItem) {
        this.cuinpCustomerQuoteItem = cuinpCustomerQuoteItem;
    }

}
