/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;

/**
 *
 * @author PAVITHRA T
 */
public class sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,i;String temp="";
        System.out.println("enter the number of students");
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        String names[]=new String[n];
        for( i=0;i<n;i++){
            System.out.println("enter name");
            names[i]=obj.next();
        }
            
        for(i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            if(names[i].compareTo(names[j])>0){
                temp=names[i];
                names[i]=names[j];
                names[j]=temp;
                }
            
             }
        }
        System.out.println(Arrays.toString(names));
        
    
        
        
 }
}
    
    

