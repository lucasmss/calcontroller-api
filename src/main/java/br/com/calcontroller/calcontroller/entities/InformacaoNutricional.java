package br.com.calcontroller.calcontroller.entities;

import javax.persistence.*;

@Entity
@Table (name = "informacaoNutricional_tb")
public class InformacaoNutricional {
  @Id
  @GeneratedValue (strategy = GenerationType.AUTO)
  private long id;
  @Column(nullable = false)
  private Double energeticValue;
  @Column(nullable = false)
  private Double carbohydrates;
  @Column(nullable = false)
  private Double saturatedFat;
  @Column(nullable = false)
  private Double transFat;
  @Column(nullable = false)
  private Double foodFiber;
  @Column(nullable = false)
  private Double sodium;

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Double getEnergeticValue() {
    return energeticValue;
  }

  public void setEnergeticValue(Double energeticValue) {
    this.energeticValue = energeticValue;
  }

  public Double getCarbohydrates() {
    return carbohydrates;
  }

  public void setCarbohydrates(Double carbohydrates) {
    this.carbohydrates = carbohydrates;
  }

  public Double getSaturatedFat() {
    return saturatedFat;
  }

  public void setSaturatedFat(Double saturatedFat) {
    this.saturatedFat = saturatedFat;
  }

  public Double getTransFat() {
    return transFat;
  }

  public void setTransFat(Double transFat) {
    this.transFat = transFat;
  }

  public Double getFoodFiber() {
    return foodFiber;
  }

  public void setFoodFiber(Double foodFiber) {
    this.foodFiber = foodFiber;
  }

  public Double getSodium() {
    return sodium;
  }

  public void setSodium(Double sodium) {
    this.sodium = sodium;
  }

  @Override
  public String toString() {
    return "InformacaoNutricional{" +
        "id=" + id +
        ", energeticValue=" + energeticValue +
        ", carbohydrates=" + carbohydrates +
        ", saturatedFat=" + saturatedFat +
        ", transFat=" + transFat +
        ", foodFiber=" + foodFiber +
        ", sodium=" + sodium +
        '}';
  }
}
