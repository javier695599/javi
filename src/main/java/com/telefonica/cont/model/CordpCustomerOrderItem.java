package com.telefonica.cont.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 * The persistent class for the CordpCustomerOrderItemS database table.
 */
@Entity
@NamedQuery(name = "CordpCustomerOrderItem.findAll", query = "SELECT c FROM CordpCustomerOrderItem c")
@Table(name = "CORDP_CUSTOMER_ORDER_ITEM")
public class CordpCustomerOrderItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BIIT_ID_CUSTOMER_ORDER_ITEM", nullable = false, precision = 38, unique = true)
    @Id
    private BigDecimal biitIdCustomerOrderItem;

    @Column(name = "BRSP_ID_RESTRICTION_SPEC", precision = 4)
    private Long brspIdRestrictionSpec;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "cordpCustomerOrderItem")
    private List<CevcrOpelementCuorItem> cevcrOpelementCuorItems;
    @JoinColumn(name = "BUIN_ID_CUSTOMER_ORDER", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpCustomerOrder cordpCustomerOrder;
    @OneToOne
    @PrimaryKeyJoinColumn(name = "BIIT_ID_CUSTOMER_ORDER_ITEM")
    private CordpCustomerSellingItem cordpCustomerSellingItem;
    @OneToMany(mappedBy = "cordpCustomerOrderItem")
    private List<CordrCorderItemLocation> cordrCorderItemLocations;
    @OneToMany(mappedBy = "cordpCustomerOrderItem")
    private List<CuinrCoitemRelProdPromoted> cuinrCoitemRelProdPromoteds;

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

    public BigDecimal getBiitIdCustomerOrderItem() {
        return this.biitIdCustomerOrderItem;
    }

    public void setBiitIdCustomerOrderItem(BigDecimal biitIdCustomerOrderItem) {
        this.biitIdCustomerOrderItem = biitIdCustomerOrderItem;
    }

    public Long getBrspIdRestrictionSpec() {
        return this.brspIdRestrictionSpec;
    }

    public void setBrspIdRestrictionSpec(Long brspIdRestrictionSpec) {
        this.brspIdRestrictionSpec = brspIdRestrictionSpec;
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

    public List<CevcrOpelementCuorItem> getCevcrOpelementCuorItems() {
        return this.cevcrOpelementCuorItems;
    }

    public void setCevcrOpelementCuorItems(List<CevcrOpelementCuorItem> cevcrOpelementCuorItems) {
        this.cevcrOpelementCuorItems = cevcrOpelementCuorItems;
    }

    public void addCevcrOpelementCuorItems(CevcrOpelementCuorItem cevcrOpelementCuorItem) {
        if (this.cevcrOpelementCuorItems == null)
            this.cevcrOpelementCuorItems = new ArrayList<CevcrOpelementCuorItem>();
        this.cevcrOpelementCuorItems.add(cevcrOpelementCuorItem);
    }

    public void removeCevcrOpelementCuorItems(CevcrOpelementCuorItem cevcrOpelementCuorItemToRemove) {
        if (cevcrOpelementCuorItemToRemove != null)
            this.cevcrOpelementCuorItems.remove(cevcrOpelementCuorItemToRemove);
    }

    public CordpCustomerOrder getCordpCustomerOrder() {
        return this.cordpCustomerOrder;
    }

    public void setCordpCustomerOrder(CordpCustomerOrder cordpCustomerOrder) {
        this.cordpCustomerOrder = cordpCustomerOrder;
    }

    public CordpCustomerSellingItem getCordpCustomerSellingItem() {
        return this.cordpCustomerSellingItem;
    }

    public void setCordpCustomerSellingItem(CordpCustomerSellingItem cordpCustomerSellingItem) {
        this.cordpCustomerSellingItem = cordpCustomerSellingItem;
    }

    public List<CordrCorderItemLocation> getCordrCorderItemLocations() {
        return this.cordrCorderItemLocations;
    }

    public void setCordrCorderItemLocations(List<CordrCorderItemLocation> cordrCorderItemLocations) {
        this.cordrCorderItemLocations = cordrCorderItemLocations;
    }

    public void addCordrCorderItemLocations(CordrCorderItemLocation cordrCorderItemLocation) {
        if (this.cordrCorderItemLocations == null)
            this.cordrCorderItemLocations = new ArrayList<CordrCorderItemLocation>();
        this.cordrCorderItemLocations.add(cordrCorderItemLocation);
    }

    public void removeCordrCorderItemLocations(CordrCorderItemLocation cordrCorderItemLocationToRemove) {
        if (cordrCorderItemLocationToRemove != null)
            this.cordrCorderItemLocations.remove(cordrCorderItemLocationToRemove);
    }

    public List<CuinrCoitemRelProdPromoted> getCuinrCoitemRelProdPromoteds() {
        return this.cuinrCoitemRelProdPromoteds;
    }

    public void setCuinrCoitemRelProdPromoteds(List<CuinrCoitemRelProdPromoted> cuinrCoitemRelProdPromoteds) {
        this.cuinrCoitemRelProdPromoteds = cuinrCoitemRelProdPromoteds;
    }

    public void addCuinrCoitemRelProdPromoteds(CuinrCoitemRelProdPromoted cuinrCoitemRelProdPromoted) {
        if (this.cuinrCoitemRelProdPromoteds == null)
            this.cuinrCoitemRelProdPromoteds = new ArrayList<CuinrCoitemRelProdPromoted>();
        this.cuinrCoitemRelProdPromoteds.add(cuinrCoitemRelProdPromoted);
    }

    public void removeCuinrCoitemRelProdPromoteds(CuinrCoitemRelProdPromoted cuinrCoitemRelProdPromotedToRemove) {
        if (cuinrCoitemRelProdPromotedToRemove != null)
            this.cuinrCoitemRelProdPromoteds.remove(cuinrCoitemRelProdPromotedToRemove);
    }

}
