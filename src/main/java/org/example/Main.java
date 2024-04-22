package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ///////////////////////////////////////////////////
        System.out.println("1-2 uzduotis");
        List<Integer> randomInt = new ArrayList<>();
        List<Double> sumPairs = new ArrayList<>();
        List<Double> substractPairs = new ArrayList<>();
        List<Double> multiplyPairs = new ArrayList<>();
        List<Double> devidePairs = new ArrayList<>();
        randomInt(randomInt,1,100);
        randOperation(randomInt, sumPairs, substractPairs, multiplyPairs, devidePairs);
        //System.out.println(randomInt);
        //System.out.println("Sudetis: " + sumPairs);
        //System.out.println("Atimtis: " + substractPairs);
        //System.out.println("Daugyba: " + multiplyPairs);
        //System.out.println("Dalyba: " + devidePairs);
        ///////////////////////////////////////////////////


        ///////////////////////////////////////////////////
        System.out.println("3-4 uzduotis");

        List<String> savaitesDienos = new ArrayList<>() {{
            add("Pirmadienis");
            add("Antradienis");
            add("Treciadienis");
            add("Ketvirtadienis");
            add("Penktadienis");
            add("Sestadienis");
            add("Sekmadienis");
        }};

        List<String> upperCaseWords = new ArrayList<>();
        List<String> lowerCaseWords = new ArrayList<>();
        List<String> reversedWords = new ArrayList<>();

        stringOperation(savaitesDienos, upperCaseWords, lowerCaseWords, reversedWords);

        //System.out.println("Didziosios: " +upperCaseWords);
        //System.out.println("Mazosios: " +lowerCaseWords);
        //System.out.println("Atvirksiai: " +reversedWords);
        ///////////////////////////////////////////////////


        //////////////////////////////////////////////////////
        System.out.println("Uzduotis 5");
        List<Integer> randomIntPredicate = new ArrayList<>();
        randomInt(randomIntPredicate,-100,100);
        // predicate(randomIntPredicate);
        //////////////////////////////////////////////////////

        //////////////////////////////////////////////////////
        System.out.println("6 Uzduotis");
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> positiveNumbers = new ArrayList<>();
        List<Integer> negativeNumbers = new ArrayList<>();
        List<Integer> primaryNumbers = new ArrayList<>();
        List<Integer> notPrimaryNumbers = new ArrayList<>();

//        predicate(randomIntPredicate, evenNumbers, oddNumbers, positiveNumbers, negativeNumbers, primaryNumbers, notPrimaryNumbers);
//
//        System.out.println("Lyginiai: "+evenNumbers);
//        System.out.println("Nelyginiai "+oddNumbers);
//        System.out.println("Teigiami "+positiveNumbers);
//        System.out.println("Neigiami "+negativeNumbers);
//        System.out.println("Pirminiai "+primaryNumbers);
//        System.out.println("Nepirminiai "+notPrimaryNumbers);
        //////////////////////////////////////////////////////

        //////////////////////////////////////////////////////
        System.out.println("7-8 Uzduotis");
        //System.out.println(temperaturosCon(31));
        //System.out.println(feetCon(31));

        List<Double> celToFar = new ArrayList<>();
        List<Double> feetToMeters = new ArrayList<>();

        for (int i = 0; i < randomInt.size(); i++) {
            celToFar.add(temperaturosCon(randomInt.get(i)));
            feetToMeters.add(feetCon(randomInt.get(i)));
        }
