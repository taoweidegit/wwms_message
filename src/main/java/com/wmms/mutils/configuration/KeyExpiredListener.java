package com.wmms.mutils.configuration;

import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.listener.KeyExpirationEventMessageListener;
import org.springframework.data.redis.listener.RedisMessageListenerContainer;

import java.sql.*;

public class KeyExpiredListener extends KeyExpirationEventMessageListener
{

    public KeyExpiredListener(RedisMessageListenerContainer listenerContainer)
    {
        super(listenerContainer);
    }

    @Override
    public void onMessage(Message message, byte[] pattern)
    {
        Connection conn = null;
        Statement statement = null;
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://127.0.0.1:3306/wmms?useSSL=false","root","19951017i");
            statement = conn.createStatement();

            String uid = message.toString().split("_")[1];
            String device = message.toString().split("_")[2];

            String sql = "UPDATE t_login SET State='logout', AccessTime='', RefreshTime='' WHERE `User`="
                    + uid + " AND Device = '" + device + "'";
            statement.execute(sql);

            System.out.println("下线用户：" + uid + " 下线设备：" + device);
        }
        catch (ClassNotFoundException | SQLException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            try
            {
                statement.close();
                conn.close();
            }
            catch (SQLException e)
            {
                System.out.println(e.getMessage());
            }
        }
    }
}
