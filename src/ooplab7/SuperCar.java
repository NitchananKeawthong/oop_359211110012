package ooplab7;
public class SuperCar {
    public void getSupercarInfo() {
        System.out.println("Student info : ");
        System.out.println("CarBrand : "+ this.CarBrand);
        System.out.println("Carcolor : "+ this.Carcolor);
        System.out.println("CarEnginesize : "+ this.CarEnginesize);
        System.out.println("CarMaxspeed : "+ this.CarMaxspeed);
        System.out.println("CountryofOrigin : "+ this.CountryofOrigin);
    }
    private String CarBrand;
    private String Carcolor;
    private String CarEnginesize;
    private String CarMaxspeed;
    private String CountryofOrigin;

    public SuperCar(){}
    public SuperCar (String CarBrand,String Carcolor,String CarEnginesize,String CarMaxspeed,String CountryofOrigin){
        this.CarBrand = CarBrand;
        this.Carcolor = Carcolor;
        this.CarEnginesize = CarEnginesize;
        this.CarMaxspeed = CarMaxspeed;
        this.CountryofOrigin = CountryofOrigin;
    }// condtructor

    public void setCarBrand(String CarBrand){
        this.CarBrand = CarBrand;
    }//setCarBrand
    public String getCarBrand(){
        return  this.CarBrand;
    }//getCarBrand

    public void setCarColor(String Carcolor){
        this.Carcolor = Carcolor;
    }//setCarColor
    public String getCarcolor(){
        return  this.Carcolor;
    }//getCarcolor

    public void setCarEnginesize(String CarEnginesize){
        this.CarEnginesize = CarEnginesize;
    }//setCarEnginesize
    public String getCarEnginesize(){
        return  this.CarEnginesize;
    }//getCarEnginesize

    public void setCarMaxspeed(String CarMaxspeed){
        this.CarMaxspeed = CarMaxspeed;
    }//setCarMaxspeed
    public String getCarMaxspeed(){
        return  this.CarMaxspeed;
    }//getCarMaxspeed

    public void setCountryofOrigin(String CountryofOrigin){
        this.CountryofOrigin = CountryofOrigin;
    }//setCountryofOrigin
    public String getCountryofOrigin(){
        return  this.CountryofOrigin;
    }//getCountryofOrigin
}

