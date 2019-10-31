/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_operativo.planif_procesos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author haobr
 */
public class Colas {
    ArrayList<procesos> ColaDeListos =new ArrayList<procesos>();


 public void ColaListos(ArrayList<procesos> process,int time){
    
     for(procesos p: process){
         if(time==p.tiempoArribo){
             ColaDeListos.add(p);
         
         }
         
     }
   
 }}
