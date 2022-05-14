
/********************************************************************
           Copyright (C) 2022 Daniel Andino Camacho

 This program is free software; you can redistribute it and/or modify
 it under the terms of the LGPL GNU General Public License as 
 published by the Free Software Foundation; either version 3 of the 
 License, or (at your option) any later version.

 This program can be distributed, copied and/or modified by referring
 to its author name and email address. 
 
 Created by Daniel Andino Camacho 
 Email address is hellotecnologic@gmail.com  

********************************************************************/

package Database;

import File.File;

class WriteData {
   
    private File file = new File();
    
    private String index = "";
    
    private String wp = "";
    
    private String wps = "";
    
    private String dir = "";
    
    public boolean setEncriptFile(String urlfile){
        if(!file.isExitsFile(urlfile))return false; dir = urlfile;
        return true;
    }
    
    protected boolean createdDataBase(String url,String name,String author,String gmail,String password){
        
        Encript encript = new Encript(dir);
        
        String w = encript.encript("@Code:0x67e") + "\n";
        
        if(!password.equals("")) w += encript.encript("@Password:" + password) + "\n";
        else w += encript.encript("@Password:null") + "\n";
        
        if(!name.equals(""))w += encript.encript("@Name:" + name) + "\n";
        else w += encript.encript("@Name:JDataBase") + "\n";
        
        if(!author.equals(""))w += encript.encript("@Author:" + author) + "\n";
        else w += encript.encript("@Author:null") + "\n";
                
        if(!gmail.equals(""))w += encript.encript("@Gmail:" + gmail) + "\n";
        else w += encript.encript("@Gmail:null") + "\n";
        
        if(file.isExitsFile(url))return false;
        
        //System.out.println("PRINT: \n" + w);
        
        if(!url.equals("")){
            file.write(w, url);
            file.write("###########################JDataKey############################\n"
                     + "Se creo database :" + url + "\n"
                     + "Version v1.0\n"
                     + "Author: " + author + "\n"
                     + "Name database: " + name + "\n"
                     + "Gmail: " + gmail + "\n"
                     + "Password: " + "**********\n" 
                     + "###############################################################\n"
                     + "JDataKey creado por Daniel Andino Camacho.\n"
                     + "JDataKey es un sistema de base de datos de tipo: clave y valor\n"
                     + "simple pero potente ,sistema de encriptamiento de datos creado\n"
                     + "por el desarrollador de JDataKey. Si quieres contribuir con\n"
                     + "el desarrollo de la libreria. o necesitas contactar puedes\n"
                     + "hacerlo mediante el correo \"hellotecnologic@gmail.com\"\n"
                     + "###############################################################", 
            file.getDir(url) + "DATABASE.txt");
        }
        
        else return false; return true;
        
    }
    
    protected boolean writeNewKey(String namekey,String value,String url){
        
        Encript encript = new Encript(dir);
        
        String w = encript.encript("K:" + namekey + " V:" + value) + "\n";
        
        if(!file.isExitsFile(url))return false;
        
        if(url.equals(""))return false;
        
        //System.out.println("\nPRINT KEY: \n" + w);
        
        //System.out.println("\nPRINT KEY Desncript: \n" + encript.desencript(w.substring(0,w.length() - 1)));
        
        String r = file.read(url) + "\n" + w;
        
        file.write(r, url); return true;
        
    }
    
    protected boolean modifiedKey(String namekey,String value,String url){
        
        Encript encript = new Encript(dir);
        
        if(!getFindKey("K:" + namekey, url)){ return writeNewKey(namekey, value, url);}
        
        /*System.out.println("\nVAL: " + index);
        System.out.println("\nVAL WP: \n\n" + wp);
        System.out.println("VAL WPS: " + wps);*/
        
        String des = encript.desencript(index);
        
        String newdes = encript.encript(des.substring(0,2) + namekey + des.substring(namekey.length() + 2,des.length()).substring(0,3) + value);
        
        //System.out.println("VAL: " + newdes);
        
        file.write(wp + newdes + wps, url);
        
        return true; 
        
    }
    
    private boolean getFindKey(String namekey, String url){
        
        Encript encript = new Encript(dir);
        
        if(namekey.equals("")) return false;
        String r = file.read(url);
        int index = r.indexOf(encript.encript(namekey)); 
        if(index == -1)return false;
        int indx = r.indexOf("\n",index);
        if(indx == -1) this.index = r.substring(index,r.length());
        else {
            this.index = r.substring(index,indx);
            wps = r.substring(indx,r.length());
        }
        this.wp = r.substring(0,index);
        return true;
    
    }
    
    protected boolean deleteKey(String namekey,String url){
        
        Encript encript = new Encript(dir);
        
        if(!file.isExitsFile(url)) return false;
        if(!getFindKey("K:" + namekey, url))return false;
        
        String wr = "";
        
        if(!wps.equals("")){
        if(wps.substring(0,1).equals("\n")) wr = wp + wps.substring(1,wps.length());
        } else wr = wp + wps;
        
        //System.out.println("D: \n" + wr);
        file.write(wr, url);
        
        return true;
        
    }
    
    protected boolean managerPassword(String url,String pActual,String pA, String pN){
        
        Encript encript = new Encript(dir);
        
        if(!pActual.equals(pA) || url.equals(""))return false;
        
        String wrp = "";
        
        getFindKey("@Password:" + pActual,url);
        
        wrp = wp + encript.encript("@Password:" + pN) + wps;
        
        file.write(wrp, url); 
        
        Dat d = new Dat(url,dir);
        
        d.setPassword(pN);
        
        return true;
        
    }
    
    protected boolean managerCredenciales(String a,String url,String cred,String k){
        
        Encript encript = new Encript(dir);
        
        if(url.equals("") || cred.equals(""))return false;
        
        String wrp = "";
        
        getFindKey(k + a,url);
        
        wrp = wp + encript.encript(k + cred) + wps;
        
        file.write(wrp, url);
        
        Dat d = new Dat(url,dir);
        
        d.setPassword(d.Password);
        
        return true;
        
    }
    
}
