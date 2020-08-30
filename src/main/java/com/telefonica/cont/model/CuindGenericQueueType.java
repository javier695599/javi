package com.telefonica.cont.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the CuindGenericQueueTypeS database table.
 */
@Entity
@NamedQuery(name = "CuindGenericQueueType.findAll", query = "SELECT c FROM CuindGenericQueueType c")
@Table(name = "CUIND_GENERIC_QUEUE_TYPE")
public class CuindGenericQueueType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "GECT_ID_GENERIC_QUEUE_TYPE", nullable = false, precision = 2, unique = true)
    @Id
    private Long gectIdGenericQueueType;

    @Column(length = 50, name = "GECT_NA_GENERIC_QUEUE_TYPE", nullable = false)
    private String gectNaGenericQueueType;

    @OneToMany(mappedBy = "cuindGenericQueueType")
    private List<CuinpGenericQueue> cuinpGenericQueues;

    public Long getGectIdGenericQueueType() {
        return this.gectIdGenericQueueType;
    }

    public void setGectIdGenericQueueType(Long gectIdGenericQueueType) {
        this.gectIdGenericQueueType = gectIdGenericQueueType;
    }

    public String getGectNaGenericQueueType() {
        return this.gectNaGenericQueueType;
    }

    public void setGectNaGenericQueueType(String gectNaGenericQueueType) {
        this.gectNaGenericQueueType = gectNaGenericQueueType;
    }

    public List<CuinpGenericQueue> getCuinpGenericQueues() {
        return this.cuinpGenericQueues;
    }

    public void setCuinpGenericQueues(List<CuinpGenericQueue> cuinpGenericQueues) {
        this.cuinpGenericQueues = cuinpGenericQueues;
    }

    public void addCuinpGenericQueues(CuinpGenericQueue cuinpGenericQueue) {
        if (this.cuinpGenericQueues == null)
            this.cuinpGenericQueues = new ArrayList<CuinpGenericQueue>();
        this.cuinpGenericQueues.add(cuinpGenericQueue);
    }

    public void removeCuinpGenericQueues(CuinpGenericQueue cuinpGenericQueueToRemove) {
        if (cuinpGenericQueueToRemove != null)
            this.cuinpGenericQueues.remove(cuinpGenericQueueToRemove);
    }

}
