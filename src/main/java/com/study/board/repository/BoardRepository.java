package com.study.board.repository;


import com.study.board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {    // Integer -> Board.java의 id가 Integer형식이기 때문

}

