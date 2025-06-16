package ex_18_Constructors;

public class Lab_Car2_Parameterized_constructor {

    //Attributes
    String name;
    String color;
    int model;

    //Default Constructors

    Lab_Car2_Parameterized_constructor() {
        name = "XYZ";
        color = "No color";
        model = 0;
    }

    //Parameterized constructor

    Lab_Car2_Parameterized_constructor(String name_car,String color_car,int model_car) {
        this.name = name_car;
        this.color = color_car;
        this.model = model_car;

    }

      // Constructor Overloading (Multiple parameterized Constructor used)
    Lab_Car2_Parameterized_constructor(String name_car) {
        this.name = name_car;
    }
    }

