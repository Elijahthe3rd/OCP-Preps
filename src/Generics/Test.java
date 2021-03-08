package Generics;

public class Test {
    public static void main(String ...args)  {
        Car car=new Car () {
            private String Cname;

            @Override
            public void name (String name) {
                this.Cname=name;
                Car.super.name (name);
            }

            @Override
            public String getCarName () {
                return Cname;
            }



            @Override
            public String toString () {
                return super.toString ();
            }
        };

      Vehicle<? super String > c=new Vehicle<>();

      car.name ("Audi RS8");
        c.start(car.getCarName ().toString ());

      Vehicle<?> carr=new Vehicle<>();


    }
}
