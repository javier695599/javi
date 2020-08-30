package com.telefonica.cont.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The persistent class for the CuinrCoitemRelProdPromotedPKS database table.
 */
@Embeddable
public class CuinrCoitemRelProdPromotedPK implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "BIIT_ID_CUSTOMER_ORDER_ITEM", nullable = false, precision = 38, unique = true)
    private BigDecimal biitIdCustomerOrderItem;

    @Column(name = "PRPD_ID_PRODUCT_PROMOTED", nullable = false, precision = 38, unique = true)
    private BigDecimal prpdIdProductPromoted;

    public BigDecimal getBiitIdCustomerOrderItem() {
        return this.biitIdCustomerOrderItem;
    }

    public BigDecimal getPrpdIdProductPromoted() {
        return this.prpdIdProductPromoted;
    }

    public void setPrpdIdProductPromoted(BigDecimal prpdIdProductPromoted) {
        this.prpdIdProductPromoted = prpdIdProductPromoted;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((biitIdCustomerOrderItem == null) ? 0 : biitIdCustomerOrderItem.hashCode());
        result = prime * result + ((prpdIdProductPromoted == null) ? 0 : prpdIdProductPromoted.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CuinrCoitemRelProdPromotedPK other = (CuinrCoitemRelProdPromotedPK) obj;
        if (biitIdCustomerOrderItem == null) {
            if (other.biitIdCustomerOrderItem != null)
                return false;
        } else if (!biitIdCustomerOrderItem.equals(other.biitIdCustomerOrderItem))
            return false;
        if (prpdIdProductPromoted == null) {
            if (other.prpdIdProductPromoted != null)
                return false;
        } else if (!prpdIdProductPromoted.equals(other.prpdIdProductPromoted))
            return false;
        return true;
    }

}
