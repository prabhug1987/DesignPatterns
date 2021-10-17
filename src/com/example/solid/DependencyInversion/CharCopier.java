package com.example.solid.DependencyInversion;
class CharCopier {

  private static final int EOF = 0;

void copy(Reader reader, Writer writer) {
    int c;
    while ((c = reader.getchar()) != EOF) {
      writer.putchar();
    }
  }
}