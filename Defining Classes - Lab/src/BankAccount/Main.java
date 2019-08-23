package BankAccount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<Integer, BankAccount> bankAccountMap = new HashMap<Integer, BankAccount>();

        String input;
        while (!"End".equals(input = reader.readLine())) {
            String[] tokens = input.split("\\s+");

            switch (tokens.length) {
                case 1:
                    BankAccount bk1 = new BankAccount();
                    bankAccountMap.put(bk1.getId(), bk1);
                    System.out.println(String.format("Account ID%d created", bk1.getId()));
                    break;
                case 2:
                    BankAccount.setInterestRate(Double.parseDouble(tokens[1]));

                    break;
                case 3:
                    int id = Integer.parseInt(tokens[1]);
                    if (!bankAccountMap.containsKey(id)) {
                        System.out.println("Account does not exist");
                    } else {
                        double amount = Double.parseDouble(tokens[2]);
                        if ("Deposit".equals(tokens[0])) {
                            bankAccountMap.get(id).deposit(amount);
                            System.out.println(String.format("Deposited %.0f to ID%d", amount, id));
                        } else {
                            System.out.println(String.format("%.2f", bankAccountMap.get(id).getInterest(Integer.parseInt(tokens[2]))));
                        }
                    }
                    break;
            }
        }
    }
}
