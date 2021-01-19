package com.eldin.mockito.mockitodemo;

public class SomeBusinessImpl {

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    private DataService dataService;

    int findTheGreatestFromAllData() {
        int greatest=Integer.MIN_VALUE;
        int [] data =  dataService.retrieveAllData();
        for (int value: data){

            if (value>greatest){
                greatest=value;
            }
        }
        return greatest;
    }
}
