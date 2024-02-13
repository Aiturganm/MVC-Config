package peaksoft.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import peaksoft.repo.StudentRepo;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{
    private final StudentRepo studentRepo;

    @Override
    public void findAll() {

    }
}
