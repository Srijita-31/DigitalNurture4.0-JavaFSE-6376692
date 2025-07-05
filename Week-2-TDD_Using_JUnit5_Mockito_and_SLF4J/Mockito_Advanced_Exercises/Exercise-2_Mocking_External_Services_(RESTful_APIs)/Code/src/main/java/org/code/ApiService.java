package org.code;

public class ApiService {
    private final RestClient restClient;

    public ApiService(RestClient client){
        this.restClient = client;
    }

    public String fetchData(){
        String data = restClient.getResponse();
        return "Fetched " + data;
    }
}
