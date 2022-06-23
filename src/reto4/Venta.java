/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reto4;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Venta {
    private int id, numeroDocumento;
    private LocalDateTime fechaYHora;
    private String tipoDocumento, nombre, descripcion;
    public int valorAPagar;
    
    public Venta(int id, int numeroDocumento, LocalDateTime fechaYHora,String tipoDocumento,
            String nombre, String descripcion, int valorAPagar){
        this.id = id;
        this.numeroDocumento = numeroDocumento;
        this.fechaYHora = fechaYHora;
        this.tipoDocumento = tipoDocumento;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valorAPagar = valorAPagar;
    }
    
public long diasVenta(){
    LocalDateTime fechaHoy = LocalDateTime.now();
    long diasEntreFechas = ChronoUnit.DAYS.between(fechaYHora, fechaHoy);
    return diasEntreFechas;
    }
}
