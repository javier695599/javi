package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the CuindCqitemSourceTypeS database table.
 */
@Entity
@NamedQuery(name = "CuindCqitemSourceType.findAll", query = "SELECT c FROM CuindCqitemSourceType c")
@Table(name = "CUIND_CQITEM_SOURCE_TYPE")
public class CuindCqitemSourceType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "CQIS_ID_CQITEM_SOURCE_TYPE", nullable = false, precision = 3, unique = true)
    @Id
    private Long cqisIdCqitemSourceType;

    @Column(length = 300, name = "CQIS_NA_CQITEM_SOURCE_TYPE", nullable = false)
    private String cqisNaCqitemSourceType;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "cuindCqitemSourceType")
    private List<CuinpCustomerQuoteItem> cuinpCustomerQuoteItems;

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

    public Long getCqisIdCqitemSourceType() {
        return this.cqisIdCqitemSourceType;
    }

    public void setCqisIdCqitemSourceType(Long cqisIdCqitemSourceType) {
        this.cqisIdCqitemSourceType = cqisIdCqitemSourceType;
    }

    public String getCqisNaCqitemSourceType() {
        return this.cqisNaCqitemSourceType;
    }

    public void setCqisNaCqitemSourceType(String cqisNaCqitemSourceType) {
        this.cqisNaCqitemSourceType = cqisNaCqitemSourceType;
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

    public List<CuinpCustomerQuoteItem> getCuinpCustomerQuoteItems() {
        return this.cuinpCustomerQuoteItems;
    }

    public void setCuinpCustomerQuoteItems(List<CuinpCustomerQuoteItem> cuinpCustomerQuoteItems) {
        this.cuinpCustomerQuoteItems = cuinpCustomerQuoteItems;
    }

    public void addCuinpCustomerQuoteItems(CuinpCustomerQuoteItem cuinpCustomerQuoteItem) {
        if (this.cuinpCustomerQuoteItems == null)
            this.cuinpCustomerQuoteItems = new ArrayList<CuinpCustomerQuoteItem> ();
        this.cuinpCustomerQuoteItems.add ( cuinpCustomerQuoteItem );
    }

    public void removeCuinpCustomerQuoteItems(CuinpCustomerQuoteItem cuinpCustomerQuoteItemToRemove) {
        if (cuinpCustomerQuoteItemToRemove != null)
            this.cuinpCustomerQuoteItems.remove ( cuinpCustomerQuoteItemToRemove );
    }

}
