package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela EMPRESA
 * @generated
 */
@Entity
@Table(name = "\"EMPRESA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Empresa")
public class Empresa implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "nom_empresa", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nom_empresa;

  /**
   * Construtor
   * @generated
   */
  public Empresa(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Empresa setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nom_empresa
   * return nom_empresa
   * @generated
   */
  
  public java.lang.String getNom_empresa(){
    return this.nom_empresa;
  }

  /**
   * Define nom_empresa
   * @param nom_empresa nom_empresa
   * @generated
   */
  public Empresa setNom_empresa(java.lang.String nom_empresa){
    this.nom_empresa = nom_empresa;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Empresa object = (Empresa)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
