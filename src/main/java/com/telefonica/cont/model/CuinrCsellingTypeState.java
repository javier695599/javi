package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CuinrCsellingTypeStateS database table.
 */
@Entity
@NamedQuery(name = "CuinrCsellingTypeState.findAll", query = "SELECT c FROM CuinrCsellingTypeState c")
@Table(name = "CUINR_CSELLING_TYPE_STATE", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "CSCH_ID_CSELLING_STATE_REASON", "CSST_ID_CSELLING_STATE"})})
public class CuinrCsellingTypeState implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "CSRE_ID_CSELLING_TYPE_STATE", nullable = false, precision = 6, unique = true)
    @GeneratedValue(generator = "CUINR_CSELLING_TYPE_STATE_CSREIDCSELLINGTYPESTATE_GENERATOR")
    @Id
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "CUINR_CSELLING_TYPE_STATE_CSREIDCSELLINGTYPESTATE_GENERATOR", sequenceName = "CUIN_CSCHSTATEREASONAPPL_SEQ")
    private Long csreIdCsellingTypeState;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "CSST_ID_CSELLING_STATE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingState corddCsellingState;
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

    public Long getCsreIdCsellingTypeState() {
        return this.csreIdCsellingTypeState;
    }

    public void setCsreIdCsellingTypeState(Long csreIdCsellingTypeState) {
        this.csreIdCsellingTypeState = csreIdCsellingTypeState;
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

    public CorddCsellingState getCorddCsellingState() {
        return this.corddCsellingState;
    }

    public void setCorddCsellingState(CorddCsellingState corddCsellingState) {
        this.corddCsellingState = corddCsellingState;
    }

    public CuindCsellingStateReason getCuindCsellingStateReason() {
        return this.cuindCsellingStateReason;
    }

    public void setCuindCsellingStateReason(CuindCsellingStateReason cuindCsellingStateReason) {
        this.cuindCsellingStateReason = cuindCsellingStateReason;
    }

}
