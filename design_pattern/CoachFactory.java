package algrothm.design_pattern;

/**
 * Created by wr on 2018/10/17.
 */
public class CoachFactory extends TeamFactory {
    @Override
    public Coach getCoach(String coach) {
        if(coach == null){
            return null;
        }
        if(coach.equalsIgnoreCase("Attact")){
            return new AttactCoach();
        }else if(coach.equalsIgnoreCase("Defence")){
            return new DefenceCoach();
        }
        return null;
    }

    @Override
    public Player getPlayer(String player) {
        return null;
    }
}
