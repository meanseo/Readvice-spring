package kr.readvice.api.common.dataStructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Map;
import java.util.Scanner;

/**
 * packageName: kr.readvice.api.common.dataStructure
 * fileName        : MemberCRUD
 * author           : 최민서
 * date               : 2022-05-09
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-05-09         최민서        최초 생성
 */
public class MemberCRUD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true){
            System.out.println("0.exit 1.register 2.findById 3.findByName 4.memberList 5.count 6.update 7.remove");
            switch (s.next()){
                case "0":return;
                case "1":break;
                case "2":break;
                case "3":break;
                case "4":break;
                case "5":break;
                case "6":break;
                case "7":break;
                default:break;
            }
        }
    }
    @Data @AllArgsConstructor
    class Member{
        protected String userid, name, ssn, password, profileImg, email;
        @Override public String toString(){
            return String.format("[사용자 스펙] userid: %s, name: %s, ssn: %s, password: %s, profileImg: %s, email: %s",
                    userid, name, ssn, password, profileImg, email);
        }
    }
    @RequiredArgsConstructor
    class  MemberService{
        private final Map<String, Member> map;
        void register(Member member){map.put(member.getUserid(), member);}
    }
}
