package temperature;

import javax.swing.*;

// This is the command class in the command pattern.
// Note that this is actually a JButton class, inside which
// the execute(JPanel panel) method will be called by the
// ButtonInvoker class to call the concerned methods
// in a receiver class

public class AirConditionOnBtn extends JButton implements Command {
     public AirConditionOnBtn(String name){
          super(name);
     }
     public void execute(JPanel panel){
         AirCondition airCondition = new AirCondition(panel);
         airCondition.startRotate();
     }
}
