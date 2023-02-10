package first.biybinaz.spring;

import org.springframework.stereotype.Component;

public class PopMusic implements Music{
    @Override
    public String getSong() {
        return "K-Pop";
    }
}
