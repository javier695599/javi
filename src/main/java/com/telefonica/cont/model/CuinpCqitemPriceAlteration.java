package com.telefonica.cont.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.eclipse.persistence.annotations.Convert;

/**
 * The persistent class for the CuinpCqitemPriceAlterationS database table.
 */
@Entity
@NamedQuery(name = "CuinpCqitemPriceAlteration.findAll", query = "SELECT c FROM CuinpCqitemPriceAlteration c")
@Table(name = "CUINP_CQITEM_PRICE_ALTERATION")
public class CuinpCqitemPriceAlteration implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "CPAL_AM_PRICE", nullable = false, precision = 15, scale = 6)
    private BigDecimal cpalAmPrice;

    @Column(name = "CPAL_ID_CQI_PRICE_ALTERATION", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal cpalIdCqiPriceAlteration;

    @Column(name = "CPAL_IN_IS_ALTERNATE", nullable = false)
    @Convert("BigDecimalBooleanConverter")
    private Boolean cpalInIsAlternate;

    @Column(name = "CPAL_IN_IS_PERCENTAGE", nullable = false)
    @Convert("BigDecimalBooleanConverter")
    private Boolean cpalInIsPercentage;

    @Column(name = "CPAL_NU_APPLICATION_DURATION", nullable = false, precision = 6)
    private Long cpalNuApplicationDuration;

    @Column(name = "CPAL_PT_PERCENTAGE", precision = 3)
    private Long cpalPtPercentage;

    @Column(name = "POFP_ID_PRODUCT_OFFERING_PRICE", nullable = false, precision = 7)
    private Long pofpIdProductOfferingPrice;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "UMEA_ID_UNIT_MEASURE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddUnitMeasure corddUnitMeasure1;
    @JoinColumn(name = "UNME_ID_UNIT_MEASURE_DURAT", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddUnitMeasure corddUnitMeasure2;
    @JoinColumns({
            @JoinColumn(referencedColumnName = "BIIT_ID_BUSINESS_IT_ITEM", nullable = false, name = "BIIT_ID_BUSINESS_IT_ITEM"),
            @JoinColumn(referencedColumnName = "", nullable = false, name = "CQPR_ID_CQI_PRICE") })
    @ManyToOne(fetch = FetchType.LAZY)
    private CuinpCqitemPrice cuinpCqitemPrice;

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

    public BigDecimal getCpalAmPrice() {
        return this.cpalAmPrice;
    }

    public void setCpalAmPrice(BigDecimal cpalAmPrice) {
        this.cpalAmPrice = cpalAmPrice;
    }

    public BigDecimal getCpalIdCqiPriceAlteration() {
        return this.cpalIdCqiPriceAlteration;
    }

    public void setCpalIdCqiPriceAlteration(BigDecimal cpalIdCqiPriceAlteration) {
        this.cpalIdCqiPriceAlteration = cpalIdCqiPriceAlteration;
    }

    public Boolean getCpalInIsAlternate() {
        return this.cpalInIsAlternate;
    }

    public void setCpalInIsAlternate(Boolean cpalInIsAlternate) {
        this.cpalInIsAlternate = cpalInIsAlternate;
    }

    public Boolean getCpalInIsPercentage() {
        return this.cpalInIsPercentage;
    }

    public void setCpalInIsPercentage(Boolean cpalInIsPercentage) {
        this.cpalInIsPercentage = cpalInIsPercentage;
    }

    public Long getCpalNuApplicationDuration() {
        return this.cpalNuApplicationDuration;
    }

    public void setCpalNuApplicationDuration(Long cpalNuApplicationDuration) {
        this.cpalNuApplicationDuration = cpalNuApplicationDuration;
    }

    public Long getCpalPtPercentage() {
        return this.cpalPtPercentage;
    }

    public void setCpalPtPercentage(Long cpalPtPercentage) {
        this.cpalPtPercentage = cpalPtPercentage;
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

    public CuinpCqitemPrice getCuinpCqitemPrice() {
        return this.cuinpCqitemPrice;
    }

    public void setCuinpCqitemPrice(CuinpCqitemPrice cuinpCqitemPrice) {
        this.cuinpCqitemPrice = cuinpCqitemPrice;
    }

}
