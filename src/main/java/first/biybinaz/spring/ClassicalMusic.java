package first.biybinaz.spring;

public class ClassicalMusic implements Music {
    public void doMyInit(){
        System.out.println("Initialization done");
    }
    public void doMyDestroy(){
        System.out.println("Destroying done");
    }
    @Override
    public String getSong() {
        return "Bax";
    }
}
