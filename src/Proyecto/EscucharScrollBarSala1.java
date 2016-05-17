package Proyecto;

import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class EscucharScrollBarSala1 implements AdjustmentListener{
	public void adjustmentValueChanged(AdjustmentEvent e) {
		Sala.x1 =Sala.sb10.getValue();
		Sala.y1 =Sala.sb11.getValue();
	}
	
}
