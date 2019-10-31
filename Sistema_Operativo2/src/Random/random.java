/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Random;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class random {
    int rb;
    int a=9991;
    int t=19;
    int z=19;
    int m=10000;
    int b=200*t+z;
    float Xn;
    float A ;
    Connection con=conexion.conectar();
    public double rand() throws SQLException{
        String sql;
        float ran=0;
  
        int rn;   
        try {
            
            sql="SELECT *  FROM random;";
        
              //variable tipo Connection
            PreparedStatement stt=con.prepareStatement(sql);
            ResultSet resul=stt.executeQuery();
            resul.next();
            A=resul.getFloat("semillaactual");

            Xn=((a*A+b)% m);
            ran=Xn/(m-1);
            sql="update random set semillaactual=?";
            PreparedStatement st=con.prepareStatement(sql);
            st.setFloat(1, ran);// consulta preparada llamada SQL
            st.executeUpdate();
        
   
                
        } catch (Exception ex) {
            System.out.println("error fatal");
            
        } 
    
 return ran;       
 }
    
    public int random_burstime1(int A) throws SQLException {
        String sql;
        float ran;
        int rn;
        int rb=0;

            
            rn=(int) ((-A)*Math.log(1-rand())); 
        
        
        return rn;
    }
    
    public int random_burstime(int D,int E) throws SQLException{
        
        float ran;
        int rn;
        int ri=0;
        
            rn=(int) (D+(E-D)*rand()); 
        
        return rn;
    }
        
    public int random_interrupcion(int B,int C) throws SQLException{

        float ran;
        int rn;
        int ri=1 ;
        
            
        rn=(int) (B+(C-B)*rand()); 
        
        return rn;
    }
    
    
}
