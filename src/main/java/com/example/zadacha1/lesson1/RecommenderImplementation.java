package com.example.zadacha1.lesson1;

public class RecommenderImplementation {

    public String[] recommendMovies(String movie){
        COntentBasedFilter filter = new COntentBasedFilter();
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }
}
