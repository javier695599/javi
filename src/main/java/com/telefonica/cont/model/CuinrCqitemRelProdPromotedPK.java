package com.telefonica.cont.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;

/**
 * The persistent class for the CuinrCqitemRelProdPromotedPKS database table.
 */
@Embeddable
public class CuinrCqitemRelProdPromotedPK implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "BIIT_ID_CUSTOMER_QUOTE_ITEM", nullable = false, precision = 38, unique = true)
    private BigDecimal biitIdCustomerQuoteItem;

    @Column(name = "PRPD_ID_PRODUCT_PROMOTED", nullable = false, precision = 38, unique = true)
    @GeneratedValue(generator = "telco-uuid")
    private BigDecimal prpdIdProductPromoted;

    public void setBiitIdCustomerQuoteItem(BigDecimal biitIdCustomerQuoteItem) {
		this.biitIdCustomerQuoteItem = biitIdCustomerQuoteItem;
	}

	public BigDecimal getBiitIdCustomerQuoteItem() {
        return this.biitIdCustomerQuoteItem;
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
        result = prime * result + ((biitIdCustomerQuoteItem == null) ? 0 : biitIdCustomerQuoteItem.hashCode());
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
        CuinrCqitemRelProdPromotedPK other = (CuinrCqitemRelProdPromotedPK) obj;
        if (biitIdCustomerQuoteItem == null) {
            if (other.biitIdCustomerQuoteItem != null)
                return false;
        } else if (!biitIdCustomerQuoteItem.equals(other.biitIdCustomerQuoteItem))
            return false;
        if (prpdIdProductPromoted == null) {
            if (other.prpdIdProductPromoted != null)
                return false;
        } else if (!prpdIdProductPromoted.equals(other.prpdIdProductPromoted))
            return false;
        return true;
    }

}
