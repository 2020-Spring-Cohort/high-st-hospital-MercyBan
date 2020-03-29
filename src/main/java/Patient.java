public class Patient  {
    private final String name;
    public int BLOOD_LEVEL = 20;
     public int HEALTH_LEVEL = 10;

    public Patient(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBloodLevel() {

        return BLOOD_LEVEL;
     }

     public void setBloodLevel(int BLOOD_LEVEL) {

        this.BLOOD_LEVEL = BLOOD_LEVEL;
     }

     public int getHealthLevel() {
          return HEALTH_LEVEL;
     }

     public void setHealthLevel(int HEALTH_LEVEL) {

        this.HEALTH_LEVEL = HEALTH_LEVEL;
     }
}
