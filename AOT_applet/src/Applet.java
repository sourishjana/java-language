import java.applet.Applet;
import java.awt.Graphics;
public class Applet extends Applet{
    String str="";
    public void init(){	str+="Init...";	System.out.println("Init");	}
    public void start(){	str+="Start...";System.out.println("Start");	}
    public void paint(Graphics G){
        str+="Paint...";
        G.drawString(str,10,20); //To display a string message,drawString(S,x,y)
        System.out.println("Paint");
    }
    public void stop(){	str+="Stop...";System.out.println("Stop");
    }
}