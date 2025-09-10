package com.multi.di.di3;

public class MemberService {
    private final MemberRepository memberRepository; // 불변

    // 생성자 주입
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void join(Member m) { memberRepository.save(m); }

    public Member get(Long id) { return memberRepository.findById(id); }
}
