package PC;

public class Test {
	public static void main(String args[]) {
	  //创建一个CPU对象
		CPU cpu =new CPU();
	  //将cpu的speed设置为4400
	    cpu.set_Speed(4400);
	  //cpu型号  
	    cpu.set_type("R5-2600");
	  //cpu二级缓存
	    cpu.set_cache_2(3);
	  //cpu三级缓存
	    cpu.set_cache_3(16);
	  //创建一个HardDisk对象
	    HardDisk disk=new HardDisk();
	  //将disk的amount设置为200
	    disk.setAmount(2);
	  //硬盘读写速度  
	    disk.setspeed2(100);
	  //创建一个PC对象
	    PC pc=new PC();
	    pc.setCPU(cpu);
	    pc.setHardDisk(disk);
	    pc.show();
	 }
	  
	 
}
