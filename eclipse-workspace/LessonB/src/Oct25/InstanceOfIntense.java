package Oct25;

class Box {
	   public void simpleWrap() {
	      System.out.println("Simple Wrapping");
	   }
	}

	class PaperBox extends Box {
	   public void paperWrap() {
	      System.out.println("Paper Wrapping");
	   }
	}

	class GoldPaperBox extends PaperBox {
	   public void goldWrap() {
	      System.out.println("Gold Wrapping");
	   }
	}


public class InstanceOfIntense {
	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);

	}
	
	public static void wrapBox(Box box) { //polymorphism적용
		if (box instanceof GoldPaperBox) {
			((GoldPaperBox)box).goldWrap();
		}
		else if(box instanceof PaperBox) {
			
			//((PaperBox)box).paperWrap();
			
			PaperBox pb = (PaperBox)box; //형변환
			pb.paperWrap();
			
			
			// 형변환 해주고 겉에 한 번 더 괄호 쳐주면 Paperbox객체가 되는 것.
			((PaperBox)box).paperWrap();  
			
			
		}
		else {
			box.simpleWrap();
		}
	}

}
