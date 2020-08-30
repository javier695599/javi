package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * The persistent class for the CuinaPortaReqLogErrorS database table.
 */
@Entity
@NamedQuery(name = "CuinaPortaReqLogError.findAll", query = "SELECT c FROM CuinaPortaReqLogError c")
@Table(name = "CUINA_PORTA_REQ_LOG_ERROR")
public class CuinaPortaReqLogError implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "PRLE_ID_PORTA_REQ_LOG_ERROR", nullable = false, precision = 6, unique = true)
    @GeneratedValue(generator = "CUINA_PORTA_REQ_LOG_ERROR_PRLEIDPORTAREQLOGERROR_GENERATOR")
    @Id
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "CUINA_PORTA_REQ_LOG_ERROR_PRLEIDPORTAREQLOGERROR_GENERATOR", sequenceName = "CUIN_PORTA_REQ_LOG_SEQ")
    private Long prleIdPortaReqLogError;

    @Column(length = 15, name = "PRLE_NA_PORTA_REQ_LOG_ERROR", nullable = false)
    private String prleNaPortaReqLogError;

    @Column(length = 4000, name = "PRLR_DS_PORTA_REQ_LOG_ERROR", nullable = false)
    private String prlrDsPortaReqLogError;

    @JoinColumn(name = "PRHS_ID_PORTA_REQ_HAS_STEP", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CuinaPortaReqHasStep cuinaPortaReqHasStep;

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

    public Long getPrleIdPortaReqLogError() {
        return this.prleIdPortaReqLogError;
    }

    public void setPrleIdPortaReqLogError(Long prleIdPortaReqLogError) {
        this.prleIdPortaReqLogError = prleIdPortaReqLogError;
    }

    public String getPrleNaPortaReqLogError() {
        return this.prleNaPortaReqLogError;
    }

    public void setPrleNaPortaReqLogError(String prleNaPortaReqLogError) {
        this.prleNaPortaReqLogError = prleNaPortaReqLogError;
    }

    public String getPrlrDsPortaReqLogError() {
        return this.prlrDsPortaReqLogError;
    }

    public void setPrlrDsPortaReqLogError(String prlrDsPortaReqLogError) {
        this.prlrDsPortaReqLogError = prlrDsPortaReqLogError;
    }

    public CuinaPortaReqHasStep getCuinaPortaReqHasStep() {
        return this.cuinaPortaReqHasStep;
    }

    public void setCuinaPortaReqHasStep(CuinaPortaReqHasStep cuinaPortaReqHasStep) {
        this.cuinaPortaReqHasStep = cuinaPortaReqHasStep;
    }

}
