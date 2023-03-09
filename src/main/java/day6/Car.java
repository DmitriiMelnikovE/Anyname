package day6;

public class Car {
    private String model;
    private String colour;
    private int year;
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return model;
    }
    public void setColour(String colour){
        this.colour=colour;
    }
    public String getColour(){
        return colour;
    }
    public void setYear(int year){
        this.year=year;
    }
    public int getYear(){
        return year;
    }
    public void info(){
        System.out.println("Это автомобиль");
    }public int yearDifference(int inputYear){
        return inputYear-year;
    }
}
