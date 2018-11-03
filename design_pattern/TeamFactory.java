package algrothm.design_pattern;

/**
 * Created by wr on 2018/10/17.
 */
public abstract class TeamFactory {
    public abstract Coach getCoach(String coach);
    public abstract Player getPlayer(String player);
}
