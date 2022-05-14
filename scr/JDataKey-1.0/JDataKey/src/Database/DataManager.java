
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

public class DataManager {
    
    private String UrlDatabase = "";
    
    private String Password = "";
    
    private String Author = "";
    
    private String Gmail = "";
    
    private String Name = "";
    
    private String dir = "";
    
    public DataManager(String UrlDatabase){
        this.UrlDatabase = UrlDatabase;
    }
    
     /**
     * <ul><li>Metodo sirve para agregar url de archivo de encriptacion personalizado agregado en v1.1</li></ul>  
     * @return <ul><li>Retorna true si el archivo existe.</li></ul>
     */
    
    public boolean setEncriptFile(String urlfile){
        if(!new File.File().isExitsFile(urlfile))return false; dir = urlfile;
        return true;
    }
    
     /**
     * <ul><li>Metodo sirve para crear nueva database.</li></ul>  
     * @return <ul><li>Retorna true si se creo database.</li></ul>
     */
    
    public boolean newDatabase(){
        WriteData wd = new WriteData(); 
        wd.setEncriptFile(dir);
        return wd.createdDataBase(UrlDatabase, Name, Author, Gmail, Password);
    }
    
     /**
     * <ul><li>Metodo sirve para eliminar database.</li></ul>  
     * @return <ul><li>Retorna true si se elimino database.</li></ul>
     */
    
    public boolean delDatabase(String url){
        return new File.File().Delete(UrlDatabase);
    }
    
     /**
     * <ul><li>Metodo sirve para renombrar fichero de la database.</li></ul>  
     * @return <ul><li>Retorna true si se creo database.</li></ul>
     */
    
    public boolean renDatabase(String NewName, String LastName){
        return new File.File().Rename(LastName, NewName);
    }
    
     /**
     * <ul><li>Metodo sirve para agregar nuevo nombre del author para una nueva database.</li></ul>  
     */
    
    public void setAuthor(String author){
        this.Author = author;
    }
    
     /**
     * <ul><li>Metodo sirve para agregar nuevo gmail para una nueva database.</li></ul>  
     */
    
    public void setGmail(String gmail){
        this.Gmail = gmail;
    }
    
     /**
     * <ul><li>Metodo sirve para agregar nuevo password para una nueva database.</li></ul>  
     */
    
    public void setPassword(String password){
        this.Password = password;
    }
    
     /**
     * <ul><li>Metodo sirve para agregar nuevo name para la database.</li></ul>  
     */
    
    public void setName(String name){
        this.Name = name;
    }
    
     /**
     * <ul><li>Metodo sirve para saber si la database ya existe.</li></ul>  
     */
    
    public boolean isDatabaseExits(){
        return new File.File().isExitsFile(UrlDatabase);
    }
    
}
