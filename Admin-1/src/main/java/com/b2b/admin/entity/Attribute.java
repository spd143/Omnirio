package com.b2b.admin.entity;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the attributes database table.
 * 
 */
@Entity
@Table(name="attributes")
@NamedQuery(name="Attribute.findAll", query="SELECT a FROM Attribute a")
public class Attribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	private String name;

	private String value;

	//bi-directional one-to-one association to ProdTab
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id")
	private ProdTab prodTab1;

	//bi-directional many-to-one association to ProdTab
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="prod_id")
	private ProdTab prodTab2;

	public Attribute() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public ProdTab getProdTab1() {
		return this.prodTab1;
	}

	public void setProdTab1(ProdTab prodTab1) {
		this.prodTab1 = prodTab1;
	}

	public ProdTab getProdTab2() {
		return this.prodTab2;
	}

	public void setProdTab2(ProdTab prodTab2) {
		this.prodTab2 = prodTab2;
	}

}