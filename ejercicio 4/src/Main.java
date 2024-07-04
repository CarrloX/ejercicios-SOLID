public class Main {
    public static void main(String[] args) {
        DataStorage database = new Database();
        DataService dataService = new DataService(database);

        // Ejemplo de uso
        dataService.saveData("datos que guardaremos en la base de datos");
    }
}
