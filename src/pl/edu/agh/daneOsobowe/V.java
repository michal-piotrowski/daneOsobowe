package pl.edu.agh.daneOsobowe;

import javax.faces.bean.ManagedBean;
import javax.faces.component.UIInput;
import javax.faces.event.AjaxBehaviorEvent;

/**
 * Created by Michał Piotrowski on 2017-04-06.
 */
@ManagedBean(eager = true)
public class V {
    private boolean selected;
    public boolean getSelected() {
        return selected;
    }
    public void setSelected(boolean b) {
        selected = b;
    }
    public void voivodeshipSelected(AjaxBehaviorEvent e) {
        UIInput input =  (UIInput) e.getSource();
        System.out.println(input.getValue());
        //below getValue() returns the name of voivodeship selected in the form. If it's 0, it means,
        //that the "none" option has been chosen.
        setSelected(!input.getValue().equals("0"));

    }
}
