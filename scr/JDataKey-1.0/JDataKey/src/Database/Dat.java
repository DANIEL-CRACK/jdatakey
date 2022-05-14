
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

public class Dat {

    public final int LEVEL_1 = 0;
    public final int LEVEL_2 = 1;
    public final int LEVEL_3 = 2;
    public final int LEVEL_4 = 3;
    
    private String UrlDataBase = "";
    
    protected String Author = "";
    
    protected String Gmail = "";
    
    protected String Name = "";
    
    protected String Password = "";
    
    private boolean state = false;
    
    private int D = 0;
    
    private String dir = "";
    
    public Dat(String UrlDataBase, String url_file_encript){
        this.UrlDataBase = UrlDataBase;
        this.setEncriptFile(url_file_encript);
    }
    
    /**
     * <ul><li>Metodo sirve para agregar url de archivo de encriptacion personalizado agregado en v1.1</li></ul>  
     * @return <ul><li>Retorna true si el archivo existe.</li></ul>
     */
    
    private boolean setEncriptFile(String urlfile){
        if(!new File.File().isExitsFile(urlfile))return false; dir = urlfile;
        return true;
    }
    
    /**
     * <ul><li>Metodo sirve para generar password aleatorios con diferentes niveles de seguridad. Ejemplo:</li></ul>  
     * <ul><li>Dat data = new Dat("/Mydatabase.dat");</li>
     * <li>String password = data.GeneratedPassword(nivel);</li></ul>
     * 
     * @param NivelSeguridadPassword
     * <ul>
     *          <li>nivel:</li>
     *                 <li>data.LEVEL_1 = poca seguridad</li>
     *                 <li>data.LEVEL_2 = mas seguridad</li>
     *                 <li>data.LEVEL_3 = seguridad decente</li>
     *                 <li>data.LEVEL_4 = seguridad bastante alta</li>
     * </ul>
     * 
     * @return <ul><li>Retorna String con password generado.</li></ul>
     * 
     */
    
    public String GeneratedPassword(int NivelSeguridadPassword) {

        int pass[] = {(getRandom(35) + 5),(getRandom(4))};
        
        String password = ""; int i = 0;

        if (NivelSeguridadPassword == LEVEL_1) {

            while(i < 5){
                password += ch(getRandom(35) + 5);
                i++;
            }
            
            return password;
            
        } else if (NivelSeguridadPassword == LEVEL_2) {

            while(i < 4){
                password += ch(getRandom(35) + 5) + ch(pass[0]);
                i++;
            }
            
            return password;
            
        } else if (NivelSeguridadPassword == LEVEL_3) {

            while(i < 4){
                password += ch(pass[0]) + ch(getRandom(35) + 5);
                i++;
            }
            
            return ch(pass[1]) + password + ch(getRandom(30) - pass[1]);
            
        }

            while(i < 5){
                password += ch(getRandom(35) + 5);
                i++;
            } i = 4;
        
            while(i < 5){
                password += ch(pass[1]) + ch(pass[0]) ;
                i++;
            }
            
            return password + ch(pass[0]) + ch(getRandom(35) + 5) + ch(pass[0]) + ch(getRandom(35) + 5) + "3ygfb2#2fr84";
        
    }

