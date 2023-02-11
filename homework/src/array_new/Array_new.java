package array_new;

import java.util.Random;

public class Array_new {
//	Q8 VERSIONS1
	static void arrayTriads(int[] n) {
		int max = n.length-1;
		int min = 0;
		int index1 = 0;
			int count = 0;
			int newArray[] = new int[3];
			NEW_INDEX:	for(int i =0; i<n.length; i++) {
				int index =(int)Math.floor((Math.random()*(max -min + 1) +min));
				for(int f =0; f < 3; f++) {					
					newArray[f] = n[index];
				}
				if(i == 2) {
					if(newArray[i] == newArray[i -1] || newArray[i] == newArray[i -2]) {
					}
						else {
							for(int v = 0; v<3; v++)
							System.out.println(newArray[v]);
							
							break;	
						}
				}
			}
	}
//	Q8 VERSIONS2
	static void arrayTriads2(int[] n) {
        Random rand = new Random();
        int max = n.length - 1;
        int min = 0;
        int count = 0;
        int k = 0;
        int newArray[] = new int[3];// newArray{1,5,9},  newArray{14,5,9}
        NEW_INDEX:
        for (int i = 0; i < 3; i++) {
            int index = (int) Math.floor((rand.nextInt(min,max)));
            if (i < 3) {
                newArray[i] = n[index];
                count++;
            }
            while (count == 3) {
                if (newArray[count - 1] == newArray[count - 2] || newArray[count -1] == newArray[count - 3] || newArray[count - 2] == newArray[count - 3]) {
                    count = 0;
                    continue NEW_INDEX;

                } else {
                    for (int j = 0; j < newArray.length; j++) {
                        System.out.print(newArray[j] + " ");
                    }
                    count = 0;
                    continue NEW_INDEX;
                    
                }
            }
        }
    }
//Q8 version 3

	    static void arrayTriads3(int[] n) {
	        Random rand = new Random();
	        int max = n.length - 1;
	        int min = 0;
	        int count = 0;
	        int k = 0;
	        boolean b = true;
	        int newArray[] = new int[3];// newArray{1,5,9},  newArray{14,5,9}

	        while (b) {
	            NEW_INDEX:
	            for (int i = 0; i < 3; i++) {
	                int index = rand.nextInt(4);
	                if (i < 3) {
	                    newArray[i] = n[index];
	                    count++;
	                }
	                while (count == 3) {
	                    if (newArray[count - 1] == newArray[count - 2] || newArray[count - 1] == newArray[count - 3] || newArray[count - 2] == newArray[count - 3]) {
	                        count = 0;
	                        i = 0;
	                        continue NEW_INDEX;

	                    } else {
	                        while (k != 4) {
	                            for (int j = 0; j < newArray.length; j++) {
	                                System.out.print(newArray[j] + " ");
	                            }
	                            System.out.println("\n");
	                            k++;
	                            i = 0;
	                            count = 0;
	                            continue NEW_INDEX;
	                        }
	                        b = false;
	                        break;
	                    }

	                }
	            }
	        }
	    }
	    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ms[] = {12, 134, 100, 12 ,213 };
		arrayTriads(ms);
		Random ran = new Random();
		ran.nextInt(8);
	}

}
