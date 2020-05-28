package com.dellead.appfragment.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DummyContent {

    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();


    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 4;

    static {
        // Add some sample items.
        for (int i = 1; i <= COUNT; i++) {
            addItem(createDummyItem(i));
        }
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    private static DummyItem createDummyItem(int position) {

        String nome = "";
        switch (position){

            case 1:
                nome = "Carlos";
                break;
            case 2:
                nome = "Joao";
                break;
            case 3:
                nome = "Jose";
                break;
            case 4:
                nome = "Daniel";
                break;
        }
        return new DummyItem(String.valueOf(position), nome, makeDetails(position));
    }

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();

        switch (position){

            case 1:
                builder.append("Brasileiro");
                builder.append("\n 29 anos");
                builder.append("\n Programador");
                break;
            case 2:
                builder.append("Brasileiro");
                builder.append("\n 22 anos");
                builder.append("\n Vendedor");
                break;
            case 3:
                builder.append("Brasileiro");
                builder.append("\n 20 anos");
                builder.append("\n Estudande");
                break;
            case 4:
                builder.append("Brasileiro");
                builder.append("\n 35 anos");
                builder.append("\n Contador");
                break;
        }
        return builder.toString();
    }


    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;

        public DummyItem(String id, String content, String details) {
            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
