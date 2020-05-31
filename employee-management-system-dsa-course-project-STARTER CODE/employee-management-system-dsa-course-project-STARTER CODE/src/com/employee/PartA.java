package com.employee;
public class PartA {

	public void createTeams(PermanentEmployee[] perm) {
		// ************************************ TODO A1 ************************************
		/*
		 * This method should print the even and odd teams along with their respective captains.
		 * 
		 * If there are less than 11 players in any of the team, Print
		 * "Teams cannot be formed"
		 * 
		 * Uncomment the line containing "TestYourCode.testTeams(evenTeam, oddTeam)" to test your code 
		 * Note : evenTeam and OddTeam are integer arrays containing employee Ids of evenTeam and oddTeam respectively.
		 */

		// ************************************ SOLUTION A1 BEGIN ***********************************

        //take a even team array
                int[] evenTeam = new int[11];
        //take a odd team array
                int[] oddTeam = new int[11];
                int x = 0;
                int y = 0;
                for (int i = perm.length - 1; i > -1 ; i--) {
                    if (x == 11 && y == 11) {
                        break;
                    }

            //store the perm employee id in even array
                    if (x < 11 && perm[i].getId() % 2 == 0) {
                        evenTeam[x] = perm[i].getId();
                        x++;
                    } else if (y < 11){
                        oddTeam[y] = perm[i].getId();
                        y++;
                    }
                }

                if (x == 11 && y == 11) {
                    for (int i = 0; i < 11; i++) {
                        System.out.print(evenTeam[i] + " ");
                    }

                    System.out.println("\n" + evenTeam[5]);

                    for (int i = 0; i < 11; i++) {
                        System.out.print(oddTeam[i] + " ");
                    }
                    System.out.println("\n" + oddTeam[5]);
                     }
                   else {
                    System.out.println("Teams cannot be formed");
                }

                // Uncomment the line below to test your code
                TestYourCode.testTeams(evenTeam, oddTeam);

		// ************************************ SOLUTION A1 END************************************
	}
	
	
	

	public void findTwoBestPerformers(PermanentEmployee[] perm) {
		// ************************************ TODO A2 ************************************
		/*
		 * This method should print Employee ID, Name and Rating of the two Employees
		 * who have the maximum Ratings (100 being the best).
		 * 
		 * Uncomment the line containing TestYourCode.testTwoBestPerformers(bestPerformer.getId(), secondPerformer.getId())
		 * to test your code 
		 */



		//************************************ SOLUTION A2 BEGIN ************************************

        PermanentEmployee bestPerformer = perm[0];
        PermanentEmployee secondPerformer = perm[0];

        for (int i = 1; i < perm.length; i++) {
            if(bestPerformer.getRating() < perm[i].getRating()) {
                secondPerformer = bestPerformer;
                bestPerformer = perm[i];
            } else if(secondPerformer.getRating() < perm[i].getRating()){
                secondPerformer = perm[i];
            }
        }
// Uncomment the line below to test your code
        TestYourCode.testTwoBestPerformers(bestPerformer.getId(), secondPerformer.getId());
		// ************************************ SOLUTION A2 END ************************************
	}
}

