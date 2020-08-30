package com.telefonica.cont.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the CuinaPortaReqHasStepS database table.
 */
@Entity
@NamedQuery(name = "CuinaPortaReqHasStep.findAll", query = "SELECT c FROM CuinaPortaReqHasStep c")
@Table(name = "CUINA_PORTA_REQ_HAS_STEP")
public class CuinaPortaReqHasStep implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "PRHS_DS_MESSAGE", nullable = false)
    @Lob
    private String prhsDsMessage;

    @Column(name = "PRHS_ID_JOB", precision = 19)
    private Long prhsIdJob;

    @Column(name = "PRHS_ID_PORTA_REQ_HAS_STEP", nullable = false, precision = 9, unique = true)
    @GeneratedValue(generator = "CUINA_PORTA_REQ_HAS_STEP_PRHSIDPORTAREQHASSTEP_GENERATOR")
    @Id
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "CUINA_PORTA_REQ_HAS_STEP_PRHSIDPORTAREQHASSTEP_GENERATOR", sequenceName = "CUIN_PORTA_REQ_HAS_ST_SEQ")
    private Long prhsIdPortaReqHasStep;

    @Column(name = "PRHS_ID_STEP", precision = 19)
    private Long prhsIdStep;

    @Column(length = 100, name = "PRHS_NA_STEP_NAME", nullable = false)
    private String prhsNaStepName;

    @Column(length = 15, name = "PRLE_NA_PORTA_REQ_LOG_ERROR")
    private String prleNaPortaReqLogError;

    @Column(length = 4000, name = "PRLR_DS_PORTA_REQ_LOG_ERROR")
    private String prlrDsPortaReqLogError;

    @OneToMany(mappedBy = "cuinaPortaReqHasStep")
    private List<CuinaPortaReqLogError> cuinaPortaReqLogErrors;
    @JoinColumn(name = "PORE_ID_PORTABILITY_REQUEST", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CuinpPortabilityRequest cuinpPortabilityRequest;

    public Timestamp getAudiTiCreation() {
        if (this.audiTiCreation != null)
            return (Timestamp) this.audiTiCreation.clone();
        else
            return null;
    }

    public void setAudiTiCreation(Timestamp audiTiCreation) {
        if (audiTiCreation != null)
            this.audiTiCreation = (Timestamp) audiTiCreation.clone();
        else
            this.audiTiCreation = audiTiCreation;
    }

    public String getPrhsDsMessage() {
        return this.prhsDsMessage;
    }

    public void setPrhsDsMessage(String prhsDsMessage) {
        this.prhsDsMessage = prhsDsMessage;
    }

    public Long getPrhsIdJob() {
        return this.prhsIdJob;
    }

    public void setPrhsIdJob(Long prhsIdJob) {
        this.prhsIdJob = prhsIdJob;
    }

    public Long getPrhsIdPortaReqHasStep() {
        return this.prhsIdPortaReqHasStep;
    }

    public void setPrhsIdPortaReqHasStep(Long prhsIdPortaReqHasStep) {
        this.prhsIdPortaReqHasStep = prhsIdPortaReqHasStep;
    }

    public Long getPrhsIdStep() {
        return this.prhsIdStep;
    }

    public void setPrhsIdStep(Long prhsIdStep) {
        this.prhsIdStep = prhsIdStep;
    }

    public String getPrhsNaStepName() {
        return this.prhsNaStepName;
    }

    public void setPrhsNaStepName(String prhsNaStepName) {
        this.prhsNaStepName = prhsNaStepName;
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

    public List<CuinaPortaReqLogError> getCuinaPortaReqLogErrors() {
        return this.cuinaPortaReqLogErrors;
    }

    public void setCuinaPortaReqLogErrors(List<CuinaPortaReqLogError> cuinaPortaReqLogErrors) {
        this.cuinaPortaReqLogErrors = cuinaPortaReqLogErrors;
    }

    public void addCuinaPortaReqLogErrors(CuinaPortaReqLogError cuinaPortaReqLogError) {
        if (this.cuinaPortaReqLogErrors == null)
            this.cuinaPortaReqLogErrors = new ArrayList<CuinaPortaReqLogError>();
        this.cuinaPortaReqLogErrors.add(cuinaPortaReqLogError);
    }

    public void removeCuinaPortaReqLogErrors(CuinaPortaReqLogError cuinaPortaReqLogErrorToRemove) {
        if (cuinaPortaReqLogErrorToRemove != null)
            this.cuinaPortaReqLogErrors.remove(cuinaPortaReqLogErrorToRemove);
    }

    public CuinpPortabilityRequest getCuinpPortabilityRequest() {
        return this.cuinpPortabilityRequest;
    }

    public void setCuinpPortabilityRequest(CuinpPortabilityRequest cuinpPortabilityRequest) {
        this.cuinpPortabilityRequest = cuinpPortabilityRequest;
    }

}
