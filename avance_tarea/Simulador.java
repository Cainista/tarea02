
import java.io.PrintStream;

public class Simulador {
    private Comuna comuna;
    private PrintStream out;

    private Simulador(){ }
    public Simulador (PrintStream output, Comuna comuna){
        out=output;
        this.comuna = comuna;
    }
    
    private void printStateDescription(){;
        String s="time\tx\ty";
        //+ Comuna.getStateDescription();
        out.println(s);
    }
    
    private void printState(double t){
        String s = t + "\t";
        s+= comuna.getState();
        out.println(s);
    }

    /**
     * @param delta_t time step
     * @param endTime simulation time
     * @param samplingTime  time between printing states to not use delta_t that would generate too many lines.
     */
    public void simulate (double delta_t, double endTime, double samplingTime) {  // simulate time passing
        double t=0;
        printStateDescription();
        printState(t);
        while (t<endTime) {
            for(double nextStop=t+samplingTime; t<nextStop; t+=delta_t) {
                comuna.computeNextState(delta_t); // compute its next state based on current global state
                comuna.updateState();            // update its state
            }
            printState(t);
        }
    }
}
