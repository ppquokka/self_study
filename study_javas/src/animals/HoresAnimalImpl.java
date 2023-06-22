package animals;

public class HoresAnimalImpl implements InterfaceAnimal {
    String legs = "4";
    String arms = "0";
    String enableSpeech = "No";

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
