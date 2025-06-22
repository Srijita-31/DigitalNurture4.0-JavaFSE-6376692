public class Computer {
    private final String cpu;
    private final String ram;
    private final String storage;
    private final String os;
    private final String gpu;

    private Computer(Builder builder){
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.os = builder.os;
        this.gpu = builder.gpu;
    }

    public static class Builder{
        private String cpu;
        private String ram;
        private String storage;
        private String os;
        private String gpu;

        public Builder(String cpu,String ram){
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setStorage(String storage){
            this.storage = storage;
            return this;
        }

        public Builder setOs(String os){
            this.os = os;
            return this;
        }

        public Builder setGpu(String gpu){
            this.gpu = gpu;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    public void getComputer(){
        System.out.println("Computer has: cpu = " + cpu + ",ram = " + ram + ",storage = "+ storage + ",gpu = "+ gpu+", os = "+ os);
    }
}