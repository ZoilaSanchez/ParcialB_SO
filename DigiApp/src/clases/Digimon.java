/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Miguel Matul <https://github.com/MigueMat4>
 */
 public class Digimon implements Comparable<Digimon> {
    private String name;
    private String img;
    private String level;
        
    public Digimon() {
    }
        
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
        
    @Override
    public String toString() {
        return "Digimon{" +
                "nombre='" + name + '\'' +
                ", nivel='" + level + '\'' +
                '}';
    }
     public int compareTo(Digimon o) {
        String a=String.valueOf(this.getName());
        String b=String.valueOf(o.getName());
        return a.compareTo(b);
    }
}
