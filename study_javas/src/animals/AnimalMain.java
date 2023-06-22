package animals;
// 여기에서 디버깅
public class AnimalMain {
    public static void main(String[] args){
        try {
            // 특이하게 호출하기(interface-implement 확인
            InterfaceAnimal humanAnimal = new HumanAnimalImpl();  // 왜 순서가 leg,arm,speech순이 아니라
                                                              // arm, speech, leg순이지??
            InterfaceAnimal horesAnimal = new HoresAnimalImpl();
            System.out.println();
            
            // 추상화(abstract-extend) 확인
            HumanAnimalExtend humanAnimalExtend = new HumanAnimalExtend();
            HoresAnimalExtend horesAnimalExtend = new HoresAnimalExtend();
            System.out.println();

        } catch (Exception e) {
           System.out.println(e.getMessage());
        }
    }
    
}
