public class StringCaseChanger implements  StringTransformer {
    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();
        StringBuilder newText = new StringBuilder();
        for(char c: text.toCharArray()){
            if(Character.isLowerCase(c)){
                newText.append(Character.toUpperCase(c));
            }
            else {
                newText.append(Character.toLowerCase(c));
            }
        }
        drink.setText(newText.toString());
    }
    public void undo(StringDrink drink) {
        String text = drink.getText();
        StringBuilder newText = new StringBuilder();
        for(char c: text.toCharArray()){
            if(Character.isLowerCase(c)){
                newText.append(Character.toUpperCase(c));
            }
            else {
                newText.append(Character.toLowerCase(c));
            }
        }
        drink.setText(newText.toString());
    }
}
