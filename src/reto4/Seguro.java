/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto4;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Seguro {
    private int id;
    private String nombreEmpresa, descripcion;
    public LocalDate fechaInicial, fechaFinal;
    
    public Seguro(int id, String nombreEmpresa, String descripcion, LocalDate fechaInicial,
            LocalDate fechaFinal){
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.descripcion = descripcion;
        this.fechaInicial = fechaInicial;
        this.fechaFinal = fechaFinal;
    }
    
public long diasCobertura(){
    long diasEntreFechas = ChronoUnit.DAYS.between(fechaInicial, fechaFinal);
    return diasEntreFechas;
    }
}
