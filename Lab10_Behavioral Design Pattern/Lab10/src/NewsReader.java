/**
 *
 * @author Lewin
 */
public class NewsReader implements NewsSubscriber{
    
    private final String r_name;
    
    public NewsReader(String name) {
        this.r_name = name;
    }

    @Override
    public void update(News news) {
        System.out.println(this.r_name+" got news topic about :"+news.getTopic().toString() +" content : " + news.getContent());
    }
 
}
