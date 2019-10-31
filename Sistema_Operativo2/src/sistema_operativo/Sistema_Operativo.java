/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_operativo;

import Random.random;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import sistema_operativo.planif_procesos.Colas;
import sistema_operativo.planif_procesos.Politica;
import sistema_operativo.planif_procesos.procesos;
/**
 *
 * @author haobr
 */
public class Sistema_Operativo {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    
    public static void main(String[] args) throws SQLException {
        
        int num1= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el num de procesos : "));
        ArrayList<procesos> process=new ArrayList<>();
        for (int i=1; i<=num1;i++){
            procesos abc= new procesos(i);
            process.add(abc);
        }
        System.out.println(process);
            Politica algoritmo = new Politica();
        algoritmo.FCFS(process);
        
        System.out.println(process);        
        }
        
     }
        

     
     
     
     
     
     
     
     
     
    
    
    
    
    

    


