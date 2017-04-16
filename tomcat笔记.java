HttpRequestLine hrl= new HttpRequestLine();
SocketInputStream.readRequestLine(hrl); //读请求的首行


HttpHeader hh = new HttpHeader();
SocketInputStream.readHeader(hh);

foreach(){
String name = new String(hh.name,0,namelength);
String value = new String(hh.value,0,valuelength);
request.addHeader(name,value);
}

cookie也是请求头的一部分，
Cookie: username=budi;password=pwd;


HttpServletRequest.getParameterMap();

Http1.1  keep-alive


HttpConnector 实现了LifeCycle接口，因此 当创建一个HttpConnector实例时，
就应该调用其initialize（）和start（）方法


HttpProcessor的构造函数会调用HttpConnector的createRequest（）和 createResponse（）	方法。