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
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

    double debiter(double solde, double x)throws RemoteException;
    double crediter(double solde, double x)throws RemoteException;
    void lireSolde(double solde)throws RemoteException;
}