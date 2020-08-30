package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the CevcrPmGroupRelshipS database table.
 */
@Entity
@NamedQuery(name = "CevcrPmGroupRelship.findAll", query = "SELECT c FROM CevcrPmGroupRelship c")
@Table(name = "CEVCR_PM_GROUP_RELSHIP", uniqueConstraints = {@UniqueConstraint(columnNames = {"GHAS_ID_PM_GROUP_O",
        "GHAS_ID_PM_GROUP_D"})})
public class CevcrPmGroupRelship implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "PGRE_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date pgreDaEndValidity;

    @Column(columnDefinition = "DATE", name = "PGRE_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date pgreDaStartValidity;

    @Column(name = "PGRE_ID_PM_GROUP_RELSHIP", nullable = false, precision = 3, unique = true)
    @Id
    private Long pgreIdPmGroupRelship;

    @Column(length = 40, name = "PGRE_NA_PURPOSE_PM_GROUP", nullable = false)
    private String pgreNaPurposePmGroup;

    @Column(name = "PGRE_NU_SEQUENTIAL_ORDER", precision = 2)
    private Long pgreNuSequentialOrder;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "GHAS_ID_PM_GROUP_O", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcrPmGroup cevcrPmGroup1;
    @JoinColumn(name = "GHAS_ID_PM_GROUP_D", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcrPmGroup cevcrPmGroup2;

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

    public Date getPgreDaEndValidity() {
        if (this.pgreDaEndValidity != null)
            return (Date) this.pgreDaEndValidity.clone ();
        else
            return null;
    }

    public void setPgreDaEndValidity(Date pgreDaEndValidity) {
        if (pgreDaEndValidity != null)
            this.pgreDaEndValidity = (Date) pgreDaEndValidity.clone ();
        else
            this.pgreDaEndValidity = pgreDaEndValidity;
    }

    public Date getPgreDaStartValidity() {
        if (this.pgreDaStartValidity != null)
            return (Date) this.pgreDaStartValidity.clone ();
        else
            return null;
    }

    public void setPgreDaStartValidity(Date pgreDaStartValidity) {
        if (pgreDaStartValidity != null)
            this.pgreDaStartValidity = (Date) pgreDaStartValidity.clone ();
        else
            this.pgreDaStartValidity = pgreDaStartValidity;
    }

    public Long getPgreIdPmGroupRelship() {
        return this.pgreIdPmGroupRelship;
    }

    public void setPgreIdPmGroupRelship(Long pgreIdPmGroupRelship) {
        this.pgreIdPmGroupRelship = pgreIdPmGroupRelship;
    }

    public String getPgreNaPurposePmGroup() {
        return this.pgreNaPurposePmGroup;
    }

    public void setPgreNaPurposePmGroup(String pgreNaPurposePmGroup) {
        this.pgreNaPurposePmGroup = pgreNaPurposePmGroup;
    }

    public Long getPgreNuSequentialOrder() {
        return this.pgreNuSequentialOrder;
    }

    public void setPgreNuSequentialOrder(Long pgreNuSequentialOrder) {
        this.pgreNuSequentialOrder = pgreNuSequentialOrder;
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

    public CevcrPmGroup getCevcrPmGroup1() {
        return this.cevcrPmGroup1;
    }

    public void setCevcrPmGroup1(CevcrPmGroup cevcrPmGroup1) {
        this.cevcrPmGroup1 = cevcrPmGroup1;
    }

    public CevcrPmGroup getCevcrPmGroup2() {
        return this.cevcrPmGroup2;
    }

    public void setCevcrPmGroup2(CevcrPmGroup cevcrPmGroup2) {
        this.cevcrPmGroup2 = cevcrPmGroup2;
    }

}
