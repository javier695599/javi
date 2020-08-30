package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CordsCustomerSellingS database table.
 */
@Entity
@NamedQuery(name = "CordsCustomerSelling.findAll", query = "SELECT c FROM CordsCustomerSelling c")
@Table(name = "CORDS_CUSTOMER_SELLING", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BUIN_ID_CUSTOMER_SELLING", "BINT_ID_CSELLING_TYPE"})})
public class CordsCustomerSelling implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BINT_ID_CSELLING_TYPE", nullable = false, precision = 3)
    private Long bintIdCsellingType;

    @Column(length = 14, name = "BUIN_CO_CUSTOMER_SELLING")
    private String buinCoCustomerSelling;

    @Column(name = "BUIN_ID_CUSTOMER_SELLING", nullable = false, precision = 38)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal buinIdCustomerSelling;

    @Column(name = "BUIN_TI_COMPLETE_INTERAC")
    private Timestamp buinTiCompleteInterac;

    @Column(name = "BUIN_TI_START_INTERAC", nullable = false)
    private Timestamp buinTiStartInterac;

    @Column(length = 400, name = "LCOR_DS_CUSTOMER_SELLING_LANG")
    private String lcorDsCustomerSellingLang;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

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

    public String getBuinCoCustomerSelling() {
        return this.buinCoCustomerSelling;
    }

    public void setBuinCoCustomerSelling(String buinCoCustomerSelling) {
        this.buinCoCustomerSelling = buinCoCustomerSelling;
    }

    public BigDecimal getBuinIdCustomerSelling() {
        return this.buinIdCustomerSelling;
    }

    public void setBuinIdCustomerSelling(BigDecimal buinIdCustomerSelling) {
        this.buinIdCustomerSelling = buinIdCustomerSelling;
    }

    public Timestamp getBuinTiCompleteInterac() {
        if (this.buinTiCompleteInterac != null)
            return (Timestamp) this.buinTiCompleteInterac.clone ();
        else
            return null;
    }

    public void setBuinTiCompleteInterac(Timestamp buinTiCompleteInterac) {
        if (buinTiCompleteInterac != null)
            this.buinTiCompleteInterac = (Timestamp) buinTiCompleteInterac.clone ();
        else
            this.buinTiCompleteInterac = buinTiCompleteInterac;
    }

    public Timestamp getBuinTiStartInterac() {
        if (this.buinTiStartInterac != null)
            return (Timestamp) this.buinTiStartInterac.clone ();
        else
            return null;
    }

    public void setBuinTiStartInterac(Timestamp buinTiStartInterac) {
        if (buinTiStartInterac != null)
            this.buinTiStartInterac = (Timestamp) buinTiStartInterac.clone ();
        else
            this.buinTiStartInterac = buinTiStartInterac;
    }

    public String getLcorDsCustomerSellingLang() {
        return this.lcorDsCustomerSellingLang;
    }

    public void setLcorDsCustomerSellingLang(String lcorDsCustomerSellingLang) {
        this.lcorDsCustomerSellingLang = lcorDsCustomerSellingLang;
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

}
