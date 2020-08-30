package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the CordaCsellingStateMoveS database table.
 */
@Entity
@NamedQuery(name = "CordaCsellingStateMove.findAll", query = "SELECT c FROM CordaCsellingStateMove c")
@Table(name = "CORDA_CSELLING_STATE_MOVE", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BUIN_ID_CUSTOMER_SELLING", "AUDI_TI_CREATION"})})
public class CordaCsellingStateMove implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "BISM_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date bismDaEndValidity;

    @Column(columnDefinition = "DATE", name = "BISM_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date bismDaStartValidity;

    @Column(name = "CSSM_ID_CSELLING_STATE_MOVE", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal cssmIdCsellingStateMove;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @OneToOne(mappedBy = "cordaCsellingStateMove")
    private CordaCsellingStateMoveOb cordaCsellingStateMoveOb;
    @JoinColumns({
            @JoinColumn(referencedColumnName = "BINT_ID_CSELLING_TYPE", nullable = false,
                    name = "BINT_ID_CSELLING_TYPE"),
            @JoinColumn(referencedColumnName = "BUIN_ID_CUSTOMER_SELLING", nullable = false,
                    name = "BUIN_ID_CUSTOMER_SELLING")})
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpCustomerSelling cordpCustomerSelling;
    @JoinColumns({
            @JoinColumn(referencedColumnName = "BINT_ID_CSELLING_TYPE", nullable = false, name = "BINT_ID_CSELLING_TYPE", updatable = false, insertable = false),
            @JoinColumn(referencedColumnName = "CSST_ID_CUST_SELL_INTE_STATE", nullable = false, name = "CSST_ID_CSELLING_STATE")})
    @ManyToOne(fetch = FetchType.LAZY)
    private CordrCsellingStateRela cordrCsellingStateRela;
    @JoinColumn(name = "CSCH_ID_CSELLING_STATE_REASON")
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

    public Date getBismDaEndValidity() {
        if (this.bismDaEndValidity != null)
            return (Date) this.bismDaEndValidity.clone ();
        else
            return null;
    }

    public void setBismDaEndValidity(Date bismDaEndValidity) {
        if (bismDaEndValidity != null)
            this.bismDaEndValidity = (Date) bismDaEndValidity.clone ();
        else
            this.bismDaEndValidity = bismDaEndValidity;
    }

    public Date getBismDaStartValidity() {
        if (this.bismDaStartValidity != null)
            return (Date) this.bismDaStartValidity.clone ();
        else
            return null;
    }

    public void setBismDaStartValidity(Date bismDaStartValidity) {
        if (bismDaStartValidity != null)
            this.bismDaStartValidity = (Date) bismDaStartValidity.clone ();
        else
            this.bismDaStartValidity = bismDaStartValidity;
    }

    public BigDecimal getCssmIdCsellingStateMove() {
        return this.cssmIdCsellingStateMove;
    }

    public void setCssmIdCsellingStateMove(BigDecimal cssmIdCsellingStateMove) {
        this.cssmIdCsellingStateMove = cssmIdCsellingStateMove;
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

    public CordaCsellingStateMoveOb getCordaCsellingStateMoveOb() {
        return this.cordaCsellingStateMoveOb;
    }

    public void setCordaCsellingStateMoveOb(CordaCsellingStateMoveOb cordaCsellingStateMoveOb) {
        this.cordaCsellingStateMoveOb = cordaCsellingStateMoveOb;
    }

    public CordpCustomerSelling getCordpCustomerSelling() {
        return this.cordpCustomerSelling;
    }

    public void setCordpCustomerSelling(CordpCustomerSelling cordpCustomerSelling) {
        this.cordpCustomerSelling = cordpCustomerSelling;
    }

    public CordrCsellingStateRela getCordrCsellingStateRela() {
        return this.cordrCsellingStateRela;
    }

    public void setCordrCsellingStateRela(CordrCsellingStateRela cordrCsellingStateRela) {
        this.cordrCsellingStateRela = cordrCsellingStateRela;
    }

    public CuindCsellingStateReason getCuindCsellingStateReason() {
        return this.cuindCsellingStateReason;
    }

    public void setCuindCsellingStateReason(CuindCsellingStateReason cuindCsellingStateReason) {
        this.cuindCsellingStateReason = cuindCsellingStateReason;
    }

}
