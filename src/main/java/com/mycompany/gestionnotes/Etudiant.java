/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestionnotes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author khali
 */
public class Etudiant {
    private String nom,classe;
    private String remarque="";
    private List<Integer> notes=new ArrayList<Integer>();

    public Etudiant(String nom, String classe) {
        this.nom = nom;
        this.classe = classe;
    }

    public Etudiant() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getRemarque() {
        return remarque;
    }

    public void setRemarque(String remarque) {
        this.remarque = remarque;
    }

    public List<Integer> getNotes() {
        return notes;
    }

    public void setNotes(List<Integer> notes) {
        this.notes = notes;
    }
    
    public void addNote(int note)
    {
    if(note>=0 && note<=20)
    {
    notes.add(note);
    }
    
    }
    public void listerNotes()
    {
    for(int n: notes)
    {
        System.out.println(n);
    }
    
    
    }
    public double moyenne()
    {
        int somme=0;
        int taille=notes.size();
        // la taille de ArrayList
        // [] => length
        // List<> size
    for(int n: notes)
    {
    somme=somme+n;
   // somme+=n;
    
    }
  
    return somme/taille;
    }
    
    
}
