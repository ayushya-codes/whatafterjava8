package com.leanquitous.java_fourteen;

/**
 * Refer the JDK-14 Features.md for more details on this feature.
 */
public class RecordDemo {
    public static void main(String[] args) {
        UserRecord userRecord = new UserRecord(1, "Ayushya", "D");
        System.out.println(userRecord);

        DemoInternalClass.NewTypeOfUser newTypeOfUser = new DemoInternalClass.NewTypeOfUser(1, "sample", "business");
        System.out.println(newTypeOfUser);


        System.out.println(DemoInternalClass.userRecord);
    }

    static class DemoInternalClass {

        // Earlier this was not allowed, it is allowed since JDK - 17 that records can be part of internal class.
        static UserRecord userRecord = new UserRecord(2, "Jg", "d");


        record NewTypeOfUser(int id, String name, String business) {
        }

    }
}

record UserRecord(int id, String name, String surname) {
}



