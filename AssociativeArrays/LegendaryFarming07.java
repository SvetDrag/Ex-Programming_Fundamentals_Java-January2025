package AssociativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class LegendaryFarming07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);


        int shadowmourne = 0;
        int valanyr = 0;
        int dragonwrath = 0;
        int shards = 0;
        int fragments = 0;
        int motes = 0;
        Map<String, Integer> materialsMap = new LinkedHashMap<>();
        Map<String, Integer> oderMaterials = new LinkedHashMap<>();

        List<String> input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        int poss1 = 0;
        int poss2 = 1;
        String material = " ";

        for (int i = 0; i < input.size()-1; i++) {
            material = input.get(poss2);

            switch (material){

                case "shards" -> {

                int num = Integer.parseInt(input.get(poss1));
                shards += num;
                    if(!oderMaterials.containsKey(material)){
                        num = Integer.parseInt(input.get(poss1));
                        oderMaterials.put(material, num);
                    }
                    else {
                        num = Integer.parseInt(input.get(poss1)) + oderMaterials.get(material);
                        oderMaterials.put(material, num);
                    }
                }

                case "fragments" -> {
                    int num = Integer.parseInt(input.get(poss1));
                    fragments += num;
                    if(!oderMaterials.containsKey(material)){
                        num = Integer.parseInt(input.get(poss1));
                        oderMaterials.put(material, num);
                    }
                    else {
                        num = Integer.parseInt(input.get(poss1)) + oderMaterials.get(material);
                        oderMaterials.put(material, num);
                    }
                }

                case "motes" -> {
                    int num = Integer.parseInt(input.get(poss1));
                    motes += num;
                    if(!oderMaterials.containsKey(material)){
                        num = Integer.parseInt(input.get(poss1));
                        oderMaterials.put(material, num);
                    }
                    else {
                        num = Integer.parseInt(input.get(poss1)) + oderMaterials.get(material);
                        oderMaterials.put(material, num);
                    }
                }
                default -> {
                    if(!oderMaterials.containsKey(material)){
                        int num = Integer.parseInt(input.get(poss1));
                        oderMaterials.put(material, num);
                    }
                    else {
                        int num = Integer.parseInt(input.get(poss1)) + oderMaterials.get(material);
                        oderMaterials.put(material, num);
                    }
                }


            }


            poss1 += 2;
            poss2 += 2;

        }

        for (Map.Entry<String, Integer> entry : oderMaterials.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }



    }
}
