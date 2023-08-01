package Array.BinarySearch;

public class _0nearestPerfectSquare {

    // for 5 ans is 4,1
    // for 4 ans is 4,0
    // for 8 ans is 9,1

    // using sqrt function O(sqrt)

        public static void mistakesSquare(){
            int N =1545454;
            int left =0;
            int right = N;
            while(left<=right){
                int mid = left+(right-left)/2;
                System.out.print("left= "+left+" "+"right= "+right+" "+"mid= "+mid+" " +"mid*mid="+mid*mid);
                if(mid*mid==N){
                    break;
                }
                else if((mid*mid)<N){
                    left = mid+1;

                }
                else{
                    right = mid-1;

                }

            }
            System.out.println(right+" "+right*right);
            System.out.println(left+" "+left*left);
            System.out.println(Math.sqrt(1545049));

       int[] ans = new int[2];

        if(left*left-N<N-right*right){
            ans[0]=left*left;
            ans[1]=Math.abs(left*left-N);
        }
        else{
            ans[0]=right*right;
            ans[1]=Math.abs(N-right*right);
        }
            System.out.println( ans);
        }

        // o(logN)
    int[] nearestPerfectSquare(int N) {
        long left =0;
        long right = N;
        while(left<=right){
            long mid = left+(right-left)/2;
            if(mid*mid==N){
                int[] ans = new int[2];
                int mul = (int) mid*(int) mid;
                ans[0]=mul;

                ans[1]=0;
                return ans;
            }
            else if(mid*mid>N){
                right = mid-1;
            }
            else{
                left = mid+1;
            }

        }
        int[] ans = new int[2];

        if(left*left-N<N-right*right){
            ans[0]=(int) left*(int)left;
            ans[1]=(int) Math.abs(left*left-N);
        }
        else{
            ans[0]=(int) right*(int)right;
            ans[1]=(int) Math.abs(N-right*right);
        }
        return ans;
    }
    }



