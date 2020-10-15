import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class NettyServer {
    public static void main(String[] args) throws InterruptedException {
        EventLoopGroup bossGroup=new NioEventLoopGroup(2);

        //负责服务
        EventLoopGroup workerGroup=new NioEventLoopGroup(4);

        ServerBootstrap b=new ServerBootstrap();
         b.group(bossGroup,workerGroup);

         b.channel(NioServerSocketChannel.class);
         b.childHandler(new MyChildInitializer());
         b.bind(8888).sync();

    }
}
