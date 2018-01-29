package ooplab7;

public class SuperCar {
    private String carBrand;
    private String carColor;
    private String engSize;
    private String CarMaxspeed;
    private String CountryofOrigin;
    //constructor
    public SuperCar(){}
    public SuperCar(String b,String c, String e, String p, String u){

        this.carBrand = b;
        this.carColor = c;
        this.engSize = e;
        this.CarMaxspeed =p;
        this.CountryofOrigin =u;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    //getter and setter methods
    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getEngSize() {
        return engSize;
    }

    public void setEngSize(String engSize) {
        this.engSize = engSize;
    }
    public String getCarMaxspeed () {
        return CarMaxspeed ;
    }

    public void setCarMaxspeed (String CarMaxspeed ) {
        this.CarMaxspeed  = CarMaxspeed ;
    }
    public String getCountryofOrigin  () {
        return  CountryofOrigin ;
    }

    public void setCountryofOrigin  (String  CountryofOrigin ) {
        this. CountryofOrigin   =  CountryofOrigin ;
    }




    public String getSuperCarInfo() {
        return "SuperCar{" +
                "carBrand='" + carBrand + '\'' +
                ", carColor='" + carColor + '\'' +
                ", engSize='" + engSize + '\'' +
                ", CarMaxspeed='" + CarMaxspeed + '\''+
                ", CountryofOrigin='" + CountryofOrigin + '\''+
        '}';
    }
}



