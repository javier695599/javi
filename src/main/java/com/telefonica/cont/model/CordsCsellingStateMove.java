package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the CordsCsellingStateMoveS database table.
 */
@Entity
@NamedQuery(name = "CordsCsellingStateMove.findAll", query = "SELECT c FROM CordsCsellingStateMove c")
@Table(name = "CORDS_CSELLING_STATE_MOVE", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BUIN_ID_CUSTOMER_SELLING", "AUDI_TI_CREATION"})})
public class CordsCsellingStateMove implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "BINT_ID_CSELLING_TYPE", nullable = false, precision = 3)
    private Long bintIdCsellingType;

    @Column(columnDefinition = "DATE", name = "BISM_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date bismDaEndValidity;

    @Column(columnDefinition = "DATE", name = "BISM_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date bismDaStartValidity;

    @Column(name = "BUIN_ID_CUSTOMER_SELLING", nullable = false, precision = 38)
    private BigDecimal buinIdCustomerSelling;

    @Column(name = "CSCH_ID_CSELLING_STATE_REASON", precision = 3)
    private Long cschIdCsellingStateReason;

    @Column(name = "CSSM_ID_CSELLING_STATE_MOVE", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal cssmIdCsellingStateMove;

    @Column(name = "CSST_ID_CSELLING_STATE", nullable = false, precision = 3)
    private Long csstIdCsellingState;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

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

    public Long getBintIdCsellingType() {
        return this.bintIdCsellingType;
    }

    public void setBintIdCsellingType(Long bintIdCsellingType) {
        this.bintIdCsellingType = bintIdCsellingType;
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

    public BigDecimal getBuinIdCustomerSelling() {
        return this.buinIdCustomerSelling;
    }

    public void setBuinIdCustomerSelling(BigDecimal buinIdCustomerSelling) {
        this.buinIdCustomerSelling = buinIdCustomerSelling;
    }

    public Long getCschIdCsellingStateReason() {
        return this.cschIdCsellingStateReason;
    }

    public void setCschIdCsellingStateReason(Long cschIdCsellingStateReason) {
        this.cschIdCsellingStateReason = cschIdCsellingStateReason;
    }

    public BigDecimal getCssmIdCsellingStateMove() {
        return this.cssmIdCsellingStateMove;
    }

    public void setCssmIdCsellingStateMove(BigDecimal cssmIdCsellingStateMove) {
        this.cssmIdCsellingStateMove = cssmIdCsellingStateMove;
    }

    public Long getCsstIdCsellingState() {
        return this.csstIdCsellingState;
    }

    public void setCsstIdCsellingState(Long csstIdCsellingState) {
        this.csstIdCsellingState = csstIdCsellingState;
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

}
