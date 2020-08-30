package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the CorddExecutionModeS database table.
 */
@Entity
@NamedQuery(name = "CorddExecutionMode.findAll", query = "SELECT c FROM CorddExecutionMode c")
@Table(name = "CORDD_EXECUTION_MODE")
public class CorddExecutionMode implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "EXMO_ID_EXECUTION_MODE", nullable = false, precision = 3, unique = true)
    @Id
    private Long exmoIdExecutionMode;

    @Column(length = 100, name = "EXMO_NA_EXECUTION_MODE", nullable = false)
    private String exmoNaExecutionMode;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "corddExecutionMode")
    private List<CordpCustomerSellingItem> cordpCustomerSellingItems;

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

    public Long getExmoIdExecutionMode() {
        return this.exmoIdExecutionMode;
    }

    public void setExmoIdExecutionMode(Long exmoIdExecutionMode) {
        this.exmoIdExecutionMode = exmoIdExecutionMode;
    }

    public String getExmoNaExecutionMode() {
        return this.exmoNaExecutionMode;
    }

    public void setExmoNaExecutionMode(String exmoNaExecutionMode) {
        this.exmoNaExecutionMode = exmoNaExecutionMode;
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
            this.cordpCustomerSellingItems = new ArrayList<CordpCustomerSellingItem> ();
        this.cordpCustomerSellingItems.add ( cordpCustomerSellingItem );
    }

    public void removeCordpCustomerSellingItems(CordpCustomerSellingItem cordpCustomerSellingItemToRemove) {
        if (cordpCustomerSellingItemToRemove != null)
            this.cordpCustomerSellingItems.remove ( cordpCustomerSellingItemToRemove );
    }

}
