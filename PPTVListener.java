import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class PPTVListener implements PropertyChangeListener {

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("PPTV live score: " + evt.getNewValue());
    }
    
}
