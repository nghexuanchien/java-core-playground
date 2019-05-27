/**
 * @author chiennghe
 */
public class DataSync {
    private int id;
    private long simulationDuration;

    DataSync(int id, long simulationDuration){
        this.id = id;
        this.simulationDuration = simulationDuration;
    }

    public String get(){
        try {
            Thread.sleep(this.simulationDuration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "data-"+id;
    }
}
