package PC;

public class Test {
	public static void main(String args[]) {
	  //����һ��CPU����
		CPU cpu =new CPU();
	  //��cpu��speed����Ϊ4400
	    cpu.set_Speed(4400);
	  //cpu�ͺ�  
	    cpu.set_type("R5-2600");
	  //cpu��������
	    cpu.set_cache_2(3);
	  //cpu��������
	    cpu.set_cache_3(16);
	  //����һ��HardDisk����
	    HardDisk disk=new HardDisk();
	  //��disk��amount����Ϊ200
	    disk.setAmount(2);
	  //Ӳ�̶�д�ٶ�  
	    disk.setspeed2(100);
	  //����һ��PC����
	    PC pc=new PC();
	    pc.setCPU(cpu);
	    pc.setHardDisk(disk);
	    pc.show();
	 }
	  
	 
}
