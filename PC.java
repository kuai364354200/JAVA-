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
	  System.out.println("CPU�ٶ�"+cpu.set_Speed()+"MHZ");
	  System.out.println("CPU�ͺ�"+cpu.set_type());
	  System.out.println("CPU��������"+cpu.set_cache_2()+"MB");
	  System.out.println("CPU��������"+cpu.set_cache_3()+"MB");
	  System.out.println("Ӳ������"+disk.getAmount()+"TB");
	  System.out.println("Ӳ���ٶ�"+disk.getspeed2()+"MB/s");
	 }
	 
}
