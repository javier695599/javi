package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CevcrOpelementAfterFinishS database table.
 */
@Entity
@NamedQuery(name = "CevcrOpelementAfterFinish.findAll", query = "SELECT c FROM CevcrOpelementAfterFinish c")
@Table(name = "CEVCR_OPELEMENT_AFTER_FINISH", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "OPEL_ID_ORCH_PLAN_ELEMENT_O", "OPEL_ID_ORCH_PLAN_ELEMENT_D"})})
public class CevcrOpelementAfterFinish implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AFFI_ID_OPELEMENT_AFTER_FINISH", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal affiIdOpelementAfterFinish;

    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "OPEL_ID_ORCH_PLAN_ELEMENT_D", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcpOplanElement cevcpOplanElement1;
    @JoinColumn(name = "OPEL_ID_ORCH_PLAN_ELEMENT_O", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcpOplanElement cevcpOplanElement2;

    public BigDecimal getAffiIdOpelementAfterFinish() {
        return this.affiIdOpelementAfterFinish;
    }

    public void setAffiIdOpelementAfterFinish(BigDecimal affiIdOpelementAfterFinish) {
        this.affiIdOpelementAfterFinish = affiIdOpelementAfterFinish;
    }

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

    public CevcpOplanElement getCevcpOplanElement1() {
        return this.cevcpOplanElement1;
    }

    public void setCevcpOplanElement1(CevcpOplanElement cevcpOplanElement1) {
        this.cevcpOplanElement1 = cevcpOplanElement1;
    }

    public CevcpOplanElement getCevcpOplanElement2() {
        return this.cevcpOplanElement2;
    }

    public void setCevcpOplanElement2(CevcpOplanElement cevcpOplanElement2) {
        this.cevcpOplanElement2 = cevcpOplanElement2;
    }

}
