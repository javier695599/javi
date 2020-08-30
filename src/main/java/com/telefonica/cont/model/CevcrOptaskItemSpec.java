package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CevcrOptaskItemSpecS database table.
 */
@Entity
@NamedQuery(name = "CevcrOptaskItemSpec.findAll", query = "SELECT c FROM CevcrOptaskItemSpec c")
@Table(name = "CEVCR_OPTASK_ITEM_SPEC", uniqueConstraints = {@UniqueConstraint(columnNames = {"OPEL_ID_OPLAN_TASK",
        "IWST_ID_IWFLOW_SP_TASK"})})
public class CevcrOptaskItemSpec implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "IWST_ID_IWFLOW_SP_TASK", nullable = false, precision = 10)
    private Long iwstIdIwflowSpTask;

    @Column(name = "OPSH_ID_OPTASK_ITEM_SPEC", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal opshIdOptaskItemSpec;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "OPEL_ID_OPLAN_TASK", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcpOplanTask cevcpOplanTask;

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

    public Long getIwstIdIwflowSpTask() {
        return this.iwstIdIwflowSpTask;
    }

    public void setIwstIdIwflowSpTask(Long iwstIdIwflowSpTask) {
        this.iwstIdIwflowSpTask = iwstIdIwflowSpTask;
    }

    public BigDecimal getOpshIdOptaskItemSpec() {
        return this.opshIdOptaskItemSpec;
    }

    public void setOpshIdOptaskItemSpec(BigDecimal opshIdOptaskItemSpec) {
        this.opshIdOptaskItemSpec = opshIdOptaskItemSpec;
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

}
