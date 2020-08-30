package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CordaCsellingStateMoveObS database table.
 */
@Entity
@NamedQuery(name = "CordaCsellingStateMoveOb.findAll", query = "SELECT c FROM CordaCsellingStateMoveOb c")
@Table(name = "CORDA_CSELLING_STATE_MOVE_OB")
public class CordaCsellingStateMoveOb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "CSOB_ID_CSELLING_STATE_MOVE_OB", nullable = false, precision = 38, unique = true)
    @Id
    private BigDecimal csobIdCsellingStateMoveOb;

    @Column(length = 500, name = "CSOB_OB_CSELLING_STATE_MOVE_OB", nullable = false)
    private String csobObCsellingStateMoveOb;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "CSOB_ID_CSELLING_STATE_MOVE_OB")
    private CordaCsellingStateMove cordaCsellingStateMove;

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

    public BigDecimal getCsobIdCsellingStateMoveOb() {
        return this.csobIdCsellingStateMoveOb;
    }

    public void setCsobIdCsellingStateMoveOb(BigDecimal csobIdCsellingStateMoveOb) {
        this.csobIdCsellingStateMoveOb = csobIdCsellingStateMoveOb;
    }

    public String getCsobObCsellingStateMoveOb() {
        return this.csobObCsellingStateMoveOb;
    }

    public void setCsobObCsellingStateMoveOb(String csobObCsellingStateMoveOb) {
        this.csobObCsellingStateMoveOb = csobObCsellingStateMoveOb;
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

    public CordaCsellingStateMove getCordaCsellingStateMove() {
        return this.cordaCsellingStateMove;
    }

    public void setCordaCsellingStateMove(CordaCsellingStateMove cordaCsellingStateMove) {
        this.cordaCsellingStateMove = cordaCsellingStateMove;
    }

}
