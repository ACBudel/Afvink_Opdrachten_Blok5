/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aylachan
 */

import java.util.*;

public class Translator {
    
    private static String Output;
    
    public static String Translate(String Input) {
        Map m1 = new HashMap();
        m1.put("A", "ALA");
        m1.put("R", "ARG");
        m1.put("N", "ASN");
        m1.put("D", "ASP");
        m1.put("C", "CYS");
        m1.put("Q", "GLN");
        m1.put("E", "GLU");
        m1.put("G", "GLY");
        m1.put("H", "HIS");
        m1.put("I", "ILE");
        m1.put("L", "LEU");
        m1.put("K", "LYS");
        m1.put("M", "MET");
        m1.put("F", "PHE");
        m1.put("P", "PRO");
        m1.put("S", "SER");
        m1.put("T", "THR");
        m1.put("W", "TRP");
        m1.put("Y", "TYR");
        m1.put("V", "VAL");
        Output = "";
        for (char I : Input.toCharArray()){
            String In = String.valueOf(I);
            String O = m1.get(In).toString();
            Output+=O;;
        }
        return Output;
    }
    
}
