package vehicles_0619;

abstract public class AbstractVehicle {       //implement처럼 선언 가능, 구현 가능
    int speed = 0;
    int increment = 5;
    public int speedUp(int val);
    public int speedDown(int val){
         this.speed = this.speed - this.increment;
         return this.speed;
    }
}
