import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServer;

public class hello extends AbstractVerticle{

    @Override
    public void start() throws Exception{
        vertx.createHttpServer()
                .requestHandler(req -> req.response()
                                .end("Hello")
                )
                .listen(8180);
    }
}
