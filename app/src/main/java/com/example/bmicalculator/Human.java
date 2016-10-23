package com.example.bmicalculator;

import java.text.DecimalFormat;

public class Human {
    private  String Height;
    private  String Weight;
   DecimalFormat df=new DecimalFormat("0.00");
    public void setHeight(String height) {
        Height = height;
    }
    public void setWeight(String weight) {
        Weight = weight;
    }
    public String getWeight() {
        return Weight;
    }
    public String getHeight() {
        return Height;
    }
    public String BMI(){
        double bmi=Double.parseDouble(getWeight())/(Math.pow(Double.parseDouble(getHeight())/100,2));
        return df.format(bmi);

    }
    public  String CalBMI(){
        String str="";
        if(Double.parseDouble(BMI())<18.5){
            str="น้ำหนักน้อยกว่าปกติ(ผอม)";
        }else if(Double.parseDouble(BMI())>=18.5&&Double.parseDouble(BMI())<25){
            str="น้ำหนักปกติ";
        }else if(Double.parseDouble(BMI())>=25&&Double.parseDouble(BMI())<30){
          str="น้ำหนักมากกว่าปกติ(ท้วม)";
        }else {
           str="น้ำหนักมากกว่าปกติ(อ้วน)";
        }
        return str;
    }
}
