package planetamusical.modelo;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Query;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.xml.bind.annotation.XmlRootElement;

//Indicamos que es una entidad para JPA
@Entity

//Identificar como se va ha realcionar y crea la tabla en la base de datos
@Table(name = "Compra")

//Mapear en un fichero de xml  de la clase en cuanquir fichero
@XmlRootElement

//Consultar en SQL 
@NamedQueries({
   @NamedQuery(name = "Compra.buscarAll",
            query = "SELECT o FROM Compra o"),
   @NamedQuery(name = "cuenta.buscarPorId",
            query = "SELECT o FROM Compra o WHERE o.id_compra= :id_compra")
})

public class Compra implements  Serializable{
    @Id
    @Column(name= "id_compra")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long   id_compra;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date   fechaCompra;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date   fechaIngresoCompra;
    
    @Column(name = "descripcionCompra")
    private String descripcionCompra;
    
    @Column(name = "totalProducto")
    public int totalProducto;
    
    @Column(name = "valorTotal")
    public double valorTotal;
    

    //DECLARANDO LOS METODOS SET YGET 
    public long getId_compra() {
        return id_compra;
    }

    public void setId_compra(long id_compra) {
        this.id_compra = id_compra;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaIngresoCompra() {
        return fechaIngresoCompra;
    }

    public void setFechaIngresoCompra(Date fechaIngresoCompra) {
        this.fechaIngresoCompra = fechaIngresoCompra;
    }

    public String getDescripcionCompra() {
        return descripcionCompra;
    }

    public void setDescripcionCompra(String descripcionCompra) {
        this.descripcionCompra = descripcionCompra;
    }

    public int getTotalProducto() {
        return totalProducto;
    }

    public void setTotalProducto(int totalProducto) {
        this.totalProducto = totalProducto;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}