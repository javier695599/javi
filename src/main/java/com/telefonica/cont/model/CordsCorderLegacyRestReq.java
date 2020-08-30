package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CordsCorderLegacyRestReqS database table.
 */
@Entity
@NamedQuery(name = "CordsCorderLegacyRestReq.findAll", query = "SELECT c FROM CordsCorderLegacyRestReq c")
@Table(name = "CORDS_CORDER_LEGACY_REST_REQ")
public class CordsCorderLegacyRestReq implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BUIN_ID_CUSTOMER_ORDER", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal buinIdCustomerOrder;

    @Column(length = 100, name = "LRRQ_CO_LEGACY_RESTRIC_REQUEST")
    private String lrrqCoLegacyRestricRequest;

    @Column(name = "LRRQ_ID_LEGACY_RESTRIC_REQUEST", nullable = false, precision = 38)
    private BigDecimal lrrqIdLegacyRestricRequest;

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

    public BigDecimal getBuinIdCustomerOrder() {
        return this.buinIdCustomerOrder;
    }

    public void setBuinIdCustomerOrder(BigDecimal buinIdCustomerOrder) {
        this.buinIdCustomerOrder = buinIdCustomerOrder;
    }

    public String getLrrqCoLegacyRestricRequest() {
        return this.lrrqCoLegacyRestricRequest;
    }

    public void setLrrqCoLegacyRestricRequest(String lrrqCoLegacyRestricRequest) {
        this.lrrqCoLegacyRestricRequest = lrrqCoLegacyRestricRequest;
    }

    public BigDecimal getLrrqIdLegacyRestricRequest() {
        return this.lrrqIdLegacyRestricRequest;
    }

    public void setLrrqIdLegacyRestricRequest(BigDecimal lrrqIdLegacyRestricRequest) {
        this.lrrqIdLegacyRestricRequest = lrrqIdLegacyRestricRequest;
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
