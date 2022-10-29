class Application {

    public static void main(String[] args) {
        Repository repo = new Repository();

        Race kot=new Race();
        kot.setName("Kociołek");

        Race pies=new  Race();
        pies.setName("Piesio");

        Owner owner1 = new Owner();
        owner1.setFirstName("Szymoln");
        owner1.setLastName("Żalkiewicz");

        Owner owner2 = new Owner();
        owner2.setFirstName("Mama");
        owner2.setLastName("Niuniek");

        Owner owner3 = new Owner();
        owner3.setFirstName("Piotr");
        owner3.setLastName("K.");

        Pet pet1 = new Pet();
        pet1.setName("Maciuniuniuniek");
        pet1.setOwner(owner1);
        pet1.setRace(kot);


        Pet pet2 = new Pet();
        pet2.setName("Panna Kitka");
        pet2.setOwner(owner1);
        pet2.setRace(kot);

        Pet pet3 = new Pet();
        pet3.setName("Pan Kotek");
        pet3.setOwner(owner1);
        pet3.setRace(kot);

        Pet pet4 = new Pet();
        pet4.setName("Szary");
        pet4.setRace(kot);

        Pet pet5 = new Pet();
        pet5.setName("Krzywy łepek");
        pet5.setRace(kot);

        Pet pet6=new Pet();
        pet6.setName("Wanda");
        pet6.setRace(pies);


        owner1.setPet(pet1);
        owner2.setPet(pet2);
        owner3.setPet(pet6);

        repo.addRace(kot);
        repo.addRace(pies);

        repo.addPet(pet1);
        repo.addPet(pet2);
        repo.addPet(pet3);
        repo.addPet(pet4);
        repo.addPet(pet5);
        repo.addPet(pet6);

        repo.addOwner(owner1);
        repo.addOwner(owner2);
        repo.addOwner(owner3);


//        System.out.println( repo.selectOwner(2));

    }
}
