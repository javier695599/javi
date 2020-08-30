package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the CordrCsitemSubstateAssoS database table.
 */
@Entity
@NamedQuery(name = "CordrCsitemSubstateAsso.findAll", query = "SELECT c FROM CordrCsitemSubstateAsso c")
@Table(name = "CORDR_CSITEM_SUBSTATE_ASSO", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "CSIT_ID_CSELLING_ITEM_TYPE", "CSIS_ID_CSELLING_ITEM_STATE", "CSSB_ID_CSITEM_SUBSTATE"})})
public class CordrCsitemSubstateAsso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "CSUA_ID_CSITEM_SUBSTATE_ASSO", nullable = false, precision = 6, unique = true)
    @GeneratedValue(generator = "CORDR_CSITEM_SUBSTATE_ASSO_CSUAIDCSITEMSUBSTATEASSO_GENERATOR")
    @Id
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "CORDR_CSITEM_SUBSTATE_ASSO_CSUAIDCSITEMSUBSTATEASSO_GENERATOR", sequenceName = "CORD_CSITEMSUBSTATEASSO_SEQ")
    private Long csuaIdCsitemSubstateAsso;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "cordrCsitemSubstateAsso")
    private List<CordaCsitemSubstatMove> cordaCsitemSubstatMoves;
    @JoinColumn(name = "CSSB_ID_CSITEM_SUBSTATE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsitemSubstate corddCsitemSubstate;
    @JoinColumns({
            @JoinColumn(referencedColumnName = "CSIS_ID_CSELLING_ITEM_STATE", nullable = false, name = "CSIS_ID_CSELLING_ITEM_STATE"),
            @JoinColumn(referencedColumnName = "CSIT_ID_CSELLING_ITEM_TYPE", nullable = false, name = "CSIT_ID_CSELLING_ITEM_TYPE")})
    @ManyToOne(fetch = FetchType.LAZY)
    private CordrCsitemTypeAssoc cordrCsitemTypeAssoc;

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

    public Long getCsuaIdCsitemSubstateAsso() {
        return this.csuaIdCsitemSubstateAsso;
    }

    public void setCsuaIdCsitemSubstateAsso(Long csuaIdCsitemSubstateAsso) {
        this.csuaIdCsitemSubstateAsso = csuaIdCsitemSubstateAsso;
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

    public List<CordaCsitemSubstatMove> getCordaCsitemSubstatMoves() {
        return this.cordaCsitemSubstatMoves;
    }

    public void setCordaCsitemSubstatMoves(List<CordaCsitemSubstatMove> cordaCsitemSubstatMoves) {
        this.cordaCsitemSubstatMoves = cordaCsitemSubstatMoves;
    }

    public void addCordaCsitemSubstatMoves(CordaCsitemSubstatMove cordaCsitemSubstatMove) {
        if (this.cordaCsitemSubstatMoves == null)
            this.cordaCsitemSubstatMoves = new ArrayList<CordaCsitemSubstatMove> ();
        this.cordaCsitemSubstatMoves.add ( cordaCsitemSubstatMove );
    }

    public void removeCordaCsitemSubstatMoves(CordaCsitemSubstatMove cordaCsitemSubstatMoveToRemove) {
        if (cordaCsitemSubstatMoveToRemove != null)
            this.cordaCsitemSubstatMoves.remove ( cordaCsitemSubstatMoveToRemove );
    }

    public CorddCsitemSubstate getCorddCsitemSubstate() {
        return this.corddCsitemSubstate;
    }

    public void setCorddCsitemSubstate(CorddCsitemSubstate corddCsitemSubstate) {
        this.corddCsitemSubstate = corddCsitemSubstate;
    }

    public CordrCsitemTypeAssoc getCordrCsitemTypeAssoc() {
        return this.cordrCsitemTypeAssoc;
    }

    public void setCordrCsitemTypeAssoc(CordrCsitemTypeAssoc cordrCsitemTypeAssoc) {
        this.cordrCsitemTypeAssoc = cordrCsitemTypeAssoc;
    }

}
