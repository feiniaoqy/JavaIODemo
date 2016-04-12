Java IO 学习：
1、基于字节操作的I/O接口：InputStream和OutputStream
2、基于字符操作的I/O接口：Writer和Reader
3、基于磁盘操作的I/O接口：File
4、基于网络操作的I/O接口：Socket（不在java.io包下）

InputStream和OutputStream  与     Writer和Reader的区别：
1、前者是基于字节流的，后者是基于字符流的
2、Writer和Reader的目的是国际化，使IO操作支持16位的Unicode
3、两者之间的转化是通过InputStreamReader和OutputStreamWriter来的

本demo针对文件的读写操作，所涉及的IO流的类有BufferedWriter、BufferedReader、
	FileWriter、FileReader、FileOutputStream、FileInputStream、
	InputStreamReader和OutputStreamWriter
	其他的类也是类似的用法
	他们分别是由Writer、Reader、OutputStream、InputStream四个基本的抽象类继承而来的

我就是来捣乱的，你能怎么着，嘿嘿！！！！！！

我不该来捣乱，我错啦，呜呜呜~~~~~
