import java.applet.Applet;
import java.awt.*;
public class RectangleApplet extends Applet {
private int x1, y1, x2, y2;
private Color rectColor;
public void init() {
String x1Param = getParameter("x1");
String y1Param = getParameter("y1");
String x2Param = getParameter("x2");
String y2Param = getParameter("y2");
String colorParam = getParameter("color");
if (x1Param == null || y1Param == null || x2Param == null || y2Param ==
null || colorParam == null) {
showStatus("Missing required parameters");
return;
}
x1 = Integer.parseInt(x1Param);
y1 = Integer.parseInt(y1Param);
x2 = Integer.parseInt(x2Param);
y2 = Integer.parseInt(y2Param);
rectColor = Color.decode(colorParam);
}
public void paint(Graphics g) {
g.setColor(rectColor);
g.fillRect(x1, y1, x2 , y2 );
}
}
