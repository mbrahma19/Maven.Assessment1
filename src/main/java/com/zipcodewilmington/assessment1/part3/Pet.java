package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public abstract class Pet implements Animal {


    private String name;
    private Integer age;
    private PetOwner owner;

    /**
     * nullary constructor
     * by default, pet has age of 0; name of "";
     *
     */
    public Pet() {
        this.name = "";
        this.age = 0;
        this.owner = null;
    }

    /**
     * @param name name of this pet
     */
    public Pet(String name) {
        this.name = name;
        this.age = 0;
    }


    /**
     * @param age age of this pet
     */
    public Pet(int age) {
        this.age = age;
        this.name = "";
    }

    /**
     * @param name name of this pet
     * @param age age of this pet
     */
    public Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * @return name of this pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name
     */
    public void setName(String name){ this.name = name; }

    /**
     * @return age of this pet
     */
    public Integer getAge() {
        return this.age;
    }

    /**
     *
     * @param age
     */
    public void setAge(int age){ this.age = age; }

    /**
     * @param newPetOwner the new owner of this pet
     * ensure this instance of `Pet` is added to the owner's composite `pets` list
     */
    public void setOwner(PetOwner newPetOwner) {
        this.owner = newPetOwner;
    }

    /**
     * @return PetOwner object whose composite `pets` collection contains this Pet instance
     */
    public PetOwner getOwner() {
        return this.owner;
    }
}
