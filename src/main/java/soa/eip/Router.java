package soa.eip;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
public class Router extends RouteBuilder {

    public static final String DIRECT_URI = "direct:twitter";

    Pattern pattern = Pattern.compile("(max:([0-9]+))");

    @Override
    public void configure() {
        from(DIRECT_URI)
        .log("Body contains \"${body}\"")
        .log("Searching twitter for \"${body}\"!")
        .choice()
            .when(body().regex(".*max:[0-9]+.*"))
            .process(exchange -> {
                // Get InBody
                String payload = exchange.getIn().getBody(String.class);

                // Parse InBody
                Matcher matcher = pattern.matcher(payload);
                matcher.find();

                // Extract n
                String n = matcher.group(2);

                // Build InBody again
                String payloadModified = matcher.replaceFirst(""); // delete max:[0-9]+
                payloadModified += "?count=" + n;
                exchange.getIn().setBody(payloadModified);
                })
        .end()
        .log("Searching modified twitter for \"${body}\"!")
        .toD("twitter-search:${body}")
        .log("Body now contains the response from twitter:\n${body}");
    }
}
