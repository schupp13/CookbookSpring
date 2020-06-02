package com.cookbook.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.lang.NonNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="recipe")
public class Recipe {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	

	@ManyToOne
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name="cookbook_id")
	@JsonIgnore
	private Cookbook cookbook;
	
	@NonNull
	private String name;
	private String instructions;
	private String pic;
	
	
	
	

	public Recipe() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Recipe(int id, Cookbook cookbook, String name, String instructions, String pic) {
		super();
		this.id = id;
		this.cookbook = cookbook;
		this.name = name;
		this.instructions = instructions;
		this.pic = pic;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Cookbook getCookbook() {
		return cookbook;
	}
	public void setCookbook(Cookbook cookbook) {
		this.cookbook = cookbook;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return instructions;
	}
	public void setDescription(String instructions) {
		this.instructions = instructions;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	
	@Override
	public String toString() {
		return "Recipe [id=" + id + ", cookbook=" + cookbook + ", name=" + name + ", instructions=" + instructions
				+ ", pic=" + pic + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cookbook == null) ? 0 : cookbook.hashCode());
		result = prime * result + ((instructions == null) ? 0 : instructions.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((pic == null) ? 0 : pic.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Recipe other = (Recipe) obj;
		if (cookbook == null) {
			if (other.cookbook != null)
				return false;
		} else if (!cookbook.equals(other.cookbook))
			return false;
		if (instructions == null) {
			if (other.instructions != null)
				return false;
		} else if (!instructions.equals(other.instructions))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (pic == null) {
			if (other.pic != null)
				return false;
		} else if (!pic.equals(other.pic))
			return false;
		return true;
	}

}
