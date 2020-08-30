package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the CuindPortabilityReqStatusS database table.
 */
@Entity
@NamedQuery(name = "CuindPortabilityReqStatus.findAll", query = "SELECT c FROM CuindPortabilityReqStatus c")
@Table(name = "CUIND_PORTABILITY_REQ_STATUS")
public class CuindPortabilityReqStatus implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "PRST_ID_PORT_REQ_STATUS", nullable = false, precision = 2, unique = true)
    @Id
    private Long prstIdPortReqStatus;

    @Column(length = 15, name = "PRST_NA_POR_REQ_STATUS", nullable = false)
    private String prstNaPorReqStatus;

    @OneToMany(mappedBy = "cuindPortabilityReqStatus")
    private List<CuinpPortabilityRequest> cuinpPortabilityRequests;

    public Long getPrstIdPortReqStatus() {
        return this.prstIdPortReqStatus;
    }

    public void setPrstIdPortReqStatus(Long prstIdPortReqStatus) {
        this.prstIdPortReqStatus = prstIdPortReqStatus;
    }

    public String getPrstNaPorReqStatus() {
        return this.prstNaPorReqStatus;
    }

    public void setPrstNaPorReqStatus(String prstNaPorReqStatus) {
        this.prstNaPorReqStatus = prstNaPorReqStatus;
    }

    public List<CuinpPortabilityRequest> getCuinpPortabilityRequests() {
        return this.cuinpPortabilityRequests;
    }

    public void setCuinpPortabilityRequests(List<CuinpPortabilityRequest> cuinpPortabilityRequests) {
        this.cuinpPortabilityRequests = cuinpPortabilityRequests;
    }

    public void addCuinpPortabilityRequests(CuinpPortabilityRequest cuinpPortabilityRequest) {
        if (this.cuinpPortabilityRequests == null)
            this.cuinpPortabilityRequests = new ArrayList<CuinpPortabilityRequest> ();
        this.cuinpPortabilityRequests.add ( cuinpPortabilityRequest );
    }

    public void removeCuinpPortabilityRequests(CuinpPortabilityRequest cuinpPortabilityRequestToRemove) {
        if (cuinpPortabilityRequestToRemove != null)
            this.cuinpPortabilityRequests.remove ( cuinpPortabilityRequestToRemove );
    }

}
