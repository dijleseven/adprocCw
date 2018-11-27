/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;

/**
 *
 * @author Dylan Ritchings
 */
public abstract class Box {
    protected int grade, amount;
    protected double width, length, height;

    protected double[] costPerGrade = {0.55,0.65,0.82,0.98,1.5};

    protected int colourAmount;
    protected boolean reinforcedBottom, reinforcedCorners, sealableTop;

    protected double[] additonalCosts = {0.12,0.15,0.13,0.12,0.1};

    public Box() {
    }

    public Box(int cGrade, int cAmount, double cWidth, double cLength, double cHeight, int cColourAmount, boolean cReinforcedBottom, boolean cReinforcedCorners, boolean cSealableTop){
        grade = cGrade;
        amount = cAmount;
        width = cWidth;
        length = cLength;
        height = cHeight;
        colourAmount = cColourAmount;
        reinforcedBottom = cReinforcedBottom;
        reinforcedCorners = cReinforcedCorners;
        sealableTop = cSealableTop;
    }

    protected abstract String getBoxType();

    protected abstract double getBoxCost();

    public int getGrade(){
      return grade;
    }

    public void setGrade(cGrade){
      grade = cGrade;
    }

    public double getWidth(){
      return width;
    }

    public void setWidth(cWidth){
      width = cWidth;
    }

    public double getHeight(){
      return height;
    }

    public void setHeight(cHeight){
      height = cHeight
    }

    public double getLength(){
      return length;
    }

    public void setLength(cLength){
      length = cLength
    }



}
