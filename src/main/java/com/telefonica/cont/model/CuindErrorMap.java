package com.telefonica.cont.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the CuindErrorMapS database table.
 */
@Entity
@NamedQuery(name = "CuindErrorMap.findAll", query = "SELECT c FROM CuindErrorMap c")
@Table(name = "CUIND_ERROR_MAP")
public class CuindErrorMap implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(length = 15, name = "ERMA_CO_APPLICATION_ERROR", nullable = false, unique = true)
    @Id
    private String ermaCoApplicationError;

    @Column(length = 4, name = "ERMA_CO_HTTP_ERROR", nullable = false)
    private String ermaCoHttpError;

    @Column(length = 1000, name = "ERMA_DS_APPLICATION_ERROR", nullable = false)
    private String ermaDsApplicationError;

    public String getErmaCoApplicationError() {
        return this.ermaCoApplicationError;
    }

    public void setErmaCoApplicationError(String ermaCoApplicationError) {
        this.ermaCoApplicationError = ermaCoApplicationError;
    }

    public String getErmaCoHttpError() {
        return this.ermaCoHttpError;
    }

    public void setErmaCoHttpError(String ermaCoHttpError) {
        this.ermaCoHttpError = ermaCoHttpError;
    }

    public String getErmaDsApplicationError() {
        return this.ermaDsApplicationError;
    }

    public void setErmaDsApplicationError(String ermaDsApplicationError) {
        this.ermaDsApplicationError = ermaDsApplicationError;
    }

}
