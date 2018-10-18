package tools.i_manor.com.lanproxy.client.listener;

import io.netty.channel.Channel;

public interface ProxyChannelBorrowListener {

    void success(Channel channel);

    void error(Throwable cause);

}
