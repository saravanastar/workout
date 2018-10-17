package com.ask.sample;

import java.util.*;
import java.util.stream.Collectors;

public class SteakHouseNearby {

    public static void main(String[] args) {
        SteakHouseNearby steakHouseNearby = new SteakHouseNearby();
        List<Integer> input =  new ArrayList<>();

        List<List<Integer>> inputList =  new ArrayList<>();
        inputList.add(Arrays.asList(3,6));
        inputList.add(Arrays.asList(2,4));
        inputList.add(Arrays.asList(5,3));
        inputList.add(Arrays.asList(2,7));
        inputList.add(Arrays.asList(1,8));
        inputList.add(Arrays.asList(7,9));
        List<List<Integer>> lists = steakHouseNearby.nearestSteakHouses(3, inputList, 3);
        lists.stream().flatMap(latLong-> latLong.stream()).forEach(System.out::print);
    }

    List<List<Integer>> nearestSteakHouses(int totalSteakHouses,
                                           List<List<Integer>> allLocations,
                                           int numSteakHouses) {

        List<List<Integer>> sortLocationArray = new ArrayList<>();
        if (allLocations != null && allLocations.size() > 0) {
            Map<Double, List<Integer>> locationMap = new TreeMap<>();
          for(List<Integer> latLongs: allLocations) {
              int sum = latLongs.stream().mapToInt(latLong -> (int)(Math.pow(Math.abs(latLong), 2))).sum();

              locationMap.put(Math.sqrt(sum), latLongs);
          }

            sortLocationArray = locationMap.entrySet().stream().map(entry -> entry.getValue()).limit(numSteakHouses).collect(Collectors.toList());

        }
        return sortLocationArray;

    }
}
