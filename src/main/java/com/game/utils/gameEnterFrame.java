package com.game.utils;
//
////这些导入的包你可以不用知道他们是干嘛的，因为只要使用MyExclipse软件敲代码，就会提示你，帮你自动添加导入，而且自动加的非常准确。
//import org.springframework.stereotype.Component;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.Date;
//import java.util.Timer;//导入定时器类
//import java.util.TimerTask;//导入定时任务类
//
//@Component
////由于gameEnterFrame是继承自TimerTask类的。
////TimerTask类有这么一个关键的功能叫做run，是前人们已经写好的功能了。也是必须有的功能。只要继承了TimerTask的类一自动执行，就自动运行run里面的动作。
//public class gameEnterFrame extends TimerTask {
//
//    //声明内部使用一个数据库链接，起名conn，这个conn酌情改代码
//    private Connection conn;
//
//    //声明内部使用一个数据库驱动地址，不知何用，固定用法，不写就报错。这个地方酌情改代码
//    private String JDBC_DRIVER = "com.mysql.jdbc.Driver";
//
//    //声明内部使用mysql数据库的网络IP+端口+链接的数据库名字,这个地方酌情改代码
//    private String DB_URL = "jdbc:mysql://localhost:3306/game?serverTimezone=CTT&characterEncoding=UTF8";
//
//    //声明内部使用连接数据库的用户名,这个地方酌情改代码
//    private String user = "root";
//
//    //声明内部使用连接数据库的密码,这个地方酌情改代码
//    private String password = "root";
//
//    //我需要一个时间量，起名叫startdate吧，它是一个全新的时间量，他的值是现在这一刻的时间。
//    Date startdate =  new Date();
//
//    //我需要一个定时器，起名叫itimer吧，它是一个全新的定时器。
//    private Timer itimer = new Timer();
//
//    public void start(){
//        //schedule英文翻译为“日程安排”，是定时器类下属的功能方案。在我们程序中是最关键的功能，后面有好几种参数情况，其中三个参数时候代表（做啥方案，啥时间开始，多少毫秒后再做），
//        //要注意的是java里面的时间是单独的数据类型，区别于浮点数、整数、字符串类型。
//        //所以需要声明一下开始时间。我觉得使用“现在”作为开始时间最合适。这样每次程序运行时就立即开始。
//        //所以我在上面声明了一个startdate。接着让任务每隔2秒钟运行一次。
//        itimer.schedule(this, startdate, 2000);
//
//        //你可能要问了，this是啥？this意思是当下方案。这里指gameEnterFrame。
//    }
//
//    //下面来看看这个自动运行都运行了啥动作
//    public void run() {
//        //float n = (float) 1.22;//我瞎写的一个1.22数，后面会被修改为随机数。这里不必较真。
//        //n = (float) Math.random();//我需要生成随机数，一会往数据库里面写。
//        int n = 3;
//        n = (int) Math.random();
//
//        System.out.println("Server make a new number :  " +n );//把这个数打印出来方便我看。
//        //我发现链接数据库大家都爱用try。因为网络不稳定就会连不上，但不能崩了程序。
//        try {
//            //固定用法，连接数据库。为的是后面往数据里写数
//            Class.forName(JDBC_DRIVER);
//            conn = DriverManager.getConnection(DB_URL,user,password);
//
//            //准备往数据库里写啥值，引号中是mysql语句。
//            //java并不是直接往mysql里面写数据，而且先打个招呼，传达一下即将要填写的数在哪行哪列，具体的数则是留出问号，再让程序做填空题。
//            String sql = "insert into gameusre (time) values (?)";
//
//            //声明一个预处理语句叫rs，是个空的。
//            PreparedStatement rs = null;
//
//            //先把格式填写进去，等着填空。
//            rs = conn.prepareStatement(sql);
//
//            //而且据说每次只能写一个值，写入一个float类型的数值，在第一个位上把n的值（刚生的随机数）写进去。
//            rs.setFloat(1,n);
//
//            //写完了更新吧
//            rs.executeUpdate();
//
//            //关闭数据库操作通道
//            rs.close();
//
//            //关闭数据库连接，固定用法
//            conn.close();
//
//            //以下到代码最后是MyEclipse自动帮我写的。
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//}
