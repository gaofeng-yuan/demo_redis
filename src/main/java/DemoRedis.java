import redis.clients.jedis.Jedis;

/**
 * @author yuangf
 * @date 2020/9/4 - 16:30
 */
public class DemoRedis {
    public static void main(String[] args) {
        //连接本地的Redis服务
        Jedis jedis = new Jedis("192.168.1.102",6379);
        //查看服务是否运行，打出pong表示OK
        System.out.println("connection is ok=========");

    }
}
