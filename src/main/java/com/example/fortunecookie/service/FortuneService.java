package com.example.fortunecookie.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class FortuneService {

    private final List<String> fortunes = Arrays.asList(
            "You will have a great day!",
            "A surprise awaits you around the corner.",
            "Now is the time to try something new.",
            "Your hard work will soon pay off.",
            "Happiness begins with facing life with a smile and a wink.",
            "Hello-hello"
    );

    private final Random random = new Random();

    public String getRandomFortune() {
        int index = random.nextInt(fortunes.size());
        return fortunes.get(index);
    }

    public String getRandomColor() {
        String color;
        do {
            color = String.format("#%06x", random.nextInt(0xffffff + 1));
        } while (color.equals("#000000")); // Avoid black color
        return color;
    }
}
