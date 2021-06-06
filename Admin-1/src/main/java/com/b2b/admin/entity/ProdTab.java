package com.b2b.admin.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;
import java.util.List;


/**
 * The persistent class for the prod_tab database table.
 * 
 */
@Entity
@Table(name="prod_tab")
@NamedQuery(name="ProdTab.findAll", query="SELECT p FROM ProdTab p")
public class ProdTab implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="cat_id")
	private BigInteger catId;

	@Column(name="cat_name")
	private String catName;

	@Column(name="prod_id")
	private String prodId;

	@Column(name="prod_name")
	private String prodName;

	//bi-directional one-to-one association to Attribute
	@OneToOne(mappedBy="prodTab1", fetch=FetchType.LAZY)
	private Attribute attribute;

	//bi-directional many-to-one association to Attribute
	@OneToMany(mappedBy="prodTab2")
	private List<Attribute> attributes;

	public ProdTab() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigInteger getCatId() {
		return this.catId;
	}

	public void setCatId(BigInteger catId) {
		this.catId = catId;
	}

	public String getCatName() {
		return this.catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	public String getProdId() {
		return this.prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return this.prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public Attribute getAttribute() {
		return this.attribute;
	}

	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}

	public List<Attribute> getAttributes() {
		return this.attributes;
	}

	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}

	public Attribute addAttribute(Attribute attribute) {
		getAttributes().add(attribute);
		attribute.setProdTab2(this);

		return attribute;
	}

	public Attribute removeAttribute(Attribute attribute) {
		getAttributes().remove(attribute);
		attribute.setProdTab2(null);

		return attribute;
	}

}