package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CevcrOpmilestItemsSpecS database table.
 */
@Entity
@NamedQuery(name = "CevcrOpmilestItemsSpec.findAll", query = "SELECT c FROM CevcrOpmilestItemsSpec c")
@Table(name = "CEVCR_OPMILEST_ITEMS_SPEC", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "OPEL_ID_OPLAN_MILESTON", "IWSM_ID_IWFLOW_SP_MILEST"})})
public class CevcrOpmilestItemsSpec implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "IWSM_ID_IWFLOW_SP_MILEST", nullable = false, precision = 10)
    private Long iwsmIdIwflowSpMilest;

    @Column(name = "OMIS_ID_OPMILEST_ITEMS_SPEC", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal omisIdOpmilestItemsSpec;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "OPEL_ID_OPLAN_MILESTON", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcpOplanMileston cevcpOplanMileston;

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

    public Long getIwsmIdIwflowSpMilest() {
        return this.iwsmIdIwflowSpMilest;
    }

    public void setIwsmIdIwflowSpMilest(Long iwsmIdIwflowSpMilest) {
        this.iwsmIdIwflowSpMilest = iwsmIdIwflowSpMilest;
    }

    public BigDecimal getOmisIdOpmilestItemsSpec() {
        return this.omisIdOpmilestItemsSpec;
    }

    public void setOmisIdOpmilestItemsSpec(BigDecimal omisIdOpmilestItemsSpec) {
        this.omisIdOpmilestItemsSpec = omisIdOpmilestItemsSpec;
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

    public CevcpOplanMileston getCevcpOplanMileston() {
        return this.cevcpOplanMileston;
    }

    public void setCevcpOplanMileston(CevcpOplanMileston cevcpOplanMileston) {
        this.cevcpOplanMileston = cevcpOplanMileston;
    }

}
