package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
        //Given
        String [] args = {"3","1","2","4", "5"};

        //When & Then
        Main.main(args);
    }
}