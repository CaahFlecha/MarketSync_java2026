package com.marketsync.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity(name = "tb_producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "prod_id")
	private Integer id;
	
	@Column(name = "prod_codigo", nullable = false, length = 100)
	private String codigo;
	
	@Column(name = "prod_descripcion", nullable = false, length = 100)
	private String descripcion;
	
	@Column(name = "prod_precioCompra", nullable = false)
	private Double precioCompra;
	
	@Column(name = "prod_precioVenta", nullable = false)
	private Double precioVenta;
	
	@Column(name = "prod_stock", nullable = false)
	private Double stock;
	
	@Column(name = "prod_estado", nullable = false)
	private boolean estado;
	
	@ManyToOne(optional = false)
	private Categoria categoria;
	
	@ManyToOne(optional = false)
	private Marca marca;
		

	//Metodo constructor
	public Producto() {
		super();
	}

	//Getters and Setters
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Double getPrecioCompra() {
		return precioCompra;
	}


	public void setPrecioCompra(Double precioCompra) {
		this.precioCompra = precioCompra;
	}


	public Double getPrecioVenta() {
		return precioVenta;
	}


	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}


	public Double getStock() {
		return stock;
	}


	public void setStock(Double stock) {
		this.stock = stock;
	}


	public boolean isEstado() {
		return estado;
	}


	public void setEstado(boolean estado) {
		this.estado = estado;
	}


	public Categoria getCategoria() {
		return categoria;
	}


	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}


	public Marca getMarca() {
		return marca;
	}


	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	
}
