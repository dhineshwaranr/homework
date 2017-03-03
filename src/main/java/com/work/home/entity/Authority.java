package com.work.home.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.joda.time.DateTime;

@Entity
@Table(name="authority")
public class Authority {

	@Id
	@GeneratedValue
	private int id;
	//private DateTime createdDate;
	
	//private DateTime modifiedDate;
	@NotNull
    @Enumerated(EnumType.STRING)
    private AuthorityName name;

	/*@OneToOne
    @JoinColumn
	private UserEntity createdBy;*/
	
    /*@ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name="UserRole",joinColumns = @JoinColumn(name = "roleId"),inverseJoinColumns = @JoinColumn(name="userId"))
    @ManyToMany(mappedBy="role",cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    private List<UserEntity> user;*/
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public AuthorityName getName() {
		return name;
	}

	public void setName(AuthorityName name) {
		this.name = name;
	}
	
}
