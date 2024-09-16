package 완주하지못한선수;

import java.util.Arrays;

public class solution {
    public String solution(String[] participant,String[] completion) {
        String answer = "";
        //1.두 배열을 정렬한다.
        Arrays.sort(participant);
        Arrays.sort(completion);

        //2.두 배열이 다를때까지 찾는다.
        int i = 0;
        for(;i < completion.length;i++)
            if(!participant[i].equals(completion[i]))
                break;

        //3.여기까지 왔다면 마지막 주자가 완주하지 못한 선수다.
return participant[i];
    }

    public static void main(String[] args){
        String[] part = {"reo", "kiki", "eden"};
        String[] comp= {"reo", "eden"};
        solution sol = new solution();
        System.out.println(sol.solution(part,comp));

    }
}
