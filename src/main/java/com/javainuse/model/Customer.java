package com.javainuse.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Table(name="tbl_customer")
@Entity
@Data
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Long age;
	private String location;
	
	@CreationTimestamp
	@Column(name = "created_at")
	private Date createdAt;
	
	@CreationTimestamp
	@Column(name = "updated_at")
	private Date updatedAt;

	
	
	
}