    private String ch(int num) {

        if (num == 1) {
            return "*";
        }
        if (num == 2) {
            return "#";
        }
        if (num == 3) {
            return "@";
        }
        if (num == 4) {
            return "!";
        }
        if (num == 5) {
            if(getRandom(2) == 1)return "a";
            else return "A";
        }
        if (num == 6) {
            if(getRandom(2) == 1)return "b";
            else return "B";
        }
        if (num == 7) {
            if(getRandom(2) == 1)return "c";
            else return "C";
        }
        if (num == 8) {
            if(getRandom(2) == 1)return "d";
            else return "D";
        }
        if (num == 9) {
            if(getRandom(2) == 1)return "e";
            else return "E";
        }
        if (num == 10) {
            if(getRandom(2) == 1)return "f";
            else return "F";
        }
        if (num == 11) {
            if(getRandom(2) == 1)return "g";
            else return "G";
        }
        if (num == 12) {
            if(getRandom(2) == 1)return "h";
            else return "H";
        }
        if (num == 13) {
            if(getRandom(2) == 1)return "i";
            else return "I";
        }
        if (num == 14) {
            if(getRandom(2) == 1)return "j";
            else return "J";
        }
        if (num == 15) {
            if(getRandom(2) == 1)return "k";
            else return "K";
        }
        if (num == 16) {
            if(getRandom(2) == 1)return "l";
            else return "L";
        }
        if (num == 17) {
            if(getRandom(2) == 1)return "m";
            else return "M";
        }
        if (num == 18) {
            if(getRandom(2) == 1)return "n";
            else return "N";
        }
        if (num == 19) {
            if(getRandom(2) == 1)return "o";
            else return "O";
        }
        if (num == 20) {
            if(getRandom(2) == 1)return "p";
            else return "P";
        }
        if (num == 21) {
            if(getRandom(2) == 1)return "q";
            else return "Q";
        }
        if (num == 22) {
            if(getRandom(2) == 1)return "r";
            else return "R";
        }
        if (num == 23) {
            if(getRandom(2) == 1)return "s";
            else return "S";
        }
        if (num == 24) {
            if(getRandom(2) == 1)return "t";
            else return "T";
        }
        if (num == 25) {
            if(getRandom(2) == 1)return "u";
            else return "U";
        }
        if (num == 26) {
            if(getRandom(2) == 1)return "v";
            else return "V";
        }
        if (num == 27) {
            if(getRandom(2) == 1)return "w";
            else return "W";
        }
        if (num == 28) {
            if(getRandom(2) == 1)return "x";
            else return "X";
        }
        if (num == 29) {
            if(getRandom(2) == 1)return "y";
            else return "Y";
        }
        if (num == 30) {
            if(getRandom(2) == 1)return "z";
            else return "Z";
        }
        if (num == 31) {
            return "0";
        }
        if (num == 32) {
            return "1";
        }
        if (num == 33) {
            return "2";
        }
        if (num == 34) {
            return "3";
        }
        if (num == 35) {
            return "4";
        }
        if (num == 36) {
            return "5";
        }
        if (num == 37) {
            return "6";
        }
        if (num == 38) {
            return "7";
        }
        if (num == 39) {
            return "8";
        }
        if (num == 40) {
            return "9";
        }

        return "";
    }

    private int getRandom(int p) {
        double ran = Math.random() * p;
        return (int) ran + 1;
    }

    /** 
     * @param NewPassword
     * 
     * <ul> <li>Password nuevo.</li></ul>
     * 
     * @param LastPassword
     * 
     * <ul> <li>Password anterior.</li></ul>
     * 
     * @return <ul> <li>Retorna true si se cambio el password.</li></ul>
     */
    
    public boolean setNewPassword(String NewPassword, String LastPassword){
        WriteData wd = new WriteData();
        wd.setEncriptFile(dir);
        return wd.managerPassword(UrlDataBase,Password, LastPassword, NewPassword);
    }
    
     /**
     * <ul><li>Metodo sirve para saber nombre interno de database.</li></ul>  
     * @return <ul><li>Retorna String con name database.</li></ul>
     */
    
    public String getNameDatabase(){
        return Name;
    }
    
     /**
     * <ul><li>Metodo sirve para eliminar keyword de database.</li></ul>  
     * @return <ul><li>Retorna true si se elimino.</li></ul>
     */
    
    public boolean delKey(String key){
        if(!state)return false;
        WriteData wd = new WriteData();
        wd.setEncriptFile(dir);
        return wd.deleteKey(key, UrlDataBase);
    }
    
     /**
     * <ul><li>Metodo sirve para agregar keyword y valor a database.</li></ul>  
     * @return <ul><li>Retorna true si se agrego el key y valor a la database.</li></ul>
     */
    
    public boolean setKey(String key, String content){
        //System.out.println("state = " + state);
        if(!state)return false;
        WriteData wd = new WriteData();
        wd.setEncriptFile(dir);
        return wd.modifiedKey(key, content, UrlDataBase);
    }

     /**
     * <ul><li>Metodo sirve para saber valor de keyword en database.</li></ul>  
     * @return <ul><li>Retorna String con valor de key.</li></ul>
     */
    
    public String getKey(String key){
        //System.out.println("state = " + state);
        if(!state)return "Password incorrecto!";
        ReadData rd = new ReadData();
        rd.setEncriptFile(dir);
        return rd.readKey(key, UrlDataBase);
    }
    
     /**
     * <ul><li>Metodo sirve para saber author de database.</li></ul>  
     * @return <ul><li>Retorna String con nombre author.</li></ul>
     */
    
    public String getAuthor(){
        return Author;
    }
    
     /**
     * <ul><li>Metodo sirve para saber Gmail agregado en la creacion de la database.</li></ul>  
     * @return <ul><li>Retorna String con Gmail del author.</li></ul>
     */
    
    public String getGmail(){
        return Gmail;
    }
    
     /**
     * <ul><li>Metodo sirve para icializar la coneccion con la database opcional solo si tiene password la database.</li></ul>  
     * @return <ul><li>Retorna true si el password es correcto.</li></ul>
     */
    
