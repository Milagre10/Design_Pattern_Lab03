public class StringInverter implements  StringTransformer {
 public void execute(StringDrink drink){
     String text = drink.getText();
     StringBuilder si = new StringBuilder(text);
     si.reverse();
     drink.setText(si.toString());
    }

}
