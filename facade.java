package facade;

/**
 * @author xiu
 * @create 2022-04-28 9:10
 */
public class facade {
    computer computer;
    lantern lantern;
    microphone microphone;
    projector projector;
    canvas canvas;
   public void  Attend(){
       computer.on();
       lantern.on();
       microphone.on();
       projector.on();
       canvas.on();
       System.out.println("上课");
   }
   public void finish(){
       computer.off();
       lantern.off();
       microphone.off();
       projector.off();
       canvas.off();
       System.out.println("下课");
   }

    public facade() {
        this.computer=new computer();
        this.lantern = new lantern();
        this.microphone = new  microphone();
        this.projector = new  projector();
        this.canvas=new canvas();
    }
}
