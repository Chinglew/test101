/**
 *
 * @author Lewin
 */
public class NewsReader extends NewsSubscriber{
    
    private String r_name;
    private NewsSubscriber newsSubscriber;
    
    public NewsReader(String name) {
        this.r_name = name;
        newsSubscriber = new NewsSubscriber();
    }

    public void update(String m) {
        System.out.println(this.r_name+" got news :: " + m);
    }
    
    
    
    
    
}
