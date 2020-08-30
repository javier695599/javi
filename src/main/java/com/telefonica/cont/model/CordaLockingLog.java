package com.telefonica.cont.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the CordaLockingLogS database table.
 */
@Entity
@NamedQuery(name = "CordaLockingLog.findAll", query = "SELECT c FROM CordaLockingLog c")
@Table(name = "CORDA_LOCKING_LOG")
public class CordaLockingLog implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "BUIN_ID_CUSTOMER_ORDER", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    @Id
    private BigDecimal buinIdCustomerOrder;

    @Column(columnDefinition = "DATE", name = "LLOG_TI_START_DATE", nullable = false)
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date llogTiStartDate;

    @Column(name = "PARO_ID_FUNCTIONAL_ROLE", nullable = false, precision = 38)
    private BigDecimal paroIdFunctionalRole;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "BUIN_ID_CUSTOMER_ORDER")
    private CordpCustomerOrder cordpCustomerOrder;

    public BigDecimal getBuinIdCustomerOrder() {
        return this.buinIdCustomerOrder;
    }

    public void setBuinIdCustomerOrder(BigDecimal buinIdCustomerOrder) {
        this.buinIdCustomerOrder = buinIdCustomerOrder;
    }

    public Date getLlogTiStartDate() {
        if (this.llogTiStartDate != null)
            return (Date) this.llogTiStartDate.clone ();
        else
            return null;
    }

    public void setLlogTiStartDate(Date llogTiStartDate) {
        if (llogTiStartDate != null)
            this.llogTiStartDate = (Date) llogTiStartDate.clone ();
        else
            this.llogTiStartDate = llogTiStartDate;
    }

    public BigDecimal getParoIdFunctionalRole() {
        return this.paroIdFunctionalRole;
    }

    public void setParoIdFunctionalRole(BigDecimal paroIdFunctionalRole) {
        this.paroIdFunctionalRole = paroIdFunctionalRole;
    }

    public CordpCustomerOrder getCordpCustomerOrder() {
        return this.cordpCustomerOrder;
    }

    public void setCordpCustomerOrder(CordpCustomerOrder cordpCustomerOrder) {
        this.cordpCustomerOrder = cordpCustomerOrder;
    }

}
