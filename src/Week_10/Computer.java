package Week_10;

public class Computer {
    
    /*
    4 parameters of Computer class.
    All the parameters are set with private modifiers
    meaning that they are only accessible from with in this method
    */
    
    private String cpuName = "";
    private double cpuMhz = 0;
    private String graphicsCard = "";
    private double gpuMhz = 0;
    
    /*
    Computer constructor used for purpose of filling up object with data.
    */

    public Computer(String cpuName, double cpuMhz, String graphicsCard, double gpuMhz) {
        this.cpuMhz = cpuMhz;
        this.cpuName = cpuName;
        this.graphicsCard = graphicsCard;
        this.gpuMhz = gpuMhz;
    }

    /*
    getter for purpose of retrieving the cpuName variable 
    */    
    public String getCpuName() {
        return cpuName;
    }
    
    /*
    setter for purpose of updating/setting cpuName variable
    */
    
    public void setCpuName(String cpuName) {
        this.cpuName = cpuName;
    }
    
    /*
    getter for purpose of retrieving the cpuMhz variable 
    */    

    public double getCpuMhz() {
        return cpuMhz;
    }

    /*
    setter for purpose of updating/setting cpuMhz variable
    */
    
    public void setCpuMhz(double cpuMhz) {
        this.cpuMhz = cpuMhz;
    }
    
    /*
    getter for purpose of retrieving the graphicsCard variable 
    */ 

    public String getGraphicsCard() {
        return graphicsCard;
    }
    
    /*
    setter for purpose of updating/setting graphicsCard variable
    */

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    /*
    getter for purpose of retrieving the gpuMhz variable 
    */ 
    
    public double getGpuMhz() {
        return gpuMhz;
    }
    
    /*
    setter for purpose of updating/setting gpuMhz variable
    */

    public void setGpuMhz(double gpuMhz) {
        this.gpuMhz = gpuMhz;
    }

}
