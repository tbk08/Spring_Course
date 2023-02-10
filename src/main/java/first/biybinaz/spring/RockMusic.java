package first.biybinaz.spring;

import org.springframework.stereotype.Component;


public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Scriptonit";
    }
}
