package Linkedin;

public class TrappedRainWater {
    public static void main(String[] args) {
        int[] height=new int[]{4,2,0,6,3,2,5};
        int waterTrapped=trapRainWater(height);
        System.out.println(waterTrapped);

    }

    public static int trapRainWater(int[] height){
        int length=height.length;
        int[] leftMaxBoundary=new int[length];
        int[] rightMaxBoundary=new int[length];

        leftMaxBoundary[0]=height[0];
        for(int i=1;i<length;i++){
            leftMaxBoundary[i]=Math.max(leftMaxBoundary[i-1],height[i]);
        }

        rightMaxBoundary[length-1]=height[length-1];
        for(int i=length-2;i>=0;i--){
            rightMaxBoundary[i]=Math.max(height[i],rightMaxBoundary[i+1]);
        }
        int result=0;
        for(int i=0;i<length;i++){
            int waterLevel=Math.min(leftMaxBoundary[i],rightMaxBoundary[i]);
            result+=waterLevel-height[i];
        }

        return result;
    }
}
