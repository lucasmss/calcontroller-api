package br.com.calcontroller.calcontroller.entities;

import br.com.calcontroller.calcontroller.enums.Goal;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "pessoa_tb")
public class Pessoa {

  @Id
  @GeneratedValue (strategy = GenerationType.AUTO)
  private long id;
  @Column(nullable = false)
  private String name;
  @Column(nullable = false)
  private String CPF;
  @Column(nullable = false)
  private Date birthday;
  @Column(nullable = false)
  private String email;
  @Column(nullable = false)
  private Double stature;
  @Column(nullable = false)
  private Double weight;
  @Column(nullable = false)
  private Goal goal;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCPF() {
    return CPF;
  }

  public void setCPF(String CPF) {
    this.CPF = CPF;
  }

  public Date getBirthday() {
    return birthday;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Double getStature() {
    return stature;
  }

  public void setStature(Double stature) {
    this.stature = stature;
  }

  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public Goal getGoal() {
    return goal;
  }

  public void setGoal(Goal goal) {
    this.goal = goal;
  }

  @Override
  public String toString() {
    return "Pessoa{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", CPF='" + CPF + '\'' +
        ", birthday=" + birthday +
        ", email='" + email + '\'' +
        ", stature=" + stature +
        ", weight=" + weight +
        ", goal=" + goal +
        '}';
  }
}