//        System.out.println("Rand skaiciai:  "+randomInt);
//        System.out.println("C i F: "+celToFar);
//        System.out.println("pedos i metrus: "+feetToMeters);
        //////////////////////////////////////////////////////


        //////////////////////////////////////////////////////
        System.out.println("9 Uzduotis");
        List<String> zodziuSarasas = new ArrayList<>(){{
            add("Labas");
            add("Burokas");
            add("Pele");
            add("Vista");
            add("Asilas");
            add("Asilas");
            add("Asilas");
            add("Asilas");
            add("Asilas");;

        }};

        SortText s = (sarasas) -> {

                sarasas.sort(null);

            return sarasas;
        };

        System.out.println(s.sort(zodziuSarasas));

        //////////////////////////////////////////////////////


        //////////////////////////////////////////////////////
        System.out.println("10 uzduotis");

        List<Integer> skaiciuSarasas = new ArrayList<>(){{
            add(1202);
            add(20);
            add(200);
            add(100);
            add(99);
            add(45);
        }};

        SortIntegers s1 = (naujasSkaiciuSarasas) -> {
            Collections.sort(naujasSkaiciuSarasas.reversed());
            return naujasSkaiciuSarasas;
        };

        System.out.println(s1.sort(skaiciuSarasas));
        //////////////////////////////////////////////////////

        //////////////////////////////////////////////////////
        System.out.println("11 uzduotis");
        List<String> zodziuSarasas2 = new ArrayList<>(){{
            add("Labas");
            add("Burokas");
            add("");
            add("Pele");
            add("Vista");
            add("");
            add("Asilas");
            add("Asilas");
            add("");
            add("Asilas");
            add("Asilas");
            add("");
            add("Asilas");

        }};
        Transformer transformer = (naujasZodziuSarasas) -> naujasZodziuSarasas.stream().filter(s2 -> s2 != null && !s2.isEmpty())
                .collect(Collectors.toList());

        System.out.println(transformer.transform(zodziuSarasas2));
        //////////////////////////////////////////////////////

        //////////////////////////////////////////////////////
        System.out.println("12 uzduotis");


        //////////////////////////////////////////////////////

    }

    static double feetCon(double pedos) {
        Converter feetToMeters = (feet) -> feet * 0.3048;
        return feetToMeters.convert(pedos);
    }

    static double temperaturosCon(int laipsniai){
       Converter celsiusToFahrenheit = (celsius) -> (celsius * 9 / 5) + 32;
       return celsiusToFahrenheit.convert(laipsniai);
    }

    static void predicate (List<Integer> skaiciai,
                           List<Integer> evenNumbers,
                           List<Integer> oddNumbers,
                           List<Integer> positiveNumbers,
                           List<Integer> negativeNumbers,
                           List<Integer> primaryNumbers,
                           List<Integer> notPrimaryNumbers){
        Predicate lyginis = (a) -> a % 2 == 0;
        Predicate reiksmeTeigiamaArNeigiama = (a) -> a > 0;
        Predicate arPirminis = a -> {
            if (a <= 1) return false;

            for (int i = 2; i * i <= a; i++) {
                if (a % i == 0) return false;
            }
            return true;
        };

        for (int i = 0; i < skaiciai.size(); i++){

            if (lyginis.test(skaiciai.get(i))){
                evenNumbers.add(skaiciai.get(i));
            } else {
                oddNumbers.add(skaiciai.get(i));
            }

            if (reiksmeTeigiamaArNeigiama.test(skaiciai.get(i))) {
                positiveNumbers.add(skaiciai.get(i));
            } else {
                negativeNumbers.add(skaiciai.get(i));
            }

            if (arPirminis.test(skaiciai.get(i))) {
                primaryNumbers.add(skaiciai.get(i));
            } else {
                notPrimaryNumbers.add(skaiciai.get(i));
            }
        }


    }

    static void predicate (List<Integer> skaiciai){
        Predicate lyginis = (a) -> a % 2 == 0;
        Predicate reiksmeTeigiamaArNeigiama = (a) -> a > 0;
        Predicate arPirminis = a -> {
            if (a <= 1) return false;

            for (int i = 2; i * i <= a; i++) {
                if (a % i == 0) return false;
            }
            return true;
        };

        for (int i = 0; i < skaiciai.size(); i++){
            System.out.println(
                    skaiciai.get(i)+ " Lyginis: "+lyginis.test(skaiciai.get(i))+" "
                            + " Ar teigiamas: " +reiksmeTeigiamaArNeigiama.test(skaiciai.get(i))+ " "
                            + " ArPirminis: " +arPirminis.test(skaiciai.get(i))
            );
        }
    }

    static void stringOperation(
            List<String> savaitesDienos,
            List<String> upperSarasas,
            List<String> lowerSarasas,
            List<String> reversedSarasas
    ) {
        StringOperation upperCase = String::toUpperCase;
        StringOperation lowerCase = String::toLowerCase;
        StringOperation reversedWord = tekstas -> new StringBuilder(tekstas).reverse().toString();

        for (int i = 0; i < savaitesDienos.size(); i++) {
            upperSarasas.add(upperCase.manipulate(savaitesDienos.get(i)));
            lowerSarasas.add(lowerCase.manipulate(savaitesDienos.get(i)));
            reversedSarasas.add(reversedWord.manipulate(savaitesDienos.get(i)));
        }

    }

    static void randomInt(List<Integer> skaiciai,int min,int max) {
        for (int i = 0; i < 20; i++) {
            var random = new Random().nextInt(min, max);
            skaiciai.add(random);
        }
    }

    static void randOperation
            (
                    List<Integer> skaiciai,
                    List<Double> sumPairs,
                    List<Double> substractPairs,
                    List<Double> multiplyPairs,
                    List<Double> devidePairs
            ) {
        MathOperation sudeti = Integer::sum;
        MathOperation atimti = (a, b) -> a - b;
        MathOperation dauginti = (a, b) -> a * b;
        MathOperation dalinti = (a, b) -> a / b;
        int b = 0;
        int x = 1;
        for (int i = 0; i < skaiciai.size() / 2; i++) {

            // TODO Negrazina liekanos
            sumPairs.add((double) sudeti.operation(skaiciai.get(b), skaiciai.get(x)));
            substractPairs.add((double) atimti.operation(skaiciai.get(b), skaiciai.get(x)));
            multiplyPairs.add((double) dauginti.operation(skaiciai.get(b), skaiciai.get(x)));
            devidePairs.add((double) dalinti.operation(skaiciai.get(b), skaiciai.get(x)));
            b += 2;
            x += 2;
        }
    }
}
























