package Seminar2;

public interface QueueBehavioure {
    void takeInQueue(Actor actor);

    void takeOrders();
    void giveOrders();
    void releaseFromQueue();

}
