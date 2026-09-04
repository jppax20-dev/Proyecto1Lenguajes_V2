/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cunoc.promptzal_analizadorlexico.afd;

/**
 *
 * @author jpaxt
 */
public enum Estado {
    INICIO,
    EN_PALABRA,
    EN_DIRECTIVA,
    EN_CADENA,
    EN_ENTERO,
    EN_DECIMAL_PUNTO,
    EN_DECIMAL,
    EN_FLECHA,
    EN_COMENTARIO_LINEA,
    EN_COMENTARIO_BLOQUE
}