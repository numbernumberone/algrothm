package algrothm.design_pattern;

/**
 * Created by wr on 2018/10/17.
 *
 * 创建工厂创造器
 */
public class FactoryProducer {
    public static TeamFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Player")){
            return new PlayerFactory();
        }else if(choice.equalsIgnoreCase("Coach")){
            return new CoachFactory();
        }
        return null;
    }


}
