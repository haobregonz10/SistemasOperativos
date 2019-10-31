/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_operativo.planif_procesos;

import Random.random;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author haobr
 */



public class procesos {

        int bursttime;
        int interrupciones;
        int prioridad;
        int id;
        int peso;
        int periodoInterrupcion;
        String estado;
        int tiempoArribo;
        
    public procesos(int id) throws SQLException {
        random r=new random();
        this.tiempoArribo=r.random_burstime1(5);
        this.bursttime =r.random_burstime(21,100);
        this.interrupciones = r.random_interrupcion(5,20);
        this.prioridad = r.random_burstime1(20);
        this.id = id;
        this.peso = r.random_burstime1(50);
        this.periodoInterrupcion = this.bursttime/this.interrupciones;
        this.estado = "iniciado";
    }

    public int getTiempoArribo() {
        return tiempoArribo;
    }

    public void setTiempoArribo(int tiempoArribo) {
        this.tiempoArribo = tiempoArribo;
    }

    public int getBursttime() {
        return bursttime;
    }

    public void setBursttime(int bursttime) {
        this.bursttime = bursttime;
    }

    public int getInterrupciones() {
        return interrupciones;
    }

    public void setInterrupciones(int interrupciones) {
        this.interrupciones = interrupciones;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getPeriodoInterrupcion() {
        return periodoInterrupcion;
    }

    public void setPeriodoInterrupcion(int periodoInterrupcion) {
        this.periodoInterrupcion = periodoInterrupcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
       

    
    
    
    
    
    @Override
    public String toString() {
        return "procesos{" + "bursttime=" + bursttime + ", interrupciones=" + interrupciones + ", prioridad=" + prioridad + ", id=" + id + ", peso=" + peso + ", periodoInterrupcion=" + periodoInterrupcion + ", estado=" + estado + "Tiempo Arribo: "+ tiempoArribo+ '}';
    }

}
