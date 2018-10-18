package tools.i_manor.com.lanproxy.client.listener;

import io.netty.channel.ChannelHandlerContext;

public interface ChannelStatusListener {

    void channelInactive(ChannelHandlerContext ctx);

}
