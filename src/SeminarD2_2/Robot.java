package SeminarD2_2;

public class Robot extends BaseRobot implements Runner{
    private String name;
    private int maxRun;
    private int maxJump;

    public Robot(String name, int maxRun, int muxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = muxJump;
    }
    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }


    public String getName() {
        return name;
    }


    @Override
    public boolean run(int lenght) {
        if(lenght <= getMaxRun()){
            System.out.printf("%s пробежал по беговой дорожке %d метров.\n ", name, lenght);
            return true;
        }
        else {
            System.out.printf("%s не смог пробежать по беговой дорожке %d метров, остановился после %d метров.\n ", name, lenght, getMaxRun());
            return false;
        }
    }
    @Override
    public boolean jump(int height) {
        if(height <= getMaxRun()){
            System.out.printf("%s перепрыгнул через стену %d сантиметров.\n ", name, height);
            return true;
        }
        else {
            System.out.printf("%s не смог перепрыгнуть через стену %d метров, остался на месте.\n ", name, height, getMaxJump());
            return false;
        }
    }
}
