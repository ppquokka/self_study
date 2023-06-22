package cases;

public class CasherForV1 {
    public static void main(String[] args) {
        // 1.장바구니엔 5가지 넣음    2.입력 중 0원이면 입력되었던 값 합산   
        // 3.100원 이하로 입력 제한, 이상 시 0원 적용
        try {
            System.out.println("--- 계산 시작 ---");
            int bucket_1 = 40;
            int bucket_2 = 140;
            int bucket_3 = 5;
            int bucket_4 = 0;
            String bucket_5 = "";
            System.out.println("1 번째 가격 : "+ bucket_1);
            System.out.println("2 번째 가격 : "+ bucket_2);
            if (bucket_2 > 100) {
                System.out.println("100 초과 0원 적용");                
            }
            System.out.println("3 번째 가격 : "+ bucket_3);
            System.out.println("4 번째 가격 : "+ bucket_4);
            // for(first = 0; first < input.length; first = first + 1)
            System.out.println("--- 담은 총 합 ---");
            System.out.println("합계 : "+(bucket_1+bucket_2+bucket_3+bucket_4+bucket_5));
            System.out.println("--- 계산 종료 ---");    
            
        } catch (Exception e) {
            // TODO: handle exception
        }
            
    }
}

