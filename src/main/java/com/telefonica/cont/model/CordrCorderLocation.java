package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the CordrCorderLocationS database table.
 */
@Entity
@NamedQuery(name = "CordrCorderLocation.findAll", query = "SELECT c FROM CordrCorderLocation c")
@Table(name = "CORDR_CORDER_LOCATION", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BUIN_ID_CUSTOMER_ORDER", "PLAC_ID_GEO_SITE", "PLTY_ID_PLACE_TYPE"})})
public class CordrCorderLocation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "COLO_ID_CORDER_LOCATION", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal coloIdCorderLocation;

    @Column(name = "PLAC_ID_GEO_SITE", nullable = false, precision = 12)
    private Long placIdGeoSite;

    @Column(name = "PLTY_ID_PLACE_TYPE", nullable = false, precision = 3)
    private Long pltyIdPlaceType;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "BUIN_ID_CUSTOMER_ORDER", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpCustomerOrder cordpCustomerOrder;
    @OneToMany(mappedBy = "cordrCorderLocation")
    private List<CordrCorderItemLocation> cordrCorderItemLocations;

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

    public BigDecimal getColoIdCorderLocation() {
        return this.coloIdCorderLocation;
    }

    public void setColoIdCorderLocation(BigDecimal coloIdCorderLocation) {
        this.coloIdCorderLocation = coloIdCorderLocation;
    }

    public Long getPlacIdGeoSite() {
        return this.placIdGeoSite;
    }

    public void setPlacIdGeoSite(Long placIdGeoSite) {
        this.placIdGeoSite = placIdGeoSite;
    }

    public Long getPltyIdPlaceType() {
        return this.pltyIdPlaceType;
    }

    public void setPltyIdPlaceType(Long pltyIdPlaceType) {
        this.pltyIdPlaceType = pltyIdPlaceType;
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

    public CordpCustomerOrder getCordpCustomerOrder() {
        return this.cordpCustomerOrder;
    }

    public void setCordpCustomerOrder(CordpCustomerOrder cordpCustomerOrder) {
        this.cordpCustomerOrder = cordpCustomerOrder;
    }

    public List<CordrCorderItemLocation> getCordrCorderItemLocations() {
        return this.cordrCorderItemLocations;
    }

    public void setCordrCorderItemLocations(List<CordrCorderItemLocation> cordrCorderItemLocations) {
        this.cordrCorderItemLocations = cordrCorderItemLocations;
    }

    public void addCordrCorderItemLocations(CordrCorderItemLocation cordrCorderItemLocation) {
        if (this.cordrCorderItemLocations == null)
            this.cordrCorderItemLocations = new ArrayList<CordrCorderItemLocation> ();
        this.cordrCorderItemLocations.add ( cordrCorderItemLocation );
    }

    public void removeCordrCorderItemLocations(CordrCorderItemLocation cordrCorderItemLocationToRemove) {
        if (cordrCorderItemLocationToRemove != null)
            this.cordrCorderItemLocations.remove ( cordrCorderItemLocationToRemove );
    }

}
