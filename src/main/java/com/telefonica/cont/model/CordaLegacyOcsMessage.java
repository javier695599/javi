package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the CordaLegacyOcsMessageS database table.
 */
@Entity
@NamedQuery(name = "CordaLegacyOcsMessage.findAll", query = "SELECT c FROM CordaLegacyOcsMessage c")
@Table(name = "CORDA_LEGACY_OCS_MESSAGE")
public class CordaLegacyOcsMessage implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "ROEN_ID_LEGA_OCS_MESSA", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal roenIdLegaOcsMessa;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "OPEL_ID_OPLAN_TASK", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcpOplanTask cevcpOplanTask;
    @OneToMany(mappedBy = "cordaLegacyOcsMessage")
    private List<CordpLocsCharValue> cordpLocsCharValues;

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

    public BigDecimal getRoenIdLegaOcsMessa() {
        return this.roenIdLegaOcsMessa;
    }

    public void setRoenIdLegaOcsMessa(BigDecimal roenIdLegaOcsMessa) {
        this.roenIdLegaOcsMessa = roenIdLegaOcsMessa;
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

    public CevcpOplanTask getCevcpOplanTask() {
        return this.cevcpOplanTask;
    }

    public void setCevcpOplanTask(CevcpOplanTask cevcpOplanTask) {
        this.cevcpOplanTask = cevcpOplanTask;
    }

    public List<CordpLocsCharValue> getCordpLocsCharValues() {
        return this.cordpLocsCharValues;
    }

    public void setCordpLocsCharValues(List<CordpLocsCharValue> cordpLocsCharValues) {
        this.cordpLocsCharValues = cordpLocsCharValues;
    }

    public void addCordpLocsCharValues(CordpLocsCharValue cordpLocsCharValue) {
        if (this.cordpLocsCharValues == null)
            this.cordpLocsCharValues = new ArrayList<CordpLocsCharValue> ();
        this.cordpLocsCharValues.add ( cordpLocsCharValue );
    }

    public void removeCordpLocsCharValues(CordpLocsCharValue cordpLocsCharValueToRemove) {
        if (cordpLocsCharValueToRemove != null)
            this.cordpLocsCharValues.remove ( cordpLocsCharValueToRemove );
    }

}
