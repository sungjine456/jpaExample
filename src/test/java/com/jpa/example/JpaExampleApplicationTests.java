package com.jpa.example;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jpa.example.domain.Member;
import com.jpa.example.repository.MemberRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class JpaExampleApplicationTests {

	@Autowired MemberRepository memberRepository;
	@Test
	public void testMember() {
		Member member = memberRepository.findByName("name");
		Assert.assertThat(member, is(nullValue()));
	}
}
