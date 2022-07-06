package com.platzi.market.persistence.entity;

import jdk.jfr.Category;

import javax.persistence.*;
import java.util.Locale;

@Entity
@Table(name = "productos")
public class Producto {


    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column (name = "id_producto")
    private Integer idProducto;

    private String nombre;

    @Column (name = "id_Categoria")
    private Integer idCategoria;

    @Column (name = "codigo_barras")
    private String codiboBarras;

    @Column (name = "precio_venta")
    private Double precioVenta;

    @Column (name = "cantidad_stock")
    private Integer cantidadStock;

    private boolean estado;

    @ManyToOne
    @JoinColumn (name = "id_categoria", insertable = false, updatable = false)
    private Categoria categoria;



    public Integer getIdProducto() {return idProducto;}

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdCategoria() {return idCategoria;}

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCodiboBarras() {
        return codiboBarras;
    }

    public void setCodiboBarras(String codiboBarras) {
        this.codiboBarras = codiboBarras;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Integer getCantidadStock()
    {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public boolean isEstado()
    {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Categoria getCategoria() {return categoria;}

    public void setCategoria(Categoria categoria) {this.categoria = categoria;}
}


