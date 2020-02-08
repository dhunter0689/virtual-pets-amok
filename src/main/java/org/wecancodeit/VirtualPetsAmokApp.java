package org.wecancodeit;

import java.util.Scanner;

public class VirtualPetsAmokApp {

	public static void main(String[] args) {

		VirtualPetShelter shelter = new VirtualPetShelter();
		Scanner input = new Scanner(System.in);

		OrganicPets Shelby = new OrgCats("Shelby", "clumsy tabby cat");

		OrganicPets Bruno = new OrgDogs("Bruno", "the coolest bulldog pup");

		RoboticPets Lyric = new RobotCats("Lyric", "the robotic bengal cat");

		boolean exit = false;

		do {
			for (ShelterPets pet : shelter.pets()) {
				if (pet instanceof OrgDogs) {
					if (((OrgDogs) pet).getCageLevel() >= 5) {
						System.out.println(pet.getName() + "'s cage needs cleaning. ");
						((OrgDogs) pet).decreaseHealth();
					}
				}
			}

			if (shelter.litBoxClean() == 7) {
				System.out.println("The litter box is full it needs to be cleaned. ");
				for (ShelterPets pet : shelter.pets()) {
					if (pet instanceof OrgCats) {
						((OrgCats) pet).decreaseHealth();
					}
				}
			}
			System.out.println("\nWelcome to the Littlest Pet Shop Shelter ");
			System.out.println("\nHere are the pets: ");
			System.out.println("\nName\t|Hunger\t|Thirst\t|Health\t|Energy\t|Boredom\t|Hygiene\t|Oil ");
			System.out.println("________|________|________|________|________|_________|_________|___|");
			
			
			for (ShelterPets currentPet : shelter.pets()) {

				System.out.print(currentPet.getName() + "\t|" + ((ShelterPets) currentPet).getBoredom() + "\t|"

						+ ((ShelterPets) currentPet).getHealth() + "\t|");

				if (currentPet instanceof OrganicPets) {

					System.out.print(((OrganicPets) currentPet).getHunger() + "\t|"

							+ ((OrganicPets) currentPet).getThirst() + "\t|0\t|");

				}

				if (currentPet instanceof OrgDogs) {

					System.out.print("" + ((OrgDogs) currentPet).getCageLevel() + "\t|");

				} else {

					System.out.print("0\t|");

				}

				System.out.print("\n");



			}



			System.out.println("\nLitterbox\n" + " level:" + shelter.litBoxClean());

			System.out.println("\nWhat would you like to do next?");

			System.out.println("Select a number to continue");

			System.out.println(" ______________________");

			System.out.println("|                      |");

			System.out.println("| 1. Give Food         |");

			System.out.println("| 2. Give Water        |");

			System.out.println("| 3. Play With a Pet   |");

			System.out.println("| 4. Adopt             |");

			System.out.println("| 5. Drop off a Pet    |");

			System.out.println("| 6. Clean Dog Cages   |");

			System.out.println("| 7. Clean Litterbox   |");

			System.out.println("| 8. Walk the dogs     |");

			System.out.println("| 9. Oil the robots    |");

			System.out.println("| 10. Exit the shelter |");

			System.out.println("|______________________|");



			String userResponse = input.nextLine();



			switch (userResponse) {

			case "1":

				shelter.feedAllOrganic();

				System.out.print("You fed all the organic pets.");

				break;

			case "2":

				shelter.giveWaterAllOrganic();

				System.out.print("You watered all the organic pets.");

				break;

			case "3":

				System.out.println("Which pet would you like to play with?");

				displayPets(shelter);

				String petName = input.nextLine();

				shelter.playWithOne(shelter.getPet(petName));

				System.out.println("You played with " + shelter.getPet(petName) + ". ");

				break;

			case "4":

				System.out.print("You selected to adopt a pet. Please choose one:\n");

				displayPets(shelter);

				System.out.print("\nWhich pet would you like to adopt");

				String nameToAdopt = input.nextLine();

				ShelterPets a = shelter.getPet(nameToAdopt);

				shelter.adoptPet(a);

				System.out.print("You adopted " + nameToAdopt + ". Please take good care of him/her!");

				break;

			case "5":

				System.out.print("Is this an organic or robotic pet?");

				String response2 = input.next();

				if (response2.equalsIgnoreCase("organic")) {

					System.out.print("Is this a cat or dog?");

					String response3 = input.next();

					input.nextLine();



					if (response3.equalsIgnoreCase("dog")) {

						System.out.print("What is the dog's name?");

						String name = input.nextLine();



						System.out.print("What type of dog is this?");

						String description = input.nextLine();



						OrganicPets pet = new OrgDogs(name, description);

						shelter.foundPet(pet);

						System.out.print("We'll take good care of " + pet.getName() + ".");

					} else if (response3.equalsIgnoreCase("cat")) {

						System.out.print("What is the cat's name?");

						String name = input.nextLine();



						System.out.print("What type of cat is this?");

						String description = input.nextLine();



						OrganicPets pet = new OrgCats(name, description);

						shelter.foundPet(pet);

						System.out.print("We'll take good care of " + pet.getName() + ".");

					}



				} else if (response2.equalsIgnoreCase("robotic")) {

					System.out.print("");

					String response3 = input.next();

					input.nextLine();




					 if (response3.equalsIgnoreCase("cat")) {

						System.out.print("What is the cat's name?");

						String name = input.nextLine();

						System.out.print("What type of robotic cat is this?");

						String description = input.nextLine();



						RoboticPets pet = new RobotCats(name, description);

						shelter.foundPet(pet);

						System.out.print("We'll take good care of " + pet.getName() + ".");

					}

				}

				break;

			case "6":

				shelter.cleanPetCage();

				System.out.print("You cleaned all the dog cages.");

				break;

			case "7":

				shelter.getLitBoxClean();

				System.out.print("You cleaned the litter box.");

				break;

			case "8":

				shelter.walkDogs();

				System.out.print("You walked the dogs! They enjoyed their time outside and would like to go again soon.");

				break;

			case "9":

				shelter.upkeepAllRobos();

				System.out.print("You oiled the robotic pets!");

				break;

			case "10":

				System.out.print("See you next time! ");

				System.exit(0);

			default:

				System.out.print("Can you repeat that please?");

				break;



			}

			shelter.tick();



		} while (!exit);

		input.close();



	}



	private static void displayPets(VirtualPetShelter shelter) {

		for (ShelterPets currentPet : shelter.pets()) {

			System.out.print("" + currentPet);

		}

	}



}
			
	

