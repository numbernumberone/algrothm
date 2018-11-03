package algrothm.design_pattern;

/**
 * Created by wr on 2018/10/17.
 */
public class PlayerFactory extends TeamFactory {
    @Override
    public Coach getCoach(String coach) {
        return null;
    }

    @Override
    public Player getPlayer(String player) {
        if(player == null){
            return null;
        }
        if(player.equalsIgnoreCase("SG")){
            return new shooting_guard();
        }else if (player.equalsIgnoreCase("C")){
            return new centre_forward();
        }else if (player.equalsIgnoreCase("SF")){
            return new small_forward();
        }else if (player.equalsIgnoreCase("PG")){
            return new point_ground();
        }else if (player.equalsIgnoreCase("PF")){
            return new power_forward();
        }
        return  null;

    }
}
