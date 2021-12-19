package hello.advanced.trace.strategy;

import hello.advanced.trace.strategy.code.template.Collback;
import hello.advanced.trace.strategy.code.template.TimeLogTemplate;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class TemplateCallbackTest {


    /**
     * 템플릿 콜백 익명 클래스
     */
    @Test
    public void callbackV1() {
        TimeLogTemplate template = new TimeLogTemplate();
        template.execute(new Collback() {
            @Override
            public void call() {
                log.info("비즈니스 로직1 실행");
            }
        });

        template.execute(() -> log.info("비즈니스 로직2 실행"));
    }
}
