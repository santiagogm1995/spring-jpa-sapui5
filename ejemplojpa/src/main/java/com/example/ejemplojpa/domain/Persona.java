package com.example.ejemplojpa.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.springframework.boot.context.properties.ConstructorBinding;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
public class Persona implements Serializable {

  @Id
  private String dni;
  private String nombre;
  private String apellido;

  @OneToOne(mappedBy = "persona")
  @Cascade(CascadeType.ALL)
  private Carnet carnet;

  @OneToMany(mappedBy = "persona")
  @Cascade(CascadeType.ALL)
  private List<Casa> casas;
  
  

}