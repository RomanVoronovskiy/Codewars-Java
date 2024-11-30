package ru.boost_for_java.solution;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        System.out.println("saleHotdogs(1) = " + saleHotdogs(1));
//        billboard("Jeong-Ho Aristotelis",30);
//    guessBlue(5,5,2,3);
//        oddCount(7);
        // assertEquals("apple", Kata.subtractSum(10));
//        System.out.println(subtractSum(10));
//        NameMe nameMe = new NameMe("John", "Doe");
//        System.out.println("nameMe.getFirstName() = " + nameMe.getFirstName());
//        System.out.println("nameMe.getLastName() = " + nameMe.getLastName());
//        System.out.println("nameMe.getFullName() = " + nameMe.getFullName());
        System.out.println(pythagoreanTriple(new int[]{13, 12, 5}));
        System.out.println(sortOne(Arrays.asList("Algebra", "History", "Geometry", "english")));
    }

    public static int pythagoreanTriple(int[] triple) {
        Arrays.sort(triple);
        return triple[0] * triple[0] + triple[1] * triple[1] == triple[2] * triple[2] ? 1 : 0;

        add commit2
    }

    public static List<String> sortOne(List<String> textbooks) {
        textbooks.sort((String o1, String o2) -> {
            String oOneCopy = o1.toLowerCase(Locale.ROOT);
            String oTwoCopy = o2.toLowerCase(Locale.ROOT);
            if (oOneCopy.equalsIgnoreCase(oTwoCopy)) {
                return 0;
            } else {
                return oOneCopy.compareTo(oTwoCopy);
            }
        });
        return textbooks;
    }
    public static List<String> sortTwo(List<String> textbooks) {
        textbooks.sort((String o1, String o2) -> {
            return o1.compareToIgnoreCase(o2);
        });
        return textbooks;

    }

    //
//    количество хот-догов	цена за единицу (центы)
//    n < 5	            100
//    n>= 5 и n < 10	95
//    n >= 10           90
    //
    public static int saleHotdogs(final int n) {
        if (n < 5) {
            return 100 * n;
        }
        if (n >= 5 && n < 10) {
            return 95 * n;
        } else {
            return 90 * n;
        }
    }

    public static int billboard(String name, int price) {
        int res = 0;
        for (int i = 0; i < name.length(); i++) {
            res += price;
        }
        return res;
    }

    public static double guessBlue(int blueStart, int redStart, int bluePulled, int redPulled) {
        return (double) (blueStart - bluePulled) / (blueStart + redStart - bluePulled - redPulled);
    }

    public static int oddCount(int n) {
        int konechn = n;
        // konechn =  nach + 2 (n-1)
        // konechn - nach = 2 (n-1)
        // (konechn - nach)/2 = n-1
        //(konechn - nach)/2 + 1 = n
        if (n % 2 == 0) {
            konechn--;
        } else {
            konechn -= 2;
        }
        return (konechn - 1) / 2 + 1;
    }


    public static String subtractSum(int n) {
        Map<Integer, String> map = generateInitMap();
        while (n > 0) {
            int sum = 0;
            int m = n;
            while (m > 0) {
                sum += m % 10;
                m /= 10;
            }
            if (map.containsKey(n - sum)) {
                return map.get(n - sum);
            }
            n -= sum;
        }
        return null;
    }

    private static Map<Integer, String> generateInitMap() {
        String data = """
                1-kiwi
                2-pear
                3-kiwi
                4-banana
                5-melon
                6-banana
                7-melon
                8-pineapple
                9-apple
                10-pineapple
                11-cucumber
                12-pineapple
                13-cucumber
                14-orange
                15-grape
                16-orange
                17-grape
                18-apple
                19-grape
                20-cherry
                21-pear
                22-cherry
                23-pear
                24-kiwi
                25-banana
                26-kiwi
                27-apple
                28-melon
                29-banana
                30-melon
                31-pineapple
                32-melon
                33-pineapple
                34-cucumber
                35-orange
                36-apple
                37-orange
                38-grape
                39-orange
                40-grape
                41-cherry
                42-pear
                43-cherry
                44-pear
                45-apple
                46-pear
                47-kiwi
                48-banana
                49-kiwi
                50-banana
                51-melon
                52-pineapple
                53-melon
                54-apple
                55-cucumber
                56-pineapple
                57-cucumber
                58-orange
                59-cucumber
                60-orange
                61-grape
                62-cherry
                63-apple
                64-cherry
                65-pear
                66-cherry
                67-pear
                68-kiwi
                69-pear
                70-kiwi
                71-banana
                72-apple
                73-banana
                74-melon
                75-pineapple
                76-melon
                77-pineapple
                78-cucumber
                79-pineapple
                80-cucumber
                81-apple
                82-grape
                83-orange
                84-grape
                85-cherry
                86-grape
                87-cherry
                88-pear
                89-cherry
                90-apple
                91-kiwi
                92-banana
                93-kiwi
                94-banana
                95-melon
                96-banana
                97-melon
                98-pineapple
                99-apple
                100-pineapple
                """;
        String[] mass = data.split("\n");
        Map<Integer, String> result = new HashMap<>();
        for (int i = 0; i < mass.length; i++) {
            String[] dataMass = mass[i].split("-");
            result.put(Integer.parseInt(dataMass[0]), dataMass[1]);
        }
        return result;
    }
}