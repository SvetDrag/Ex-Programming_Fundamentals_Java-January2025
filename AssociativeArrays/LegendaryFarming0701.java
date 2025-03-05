package AssociativeArrays;
import java.util.*;

public class LegendaryFarming0701 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> keyMaterials = new LinkedHashMap<>();
        keyMaterials.put("shards", 0);
        keyMaterials.put("fragments", 0);
        keyMaterials.put("motes", 0);


        Map<String, Integer> junkMaterials = new LinkedHashMap<>();
        boolean isObtained = false;
        String obtainedItem = "";

        while (!isObtained) {
            String[] input = scanner.nextLine().split("\\s+");

            for (int i = 0; i < input.length; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();

                if (keyMaterials.containsKey(material)) {
                    keyMaterials.put(material, keyMaterials.get(material) + quantity);

                    if (keyMaterials.get(material) >= 250) {
                        keyMaterials.put(material, keyMaterials.get(material) - 250);
                        obtainedItem = getLegendaryItem(material);
                        isObtained = true;
                        break;
                    }
                } else {
                    junkMaterials.put(material, junkMaterials.getOrDefault(material, 0) + quantity);
                }
            }
        }


        System.out.println(obtainedItem + " obtained!");

        // Отпечатваме ключовите материали в желания ред
        System.out.println("shards: " + keyMaterials.get("shards"));
        System.out.println("fragments: " + keyMaterials.get("fragments"));
        System.out.println("motes: " + keyMaterials.get("motes"));


        for (Map.Entry<String, Integer> entry : junkMaterials.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static String getLegendaryItem(String material) {
        return switch (material) {
            case "shards" -> "Shadowmourne";
            case "fragments" -> "Valanyr";
            case "motes" -> "Dragonwrath";
            default -> "";
        };
    }
}
