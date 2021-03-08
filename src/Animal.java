public class Animal {
   private String type;
   private String breed;
   private int age;

   public Animal(){}

   public Animal (String type, String breed, int age) {
        this.type = type;
        this.breed = breed;
        this.age = age;
    }

    public String getType () {
        return type;
    }

    public String getBreed () {
        return breed;
    }

    public int getAge () {
        return age;
    }
}
