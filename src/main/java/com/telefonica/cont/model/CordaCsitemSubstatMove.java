package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

/**
 * The persistent class for the CordaCsitemSubstatMoveS database table.
 */
@Entity
@NamedQuery(name = "CordaCsitemSubstatMove.findAll", query = "SELECT c FROM CordaCsitemSubstatMove c")
@Table(name = "CORDA_CSITEM_SUBSTAT_MOVE", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "BIIT_ID_CUSTOMER_SELLING_ITEM", "AUDI_TI_CREATION"})})
public class CordaCsitemSubstatMove implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(columnDefinition = "DATE", name = "CSUM_DA_END_VALIDITY")
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csumDaEndValidity;

    @Column(columnDefinition = "DATE", name = "CSUM_DA_START_VALIDITY", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date csumDaStartValidity;

    @Column(name = "CSUM_ID_CSITEM_SUBSTAT_MOVE", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal csumIdCsitemSubstatMove;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumns({
            @JoinColumn(referencedColumnName = "BIIT_ID_CUSTOMER_SELLING_ITEM", nullable = false, name = "BIIT_ID_CUSTOMER_SELLING_ITEM"),
            @JoinColumn(referencedColumnName = "CSIT_ID_CSELLING_ITEM_TYPE", nullable = false, name = "CSIT_ID_CSELLING_ITEM_TYPE")})
    @ManyToOne(fetch = FetchType.LAZY)
    private CordpCustomerSellingItem cordpCustomerSellingItem;
    @JoinColumns({
            @JoinColumn(referencedColumnName = "CSIS_ID_CSELLING_ITEM_STATE", nullable = false,
                    name = "CSIS_ID_CSELLING_ITEM_STATE"),
            @JoinColumn(referencedColumnName = "CSIT_ID_CSELLING_ITEM_TYPE", nullable = false,
                    name = "CSIT_ID_CSELLING_ITEM_TYPE", updatable = false, insertable = false),
            @JoinColumn(referencedColumnName = "CSSB_ID_CSITEM_SUBSTATE", nullable = false,
                    name = "CSSB_ID_CSITEM_SUBSTATE")})
    @ManyToOne(fetch = FetchType.LAZY)
    private CordrCsitemSubstateAsso cordrCsitemSubstateAsso;
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

    public Date getCsumDaEndValidity() {
        if (this.csumDaEndValidity != null)
            return (Date) this.csumDaEndValidity.clone ();
        else
            return null;
    }

    public void setCsumDaEndValidity(Date csumDaEndValidity) {
        if (csumDaEndValidity != null)
            this.csumDaEndValidity = (Date) csumDaEndValidity.clone ();
        else
            this.csumDaEndValidity = csumDaEndValidity;
    }

    public Date getCsumDaStartValidity() {
        if (this.csumDaStartValidity != null)
            return (Date) this.csumDaStartValidity.clone ();
        else
            return null;
    }

    public void setCsumDaStartValidity(Date csumDaStartValidity) {
        if (csumDaStartValidity != null)
            this.csumDaStartValidity = (Date) csumDaStartValidity.clone ();
        else
            this.csumDaStartValidity = csumDaStartValidity;
    }

    public BigDecimal getCsumIdCsitemSubstatMove() {
        return this.csumIdCsitemSubstatMove;
    }

    public void setCsumIdCsitemSubstatMove(BigDecimal csumIdCsitemSubstatMove) {
        this.csumIdCsitemSubstatMove = csumIdCsitemSubstatMove;
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

    public CordpCustomerSellingItem getCordpCustomerSellingItem() {
        return this.cordpCustomerSellingItem;
    }

    public void setCordpCustomerSellingItem(CordpCustomerSellingItem cordpCustomerSellingItem) {
        this.cordpCustomerSellingItem = cordpCustomerSellingItem;
    }

    public CordrCsitemSubstateAsso getCordrCsitemSubstateAsso() {
        return this.cordrCsitemSubstateAsso;
    }

    public void setCordrCsitemSubstateAsso(CordrCsitemSubstateAsso cordrCsitemSubstateAsso) {
        this.cordrCsitemSubstateAsso = cordrCsitemSubstateAsso;
    }

    public CuindCsellingStateReason getCuindCsellingStateReason() {
        return this.cuindCsellingStateReason;
    }

    public void setCuindCsellingStateReason(CuindCsellingStateReason cuindCsellingStateReason) {
        this.cuindCsellingStateReason = cuindCsellingStateReason;
    }

}
