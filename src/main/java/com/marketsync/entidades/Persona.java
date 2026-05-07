package com.marketsync.entidades;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity(name = "tb_persona")
@Inheritance(strategy = InheritanceType.JOINED) //falta confirmar si es este que se usa
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "per_id")
	private Integer id;
	
	@Column(name = "per_nombre", nullable = false, length = 50)
	private String nombre;
	
	@Column(name = "per_apellido", nullable = false, length = 50)
	private String apellido;
	
	@Column(name = "per_cedula",nullable = false, length = 45)
	private String cedula;

	@Column(name = "per_celular", nullable = false, length = 45)
	private String celular;
	
	@Column(name = "per_direccion", nullable = false, length = 100)
	private String direccion;
	
	@Column(name = "per_email", nullable = false, length = 100)
	private String email;
	
	//Metodo contructor
	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	//Getters and Setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
