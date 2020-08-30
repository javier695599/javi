package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CordrCsellingIncidentS database table.
 */
@Entity
@NamedQuery(name = "CordrCsellingIncident.findAll", query = "SELECT c FROM CordrCsellingIncident c")
@Table(name = "CORDR_CSELLING_INCIDENT", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BUIN_ID_CUSTOMER_SELLING", "INCI_ID_INCIDENT"})})
public class CordrCsellingIncident implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "CSEI_ID_CSELLING_INCIDENT", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal cseiIdCsellingIncident;

    @Column(name = "INCI_ID_INCIDENT", nullable = false, precision = 14)
    private Long inciIdIncident;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumns({
            @JoinColumn(referencedColumnName = "BINT_ID_CSELLING_TYPE", nullable = false,
                    name = "BINT_ID_CSELLING_TYPE"),
            @JoinColumn(referencedColumnName = "BUIN_ID_CUSTOMER_SELLING", nullable = false,
                    name = "BUIN_ID_CUSTOMER_SELLING")})
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpCustomerSelling cordpCustomerSelling;

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

    public BigDecimal getCseiIdCsellingIncident() {
        return this.cseiIdCsellingIncident;
    }

    public void setCseiIdCsellingIncident(BigDecimal cseiIdCsellingIncident) {
        this.cseiIdCsellingIncident = cseiIdCsellingIncident;
    }

    public Long getInciIdIncident() {
        return this.inciIdIncident;
    }

    public void setInciIdIncident(Long inciIdIncident) {
        this.inciIdIncident = inciIdIncident;
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

    public CordpCustomerSelling getCordpCustomerSelling() {
        return this.cordpCustomerSelling;
    }

    public void setCordpCustomerSelling(CordpCustomerSelling cordpCustomerSelling) {
        this.cordpCustomerSelling = cordpCustomerSelling;
    }

}
