
package sistema_operativo.planif_procesos;

import java.util.ArrayList;
import java.util.List;

public class Politica {
    
public void FCFS(ArrayList<procesos> process){

    int maxt=0;
    int bt=0;
    int AA=0;
    List<procesos> colaL=new ArrayList<>(process);
    for (procesos p:process){
        if (p.tiempoArribo>=maxt){
            maxt=p.tiempoArribo;
            bt=p.bursttime;

        
        }
    }
    for (int timer=0;timer<=maxt+bt; timer++){

        for(procesos p: process){

         if(timer==p.getTiempoArribo()){
             p.setEstado("Listo");
             System.out.println(p.id);
             colaL.add(p);
             
         }
         
         for(procesos a:colaL){
             a.setBursttime(a.getBursttime()-1);

             a.setEstado("Ejecutando");
             if (a.bursttime<0){
                 
                 AA=1;
                 break;
             }
             System.out.println(a.id+" BurstTime: "+a.bursttime);
             if(a.bursttime==0){
                 
                 colaL.remove(0);
                 System.out.println(a.getId()+" >> Terminado..");
             }
             break;
         }
       
                 
        if (AA==1){
        break;
        }
        
    }   
    
    }
    
    
    
    for (int i=0; i<=maxt+bt;i++){
        
        
        
        for (procesos p:process){
    }    
    
    
    }



}}


    

