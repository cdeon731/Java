import java.util.Date;

public class AlfredQuotes {

    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
        return String.format("Hello, %s. Lovely, to see you!", name);
    }

    public String dateAnnouncement() {
        return String.format("It is currently %s.", new Date());
    }

    public String respondBeforeAlexis(String conversation) {
        if (conversation.indexOf("Alexis") > -1) {
            return "She's really of no help. What can I get for you?";
        } else if (conversation.indexOf("Alfred") > -1) {
            return "At your service, naturally. How may I be of assistance?";
        } else {
            return "Right. And with that I shall retire.";
        }
    }

    // NINJA BONUS
    // See the specs to overload the guessGreeting method
    public String guestGreeting(String name, String dayPeriod) {
        return String.format("Good %s, %s. Lovely, to see you!", dayPeriod, name);
    }

    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have
    // learned!
    public String gothamCityCrimeReport(String news, String name) {
        if (news.indexOf("Crime") > -1) {
            return String.format("Batman! You are needed at once! Gotham is in trouble");
        } else if (news.indexOf("Joker") > -1) {
            return String.format("Batman, the Joker is up to his tricks again. Bring %s for backup!", name);
        } else {
            return String.format("As of %s, there is currently no activity in Gotham.", new Date());
        }
    }
}
