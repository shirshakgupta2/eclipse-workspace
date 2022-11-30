package mapping;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class keyvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		map.put("hindi", 930);
		map.put("english", 580);
		map.put("kannada",125);
		map.put("tamil", 551);
		System.out.println(map.entrySet());
		System.out.println(map);// System.out.println(map.entrySet()) both will give same result
		System.out.println(map.keySet());
		
		/*String keys=map.keySet();*/   // this can n9ot store all values of keyset so this is not of type String
		
		Set<String> keys=map.keySet();
		
		for(String key:keys) {
			System.out.println(key+"==>"+map.get(key));
			System.out.println(map.get(key));
		}
		
		
		
		

	}

}
/*## key values where key  can not have repeated names but values can repeated values

we create HashMap() by calling jvm through a keyword called as new which activates jvm  
new hashmap(); this creates hashmap   then create a refrence with name map and what kind of hash map is it HashMap type

HashMap map=newHashmap();


we need to create an hasmapwith defining the type of hashmap  

if we want to create key of "Atringf" and value of 'int'


HashMap<String,Interger> map=new HashMap<String,Integer>();

for putting the value inside map we do this


map.put("hiindi",976)
map.put("english",806)



while getting the values back we put map.get and pass the String literal

map.get("english") this will give 806

map.containsKey("hindi")==>true;
map.containsKey("sanskrit")==>false;


size();

map.containsValue(806)==>true;
map.containsValue(351)==>false;

for removing all the keys and values

keyset()
values()

key and value=e together

entryset()


for each loop 

for(type of variable and stroing it to something:name of array){
sop(x);
}
*/