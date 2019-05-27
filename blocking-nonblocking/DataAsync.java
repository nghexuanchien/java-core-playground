import java.util.function.Supplier;

/**
 * @author chiennghe
 */
public class DataAsync implements Supplier<String> {

    private int id;
    private long simulationDuration;

    DataAsync(int id, long simulationDuration){
        this.id = id;
        this.simulationDuration = simulationDuration;
    }

    @Override
    public String get() {
        try{
            Thread.sleep(simulationDuration);
        }catch (Exception e){}

        return "data-"+id;
    }
}
