package com.mycompany.group234.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.mycompany.group234.model.AppPort;
import com.mycompany.group234.converter.DurationConverter;
import com.mycompany.group234.converter.UUIDToByteConverter;
import com.mycompany.group234.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "AppPort")
@Table(name = "\"AppPort\"", schema =  "\"generated_app\"")
@Data
                        
public class AppPort {
	public AppPort () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"app_Id\"", nullable = true )
  private Integer app_Id;
	  
  @Column(name = "\"app_Name\"", nullable = true )
  private String app_Name;
  
	  
  @Column(name = "\"github_URL\"", nullable = true )
  private String github_URL;
  
	  
  @Column(name = "\"service_Name\"", nullable = true )
  private String service_Name;
  
	  
  @Column(name = "\"date\"")
  @Temporal(value = TemporalType.TIMESTAMP)
  private Date date;  
  
	  
  @Column(name = "\"appPort_Number\"", nullable = true )
  private Integer appPort_Number;
  
	  
  @Column(name = "\"app_URL\"", nullable = true )
  private String app_URL;
  
	  
  @Column(name = "\"host_IP\"", nullable = true )
  private String host_IP;
  
	  
  @Column(name = "\"dBPort_Number\"", nullable = true )
  private Integer dBPort_Number;
  
  
  
  
   
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "AppPort [" 
  + "app_Id= " + app_Id  + ", " 
  + "app_Name= " + app_Name  + ", " 
  + "github_URL= " + github_URL  + ", " 
  + "service_Name= " + service_Name  + ", " 
  + "date= " + date  + ", " 
  + "appPort_Number= " + appPort_Number  + ", " 
  + "app_URL= " + app_URL  + ", " 
  + "host_IP= " + host_IP  + ", " 
  + "dBPort_Number= " + dBPort_Number 
 + "]";
	}
	
}