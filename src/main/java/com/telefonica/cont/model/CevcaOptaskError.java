package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CevcaOptaskErrorS database table.
 */
@Entity
@NamedQuery(name = "CevcaOptaskError.findAll", query = "SELECT c FROM CevcaOptaskError c")
@Table(name = "CEVCA_OPTASK_ERROR", uniqueConstraints = {@UniqueConstraint(columnNames = {"OPEL_ID_OPLAN_TASK",
        "OPTE_TI_OPTASK_ERROR"})})
public class CevcaOptaskError implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "OPTE_ID_OPTASK_ERROR", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal opteIdOptaskError;

    @Column(length = 500, name = "OPTE_OB_OPTASK_ERROR")
    private String opteObOptaskError;

    @Column(name = "OPTE_TI_OPTASK_ERROR", nullable = false)
    private Timestamp opteTiOptaskError;

    @Column(name = "PWRC_ID_PROC_WFLW_RESULT_CODE", nullable = false, precision = 5)
    private Long pwrcIdProcWflwResultCode;

    @Column(name = "USER_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal userIdCreatorParty;

    @Column(name = "USER_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal userIdUpdaterParty;

    @JoinColumn(name = "OPEL_ID_OPLAN_TASK", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CevcpOplanTask cevcpOplanTask;

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

    public BigDecimal getOpteIdOptaskError() {
        return this.opteIdOptaskError;
    }

    public void setOpteIdOptaskError(BigDecimal opteIdOptaskError) {
        this.opteIdOptaskError = opteIdOptaskError;
    }

    public String getOpteObOptaskError() {
        return this.opteObOptaskError;
    }

    public void setOpteObOptaskError(String opteObOptaskError) {
        this.opteObOptaskError = opteObOptaskError;
    }

    public Timestamp getOpteTiOptaskError() {
        if (this.opteTiOptaskError != null)
            return (Timestamp) this.opteTiOptaskError.clone ();
        else
            return null;
    }

    public void setOpteTiOptaskError(Timestamp opteTiOptaskError) {
        if (opteTiOptaskError != null)
            this.opteTiOptaskError = (Timestamp) opteTiOptaskError.clone ();
        else
            this.opteTiOptaskError = opteTiOptaskError;
    }

    public Long getPwrcIdProcWflwResultCode() {
        return this.pwrcIdProcWflwResultCode;
    }

    public void setPwrcIdProcWflwResultCode(Long pwrcIdProcWflwResultCode) {
        this.pwrcIdProcWflwResultCode = pwrcIdProcWflwResultCode;
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

    public CevcpOplanTask getCevcpOplanTask() {
        return this.cevcpOplanTask;
    }

    public void setCevcpOplanTask(CevcpOplanTask cevcpOplanTask) {
        this.cevcpOplanTask = cevcpOplanTask;
    }

}
