package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CevcrOptaskRelationshipS database table.
 */
@Entity
@NamedQuery(name = "CevcrOptaskRelationship.findAll", query = "SELECT c FROM CevcrOptaskRelationship c")
@Table(name = "CEVCR_OPTASK_RELATIONSHIP", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "OPEL_ID_OPLAN_TASK_START", "OPEL_ID_OPLAN_TASK_END"})})
public class CevcrOptaskRelationship implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "OPTR_ID_OPTASK_RELATIONSHIP", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal optrIdOptaskRelationship;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "OPEL_ID_OPLAN_TASK_START", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcpOplanTask cevcpOplanTask1;
    @JoinColumn(name = "OPEL_ID_OPLAN_TASK_END", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcpOplanTask cevcpOplanTask2;

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

    public BigDecimal getOptrIdOptaskRelationship() {
        return this.optrIdOptaskRelationship;
    }

    public void setOptrIdOptaskRelationship(BigDecimal optrIdOptaskRelationship) {
        this.optrIdOptaskRelationship = optrIdOptaskRelationship;
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

    public CevcpOplanTask getCevcpOplanTask1() {
        return this.cevcpOplanTask1;
    }

    public void setCevcpOplanTask1(CevcpOplanTask cevcpOplanTask1) {
        this.cevcpOplanTask1 = cevcpOplanTask1;
    }

    public CevcpOplanTask getCevcpOplanTask2() {
        return this.cevcpOplanTask2;
    }

    public void setCevcpOplanTask2(CevcpOplanTask cevcpOplanTask2) {
        this.cevcpOplanTask2 = cevcpOplanTask2;
    }

}
