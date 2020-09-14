/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Arrays;

/**
 *
 * @author PAVITHRA T
 */
public class permutation {

    /**
Write a Java program to print all permutations of a given string with repetition.
Sample output The given string is: PQR
The permuted strings are: PPP PPQ PPR ... RRP RRQ RRR
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String str="PQR";
      System.out.println("the permutations are");
      permutate(str);
        
        
    }
    static void permutate(String str){
        int length=str.length();
        char data[]=new char[length+1];
        char temp[]=str.toCharArray();
       
        repeat(str,data,length-1,0);
    }
    static void repeat(String str,char[]data,int last,int index){
        int length=str.length();
        for(int i=0;i<length;i++){
            data[index]=str.charAt(i);
            if(index==last)
               System.out.println(new String(data));
            else
                repeat(str,data,last,index+1);
        }
    }
}
    
    

