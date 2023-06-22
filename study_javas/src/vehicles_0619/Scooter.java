package vehicles_0619;

public class Scooter extends AbstractVehicle {     
    @Override     // Bike의 @Override 처럼 한겹 씌워주면 나중에 유지보수에 용이하다
    public int speedUp(int val){
        this.speed = this.speed + this.increment;
        return this.speed;      //this가 나오면 
    }
}
