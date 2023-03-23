package com.mindhub.merchshop.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class PaqueteDeProductos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(strategy = "native", name = "native")
    private Long id;
    private Byte cantidad;
    private Double montoTotal;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "compra_id")
    private Compra compra;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "productoIlustracion_id")
    private ProductoIlustracion productoIlustracion;


    public PaqueteDeProductos(){}
    public PaqueteDeProductos(Compra compra, ProductoIlustracion productoIlustracion, Byte cantidad, Double montoTotal) {
        this.compra = compra;
        this.productoIlustracion = productoIlustracion;
        this.cantidad = cantidad;
        this.montoTotal = montoTotal;
    }

    public Long getId() {
        return id;
    }
    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public ProductoIlustracion getIllustrationProduct() {
        return productoIlustracion;
    }

    public void setIllustrationProduct(ProductoIlustracion productoIlustracion) {
        this.productoIlustracion = productoIlustracion;
    }

    public Byte getCantidad() {
        return cantidad;
    }

    public void setCantidad(Byte cantidad) {
        this.cantidad = cantidad;
    }

    public Double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(Double montoTotal) {
        this.montoTotal = montoTotal;
    }
}
