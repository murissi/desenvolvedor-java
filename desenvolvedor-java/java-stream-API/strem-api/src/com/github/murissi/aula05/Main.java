package com.github.murissi.aula05;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Empregado> empregados = new ArrayList<>();
        empregados.add(new Empregado(22,"Marcos",new BigDecimal("2000"),"Producao"));
        empregados.add(new Empregado(24,"Maria",new BigDecimal("3000"),"RH"));
        empregados.add(new Empregado(44,"Joao",new BigDecimal("2500"),"Controladoria"));
        empregados.add(new Empregado(1,"Joana",new BigDecimal("7000"),"CTO"));
//        Iterator<Empregado> empregadoIterator = empregados.iterator();
//        while(empregadoIterator.hasNext()) {
//            System.out.println(empregadoIterator.next());
//        }

        // stream API
        empregados.stream().forEach(emp -> {
            System.out.println(emp);
        });


        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        int resultado = (int) numeros.stream().mapToInt(n -> n.intValue()).sum();
        System.out.println(resultado);
    }

}
