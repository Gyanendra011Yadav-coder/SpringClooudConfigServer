package io.gyanendra.learning.springconfigserverimplmentaionlearning.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created By: Gyanendra Yadav
 *  on 2022-11-08,Nov,2022
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}