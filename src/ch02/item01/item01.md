## static factory method naming
- from  
해당 타입의 인스턴스를 반환  
ex) Date.from(instant);  
- of     
여러 매개 변수를 받아 적합한 타입의 인스턴스 반환  
ex) Set<Rank> faceCards = EnumSet.of(JACK,QUEEN,KING);
- valueOf   
from 과 of 의 더 자세한 버전
BigInteger prime = BigInteger.valueOf(Integer.MAX_VALUE);  
- instance, getInstance
- create , newInstance   
  매번 새로운 인스턴스를 생성해 반환함을 보장  
  ex) Object newArray = Array.newInstance(classObject, arrayLen)
- getType  
ex) FileStore fs = Files.getFileStore(path);  
- newType  
ex) BufferedReader br = Files.newBufferedReader(path);  
- type  
ex) List<Complaint> litany = Collections.list(legacyLitany);


### `item01`  
public 생성자 보단 정적 팩터리를 사용하는 습관을 가지자.

