package br.com.lsena.palindrome;

import java.text.Normalizer;
import java.util.regex.Pattern;

public class ValidatePalindrome implements IValidatePalindrome {

    @Override
    public boolean validate(String text) {
        String preparedText = prepareString(text);
        String reverseText = reverseString(preparedText);
        return preparedText.equals(reverseText);
    }

    private String prepareString(String text){
        String nfdNormalizedString = Normalizer.normalize(text, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("[\\p{InCombiningDiacriticalMarks}\\p{Punct}\\p{Blank}]+");
        return pattern.matcher(nfdNormalizedString)
                .replaceAll("")
                .toLowerCase();
    }

    private String reverseString(String text){
        StringBuilder builder = new StringBuilder(text);
        return builder.reverse().toString();
    }
}
