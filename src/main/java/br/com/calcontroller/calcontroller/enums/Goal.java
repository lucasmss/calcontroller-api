package br.com.calcontroller.calcontroller.enums;

public enum Goal {
  LOSEWEIGTH("Perder"),
  MAINTAINWEIGHT("Manter"),
  GAINWEIGHT("Ganhar");

  private String goal;
  Goal(String goal){
    this.goal = goal;
  }
  public String getGoal() {
    return goal;
  }
}
