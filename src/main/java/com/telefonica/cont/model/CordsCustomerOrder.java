package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the CordsCustomerOrderS database table.
 */
@Entity
@NamedQuery(name = "CordsCustomerOrder.findAll", query = "SELECT c FROM CordsCustomerOrder c")
@Table(name = "CORDS_CUSTOMER_ORDER", uniqueConstraints = {@UniqueConstraint(columnNames = {"BUIN_ID_CUSTOMER_ORDER",
        "BINT_ID_CUST_ORDER_TYPE"})})
public class CordsCustomerOrder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BINT_ID_CUST_ORDER_TYPE", nullable = false, precision = 3)
    private Long bintIdCustOrderType;

    @Column(name = "BISP_ID_BUSINESS_INTE_SPEC_CAT", nullable = false, precision = 2)
    private Long bispIdBusinessInteSpecCat;

    @Column(name = "BUIN_ID_CUSTOMER_ORDER", nullable = false, precision = 38)
    @GeneratedValue(generator = "telco-uuid")
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

    public Long getBintIdCustOrderType() {
        return this.bintIdCustOrderType;
    }

    public void setBintIdCustOrderType(Long bintIdCustOrderType) {
        this.bintIdCustOrderType = bintIdCustOrderType;
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

}
