public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int quilt;
    private int sheets;
    
    public Bed(String style,int pillows,int height,int quilt,int sheets){
        this.style=style;
        this.pillows=pillows;
        this.height=height;
        this.quilt=quilt;
        this.sheets=sheets;
        
        
    }
    public void make(){
        System.out.println("Bed -> Making | ");
    }
    public String getStyle(){
        return this.style;
    }
    public int getPillows(){
        return pillows;
    }
    public int getHeight(){
        return this.height;
    }
    public int getSheets(){
        return this.sheets;
    }
    public int getQuilt(){
        return this.quilt;
    }
    
    
}