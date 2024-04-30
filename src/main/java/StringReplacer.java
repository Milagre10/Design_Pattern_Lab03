public class StringReplacer implements StringTransformer {
    private String text;
    private String replace;

    public StringReplacer(String text, String replace) {
        this.text = text;
        this.replace = replace;
    }

    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();
        String newText = text.replace("A", "X");
        drink.setText(newText);
    }
}
