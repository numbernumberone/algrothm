package algrothm.design_pattern;

/**
 * Created by wr on 2018/10/17.
 */
public class AbstractFactoryPatternDemo  {

    public static void main(String[] args){

        //获取球员工厂
        TeamFactory palyerFactory = FactoryProducer.getFactory("Player");

        Player player1 = palyerFactory.getPlayer("SG");

        player1.position();

        Player player2 = palyerFactory.getPlayer("C");

        player2.position();

        Player player3 = palyerFactory.getPlayer("SF");

        player3.position();

        Player player4 = palyerFactory.getPlayer("PF");

        player4.position();

        Player player5 = palyerFactory.getPlayer("PG");

        player5.position();

        TeamFactory coacheFactory = FactoryProducer.getFactory("Coach");

        Coach coach1 = coacheFactory.getCoach("Attact");

        coach1.Tactics();

        Coach coach2 = coacheFactory.getCoach("Defence");

        coach2.Tactics();



    }



}
