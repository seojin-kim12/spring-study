package com.spring.springstudy.service;

import com.spring.springstudy.entity.Board;
import com.spring.springstudy.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public void write(Board board){

        boardRepository.save(board);
    }

    public List<Board> boardList() {
        return boardRepository.findAll();
    }
}
