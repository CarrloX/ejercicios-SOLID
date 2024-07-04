public class DataService {
    private final DataStorage dataStorage;

    public DataService(DataStorage dataStorage) {
        this.dataStorage = dataStorage;
    }

    public void saveData(String data) {
        dataStorage.save(data);
    }
}
