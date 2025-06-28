public class MyService {
    private ExternalApi ExternalApi; // Dependency on the ExternalApi interface

    // Constructor for dependency injection
    public MyService(ExternalApi externalApi) {
        this.ExternalApi = externalApi;
    }

    // Method that uses the external API
    public String fetchDataFromExternalService(String query) {
        // Calls the fetchData method of the injected ExternalApi
        return ExternalApi.fetchData(query);
    }

    // A new method that performs an action and potentially calls the API multiple times
    public void performAction(String dataId, int count) {
        for (int i = 0; i < count; i++) {
            ExternalApi.fetchData(dataId + "-" + i);
        }
    }
}