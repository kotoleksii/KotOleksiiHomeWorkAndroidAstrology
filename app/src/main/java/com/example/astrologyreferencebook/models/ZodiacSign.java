package com.example.astrologyreferencebook.models;

import com.example.astrologyreferencebook.R;

import java.io.Serializable;
import java.util.ArrayList;

public class ZodiacSign implements Serializable {
    private int image;
    private String title;
    private String period;
    private String description;

    public ZodiacSign(int image, String title, String period, String description) {
        this.image = image;
        this.title = title;
        this.period = period;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static int[] getZodiacSignsImages() {
        int[] zodiacSignsImages = {
                R.drawable.pisces, R.drawable.aries, R.drawable.taurus,
                R.drawable.gemini, R.drawable.cancer, R.drawable.leo,
                R.drawable.virgo, R.drawable.libra, R.drawable.scorpio,
                R.drawable.sagittarius, R.drawable.capricorn, R.drawable.aquarius};

        return zodiacSignsImages;
    }

    public static String[] getZodiacSignsNames() {
        String[] zodiacSignsNames = {
                "Риби", "Овен", "Телець",
                "Близнюки", "Рак", "Лев",
                "Діва", "Терези", "Скорпіон",
                "Стрілець", "Козоріг", "Водолій"};

        return zodiacSignsNames;
    }

    public static ArrayList<ZodiacSign> getZodiacSignsList() {
        ArrayList<ZodiacSign> zodiacSignsList = new ArrayList<>();

        zodiacSignsList.add(new ZodiacSign(
                    ZodiacSign.getZodiacSignsImages()[0],
                ZodiacSign.getZodiacSignsNames()[0],
            "20.02 – 20.03",
        "Відомі вони своєю мінливістю і мінливістю, яку визначає стихія Води, подвійністю" +
        " їх характеру."
        ));

        zodiacSignsList.add(new ZodiacSign(
                    ZodiacSign.getZodiacSignsImages()[1],
                ZodiacSign.getZodiacSignsNames()[1],
            "21.03 – 20.04",
        "У зодіакальному колі цей знак є першим. Його представники заповзятливі," +
        " цілеспрямовані, впевнені в своїх силах, що і допомагає їм досягати багато чого в кар'єрі."
        ));

        zodiacSignsList.add(new ZodiacSign(
                    ZodiacSign.getZodiacSignsImages()[2],
                ZodiacSign.getZodiacSignsNames()[2],
            "21.04 – 21.05",
        "Цей земний знак відомий своїм консерватизмом, практичністю, впертістю, але його " +
        "представники є естетами, люблячими комфорт."
        ));

        zodiacSignsList.add(new ZodiacSign(
                    ZodiacSign.getZodiacSignsImages()[3],
                ZodiacSign.getZodiacSignsNames()[3],
            "22.05 – 21.06",
        "Енергійні, товариські, рухливі, вони є одним з найбільш непостійних знаків Зодіаку."
        ));

        zodiacSignsList.add(new ZodiacSign(
                        ZodiacSign.getZodiacSignsImages()[4],
                    ZodiacSign.getZodiacSignsNames()[4],
            "22.06 – 22.07",
        "Представники цього знака Зодіаку можуть розцінюватися сторонніми як люди загадкові," +
        " складні, відсторонені."
        ));

        zodiacSignsList.add(new ZodiacSign(
                    ZodiacSign.getZodiacSignsImages()[5],
                ZodiacSign.getZodiacSignsNames()[5],
            "23.07 – 21.08",
        "Яскраві, амбітні, не позбавлені гордості і почуття власної гідності, представники" +
        " цього знака Зодіаку прагнуть до визнання своїх заслуг."
        ));

        zodiacSignsList.add(new ZodiacSign(
                    ZodiacSign.getZodiacSignsImages()[6],
                ZodiacSign.getZodiacSignsNames()[6],
            "22.08 – 23.09",
        "Цей знак Зодіаку характеризується педантичністю, строгістю, любов'ю до порядку " +
        "у всьому."
        ));

        zodiacSignsList.add(new ZodiacSign(
                    ZodiacSign.getZodiacSignsImages()[7],
                ZodiacSign.getZodiacSignsNames()[7],
            "24.09 – 23.10",
        "Представники цього повітряного знака Зодіаку розважливі, спокійні, доброзичливі і" +
        " товариські."
        ));

        zodiacSignsList.add(new ZodiacSign(
                    ZodiacSign.getZodiacSignsImages()[8],
                ZodiacSign.getZodiacSignsNames()[8],
            "24.10 – 22.11",
        "Енергійність, цілеспрямованість, емоційність – характеристики, якими відомі " +
        "народжені під цим сузір'ям."
        ));

        zodiacSignsList.add(new ZodiacSign(
                    ZodiacSign.getZodiacSignsImages()[9],
                ZodiacSign.getZodiacSignsNames()[9],
            "23.11 – 22.12",
        "Народжені під цим сузір'ям є активними, товариськими, допитливими, чарівними, " +
        "доброзичливими."
        ));

        zodiacSignsList.add(new ZodiacSign(
                    ZodiacSign.getZodiacSignsImages()[10],
                ZodiacSign.getZodiacSignsNames()[10],
            "23.12 – 20.01",
        "Це один з найбільш дисциплінованих, відповідальних, сильних, організованих знаків," +
        " і такими якостями наділила його стихія, якою він управляється – Земля."
        ));

        zodiacSignsList.add(new ZodiacSign(
                    ZodiacSign.getZodiacSignsImages()[11],
                ZodiacSign.getZodiacSignsNames()[11],
            "21.01 – 19.02",
        "Пошук нових відчуттів-одне з улюблених занять представників цього знака Зодіаку."
        ));

        return zodiacSignsList;
    }
}
