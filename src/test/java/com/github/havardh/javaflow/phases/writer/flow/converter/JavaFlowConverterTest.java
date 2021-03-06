package com.github.havardh.javaflow.phases.writer.flow.converter;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import com.github.havardh.javaflow.model.CanonicalName;

import org.junit.jupiter.api.Test;

public class JavaFlowConverterTest {

  private JavaFlowConverter converter = new JavaFlowConverter();

  @Test
  public void shouldConvertCollectionToArray() {
    String flowType = converter.convert(CanonicalName.fromString("java.util.Collection"));

    assertThat(flowType, is("Array"));
  }
}
