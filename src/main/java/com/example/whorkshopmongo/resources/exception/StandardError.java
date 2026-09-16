package com.example.whorkshopmongo.resources.exception;

import java.time.Instant;

public class StandardError {

    private Instant instant;
    private Integer status;
    private String error;
    private String messagem;
    private String path;

    public StandardError() {
    }

    public StandardError(Instant instant, Integer status, String error, String messagem, String path) {
        this.instant = instant;
        this.status = status;
        this.error = error;
        this.messagem = messagem;
        this.path = path;
    }

    public Instant getInstant() {
        return instant;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getMessagem() {
        return messagem;
    }

    public void setMessagem(String messagem) {
        this.messagem = messagem;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
