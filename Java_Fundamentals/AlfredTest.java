public class AlfredTest {
        /*
         * This main method will always be the launch point for a Java application
         * For now, we are using the main to test all our
         * AlfredQuotes methods.
         */
        public static void main(String[] args) {
                // Make an instance of AlfredQuotes to access all its methods.
                AlfredQuotes alfredBot = new AlfredQuotes();

                // Make some test greetings, providing any necessary data
                String testGreeting = alfredBot.basicGreeting();
                String testGuestGreeting = alfredBot.guestGreeting("Beth Kane");
                String testGuestGreeting2 = alfredBot.guestGreeting("Beth", "Evening");
                String testDateAnnouncement = alfredBot.dateAnnouncement();

                String alexisTest = alfredBot.respondBeforeAlexis("Alexis! Play some low-fi beats.");
                String alfredTest = alfredBot
                                .respondBeforeAlexis("I can't find my yo-yo. Maybe Alfred will know where it is.");
                String notRelevantTest = alfredBot
                                .respondBeforeAlexis("Maybe that's what Batman is about. Not winning. But failing..");

                String crimeTest1 = alfredBot.gothamCityCrimeReport("Crime Takes Over Gotham City!", "Robin");
                String crimeTest2 = alfredBot.gothamCityCrimeReport("The Joker and Harley Quinn are at it again!",
                                "Robin");
                String crimeTest3 = alfredBot.gothamCityCrimeReport("Stocks rise in Gotham City today.", "Robin");

                // Print the greetings to test.
                System.out.println(testGreeting);

                // Uncomment these one at a time as you implement each method.
                System.out.println(testGuestGreeting);
                System.out.println(testGuestGreeting2);
                System.out.println(testDateAnnouncement);
                System.out.println(alexisTest);
                System.out.println(alfredTest);
                System.out.println(notRelevantTest);

                System.out.println(crimeTest1);
                System.out.println(crimeTest2);
                System.out.println(crimeTest3);
        }
}
