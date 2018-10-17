package com.ask.sample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ColonyHouses {

    public static void main(String[] args) {
//        int[] input = {1,0,0,0,0,1,0,0};
        int[] input = {1,1,1,0,1,1,1,1};
        ColonyHouses colonyHouses = new ColonyHouses();
        List<Integer> output = colonyHouses.cellCompete(input, 2);
        output.stream().forEach(System.out::print);
    }

    public List<Integer> cellCompete(int[] states, int days) {

        int[] temp = states;
        int[] newState = new int[states.length];
        for (int index = 0; index < days; index++) {
            for (int i = 0; i < states.length; i++) {
                if (i == 0) {
                    if (states[i + 1] == 0) {
                        newState[i] = 0;
                    } else {
                        newState[i] = 1;
                    }
                } else if (i == states.length - 1) {
                    if (states[i - 1] == 0) {
                        newState[i] = 0;
                    } else {
                        newState[i] = 1;
                    }
                } else {
                    if (states[i + 1] != states[i-1]) {
                        newState[i] = 1;
                    } else {
                        newState[i] = 0;
                    }
                }

            }
            states = newState.clone();
        }
        return Arrays.stream(states).boxed().collect(Collectors.toList());
    }
}
