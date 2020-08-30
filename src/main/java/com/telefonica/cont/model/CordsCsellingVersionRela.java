package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CordsCsellingVersionRelaS database table.
 */
@Entity
@NamedQuery(name = "CordsCsellingVersionRela.findAll", query = "SELECT c FROM CordsCsellingVersionRela c")
@Table(name = "CORDS_CSELLING_VERSION_RELA", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BUIN_ID_CUSTOMER_SELLING", "BUIN_ID_CUSTOMER_SELLING_RE"})})
public class CordsCsellingVersionRela implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BINT_ID_CSELLING_TYPE", nullable = false, precision = 3)
    private Long bintIdCsellingType;

    @Column(name = "BUIN_ID_CUSTOMER_SELLING", nullable = false, precision = 38)
    private BigDecimal buinIdCustomerSelling;

    @Column(name = "BUIN_ID_CUSTOMER_SELLING_RE", nullable = false, precision = 38)
    private BigDecimal buinIdCustomerSellingRe;

    @Column(name = "CSVE_ID_CSELLING_VERSION_RELA", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal csveIdCsellingVersionRela;

    @Column(name = "CSVR_ID_CSELLING_VERS_REASON", nullable = false, precision = 3)
    private Long csvrIdCsellingVersReason;

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

    public BigDecimal getBuinIdCustomerSelling() {
        return this.buinIdCustomerSelling;
    }

    public void setBuinIdCustomerSelling(BigDecimal buinIdCustomerSelling) {
        this.buinIdCustomerSelling = buinIdCustomerSelling;
    }

    public BigDecimal getBuinIdCustomerSellingRe() {
        return this.buinIdCustomerSellingRe;
    }

    public void setBuinIdCustomerSellingRe(BigDecimal buinIdCustomerSellingRe) {
        this.buinIdCustomerSellingRe = buinIdCustomerSellingRe;
    }

    public BigDecimal getCsveIdCsellingVersionRela() {
        return this.csveIdCsellingVersionRela;
    }

    public void setCsveIdCsellingVersionRela(BigDecimal csveIdCsellingVersionRela) {
        this.csveIdCsellingVersionRela = csveIdCsellingVersionRela;
    }

    public Long getCsvrIdCsellingVersReason() {
        return this.csvrIdCsellingVersReason;
    }

    public void setCsvrIdCsellingVersReason(Long csvrIdCsellingVersReason) {
        this.csvrIdCsellingVersReason = csvrIdCsellingVersReason;
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