    public boolean setPassword(String password){
        
        this.Password = password; if(this.Password.equals("")) Password = "null";
        
        if(new File.File().isExitsFile(this.UrlDataBase)){
            
            String read = new File.File().read(this.UrlDataBase);
            
            int index = read.indexOf("\n"); String code = "";
            
            if(index != -1) code = read.substring(0,index);
            
            if(new Encript(dir).desencript(code).equals("@Code:0x67e")){
                
                int d = index; index = read.indexOf("\n",d+1); String pass = "";
                
                if(index != -1){
                    
                    Encript desn = new Encript(dir);
                            
                    pass = desn.desencript(read.substring(d,index));
                    
                    //System.out.println("Aqui? :" + pass + " nrrPassword:" + Password);
                    
                    if(pass.equals("nrrPassword:" + this.Password)){
                        
                        //System.out.println("Aqui? :" + pass);
                        
                        d = index; index = read.indexOf("\n",d+1);
                        
                        if(index != -1){
                            
                            String name = desn.desencript(read.substring(d,index));
                            
                            if(name.substring(0,8).equals("nrrName:")){
                                
                                this.Name = name.substring(8,name.length());
                                //System.out.println("Name: " + Name);
                                
                                d = index; index = read.indexOf("\n",d+1);
                                
                                if(index != -1){
                                
                                    String author = desn.desencript(read.substring(d,index));
                                    
                                    if(author.substring(0,10).equals("nrrAuthor:")){
                                        
                                        this.Author = author.substring(10,author.length());
                                        //System.out.println("Author: " + Author);
                                        
                                        d = index; index = read.indexOf("\n",d+1);
                                        
                                        String gmail = "";
                                        
                                        if(index != -1){
                                            
                                            gmail = desn.desencript(read.substring(d,index));
                                            
                                            if(gmail.substring(0,9).equals("nrrGmail:")){
                                                
                                                this.Gmail = gmail.substring(9,gmail.length());
                                                //System.out.println("Gmail: " + Gmail);
                                                
                                                state = true; this.D = d; return true;
                                                
                                            }
                                            
                                        }else{
                                            
                                            gmail = desn.desencript(read.substring(d,read.length()));
                                            
                                            if(gmail.substring(0,9).equals("nrrGmail:")){
                                                
                                                this.Gmail = gmail.substring(9,gmail.length());
                                                //System.out.println("Gmail: " + Gmail);
                                                
                                                state = true; this.D = d; return true;
                                                
                                            }
                                            
                                        }
                                        
                                    }
                                    
                                }
                                
                            }
                            
                        }
                        
                    }
                    
                }
                
            }
            
        }
     
        return false;
        
    }
    
     /**
     * <ul><li>Metodo sirve para saber cuando se creo la database.</li></ul>  
     * @return <ul><li>Retorna String fecha y hora de creacion de database.</li></ul>
     */
    
    public String getTimeCreationDatabase(){
        if(!new File.File().isExitsFile(UrlDataBase))return "";
        return new File.File().getCreationFile(UrlDataBase);
    }
    
     /**
     * <ul><li>Metodo sirve para saber el ultimo uso de la database.</li></ul>  
     * @return <ul><li>Retorna String con fecha y hora del ultimo uso de la database.</li></ul>
     */
    
    public String getTimeLastUsageDatabase(){
        if(!new File.File().isExitsFile(UrlDataBase))return "";
        return new File.File().getLastAccessFile(UrlDataBase);
    }
    
     /**
     * <ul><li>Metodo sirve para saber size de la database en bytes,Kbytes o MBytes.</li></ul>  
     * @return <ul><li>Retorna String size de la database.</li></ul>
     */
    
    public String getDatabaseSize(){
        if(!new File.File().isExitsFile(UrlDataBase))return "";
        return new File.File().getSizeFile(UrlDataBase);
    }
    
     /**
     * <ul><li>Metodo sirve para modificar author database.</li></ul>  
     * @return <ul><li>Retorna true si se modifico el author.</li></ul>
     */
    
    public boolean setAuthor(String author){
        WriteData wd = new WriteData();
        wd.setEncriptFile(dir);
        return wd.managerCredenciales(Author,UrlDataBase, author, "@Author:");
    }
    
     /**
     * <ul><li>Metodo sirve para modificar Gmail de la database.</li></ul>  
     * @return <ul><li>Retorna true si se modifico el Gmail.</li></ul>
     */
    
    public boolean setGmail(String gmail){
        WriteData wd = new WriteData();
        wd.setEncriptFile(dir);
        return wd.managerCredenciales(Gmail,UrlDataBase, gmail, "@Gmail:");
    }

     /**
     * <ul><li>Metodo sirve para modificar Name de la database.</li></ul>  
     * @return <ul><li>Retorna true si se modifico el name.</li></ul>
     */
    
    public boolean setName(String name){
        WriteData wd = new WriteData();
        wd.setEncriptFile(dir);
        return wd.managerCredenciales(Name,UrlDataBase, name, "@Name:");
    }
    
}
