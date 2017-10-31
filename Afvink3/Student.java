/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afink3.pkg1;

/**
 *
 * @author aylachan
 */
import java.util.Scanner;

public class Student{
    private String Naam;
    private int Studentnummer;
    
    Student(String n, int sn){
        Naam = n;
        Studentnummer = sn;
          
    }
    
    Student(String n){
        Naam = n;
    }
    
    Student(int sn){
        Studentnummer = sn;
    }
    
    public void setStudentNaam(String StudentNaam){
        Naam = StudentNaam;
    }
    
    public void setStudentNummer(int Studentnr){
        Studentnummer = Studentnr;
    }
            
    public void getStudentnaam(){
        System.out.println("Studentnaam is " + Naam);
    } 
    
    public void getStudentnummer(){
        System.out.println("Studentnummer is " + Studentnummer);
    }
            
    public static void main(String[] args) {
        Student s1 = new Student(769200);
        Student s2 = new Student("Klaas", 879039);
        Student s3 = new Student("Jan", 743083);
        Student s4 = new Student("Mart", 987306);
        s1.getStudentnummer();
        s3.getStudentnaam();
    
    
}
