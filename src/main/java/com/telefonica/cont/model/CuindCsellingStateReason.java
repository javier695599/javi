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
 * The persistent class for the CuindCsellingStateReasonS database table.
 */
@Entity
@NamedQuery(name = "CuindCsellingStateReason.findAll", query = "SELECT c FROM CuindCsellingStateReason c")
@Table(name = "CUIND_CSELLING_STATE_REASON")
public class CuindCsellingStateReason implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(length = 5, name = "CSCH_CO_CSELLING_STATE_REASON")
    private String cschCoCsellingStateReason;

    @Column(columnDefinition = "DATE", name = "CSCH_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date cschDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CSCH_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date cschDaStartValidity;

    @Column(length = 100, name = "CSCH_DS_CSELLING_STATE_REASON")
    private String cschDsCsellingStateReason;

    @Column(name = "CSCH_ID_CSELLING_STATE_REASON", nullable = false, precision = 3, unique = true)
    @Id
    private Long cschIdCsellingStateReason;

    @Column(name = "CSCH_IN_PRODUCE_RETRY")
    @Convert("BigDecimalBooleanConverter")
    private Boolean cschInProduceRetry;

    @Column(length = 40, name = "CSCH_NA_CSELLING_STATE_REASON", nullable = false)
    private String cschNaCsellingStateReason;

    @Column(name = "CSCH_QU_RETRY_THRESOLD", precision = 2)
    private Long cschQuRetryThresold;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToMany(mappedBy = "cuindCsellingStateReason")
    private List<CordaCsellingStateMove> cordaCsellingStateMoves;
    @OneToMany(mappedBy = "cuindCsellingStateReason")
    private List<CordaCsitemStateMove> cordaCsitemStateMoves;
    @OneToMany(mappedBy = "cuindCsellingStateReason")
    private List<CordaCsitemSubstatMove> cordaCsitemSubstatMoves;
    @JoinColumn(name = "CSCH_ID_CSELLING_STATE_REASONR")
    @ManyToOne(fetch = FetchType.LAZY)
    private CuindCsellingStateReason cuindCsellingStateReason;
    @OneToMany(mappedBy = "cuindCsellingStateReason")
    private List<CuindCsellingStateReason> cuindCsellingStateReasons;
    @OneToMany(mappedBy = "cuindCsellingStateReason")
    private List<CuinrCsellingStateInvolve> cuinrCsellingStateInvolves;
    @OneToMany(mappedBy = "cuindCsellingStateReason")
    private List<CuinrCsellingTypeState> cuinrCsellingTypeStates;

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

    public String getCschCoCsellingStateReason() {
        return this.cschCoCsellingStateReason;
    }

    public void setCschCoCsellingStateReason(String cschCoCsellingStateReason) {
        this.cschCoCsellingStateReason = cschCoCsellingStateReason;
    }

    public Date getCschDaEndValidity() {
        if (this.cschDaEndValidity != null)
            return (Date) this.cschDaEndValidity.clone ();
        else
            return null;
    }

    public void setCschDaEndValidity(Date cschDaEndValidity) {
        if (cschDaEndValidity != null)
            this.cschDaEndValidity = (Date) cschDaEndValidity.clone ();
        else
            this.cschDaEndValidity = cschDaEndValidity;
    }

    public Date getCschDaStartValidity() {
        if (this.cschDaStartValidity != null)
            return (Date) this.cschDaStartValidity.clone ();
        else
            return null;
    }

    public void setCschDaStartValidity(Date cschDaStartValidity) {
        if (cschDaStartValidity != null)
            this.cschDaStartValidity = (Date) cschDaStartValidity.clone ();
        else
            this.cschDaStartValidity = cschDaStartValidity;
    }

    public String getCschDsCsellingStateReason() {
        return this.cschDsCsellingStateReason;
    }

    public void setCschDsCsellingStateReason(String cschDsCsellingStateReason) {
        this.cschDsCsellingStateReason = cschDsCsellingStateReason;
    }

    public Long getCschIdCsellingStateReason() {
        return this.cschIdCsellingStateReason;
    }

    public void setCschIdCsellingStateReason(Long cschIdCsellingStateReason) {
        this.cschIdCsellingStateReason = cschIdCsellingStateReason;
    }

    public Boolean getCschInProduceRetry() {
        return this.cschInProduceRetry;
    }

    public void setCschInProduceRetry(Boolean cschInProduceRetry) {
        this.cschInProduceRetry = cschInProduceRetry;
    }

    public String getCschNaCsellingStateReason() {
        return this.cschNaCsellingStateReason;
    }

    public void setCschNaCsellingStateReason(String cschNaCsellingStateReason) {
        this.cschNaCsellingStateReason = cschNaCsellingStateReason;
    }

    public Long getCschQuRetryThresold() {
        return this.cschQuRetryThresold;
    }

    public void setCschQuRetryThresold(Long cschQuRetryThresold) {
        this.cschQuRetryThresold = cschQuRetryThresold;
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

    public CuindCsellingStateReason getCuindCsellingStateReason() {
        return this.cuindCsellingStateReason;
    }

    public void setCuindCsellingStateReason(CuindCsellingStateReason cuindCsellingStateReason) {
        this.cuindCsellingStateReason = cuindCsellingStateReason;
    }

    public List<CuindCsellingStateReason> getCuindCsellingStateReasons() {
        return this.cuindCsellingStateReasons;
    }

    public void setCuindCsellingStateReasons(List<CuindCsellingStateReason> cuindCsellingStateReasons) {
        this.cuindCsellingStateReasons = cuindCsellingStateReasons;
    }

    public void addCuindCsellingStateReasons(CuindCsellingStateReason cuindCsellingStateReason) {
        if (this.cuindCsellingStateReasons == null)
            this.cuindCsellingStateReasons = new ArrayList<CuindCsellingStateReason> ();
        this.cuindCsellingStateReasons.add ( cuindCsellingStateReason );
    }

    public void removeCuindCsellingStateReasons(CuindCsellingStateReason cuindCsellingStateReasonToRemove) {
        if (cuindCsellingStateReasonToRemove != null)
            this.cuindCsellingStateReasons.remove ( cuindCsellingStateReasonToRemove );
    }

    public List<CuinrCsellingStateInvolve> getCuinrCsellingStateInvolves() {
        return this.cuinrCsellingStateInvolves;
    }

    public void setCuinrCsellingStateInvolves(List<CuinrCsellingStateInvolve> cuinrCsellingStateInvolves) {
        this.cuinrCsellingStateInvolves = cuinrCsellingStateInvolves;
    }

    public void addCuinrCsellingStateInvolves(CuinrCsellingStateInvolve cuinrCsellingStateInvolve) {
        if (this.cuinrCsellingStateInvolves == null)
            this.cuinrCsellingStateInvolves = new ArrayList<CuinrCsellingStateInvolve> ();
        this.cuinrCsellingStateInvolves.add ( cuinrCsellingStateInvolve );
    }

    public void removeCuinrCsellingStateInvolves(CuinrCsellingStateInvolve cuinrCsellingStateInvolveToRemove) {
        if (cuinrCsellingStateInvolveToRemove != null)
            this.cuinrCsellingStateInvolves.remove ( cuinrCsellingStateInvolveToRemove );
    }

    public List<CuinrCsellingTypeState> getCuinrCsellingTypeStates() {
        return this.cuinrCsellingTypeStates;
    }

    public void setCuinrCsellingTypeStates(List<CuinrCsellingTypeState> cuinrCsellingTypeStates) {
        this.cuinrCsellingTypeStates = cuinrCsellingTypeStates;
    }

    public void addCuinrCsellingTypeStates(CuinrCsellingTypeState cuinrCsellingTypeState) {
        if (this.cuinrCsellingTypeStates == null)
            this.cuinrCsellingTypeStates = new ArrayList<CuinrCsellingTypeState> ();
        this.cuinrCsellingTypeStates.add ( cuinrCsellingTypeState );
    }

    public void removeCuinrCsellingTypeStates(CuinrCsellingTypeState cuinrCsellingTypeStateToRemove) {
        if (cuinrCsellingTypeStateToRemove != null)
            this.cuinrCsellingTypeStates.remove ( cuinrCsellingTypeStateToRemove );
    }

}
