package io.jenkins.plugins.markdownparams;

public class Item {
    private final String name;
    private Boolean isChecked;
    private String bullet;
    private final int level;


    public Item(int level, String bullet, Boolean isChecked, String name){
        this.level = level;
        this.bullet = bullet;
        this.isChecked= isChecked;
        this.name= name;
    }

    public Item(int level, String bullet, String name){
        this.level = level;
        this.bullet = bullet;
        this.name= name;
    }

    public Item(int level, String name, Boolean isChecked){
        this.level = level;
        this.name= name;
        this.isChecked= isChecked;
    }

    public boolean isCheckbox(){
        return isChecked!=null;
    }

    public boolean isOrdered(){
        return !"*".equals(bullet) && !"-".equals(bullet);
    }


    public String getName() {
        return name;
    }

    public String getBullet() {
        return bullet;
    }

    public int getLevel() {
        return level;
    }

    public Boolean isChecked(){
        return this.isChecked!=null && this.isChecked;
    }

}
