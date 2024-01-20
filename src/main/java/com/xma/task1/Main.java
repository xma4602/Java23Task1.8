package com.xma.task1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> strings = new HashSet<>();
        System.out.println("Вводите значения.");
        try {
            int position = 0;
            while (true) {
                System.out.printf("Значение №%s: ", position);
                String line = scanner.nextLine();
                if (!strings.add(line)) {
                    throw new AlreadyExistsException(position, line);
                }
                position++;
            }
        } catch (AlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
    }
}
