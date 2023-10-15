// 6410406631 Thanyamas Chancharoen

package ku.cs.kafe.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import ku.cs.kafe.entity.Member;
import ku.cs.kafe.model.SignUpRequest;
import ku.cs.kafe.repository.MemberRepository;

@Service
public class SignupService {
    @Autowired
    private MemberRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private ModelMapper modelMapper;

    public boolean isUsernameAvailable(String username) {
        return repository.findByUsername(username) == null;
    }

    public void createUser(SignUpRequest user) {
        Member record = modelMapper.map(user, Member.class);
        record.setRole("ROLE_USER");

        String hashedPassword = passwordEncoder.encode(user.getPassword());
        record.setPassword(hashedPassword);

        repository.save(record);
    }

    public Member getUser(String username) {
        return repository.findByUsername(username);
    }

}
