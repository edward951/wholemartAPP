package com.wholemart.login.servicio;

import com.wholemart.login.dto.LoginDTO;
import org.springframework.stereotype.Service;

public interface LoginServicio {
  public String autenticar (LoginDTO loginDTO);

}
