package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CuinrCsellingStateInvolveS database table.
 */
@Entity
@NamedQuery(name = "CuinrCsellingStateInvolve.findAll", query = "SELECT c FROM CuinrCsellingStateInvolve c")
@Table(name = "CUINR_CSELLING_STATE_INVOLVE", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "CSCH_ID_CSELLING_STATE_REASON", "CSIS_ID_CSELLING_ITEM_STATE"})})
public class CuinrCsellingStateInvolve implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "CSSI_ID_CSELLING_STATE_INVOLVE", nullable = false, precision = 6, unique = true)
    @GeneratedValue(generator = "CUINR_CSELLING_STATE_INVOLVE_CSSIIDCSELLINGSTATEINVOLVE_GENERATOR")
    @Id
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "CUINR_CSELLING_STATE_INVOLVE_CSSIIDCSELLINGSTATEINVOLVE_GENERATOR", sequenceName = "CUIN_CSELLSTATEINVOLVES_SEQ")
    private Long cssiIdCsellingStateInvolve;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "CSIS_ID_CSELLING_ITEM_STATE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingItemState corddCsellingItemState;
    @JoinColumn(name = "CSCH_ID_CSELLING_STATE_REASON", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CuindCsellingStateReason cuindCsellingStateReason;

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

    public Long getCssiIdCsellingStateInvolve() {
        return this.cssiIdCsellingStateInvolve;
    }

    public void setCssiIdCsellingStateInvolve(Long cssiIdCsellingStateInvolve) {
        this.cssiIdCsellingStateInvolve = cssiIdCsellingStateInvolve;
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

    public CorddCsellingItemState getCorddCsellingItemState() {
        return this.corddCsellingItemState;
    }

    public void setCorddCsellingItemState(CorddCsellingItemState corddCsellingItemState) {
        this.corddCsellingItemState = corddCsellingItemState;
    }

    public CuindCsellingStateReason getCuindCsellingStateReason() {
        return this.cuindCsellingStateReason;
    }

    public void setCuindCsellingStateReason(CuindCsellingStateReason cuindCsellingStateReason) {
        this.cuindCsellingStateReason = cuindCsellingStateReason;
    }

}
