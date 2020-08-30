package com.telefonica.cont.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * The persistent class for the CuinpGenericQueueS database table.
 */
@Entity
@NamedQuery(name = "CuinpGenericQueue.findAll", query = "SELECT c FROM CuinpGenericQueue c")
@Table(name = "CUINP_GENERIC_QUEUE")
public class CuinpGenericQueue implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(length = 14, name = "GECU_CO_CLASS")
    private String gecuCoClass;

    @Column(name = "GECU_DS_MESSAGE", nullable = false)
    @Lob
    private String gecuDsMessage;

    @Column(name = "GECU_ID_CLASS", nullable = false, precision = 38)
    private BigDecimal gecuIdClass;

    @Column(name = "GECU_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal gecuIdCreatorParty;

    @Column(name = "GECU_ID_GENERIC_QUEUE", nullable = false, precision = 7, unique = true)
    @GeneratedValue(generator = "CUINP_GENERIC_QUEUE_GECUIDGENERICQUEUE_GENERATOR")
    @Id
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "CUINP_GENERIC_QUEUE_GECUIDGENERICQUEUE_GENERATOR", sequenceName = "CUINP_GENERIC_QUEUE_SEQ")
    private Long gecuIdGenericQueue;

    @Column(name = "GECU_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal gecuIdUpdaterParty;

    @Column(name = "GECU_TI_CREATION", nullable = false)
    private Timestamp gecuTiCreation;

    @Column(name = "GECU_TI_UPDATE")
    private Timestamp gecuTiUpdate;

    @JoinColumn(name = "GECT_ID_GENERIC_QUEUE_TYPE", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CuindGenericQueueType cuindGenericQueueType;

    public String getGecuCoClass() {
        return this.gecuCoClass;
    }

    public void setGecuCoClass(String gecuCoClass) {
        this.gecuCoClass = gecuCoClass;
    }

    public String getGecuDsMessage() {
        return this.gecuDsMessage;
    }

    public void setGecuDsMessage(String gecuDsMessage) {
        this.gecuDsMessage = gecuDsMessage;
    }

    public BigDecimal getGecuIdClass() {
        return this.gecuIdClass;
    }

    public void setGecuIdClass(BigDecimal gecuIdClass) {
        this.gecuIdClass = gecuIdClass;
    }

    public BigDecimal getGecuIdCreatorParty() {
        return this.gecuIdCreatorParty;
    }

    public void setGecuIdCreatorParty(BigDecimal gecuIdCreatorParty) {
        this.gecuIdCreatorParty = gecuIdCreatorParty;
    }

    public Long getGecuIdGenericQueue() {
        return this.gecuIdGenericQueue;
    }

    public void setGecuIdGenericQueue(Long gecuIdGenericQueue) {
        this.gecuIdGenericQueue = gecuIdGenericQueue;
    }

    public BigDecimal getGecuIdUpdaterParty() {
        return this.gecuIdUpdaterParty;
    }

    public void setGecuIdUpdaterParty(BigDecimal gecuIdUpdaterParty) {
        this.gecuIdUpdaterParty = gecuIdUpdaterParty;
    }

    public Timestamp getGecuTiCreation() {
        if (this.gecuTiCreation != null)
            return (Timestamp) this.gecuTiCreation.clone();
        else
            return null;
    }

    public void setGecuTiCreation(Timestamp gecuTiCreation) {
        if (gecuTiCreation != null)
            this.gecuTiCreation = (Timestamp) gecuTiCreation.clone();
        else
            this.gecuTiCreation = gecuTiCreation;
    }

    public Timestamp getGecuTiUpdate() {
        if (this.gecuTiUpdate != null)
            return (Timestamp) this.gecuTiUpdate.clone();
        else
            return null;
    }

    public void setGecuTiUpdate(Timestamp gecuTiUpdate) {
        if (gecuTiUpdate != null)
            this.gecuTiUpdate = (Timestamp) gecuTiUpdate.clone();
        else
            this.gecuTiUpdate = gecuTiUpdate;
    }

    public CuindGenericQueueType getCuindGenericQueueType() {
        return this.cuindGenericQueueType;
    }

    public void setCuindGenericQueueType(CuindGenericQueueType cuindGenericQueueType) {
        this.cuindGenericQueueType = cuindGenericQueueType;
    }

}
