package yira.example.user.nandehymnalebook;

public class Song {

        private String num;
        private  String name;

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Song(String num, String name) {
            this.num = num;
            this.name = name;

        }

}
