package pattern.prototype;

import java.io.*;

public class Table implements Cloneable, Serializable {
    private String color;
    private int height;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //cloneable 浅克隆
    public Table clone(){
        return this.deepClone();
    }

    private Table deepClone() {
        try{
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bis);
            return (Table)ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

    public Table simpleClone() {
        Table cp = new Table();
        cp.setColor(this.color);
        cp.setHeight(this.height);
        return cp;
    }

}
