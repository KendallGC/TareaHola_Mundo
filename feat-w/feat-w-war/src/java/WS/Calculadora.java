/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author kcerv
 */
@WebService(serviceName = "Calculadora")
public class Calculadora {


    @WebMethod(operationName = "Calculadora")
    public int Calculadora(@WebParam(name = "dato") int dato, @WebParam(name = "dato2") int dato2, @WebParam(name = "con") int con) {
        //TODO write your implementation code here:
        int result = 0;
        switch(con){
            case 1:{
                result =  dato-dato2;
            }break;
            case 2:{
           result =  dato+dato2;
            }break;
            case 3:{
            result =  dato*dato2;
            }break;
            default:{
            result= 00;
            }break;
            
        }
        return result;
    }
}
