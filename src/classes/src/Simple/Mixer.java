package Simple;

public class Mixer {
    //функциональный класс
    double coldTemp = 15;
    double hotTemp = 60;
    int cold = 0;
    int hot = 0;
    //default constructor
    public void setValues(int cold, int hot) {
        this.cold = cold;
        this.hot = hot;
    }

    public double getTemp() {
        return (coldTemp * cold + hotTemp * hot) / (cold + hot);
    }

}
