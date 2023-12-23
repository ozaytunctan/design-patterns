package org.javaturk.dp.ch04.factoryMethod.employee;

import java.security.SecureRandom;

public class EmployeeRandomizer {


    private static SecureRandom secureRandom = new SecureRandom();

    public static int createId() {
        return secureRandom.nextInt();
    }

    public static String createName() {
        return "";
    }

    public static int createYear() {
        return -1;
    }

    public static String createDepartment() {
        return "";
    }
}
