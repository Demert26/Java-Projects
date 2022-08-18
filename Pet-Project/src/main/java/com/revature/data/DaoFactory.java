package com.revature.data;

import com.revature.entity.Pet;

public class DaoFactory {

    private static PetDao petDao = null;

    private DaoFactory() {

    }

    public static PetDao getPetDao(){

        if(petDao == null){
            System.out.println( "");
        }
        return null;
    }


}
