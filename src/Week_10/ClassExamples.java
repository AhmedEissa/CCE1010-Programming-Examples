package Week_10;

public class ClassExamples {
    public static void main(String[] args) {
        /*
            Computer object with number of parameters
        */
        Computer computer = new Computer("Intel", 3.7, "Nvidia", 1.8);
        
        /*
        Example of using getters of computer object 
        */
        
        System.out.println("CPU Maker: "+ computer.getCpuName());        
        System.out.println("CPU Clock Speed: "+computer.getCpuMhz());
        System.out.println("GPU Maker: "+computer.getGraphicsCard());
        System.out.println("GPU Clock Speed: "+computer.getGpuMhz()+"\n");
        
        /*
        Example of updating object with new variables
        */
        
        computer.setCpuName("AMD");
        computer.setCpuMhz(4.2);
        computer.setGraphicsCard("AMD");
        computer.setGpuMhz(1.5);
        
        /*
        Printing out new set of object variables
        */
        
        System.out.println("CPU Maker: "+ computer.getCpuName());        
        System.out.println("CPU Clock Speed: "+computer.getCpuMhz());
        System.out.println("GPU Maker: "+computer.getGraphicsCard());
        System.out.println("GPU Clock Speed: "+computer.getGpuMhz());
        
    }
}
