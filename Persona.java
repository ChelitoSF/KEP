package com.example.freakdeveloper.kep.model;

public class Persona
{
    private String idPersona;
    private String NickName;
    private String EscActual;
    private String Escingresar;
    private String Email;
    private String Contra;


    public Persona(String idPersona, String NickName, String EscActual, String EscIngresar , String Email , String Contra)
    {

        this.idPersona=idPersona;
        this.NickName=NickName;
        this.EscActual=EscActual;
        this.Escingresar=EscIngresar;
        this.Email = Email;
        this.Contra = Contra;
    }

    public String getContra()
    {
        return Contra;
    }

    public void setContra(String contra) {
        Contra = contra;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }


    public String getEscActual() {
        return EscActual;
    }

    public void setEscActual(String escActual) {
        EscActual = escActual;
    }

    public String getEscingresar() {
        return Escingresar;
    }

    public void setEscingresar(String escingresar) {
        Escingresar = escingresar;
    }
}
