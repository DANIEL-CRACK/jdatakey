
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

package main;

import Database.Dat;

public class data {
    
    private Dat dat = new Dat("data_test.dat","");
    
    public data(){
        dat.setPassword("null");
    }
    
    public String Name(){
        return dat.getNameDatabase();
    }

    public String Autor(){
        return dat.getAuthor();
    }
    
    public String Gmail(){
        return dat.getGmail();
    }
    
    public String Size(){
        return dat.getDatabaseSize();
    }
    
    public void AgregarKey(String key,String value){
        dat.setKey(key, value);
    }
    
    public String RecuperarKey(String key){
        return dat.getKey(key);
    }
    
    public boolean EliminarKey(String key){
        return dat.delKey(key);
    }
    
}
