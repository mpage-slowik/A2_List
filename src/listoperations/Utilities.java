/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listoperations;

import java.io.*;

/**
 *
 * @author 10000
 */
public class Utilities {
    /**
     * Write the output to the file
     * @param str the final string to be written
     */
    public static void WriteToFile(String str){

        try (BufferedWriter buff =  new BufferedWriter(new FileWriter("./testrun.txt"))) {
                buff.write(str);
            }
        catch (IOException ioe){
            System.out.println("Error writing to file \n" +ioe.getMessage());
        }
       
    }
}
