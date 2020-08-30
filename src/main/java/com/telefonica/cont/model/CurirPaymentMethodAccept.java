package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the CurirPaymentMethodAcceptS database table.
 */
@Entity
@NamedQuery(name = "CurirPaymentMethodAccept.findAll", query = "SELECT c FROM CurirPaymentMethodAccept c")
@Table(name = "CURIR_PAYMENT_METHOD_ACCEPT", uniqueConstraints = {@UniqueConstraint(columnNames = {
        "PMET_ID_PAYMENT_METHOD_TYPE", "RIRC_ID_RISK_RESPONSE_CAUSE"})})
public class CurirPaymentMethodAccept implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "AUDI_TI_CREATION", nullable = false)
    private Timestamp audiTiCreation;

    @Column(name = "AUDI_TI_UPDATE")
    private Timestamp audiTiUpdate;

    @Column(name = "PMET_ID_PAYMENT_METHOD_TYPE", nullable = false, precision = 3)
    private Long pmetIdPaymentMethodType;

    @Column(name = "PMTA_ID_PAYMENT_METHOD_ACCEPT", nullable = false, precision = 7, unique = true)
    @GeneratedValue(generator = "CURIR_PAYMENT_METHOD_ACCEPT_PMTAIDPAYMENTMETHODACCEPT_GENERATOR")
    @Id
    @SequenceGenerator(allocationSize = 1, initialValue = 1, name = "CURIR_PAYMENT_METHOD_ACCEPT_PMTAIDPAYMENTMETHODACCEPT_GENERATOR", sequenceName = "CURI_PAYMENTMETHODACCEPT_SEQ")
    private Long pmtaIdPaymentMethodAccept;

    @Column(name = "RIRC_ID_RISK_RESPONSE_CAUSE", nullable = false, precision = 2)
    private Long rircIdRiskResponseCause;

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

    public Long getPmetIdPaymentMethodType() {
        return this.pmetIdPaymentMethodType;
    }

    public void setPmetIdPaymentMethodType(Long pmetIdPaymentMethodType) {
        this.pmetIdPaymentMethodType = pmetIdPaymentMethodType;
    }

    public Long getPmtaIdPaymentMethodAccept() {
        return this.pmtaIdPaymentMethodAccept;
    }

    public void setPmtaIdPaymentMethodAccept(Long pmtaIdPaymentMethodAccept) {
        this.pmtaIdPaymentMethodAccept = pmtaIdPaymentMethodAccept;
    }

    public Long getRircIdRiskResponseCause() {
        return this.rircIdRiskResponseCause;
    }

    public void setRircIdRiskResponseCause(Long rircIdRiskResponseCause) {
        this.rircIdRiskResponseCause = rircIdRiskResponseCause;
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
