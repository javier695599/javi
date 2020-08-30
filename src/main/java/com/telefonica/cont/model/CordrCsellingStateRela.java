package com.telefonica.cont.model;

import org.eclipse.persistence.annotations.Convert;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the CordrCsellingStateRelaS database table.
 */
@Entity
@NamedQuery(name = "CordrCsellingStateRela.findAll", query = "SELECT c FROM CordrCsellingStateRela c")
@Table(name = "CORDR_CSELLING_STATE_RELA", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BINT_ID_CSELLING_TYPE", "CSST_ID_CUST_SELL_INTE_STATE"})})
public class CordrCsellingStateRela implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "CSSR_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date cssrDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CSSR_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date cssrDaStartValidity;

    @Column(name = "CSSR_ID_CSELLING_STATE_RELA", nullable = false, precision = 3, unique = true)
    @GeneratedValue(generator = "CORDR_CSELLING_STATE_RELA_CSSRIDCSELLINGSTATERELA_GENERATOR")
    @Id
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "CORDR_CSELLING_STATE_RELA_CSSRIDCSELLINGSTATERELA_GENERATOR", sequenceName = "CSSR_CUSTSELLSTATERELA_SEQ")
    private Long cssrIdCsellingStateRela;

    @Column(name = "CSSR_IN_FINAL_STATE", nullable = false)
    @Convert("BigDecimalBooleanConverter")
    private Boolean cssrInFinalState;

    @Column(name = "CSSR_IN_VIEWABLE")
    @Convert("BigDecimalBooleanConverter")
    private Boolean cssrInViewable;

    @Column(name = "CSSR_NU_ORDER_VIEWABLE", precision = 3)
    private Long cssrNuOrderViewable;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "cordrCsellingStateRela")
    private List<CordaCsellingStateMove> cordaCsellingStateMoves;
    @JoinColumn(name = "CSST_ID_CUST_SELL_INTE_STATE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingState corddCsellingState;
    @JoinColumn(name = "BINT_ID_CSELLING_TYPE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CorddCsellingType corddCsellingType;

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

    public Date getCssrDaEndValidity() {
        if (this.cssrDaEndValidity != null)
            return (Date) this.cssrDaEndValidity.clone ();
        else
            return null;
    }

    public void setCssrDaEndValidity(Date cssrDaEndValidity) {
        if (cssrDaEndValidity != null)
            this.cssrDaEndValidity = (Date) cssrDaEndValidity.clone ();
        else
            this.cssrDaEndValidity = cssrDaEndValidity;
    }

    public Date getCssrDaStartValidity() {
        if (this.cssrDaStartValidity != null)
            return (Date) this.cssrDaStartValidity.clone ();
        else
            return null;
    }

    public void setCssrDaStartValidity(Date cssrDaStartValidity) {
        if (cssrDaStartValidity != null)
            this.cssrDaStartValidity = (Date) cssrDaStartValidity.clone ();
        else
            this.cssrDaStartValidity = cssrDaStartValidity;
    }

    public Long getCssrIdCsellingStateRela() {
        return this.cssrIdCsellingStateRela;
    }

    public void setCssrIdCsellingStateRela(Long cssrIdCsellingStateRela) {
        this.cssrIdCsellingStateRela = cssrIdCsellingStateRela;
    }

    public Boolean getCssrInFinalState() {
        return this.cssrInFinalState;
    }

    public void setCssrInFinalState(Boolean cssrInFinalState) {
        this.cssrInFinalState = cssrInFinalState;
    }

    public Boolean getCssrInViewable() {
        return this.cssrInViewable;
    }

    public void setCssrInViewable(Boolean cssrInViewable) {
        this.cssrInViewable = cssrInViewable;
    }

    public Long getCssrNuOrderViewable() {
        return this.cssrNuOrderViewable;
    }

    public void setCssrNuOrderViewable(Long cssrNuOrderViewable) {
        this.cssrNuOrderViewable = cssrNuOrderViewable;
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

    public List<CordaCsellingStateMove> getCordaCsellingStateMoves() {
        return this.cordaCsellingStateMoves;
    }

    public void setCordaCsellingStateMoves(List<CordaCsellingStateMove> cordaCsellingStateMoves) {
        this.cordaCsellingStateMoves = cordaCsellingStateMoves;
    }

    public void addCordaCsellingStateMoves(CordaCsellingStateMove cordaCsellingStateMove) {
        if (this.cordaCsellingStateMoves == null)
            this.cordaCsellingStateMoves = new ArrayList<CordaCsellingStateMove> ();
        this.cordaCsellingStateMoves.add ( cordaCsellingStateMove );
    }

    public void removeCordaCsellingStateMoves(CordaCsellingStateMove cordaCsellingStateMoveToRemove) {
        if (cordaCsellingStateMoveToRemove != null)
            this.cordaCsellingStateMoves.remove ( cordaCsellingStateMoveToRemove );
    }

    public CorddCsellingState getCorddCsellingState() {
        return this.corddCsellingState;
    }

    public void setCorddCsellingState(CorddCsellingState corddCsellingState) {
        this.corddCsellingState = corddCsellingState;
    }

    public CorddCsellingType getCorddCsellingType() {
        return this.corddCsellingType;
    }

    public void setCorddCsellingType(CorddCsellingType corddCsellingType) {
        this.corddCsellingType = corddCsellingType;
    }

}
