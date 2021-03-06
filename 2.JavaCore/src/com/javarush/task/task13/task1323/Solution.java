package com.javarush.task.task13.task1323;

/* 
Интерфейс Updatable в классе Screen
*/

import java.awt.*;

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Updatable {

        @Override
        public void onSelect() {
            System.out.println("Selected");;
        }

        @Override
        public void refresh() {
            System.out.println("Refreshed");
        }
    }
}
