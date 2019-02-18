package com.zipcodewilmington.assessment1.part3;

import com.zipcodewilmington.assessment1.part2.ArrayUtils;


/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {

    private String name;
    private Pet[] petList;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        this.petList = pets;
        setOwnersInConstructions(pets);
    }

    public void setOwnersInConstructions(Pet...pets){
        if(pets != null) {
            for (Pet p : pets) {
                p.setOwner(this);
            }
        }
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        Pet[] petToAdd = new Pet[]{pet};
        if(petList == null){
            petList = new Pet[]{pet};
        }else {
            petList = (Pet[]) ArrayUtils.mergeArraysObject(petList, petToAdd);
        }
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        if(isOwnerOf(pet)){
            petList = ArrayUtils.removeValueObject(petList,pet);
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        int occurences =  ArrayUtils.getNumberOfOccurrences(petList,pet);
        return (occurences > 0) ? true : false;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        Integer youngest = Integer.MAX_VALUE;

        for(Pet p : petList){
            if(p.getAge() < youngest){
                youngest = p.getAge();
            }
        }
        return youngest;
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Integer oldest = Integer.MIN_VALUE;

        for(Pet p : petList){
            if(p.getAge() >  oldest){
                oldest = p.getAge();
            }
        }
        return oldest;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        float ageTotal = 0;
        for(Pet p : petList){
            ageTotal = ageTotal + p.getAge();
        }
        return ageTotal/getNumberOfPets();
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        Integer counter = 0;
        for(Pet p : petList){
            if(p!=null){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        if(petList!=null){
            return this.petList;
        }else{ return new Pet[1];}
    }
}
