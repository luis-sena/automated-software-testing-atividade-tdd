public class ValidatePalindrome implements IValidatePalindrome {

    @Override
    public boolean validate(String text) {
        String originalText = prepareString(text);
        String reverseText = reverseString(originalText);
        return originalText.equals(reverseText);
    }

    private String prepareString(String text){
        return text.replaceAll("[^a-zA-Z0-9]", "")
                .trim()
                .toLowerCase();
    }

    private String reverseString(String text){
        StringBuilder builder = new StringBuilder(text);
        return builder.reverse().toString();
    }
}
