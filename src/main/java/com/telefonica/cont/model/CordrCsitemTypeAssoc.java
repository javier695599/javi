package com.telefonica.cont.model;

import org.eclipse.persistence.annotations.Convert;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the CordrCsitemTypeAssocS database table.
 */
@Entity
@NamedQuery(name = "CordrCsitemTypeAssoc.findAll", query = "SELECT c FROM CordrCsitemTypeAssoc c")
@Table(name = "CORDR_CSITEM_TYPE_ASSOC", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "CSIT_ID_CSELLING_ITEM_TYPE", "CSIS_ID_CSELLING_ITEM_STATE"})})
public class CordrCsitemTypeAssoc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "CTYA_ID_CSITEM_TYPE_ASSOC", nullable = false, precision = 3, unique = true)
    @GeneratedValue(generator = "CORDR_CSITEM_TYPE_ASSOC_CTYAIDCSITEMTYPEASSOC_GENERATOR")
    @Id
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "CORDR_CSITEM_TYPE_ASSOC_CTYAIDCSITEMTYPEASSOC_GENERATOR", sequenceName = "CTYA_CUSTSELLITTYPEASSO_SEQ")
    private Long ctyaIdCsitemTypeAssoc;

    @Column(name = "CTYA_IN_FINAL_STATE", nullable = false)
    @Convert("BigDecimalBooleanConverter")
    private Boolean ctyaInFinalState;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "cordrCsitemTypeAssoc")
    private List<CordaCsitemStateMove> cordaCsitemStateMoves;
    @JoinColumn(name = "CSIS_ID_CSELLING_ITEM_STATE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingItemState corddCsellingItemState;
    @JoinColumn(name = "CSIT_ID_CSELLING_ITEM_TYPE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingItemType corddCsellingItemType;
    @OneToMany(mappedBy = "cordrCsitemTypeAssoc")
    private List<CordrCsitemSubstateAsso> cordrCsitemSubstateAssos;

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

    public Long getCtyaIdCsitemTypeAssoc() {
        return this.ctyaIdCsitemTypeAssoc;
    }

    public void setCtyaIdCsitemTypeAssoc(Long ctyaIdCsitemTypeAssoc) {
        this.ctyaIdCsitemTypeAssoc = ctyaIdCsitemTypeAssoc;
    }

    public Boolean getCtyaInFinalState() {
        return this.ctyaInFinalState;
    }

    public void setCtyaInFinalState(Boolean ctyaInFinalState) {
        this.ctyaInFinalState = ctyaInFinalState;
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

    public List<CordaCsitemStateMove> getCordaCsitemStateMoves() {
        return this.cordaCsitemStateMoves;
    }

    public void setCordaCsitemStateMoves(List<CordaCsitemStateMove> cordaCsitemStateMoves) {
        this.cordaCsitemStateMoves = cordaCsitemStateMoves;
    }

    public void addCordaCsitemStateMoves(CordaCsitemStateMove cordaCsitemStateMove) {
        if (this.cordaCsitemStateMoves == null)
            this.cordaCsitemStateMoves = new ArrayList<CordaCsitemStateMove> ();
        this.cordaCsitemStateMoves.add ( cordaCsitemStateMove );
    }

    public void removeCordaCsitemStateMoves(CordaCsitemStateMove cordaCsitemStateMoveToRemove) {
        if (cordaCsitemStateMoveToRemove != null)
            this.cordaCsitemStateMoves.remove ( cordaCsitemStateMoveToRemove );
    }

    public CorddCsellingItemState getCorddCsellingItemState() {
        return this.corddCsellingItemState;
    }

    public void setCorddCsellingItemState(CorddCsellingItemState corddCsellingItemState) {
        this.corddCsellingItemState = corddCsellingItemState;
    }

    public CorddCsellingItemType getCorddCsellingItemType() {
        return this.corddCsellingItemType;
    }

    public void setCorddCsellingItemType(CorddCsellingItemType corddCsellingItemType) {
        this.corddCsellingItemType = corddCsellingItemType;
    }

    public List<CordrCsitemSubstateAsso> getCordrCsitemSubstateAssos() {
        return this.cordrCsitemSubstateAssos;
    }

    public void setCordrCsitemSubstateAssos(List<CordrCsitemSubstateAsso> cordrCsitemSubstateAssos) {
        this.cordrCsitemSubstateAssos = cordrCsitemSubstateAssos;
    }

    public void addCordrCsitemSubstateAssos(CordrCsitemSubstateAsso cordrCsitemSubstateAsso) {
        if (this.cordrCsitemSubstateAssos == null)
            this.cordrCsitemSubstateAssos = new ArrayList<CordrCsitemSubstateAsso> ();
        this.cordrCsitemSubstateAssos.add ( cordrCsitemSubstateAsso );
    }

    public void removeCordrCsitemSubstateAssos(CordrCsitemSubstateAsso cordrCsitemSubstateAssoToRemove) {
        if (cordrCsitemSubstateAssoToRemove != null)
            this.cordrCsitemSubstateAssos.remove ( cordrCsitemSubstateAssoToRemove );
    }

}
