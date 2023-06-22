package vehicles_0619;

public class MountainBike extends Bicycle {
    int seatHight;            //extend를 한다면 Bicycle의 모든 기능이 있는채이다
    public MountainBike(){

    }
    public MountainBike(int price, String color, int seatHight){
        this.seatHight = seatHight;
        super.price = price;
        super.color = color;
    }
    public String toString(){
        String str = "price : " + super.price + ", color : "+ super.color 
                   + ", seatHight : " +this.seatHight ;
        return str; 
    }    
}
