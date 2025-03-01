package AssociativeArrays;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map <String, String> registeredUsers = new LinkedHashMap<>();


        for (int i = 1; i <= n; i++) {
            String [] input = scanner.nextLine().split(" ");
            String command = input[0];
            String name = input[1];


            if (command.equals("register")){
                String licensePlateNumber = input[2];

                if (!registeredUsers.containsKey(name)){
                    registeredUsers.put(name, licensePlateNumber);
                    System.out.printf("%s registered %s successfully%n", name, licensePlateNumber);
                }
                else {
                    System.out.printf("ERROR: already registered with plate number %s%n", registeredUsers.get(name));
                }

            }
            else {

                if (registeredUsers.containsKey(name)){
                    registeredUsers.remove(name);
                    System.out.printf("%s unregistered successfully%n", name);
                }

                else {
                    System.out.printf("ERROR: user %s not found%n", name);
                }

            }


        }

        for (Map.Entry<String, String> entry : registeredUsers.entrySet()){
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }


    }
}
