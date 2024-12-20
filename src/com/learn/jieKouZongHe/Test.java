package com.learn.jieKouZongHe;

public class Test {
    public static void main(String[] args) {
        PingPangCoach pingpangCoach = new PingPangCoach("pingpang教练",30);
        pingpangCoach.speakEnglish();
        pingpangCoach.teach();

        PingPangSporter pingpangSporter = new PingPangSporter("pingpang人",16);
        pingpangSporter.speakEnglish();
        pingpangSporter .study();
    }
}
