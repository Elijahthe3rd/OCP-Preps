package FunctionalInterfaces;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.function.Supplier;

public class SupplierDateFactory {
    private final Supplier<LocalDate> localDateSupplier1;
    private final Supplier<LocalDate> localDateSupplier2;

    private final Supplier<LocalTime> localtimeSupplier1;
    private final Supplier<LocalTime> localtimeSupplier2;

    private final LocalDate d1;
    private final LocalDate d2;

    private final LocalTime t1;
    private final LocalTime t2;

    public SupplierDateFactory () {
        this.localDateSupplier1 = LocalDate::now;
        this.localDateSupplier2 = ()->LocalDate.now ();
        this.localtimeSupplier1  = LocalTime::now;
        this.localtimeSupplier2 = ()->LocalTime.now ();
        this.d1= localDateSupplier1.get ();
        this.d2 = localDateSupplier2.get ();
        this.t1=localtimeSupplier1.get ();
        this.t2=localtimeSupplier2.get ();
    }

    public Supplier<LocalDate> getLocalDateSupplier1 () {
        return localDateSupplier1;
    }

    public Supplier<LocalDate> getLocalDateSupplier2 () {
        return localDateSupplier2;
    }
    public LocalDate getD1 () {
        return d1.withDayOfMonth (3);
    }
    public LocalDate getD2 () {
        return d2;
    }
    public LocalTime getT1 () {
        return t1;
    }

    public LocalTime getT2 () {
        return t2;
    }

    public static void main (String[] args) {

        SupplierDateFactory factoryDate=new SupplierDateFactory ();
        System.out.println ( factoryDate.getD1 ());
        System.out.println (factoryDate.getD2 ());
        System.out.println ("``````````----------``````````````------------```````````---------``````````");
        System.out.println ( factoryDate.getT1 ().getHour ()+":"+factoryDate.getT1 ().getMinute ()+":"+factoryDate.getT1 ().getSecond ());
        System.out.println (factoryDate.getT1 ().getHour ()+":"+factoryDate.getT1 ().getMinute ()+":"+factoryDate.getT1 ().getSecond ());

    }
}
