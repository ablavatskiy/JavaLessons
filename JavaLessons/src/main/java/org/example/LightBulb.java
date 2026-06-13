package org.example;

public class LightBulb {
        private boolean isOn = false;
        public void switchLight(){
            isOn = !isOn;
        }
        public boolean getStatus(){
            return isOn;

        }
        public void showInfo(){
            System.out.println("Now lamp is on:" + getStatus());
        }



}
