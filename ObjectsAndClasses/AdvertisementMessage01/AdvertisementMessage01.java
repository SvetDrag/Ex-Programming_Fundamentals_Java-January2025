package ObjectsAndClasses.AdvertisementMessage01;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage01 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner (System.in);
        int num = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < num; i++) {
            printAdvertisementMessage();
        }

    }

    public static void printAdvertisementMessage (){

        String [] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.",
                "Exceptional product.", "I can’t live without this product."};
        String [] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String [] authors = { "Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String [] cities = { "Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        String randomPhrases = getRandomWord(phrases);
        String randomEvents = getRandomWord(events);
        String randomAuthors = getRandomWord(authors);
        String randomCities = getRandomWord(cities);

        System.out.println(randomPhrases + " " + randomEvents + " " + randomAuthors + " - " + randomCities);


    }
    public static String getRandomWord(String [] words){
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];

        return word;


    }
}
