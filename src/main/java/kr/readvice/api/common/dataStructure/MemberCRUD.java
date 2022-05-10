package kr.readvice.api.common.dataStructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.*;

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
        MemberService service = new MemberServiceImpl();
        while (true){
            System.out.println("0.exit 1.save 2.update 3.delete 4.findById 5.findByName 6.findAll 7.count 8.existsById 9.clear");
            switch (s.next()){
                case "0":return;
                case "1":
                    Member choi = new Member.Builder("choi")
                            .email("choi@redvice.kr")
                            .password("1")
                            .name("최민서")
                            .phone("010-1234-5678")
                            .profileImg("team1.jpg")
                            .build();
                    service.save(choi);
                    Member ha = new Member.Builder("ha")
                            .email("ha@redvice.kr")
                            .password("2")
                            .name("하진희")
                            .phone("010-5678-1234")
                            .profileImg("team2.jpg")
                            .build();
                    service.save(ha);
                    Member kim = new Member.Builder("kim")
                            .email("kim@redvice.kr")
                            .password("3")
                            .name("김아름")
                            .phone("010-1111-2222")
                            .profileImg("team3.jpg")
                            .build();
                    service.save(kim);
                    Member no = new Member.Builder("no")
                            .email("no@redvice.kr")
                            .password("4")
                            .name("노홍주")
                            .phone("010-3333-4444")
                            .profileImg("team4.jpg")
                            .build();
                    service.save(no);
                    break;
                case "2":break;
                case "3":break;
                case "4":break;
                case "5":break;
                case "6":break;
                case "7":break;
                case "8":break;
                case "9":break;
                default:break;
            }
        }
    }
    @Data @AllArgsConstructor
    static class Member{
        protected String userid, name, ssn, password, profileImg, phone, email;

        public Member(Builder builder) {
            this.userid = builder.userid;
            this.name = builder.name;
            this.ssn = builder.ssn;
            this.password = builder.password;
            this.profileImg = builder.profileImg;
            this.phone = builder.phone;
            this.email = builder.email;
        }

        static class Builder{
            private String userid, name, ssn, password, profileImg, phone, email;
            public Builder(String userid){this.userid=userid;}
            public Builder name(String name){this.name=name; return this;}
            public Builder ssn(String ssn){this.ssn=ssn; return this;}
            public Builder password(String password){this.password=password; return this;}
            public Builder profileImg(String profileImg){this.profileImg=profileImg; return this;}
            public Builder phone(String phone){this.phone=phone; return this;}
            public Builder email(String email){this.email=email; return this;}
            Member build(){ return  new Member(this);}

        }
        @Override public String toString(){
            return String.format("[사용자 스펙] userid: %s, name: %s, ssn: %s, password: %s, profileImg: %s, email: %s",
                    userid, name, ssn, password, profileImg, email);
        }
    }
    interface MemberService{
        void save(Member member);
        void update (Member member);
        void delete (Member member);
        List<Member> findAll();
        Member findById(String id);
        List<Member> findByName(String name);
        Boolean existsById(String id);
        int count();
    }

    static class  MemberServiceImpl implements MemberService{
        Map<String, Member> map;

        MemberServiceImpl(){
            this.map = new HashMap<>();
        }
        @Override public void save(Member member){
            map.put(member.getUserid(), member);
        }

        @Override
        public void update(Member member) {
            map.replace(member.getUserid(),member);
        }

        @Override
        public void delete(Member member) {
            map.remove(member.getUserid(),member);
        }

        @Override
        public List<Member> findAll() {
            return (List<Member>)map.values();
        }

        @Override
        public Member findById(String id) {
            return map.get(id);
        }

        @Override
        public List<Member> findByName(String name) {
            return (List<Member>)map.get(name);
        }

        @Override
        public Boolean existsById(String id) {
            return map.containsKey(id);
        }

        @Override
        public int count() {
            return map.size();
        }
    }
}
