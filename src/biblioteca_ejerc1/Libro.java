/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca_ejerc1;

/**
 * Esta clase se encarga de administrar libros
 * @see https://google.com.ar/claselibro
 * @version version 1
 * @author ema_2
 */
public class Libro {
    private String titulo;
    private String autor;
    private int cantidadEjemplares;
    private int cantidadPrestados;

    public Libro(String titulo, String autor, int cantidadEjemplares, int cantidadPrestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadEjemplares = cantidadEjemplares;
        this.cantidadPrestados = cantidadPrestados;
    }
    
    public Libro()
    {
        this.titulo = "Mi primer libro";
        this.autor= "Autor de prueba";
    }
    
    public Libro(String nombre, String autor, int cantidad)
    {
        this.titulo = nombre;
        this.autor = autor;
        this.cantidadEjemplares = cantidad;
        this.cantidadPrestados = 0;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    public int getCantidadPrestados() {
        return cantidadPrestados;
    }

    public void setCantidadPrestados(int cantidadPrestados) {
        this.cantidadPrestados = cantidadPrestados;
    }
    
    
    public void setTitulo(String tit)
    {
        this.titulo = tit;
    }
    public String getTitulo()
    {
        return this.titulo;
    }

    @Override
    public String toString() {
       String datos;
       datos = "Libro: "+this.titulo+"- Autor: "+this.autor+ 
               " - cantidad de ejemplares: "+this.cantidadEjemplares 
               + " - cantidad disponible:  "+ (this.cantidadEjemplares - this.cantidadPrestados);
        
        return datos; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public boolean prestamo()
    {
        if ((this.cantidadEjemplares - this.cantidadPrestados) > 0) {
            this.cantidadPrestados++;
            return true;
        } else {
            return false;
        }        
    }
    
    public boolean devolucion()
    {
       if(this.cantidadPrestados>0) 
       {
           this.cantidadPrestados--;
           return true;
       }else{
           return false;
         }
    }
    
    public void controlarIgualdad(Libro lib)
    {
        if(this.getAutor() != lib.getAutor() || this.getTitulo() != lib.getTitulo())            
        {
           System.out.println("Libros diferentes:\n" +lib.toString() +"\n"+this.toString() );            
        }else{
            System.out.println("libros iguales");
        }        
       
    }
    
    
    
    
    
    
    

    
    
    
    
    
    
    
}
