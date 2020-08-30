package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CordaCsitemStateMoveObS database table.
 */
@Entity
@NamedQuery(name = "CordaCsitemStateMoveOb.findAll", query = "SELECT c FROM CordaCsitemStateMoveOb c")
@Table(name = "CORDA_CSITEM_STATE_MOVE_OB")
public class CordaCsitemStateMoveOb implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "CIOB_ID_CSITEM_STATE_MOVE_OB", nullable = false, precision = 38, unique = true)
    @Id
    private BigDecimal ciobIdCsitemStateMoveOb;

    @Column(length = 500, name = "CIOB_OB_CSITEM_STATE_MOVE_OB", nullable = false)
    private String ciobObCsitemStateMoveOb;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "CIOB_ID_CSITEM_STATE_MOVE_OB")
    private CordaCsitemStateMove cordaCsitemStateMove;

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

    public BigDecimal getCiobIdCsitemStateMoveOb() {
        return this.ciobIdCsitemStateMoveOb;
    }

    public void setCiobIdCsitemStateMoveOb(BigDecimal ciobIdCsitemStateMoveOb) {
        this.ciobIdCsitemStateMoveOb = ciobIdCsitemStateMoveOb;
    }

    public String getCiobObCsitemStateMoveOb() {
        return this.ciobObCsitemStateMoveOb;
    }

    public void setCiobObCsitemStateMoveOb(String ciobObCsitemStateMoveOb) {
        this.ciobObCsitemStateMoveOb = ciobObCsitemStateMoveOb;
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

    public CordaCsitemStateMove getCordaCsitemStateMove() {
        return this.cordaCsitemStateMove;
    }

    public void setCordaCsitemStateMove(CordaCsitemStateMove cordaCsitemStateMove) {
        this.cordaCsitemStateMove = cordaCsitemStateMove;
    }

}
