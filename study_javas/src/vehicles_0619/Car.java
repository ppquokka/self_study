package vehicles_0619;

public class Car implements Vehicle{
    int speed = 0;   // 초기화를 꼭 생성자 parameter로 안하고 이렇게 하면 inatance화 할 때 이 값으로 초기화 됨
    int increment = 20;  
    
    @Override
    public int speedUp(int val) {         //parameter와 return값은 사용하지 않고 모양을 사용하겠음
        this.speed = this.speed + increment;
        return this.speed;  
    }

    @Override
    public int speedDown(int val) {
        this.speed = this.speed - increment;
        return this.speed;
    }  // 대략적인 vehicle파일을 구체적으로 구현할거다
    
}
