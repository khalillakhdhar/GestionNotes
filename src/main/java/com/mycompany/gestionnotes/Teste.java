/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.gestionnotes;

/**
 *
 * @author khali
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Etudiant e1=new Etudiant("e1", "test1");
        e1.addNote(12);
        e1.addNote(14);
        e1.addNote(13);
        e1.decision();
        System.out.println(e1.toString());
        Etudiant e2=new Etudiant("etudiant2", "classe2");
          e2.addNote(2);
        e2.addNote(4);
        e2.addNote(8);
        e2.decision();
        System.err.println(e2.toString());
    }
    
}
