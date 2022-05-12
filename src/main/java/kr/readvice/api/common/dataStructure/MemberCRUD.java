package kr.readvice.api.common.dataStructure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


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
                case "2":
                    Member m = new Member();
                    m.setUserid("choi");

                    break;
                case "3":
                    Member temp = new Member();
                    temp.setUserid("choi");
                    service.delete(temp);
                    break;
                case "4":
                    /**
                    if(service.existsById("choi")){
                        System.out.println(service.findById("choi"));
                    }
                    else {
                        System.out.println("존재하지 않는 아이디 입니다.");
                    }*/
                    System.out.println(service.existsById("choi")?
                            service.findById("choi"):"존재하지 않는 아이디 입니다.");
                    break;
                case "5":break;
                case "6":break;
                case "7":
                    System.out.println("회원수: "+service.count());
                    break;
                case "8":
                    System.out.println(service.existsById("choi")? "존재합니다.":"존재하지 않습니다.");
                    break;
                case "9":
                    service.clear();
                    break;
                case "10":
                    service.findAll();
                    break;
                default:
                    break;
            }
        }
    }
    @Data @NoArgsConstructor
    static class Member{
        protected String userid, name, password, profileImg, phone, email;

        public Member(Builder builder) {
            this.userid = builder.userid;
            this.name = builder.name;
            this.password = builder.password;
            this.profileImg = builder.profileImg;
            this.phone = builder.phone;
            this.email = builder.email;
        }

        static class Builder{
            private String userid, name, password, profileImg, phone, email;
            public Builder(String userid){this.userid=userid;}
            public Builder name(String name){this.name=name; return this;}
            public Builder password(String password){this.password=password; return this;}
            public Builder profileImg(String profileImg){this.profileImg=profileImg; return this;}
            public Builder phone(String phone){this.phone=phone; return this;}
            public Builder email(String email){this.email=email; return this;}
            Member build(){ return  new Member(this);}

        }
        @Override public String toString(){
            return String.format("[사용자 스펙] userid: %s, name: %s, password: %s, profileImg: %s, email: %s",
                    userid, name, password, profileImg, email);
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
        void clear();
    }

    static class  MemberServiceImpl implements MemberService{
        private final Map<String, Member> map;

        public MemberServiceImpl(){
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
            map.remove(member.getUserid());
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

        @Override
        public void clear() {
            map.clear();
        }
    }
}
