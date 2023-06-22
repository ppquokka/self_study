package animals;

public class HumanAnimalImpl implements InterfaceAnimal{
    String legs = "2";
    String arms = "2";
    String enableSpeech = "Yes";

    @Override
    public String legs(String val) { 
        this.legs = legs;
        return this.legs;
    }

    @Override
    public String arms(String val) {
        this.arms = arms;
        return this.arms; 
    }

    @Override
    public String enableSpeech(String val) {
        this.enableSpeech = enableSpeech;
        return this.enableSpeech;
    }   

}
