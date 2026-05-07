package com.marketsync.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity(name = "tb_ventaDetalles")
public class VentaDetalles {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vend_id")
	private Integer id;
	
	@Column(name = "vend_cantidad", nullable = false)
	private Double cantidad;
	
	@Column(name = "vend_precioUnitario", nullable = false)
	private Double precioUnitario;
	
	@ManyToOne(optional = false)
	private Venta venta;
	
	@ManyToOne(optional = false)
	private Producto producto;



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}

	public Double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
	
}
