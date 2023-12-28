package Seminar2;

import java.util.List;

public interface MarketBehavioure {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();

}
