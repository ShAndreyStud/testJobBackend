package work.test;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class RunAfterStartup {

    @EventListener(ApplicationReadyEvent.class)
    public String[] runAfterStartup() throws Exception {
        String[] text = FileReader.textReader();
        return text;
    }
}
