/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

/**
 *
 * @author Esteban Menendez
 */
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)
public class dtColaboracion {

    private String propuesta, nickname;

//CONSTRUCTOR//
    public dtColaboracion(String propuesta, String nickname) {
        this.propuesta = propuesta;
        this.nickname = nickname;
    }

//GETTERS//
    public String getPropuesta() {
        return propuesta;
    }

    public String getNickname() {
        return nickname;
    }

//SETTERS//
    public void setPropuesta(String propuesta) {
        this.propuesta = propuesta;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    
}
