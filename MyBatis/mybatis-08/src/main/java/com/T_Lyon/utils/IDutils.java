package com.T_Lyon.utils;


import org.junit.Test;

import java.util.UUID;

//’Ú—πæØ∏Ê
@SuppressWarnings("all")
public class IDutils {
    public static String getID() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    @Test
    public void testid() {
        System.out.println(IDutils.getID());
        System.out.println(IDutils.getID());
        System.out.println(IDutils.getID());
        System.out.println(IDutils.getID());
    }
}
