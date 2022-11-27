package com.wholemart.login.repository;

import com.wholemart.login.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginRepository extends JpaRepository<Usuario, Long> {
    public Usuario findByEmailAndPassword(String email, String password);
}
