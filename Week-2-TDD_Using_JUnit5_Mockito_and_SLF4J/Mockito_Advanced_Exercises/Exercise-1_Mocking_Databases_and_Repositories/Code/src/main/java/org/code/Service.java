package org.code;

public class Service {
    private final Repository repository;

    public Service(Repository repo){
        this.repository = repo;
    }

    public String processData(){
        String data = repository.getData();
        return "Processed " + data;
    }
}
