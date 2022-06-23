
package reto4;


public class Panel {
    public int id, numeroSerie;
    private String descripcion, tipoDePanel, modelo;
    private int añoFabricacion, precioDeVenta;

    public Panel(int id, int numeroSerie, String descripcion, String tipoDePanel,
            String modelo, int añoFabricacion, int precioDeVenta){
        this.id = id;
        this.numeroSerie = numeroSerie;
        this.descripcion = descripcion;
        this.tipoDePanel = tipoDePanel;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.precioDeVenta = precioDeVenta;
    }
public String consultarUso(){
    String uso;
    if(añoFabricacion >= 0 && añoFabricacion <= 1){
            uso = "El Panel es nuevo";
    }
    else if(añoFabricacion >= 2 && añoFabricacion <= 4){
            uso = "El Panel es medianamente usado";
    }
    else if(añoFabricacion >= 5){
            uso = "El Panel es usado";
    }
    else{
            uso = "Año de fabricacion no valido";
    }
    return uso;
        
}
}