/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ipc1.afd_proyecto1_lenguajes.afd;

/**
 *
 * @author jpaxt
 */
import java.util.Set;

public class TablasLexicas {
    public static final Set<String> PALABRAS_RESERVADAS = Set.of(
            "AGENTE", "contexto", "variable", "EJECUTAR", "EXPORTAR");
    public static final Set<String> COMANDOS_IA = Set.of(
            "PREGUNTAR", "GENERAR", "RESUMIR", "ANALIZAR", "TRADUCIR", "CLASIFICAR", "EXTRAER");
    public static final Set<String> CONECTORES_PALABRA = Set.of(
            "SOBRE", "DESDE", "EN", "COMO");
}