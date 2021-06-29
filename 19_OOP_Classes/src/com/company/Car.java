package com.company;

public class Car {

    /*
    Here we can see that all the data or variables which are not visible or cant be used from
    outside. All the methods are public and can be only used from outside. User have no access that how
    methods are working, they can only get the advantage of using them
    This is called encapsulation.
    */


    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
        String modelName=model.toLowerCase().trim();
        if(modelName.equals("suzuki") || modelName.equals("maruti")){
            this.model = model;
        }else{
            this.model = "Unknown";
        }
    }
    public String getModel(){
        return this.model;
    }
}
