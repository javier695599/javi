package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the CordsCsellingRelaInS database table.
 */
@Entity
@NamedQuery(name = "CordsCsellingRelaIn.findAll", query = "SELECT c FROM CordsCsellingRelaIn c")
@Table(name = "CORDS_CSELLING_RELA_IN", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BUIN_ID_CUSTOMER_SELLING", "BINT_ID_CSELLING_TYPE", "BUIN_ID_CUSTOMER_SELLING_RE", "BINT_ID_CSELLING_TYPE_RE",
        "CSRT_ID_CSELLING_RELA_TYPE"})})
public class CordsCsellingRelaIn implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BINT_ID_CSELLING_TYPE", nullable = false, precision = 3)
    private Long bintIdCsellingType;

    @Column(name = "BINT_ID_CSELLING_TYPE_RE", nullable = false, precision = 3)
    private Long bintIdCsellingTypeRe;

    @Column(name = "BUIN_ID_CUSTOMER_SELLING", nullable = false, precision = 38)
    private BigDecimal buinIdCustomerSelling;

    @Column(name = "BUIN_ID_CUSTOMER_SELLING_RE", nullable = false, precision = 38)
    private BigDecimal buinIdCustomerSellingRe;

    @Column(columnDefinition = "DATE", name = "CSRS_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csrsDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CSRS_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csrsDaStartValidity;

    @Column(name = "CSRS_ID_CSELLING_RELA_IN", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal csrsIdCsellingRelaIn;

    @Column(name = "CSRT_ID_CSELLING_RELA_TYPE", nullable = false, precision = 3)
    private Long csrtIdCsellingRelaType;

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

    public Long getBintIdCsellingTypeRe() {
        return this.bintIdCsellingTypeRe;
    }

    public void setBintIdCsellingTypeRe(Long bintIdCsellingTypeRe) {
        this.bintIdCsellingTypeRe = bintIdCsellingTypeRe;
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

    public Date getCsrsDaEndValidity() {
        if (this.csrsDaEndValidity != null)
            return (Date) this.csrsDaEndValidity.clone ();
        else
            return null;
    }

    public void setCsrsDaEndValidity(Date csrsDaEndValidity) {
        if (csrsDaEndValidity != null)
            this.csrsDaEndValidity = (Date) csrsDaEndValidity.clone ();
        else
            this.csrsDaEndValidity = csrsDaEndValidity;
    }

    public Date getCsrsDaStartValidity() {
        if (this.csrsDaStartValidity != null)
            return (Date) this.csrsDaStartValidity.clone ();
        else
            return null;
    }

    public void setCsrsDaStartValidity(Date csrsDaStartValidity) {
        if (csrsDaStartValidity != null)
            this.csrsDaStartValidity = (Date) csrsDaStartValidity.clone ();
        else
            this.csrsDaStartValidity = csrsDaStartValidity;
    }

    public BigDecimal getCsrsIdCsellingRelaIn() {
        return this.csrsIdCsellingRelaIn;
    }

    public void setCsrsIdCsellingRelaIn(BigDecimal csrsIdCsellingRelaIn) {
        this.csrsIdCsellingRelaIn = csrsIdCsellingRelaIn;
    }

    public Long getCsrtIdCsellingRelaType() {
        return this.csrtIdCsellingRelaType;
    }

    public void setCsrtIdCsellingRelaType(Long csrtIdCsellingRelaType) {
        this.csrtIdCsellingRelaType = csrtIdCsellingRelaType;
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
