package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela CIDADE
 * @generated
 */
@Entity
@Table(name = "\"CIDADE\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Cidade")
public class Cidade implements Serializable {

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
  @Column(name = "nom_cidade", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nom_cidade;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_empresa", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Empresa empresa;

  /**
   * Construtor
   * @generated
   */
  public Cidade(){
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
  public Cidade setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nom_cidade
   * return nom_cidade
   * @generated
   */
  
  public java.lang.String getNom_cidade(){
    return this.nom_cidade;
  }

  /**
   * Define nom_cidade
   * @param nom_cidade nom_cidade
   * @generated
   */
  public Cidade setNom_cidade(java.lang.String nom_cidade){
    this.nom_cidade = nom_cidade;
    return this;
  }

  /**
   * Obtém empresa
   * return empresa
   * @generated
   */
  
  public Empresa getEmpresa(){
    return this.empresa;
  }

  /**
   * Define empresa
   * @param empresa empresa
   * @generated
   */
  public Cidade setEmpresa(Empresa empresa){
    this.empresa = empresa;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Cidade object = (Cidade)obj;
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
