package fr.christophetd.log4shell.vulnerableapp.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  private String name;
  private String email;
  private String ccNum;
  private String ccExpiration;
  private Integer ccSecCode;
  private Integer ccZipCode;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCCNum() {
    return ccNum;
  }

  public void setCCNum(String ccNum) {
    this.ccNum = ccNum;
  }

  public String getCCExpiration() {
    return ccExpiration;
  }

  public void setCCExpiration(String ccExpiration) {
    this.ccExpiration = ccExpiration;
  }

  public Integer getCCSecCode() {
    return ccSecCode;
  }

  public void setCCSecCode(Integer ccSecCode) {
    this.ccSecCode = ccSecCode;
  }

  public Integer getCCZipCode() {
    return ccZipCode;
  }

  public void setCCZipCode(Integer ccZipCode) {
    this.ccZipCode = ccZipCode;
  }
}