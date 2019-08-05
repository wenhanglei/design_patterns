package org.wenhanglei.decorator;

/**
 * @author: wenhanglei
 * @date: 2019/8/5
 * @time: 10:18
 * @info:
 */
public abstract class Beverage {

  private String description;

  public String getDescription() {
    return description;
  }

  abstract int getCost();

}
