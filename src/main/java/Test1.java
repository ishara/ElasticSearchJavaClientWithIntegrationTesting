import org.elasticsearch.client.Client;
import org.elasticsearch.node.Node;
import static org.elasticsearch.node.NodeBuilder.*;
/**
 * Created by ishara on 7/19/14.
 */
public class Test1
{
    public static void main( String[] args )
    {
        Node node = nodeBuilder().local(true).node();
        Client client = node.client();

        node.close();
    }
}
