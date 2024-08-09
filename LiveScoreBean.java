import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

public class LiveScoreBean implements Serializable{
    public static String SCORELINE_PROPERTY = "scoreLine";

    private String scoreLine;

    private PropertyChangeSupport propertyChange;

    public LiveScoreBean() {
        propertyChange = new PropertyChangeSupport(this);     
    }

    public String getScoreLine(){
        return scoreLine;
    }

    public void setScoreLine(String scoreLine){
        String oldScoreLine = this.scoreLine;
        this.scoreLine = scoreLine;
        propertyChange.firePropertyChange(SCORELINE_PROPERTY, oldScoreLine, this.scoreLine);
    }

    public void addListenerProperty(PropertyChangeListener e){
        propertyChange.addPropertyChangeListener(e);
    }

    public void removeListenerProperty(PropertyChangeListener e){
        propertyChange.removePropertyChangeListener(e);
    }
}
