package PC;

public class PC {
	 CPU cpu;
	 HardDisk disk;
	 void setCPU(CPU cpu){
	  this.cpu=cpu;
	 }
	 void setHardDisk(HardDisk disk){
	  this.disk=disk; 
	 }
	 void show(){
	  System.out.println("CPU速度"+cpu.set_Speed()+"MHZ");
	  System.out.println("CPU型号"+cpu.set_type());
	  System.out.println("CPU二级缓存"+cpu.set_cache_2()+"MB");
	  System.out.println("CPU三级缓存"+cpu.set_cache_3()+"MB");
	  System.out.println("硬盘容量"+disk.getAmount()+"TB");
	  System.out.println("硬盘速度"+disk.getspeed2()+"MB/s");
	 }
	 
}
