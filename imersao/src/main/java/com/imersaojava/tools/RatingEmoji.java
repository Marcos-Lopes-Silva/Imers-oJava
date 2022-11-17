package com.imersaojava.tools;

public class RatingEmoji {

    public String getRating(String rating) {
        String save = "";

        double val = Double.parseDouble(rating);
        int valor = (int) val / 1;

        for (int i = 0; i < valor; i++) {
            save = save.concat(ANSI.STAR_FULL);
        }

        save = save.concat("(" + rating + ")");

        return save;
    }

}
