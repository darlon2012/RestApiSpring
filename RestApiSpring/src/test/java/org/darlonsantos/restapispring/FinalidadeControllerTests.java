package org.darlonsantos.restapispring;

import org.darlonsantos.restapispring.entity.Finalidade;
import org.darlonsantos.restapispring.repository.FinalidadeRepository;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.Arrays;
import java.util.List;

import static net.sf.jsqlparser.util.validation.feature.DatabaseType.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(FinalidadeControllerTests.class)
public class FinalidadeControllerTests{


  @Autowired
  private MockMvc mvc;

@MockBean
private FinalidadeRepository finalidadeRepository;



  @Test
  public void getAllFinalidadesTest() throws Exception {
    Finalidade finalidade = new Finalidade();


    List<Finalidade> allFinalidades = Arrays.asList(finalidade);

    Mockito.when(finalidadeRepository.findAllFinalidade()).thenReturn(allFinalidades);

    mvc.perform(MockMvcRequestBuilders.get("/finalidade")
            .contentType(MediaType.APPLICATION_JSON))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.jsonPath("$", Matchers.hasSize(1)))
        .andExpect(MockMvcResultMatchers.jsonPath("$[0].nome", Matchers.is(finalidade.getDescricao())));

}
}