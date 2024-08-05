package com.ticketera.backticketeradervinsa.domain.enums;

public enum Estado {
    POR_HACER("Por hacer"),
    EN_PROGRESO("En progreso"),
    COMPLETADO("Completado"),
    RECHAZADO("Rechazado");

    private String estado;

    Estado(String estado) {
        this.estado = estado;
    }

}