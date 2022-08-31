package com.cydeo.Task8;

import java.util.List;

import static java.util.Arrays.asList;

public class StateTest {

    public static void main(String[] args) {


        State va = new State();
        va.addCity("McLean");
        va.addCity("Arlington");
        va.addCity("Fairfax");
        va.addCity("FallsChurch");

        State tx= new State();
        tx.addCity("Dallas");
        tx.addCity("Plano");
        tx.addCity("Austin");
        tx.addCity("Houston");

        List<State> list = asList(va,tx);

//        list.stream().map(state -> state.getCity()).forEach(System.out::println);

        list.stream()
                .map(state -> state.getCity())
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}