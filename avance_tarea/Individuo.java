public class Individuo {
    private double x, y, speed, angle, deltaAngle;
    private double x_tPlusDelta, y_tPlusDelta;
    private Comuna comuna;
    /*
    El individuo pertenece a x comuna
    posee una velocidad 
    */
    public Individuo(){
        x = 0;
        y = 0;
        speed = 0;
        angle = 0;
        deltaAngle = 0;
    }
    public Individuo (Comuna comuna, double speed, double deltaAngle){
        this.comuna = comuna;
        this.speed = speed;
        this.deltaAngle = deltaAngle;
        angle = Math.random()*2*Math.PI;
    }
    public static String getStateDescription(){
        return "x,\ty";
    }
    public String getState() {
        return x + "\t" + y;
    }
    public void computeNextState(double delta_t) { //computar siguiente movimiento aleatorio
        double r=Math.random();
        angle+=delta_t;
        x_tPlusDelta=x+speed*Math.cos(angle);
        y_tPlusDelta=y+speed*Math.sin(angle);
        
        if(x_tPlusDelta < 0){   // rebound logic
            x_tPlusDelta=x-speed*Math.cos(angle);
           //??
        }
        else if( x_tPlusDelta > comuna.getWidth()){
            x_tPlusDelta=x-speed*Math.cos(angle);
        }
        if(y_tPlusDelta < 0){   // rebound logic
            y_tPlusDelta=y-speed*Math.sin(angle);
            //??
        }
        else if( y_tPlusDelta > comuna.getHeight()){
            y_tPlusDelta=y-speed*Math.sin(angle);
            //??
        }
        
    }
    public void updateState(){ //actualizar 
        this.x=x_tPlusDelta;
        this.y=y_tPlusDelta;
    }
}
