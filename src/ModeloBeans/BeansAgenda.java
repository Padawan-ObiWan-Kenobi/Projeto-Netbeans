/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBeans;

import java.util.Date;


public class BeansAgenda {
    
    private Integer IDAgenda;
    private String NomeMedico;
    private String NomePaciente;
    private String Turno;
    private Date Data;
    private String Status;
    private String Motivo;
    private String Pesquisar;

    public Integer getIDAgenda() {
        return IDAgenda;
    }

    public void setIDAgenda(Integer IDAgenda) {
        this.IDAgenda = IDAgenda;
    }

    public String getNomeMedico() {
        return NomeMedico;
    }

    public void setNomeMedico(String NomeMedico) {
        this.NomeMedico = NomeMedico;
    }

    public String getNomePaciente() {
        return NomePaciente;
    }

    public void setNomePaciente(String NomePaciente) {
        this.NomePaciente = NomePaciente;
    }

    public String getTurno() {
        return Turno;
    }

    public void setTurno(String Turno) {
        this.Turno = Turno;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getMotivo() {
        return Motivo;
    }

    public void setMotivo(String Motivo) {
        this.Motivo = Motivo;
    }

    public String getPesquisar() {
        return Pesquisar;
    }

    public void setPesquisar(String Pesquisar) {
        this.Pesquisar = Pesquisar;
    }
    
    
}
