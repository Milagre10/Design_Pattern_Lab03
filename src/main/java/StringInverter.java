public class StringInverter implements  StringTransformer {
 public void execute(StringDrink drink){
     String text = drink.getText();
     StringBuilder si = new StringBuilder(text);
     si.reverse();
     drink.setText(si.toString());
    }
    public void undo(StringDrink drink){
     String text = drink.getText();
     StringBuilder sb = new StringBuilder(text);
     sb.reverse();
     drink.setText(sb.toString());
    }

}
