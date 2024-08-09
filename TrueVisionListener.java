import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class TrueVisionListener implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("True vision live score: " + evt.getNewValue());
    }
    
}
