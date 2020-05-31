package com.employee;


import java.util.Arrays;

public class PartE {

	public void getFrequencyOfVisitedWebsites(String[] browsingHistory, String[] restrictedWebsites) {
		// ************************************ TODO E1 ************************************
		/*
		 * This method should print :
		 * <<WebsiteName>>:<<Frequency>>
		 * <<WebsiteName>>:<<Frequency>>
		 *
		 * For Example :  Instagram:3
		 * 				  Facebook:0
		 *
		 * Pass the frequency in an array in order of the websites.
		 *
		 * Uncomment the line "TestYourCode.testFrequencyOfVisitedWebsites(restrictedWebsites,freq)" to test your code
		 * Note : 	restrictedWebsites is String array given
		 * 			freq is an integer array which contains the frequency of corresponding restrictedWebsites
		 */
		// ************************************ SOLUTION E1 BEGIN ***********************************
		int[] freq = new int[4];
		int c = 0;
		int k = 0;
		for (int i = 0; i < restrictedWebsites.length; i++) {
			c = 0;
			for (int j = 0; j < browsingHistory.length; j++) {
				if (restrictedWebsites[i].toUpperCase().equals(browsingHistory[j].toUpperCase())) {
					c++;
					freq[k] = c;
					//System.out.println(restrictedWebsites[i]);
				}
			}
			k++;
			System.out.println(freq[i]);
		}
		// Uncomment the line below to test your code

		TestYourCode.testFrequencyOfVisitedWebsites(restrictedWebsites, freq);

		// ************************************ SOLUTION E1 END ************************************
	}


	public void findSimilarNamedTeams(PermanentEmployee[] perm) {
		// ************ TODO E2 ************
		/*
		 * This method should print number of teams
		 *
		 * Uncomment the line "TestYourCode.testSimilarNamedTeam(count)" to test your code
		 * Note : Here, count is an integer data type storing the number of teams that can be formed.
		 */
		String[] str = new String[perm.length];
		int count = 0;

		for (int i = 0; i < perm.length; i++) {
			str[i] = perm[i].getName();
		}

		for (int i = 0; i < perm.length; i++) {
			for (int j = i + 1; j < perm.length; j++) {
				if (isAnagram(str[i], str[j]) && str[j] != "0") {

					count++;
					str[j] = "0";
					break;
				}
			}
		}
		System.out.println(count);

		// ************ SOLUTION E2 BEGIN ************

		// Uncomment line below to test your code
		TestYourCode.testSimilarNamedTeams(count);

		//************ SOLUTION E2 END ************
	}

	public boolean isAnagram(String str1, String str2) {
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();

		if (str1.equals(str2))
			return true;

		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();

		Arrays.sort(char1);
		Arrays.sort(char2);

		for (int i = 0; i < str1.length(); i++)
			if (char1[i] != char2[i])

				return false;

		return true;
	}
}