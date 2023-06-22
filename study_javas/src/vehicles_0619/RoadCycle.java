package vehicles_0619;

public class RoadCycle extends Bicycle {
    String productName;
    public RoadCycle() {

    }
    public RoadCycle(int price, String color, String productName) {
    // toString() gksms Inheritances.java의 RoadCycle 인스턴스와 순서가 같아야 한다
        this.productName = productName;
        super.price = price;
        super.color = color;
    }
    public String toString() {
        String str = "ProductName : " + this.productName + ", Price : "
                     + super.price +", color : " + super.color ;
        return str;              
    }
}

/* 
 1.main이 시작되는 파일에서 디버깅포인트를 잘!!! 잡아서 디버깅을 시작한다
 2.인스턴스화 시킨 네이밍에 맞춰 toSting()을 해야한다
 */