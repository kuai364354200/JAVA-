package PC;

public class CPU {
	 int speed;
	 String CPU_type;
	 int cache_2;
	 //二级缓存
	 int cache_3;
	 //三级缓存
	 int set_Speed(){
	  return speed;
	 }
	 public void set_Speed(int speed){
	  this.speed=speed;
	 }
	 String set_type() {
		 return CPU_type;
	 }
	 public void set_type(String type) {
		 this.CPU_type=type;
	 }
	 int set_cache_2() {
		 return cache_2;
	 }
	 public void set_cache_2(int cache_2) {
		 this.cache_2=cache_2;
	 }
	 int set_cache_3() {
		 return cache_3;
	 }
	 public void set_cache_3(int cache_3) {
		 this.cache_3=cache_3;
	 }
	}
