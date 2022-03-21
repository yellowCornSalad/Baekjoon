// Buffered 기본 개념
// 참조: https://mrlazydev.tistory.com/m/entry/%EB%B0%B1%EC%A4%80-15552%EB%B2%88-%EC%9E%90%EB%B0%94-%EB%AC%B8%EC%A0%9C-Buffered

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Q15552 {
    public static void main(String[] args) throws IOException {

        // Scanner 및 println
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // scanner
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // println

        int strToNum = Integer.parseInt(br.readLine()); // bufferedreader의 형 변환 str->int

        // StringTokenizer 생성자
        StringTokenizer st;

        for(int i = 0; i < strToNum; i++) {
            // 생성자를 사용한 띄어쓰기 단위로 문자열을 구분할 " "를 입력
            st = new StringTokenizer(br.readLine(), " ");

            // StringTokenizer를 통해 반환된 "분리된 문자열"을 받아서(nextToken()) 정수로 형변환을 해주고,
            // 띄어쓰기 기준으로 구분된 데이터를 받아서 더한 뒤 \n을 통해 줄바꿈 해준다.
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
        }
        // 자동으로 데이터를 내주지 않아 버퍼에서 데이터 내주는 것 반드시 필요!
        bw.flush();
        // 버퍼 닫아주기
        bw.close();

    }
}