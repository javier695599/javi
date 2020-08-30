package com.telefonica.cont.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the CuinaPhyParameterValueS database table.
 */
@Entity
@NamedQuery(name = "CuinaPhyParameterValue.findAll", query = "SELECT c FROM CuinaPhyParameterValue c")
@Table(name = "CUINA_PHY_PARAMETER_VALUE")
public class CuinaPhyParameterValue implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(length = 150, name = "PHPV_DS_PARAMETER_VALUE", nullable = false)
    private String phpvDsParameterValue;

    @Column(name = "PHPV_ID_CREATOR_PARTY", nullable = false, precision = 38)
    private BigDecimal phpvIdCreatorParty;

    @Column(name = "PHPV_ID_PHY_PARAMETER_VALUE", nullable = false, precision = 2, unique = true)
    @Id
    private Long phpvIdPhyParameterValue;

    @Column(name = "PHPV_ID_UPDATER_PARTY", precision = 38)
    private BigDecimal phpvIdUpdaterParty;

    @Column(length = 50, name = "PHPV_NA_PARAMETER_VALUE", nullable = false)
    private String phpvNaParameterValue;

    @Column(name = "PHPV_TI_CREATION", nullable = false)
    private Timestamp phpvTiCreation;

    @Column(name = "PHPV_TI_UPDATE")
    private Timestamp phpvTiUpdate;

    public String getPhpvDsParameterValue() {
        return this.phpvDsParameterValue;
    }

    public void setPhpvDsParameterValue(String phpvDsParameterValue) {
        this.phpvDsParameterValue = phpvDsParameterValue;
    }

    public BigDecimal getPhpvIdCreatorParty() {
        return this.phpvIdCreatorParty;
    }

    public void setPhpvIdCreatorParty(BigDecimal phpvIdCreatorParty) {
        this.phpvIdCreatorParty = phpvIdCreatorParty;
    }

    public Long getPhpvIdPhyParameterValue() {
        return this.phpvIdPhyParameterValue;
    }

    public void setPhpvIdPhyParameterValue(Long phpvIdPhyParameterValue) {
        this.phpvIdPhyParameterValue = phpvIdPhyParameterValue;
    }

    public BigDecimal getPhpvIdUpdaterParty() {
        return this.phpvIdUpdaterParty;
    }

    public void setPhpvIdUpdaterParty(BigDecimal phpvIdUpdaterParty) {
        this.phpvIdUpdaterParty = phpvIdUpdaterParty;
    }

    public String getPhpvNaParameterValue() {
        return this.phpvNaParameterValue;
    }

    public void setPhpvNaParameterValue(String phpvNaParameterValue) {
        this.phpvNaParameterValue = phpvNaParameterValue;
    }

    public Timestamp getPhpvTiCreation() {
        if (this.phpvTiCreation != null)
            return (Timestamp) this.phpvTiCreation.clone();
        else
            return null;
    }

    public void setPhpvTiCreation(Timestamp phpvTiCreation) {
        if (phpvTiCreation != null)
            this.phpvTiCreation = (Timestamp) phpvTiCreation.clone();
        else
            this.phpvTiCreation = phpvTiCreation;
    }

    public Timestamp getPhpvTiUpdate() {
        if (this.phpvTiUpdate != null)
            return (Timestamp) this.phpvTiUpdate.clone();
        else
            return null;
    }

    public void setPhpvTiUpdate(Timestamp phpvTiUpdate) {
        if (phpvTiUpdate != null)
            this.phpvTiUpdate = (Timestamp) phpvTiUpdate.clone();
        else
            this.phpvTiUpdate = phpvTiUpdate;
    }

}
