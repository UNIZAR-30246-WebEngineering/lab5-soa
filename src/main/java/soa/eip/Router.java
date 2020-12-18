package soa.eip;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import org.apache.camel.Processor;
import org.apache.camel.Exchange;
import org.apache.camel.Message;

@Component
public class Router extends RouteBuilder {

  public static final String DIRECT_URI = "direct:twitter";

  @Override
  public void configure() {
    from(DIRECT_URI)
      .log("Body contains \"${body}\"")
      .log("Searching twitter for \"${body}\"!")
	            .process(exchange -> {
               Message msg = exchange.getIn();
               String body = msg.getBody(String.class);
               if (body.matches("^[a-zA-Z0-9]+ max:[0-9]+$")) {
                 String split[] = body.split(":");
                 body = body.replace("max:" + Integer.parseInt(split[1]), "");
                 body = body + " ?count=" + Integer.parseInt(split[1]);
               }
               exchange.getOut().setBody(body);
             })
      .toD("twitter-search:${body}")
      .log("Body now contains the response from twitter:\n${body}");
  }
}
