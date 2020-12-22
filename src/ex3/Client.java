/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author Ala Hamadi
 */
import java.rmi.Naming;
import java.util.Scanner;


public class Client {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        try {
            MyInterface service1 = (MyInterface) Naming.lookup("rmi://127.0.0.1:1250/server");
            System.out.println("Entrez votre solde: "); 
            double solde=s.nextDouble();
            service1.lireSolde(solde);
            
            System.out.println("Credit: "); 
            double credit=s.nextDouble();
            solde=service1.crediter(solde,credit);
            service1.lireSolde(solde);
            
            
            System.out.println("débit : "); 
            double debit=s.nextDouble();
            solde=service1.debiter(solde,debit);
            service1.lireSolde(solde);
            
            

        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.toString());
        }
    }

}