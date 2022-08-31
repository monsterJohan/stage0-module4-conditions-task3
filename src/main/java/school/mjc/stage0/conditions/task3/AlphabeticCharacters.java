package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String vowelString = "AaEeIiOoUuYy";
        if (character >= 65 && character <= 90 || character >= 97 && character <= 122) {
            if (vowelString.indexOf(character) != -1) {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("wrong alphabet!");
        }
    }
}
