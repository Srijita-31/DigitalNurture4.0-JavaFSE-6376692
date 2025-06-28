public class MyService {
    private ExternalApi externalApi; // Dependency on the ExternalApi interface

    // Constructor for dependency injection
    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    // Method that uses the external API
    public String fetchDataFromExternalService() {
        // Calls the fetchData method of the injected ExternalApi
        return externalApi.fetchData("some_query_parameter");
    }

        public String processData(String input) {
        String rawData = externalApi.fetchData(input);
        // Simulate some processing
        return "Processed: " + rawData.toUpperCase();
    }
}