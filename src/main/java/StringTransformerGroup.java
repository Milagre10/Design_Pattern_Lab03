
import java.util.List;
import  java.util.ArrayList;
public class StringTransformerGroup implements  StringTransformer {
    private List<StringTransformer> transformers;

    public StringTransformerGroup(List<StringTransformer> transformers) {
        this.transformers = transformers;
    }

    @Override
    public void execute(StringDrink drink) {
        for(StringTransformer transformer: transformers){
            transformer.execute(drink);
        }

    }
    public void mix(StringDrink drink){
        for (StringTransformer transformer : transformers) {
            transformer.execute(drink);
        }
    }
}
