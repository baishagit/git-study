package com.baisha.service;
import com.baisha.mapper.NotebookMapper;
import com.baisha.pojo.Notebook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotebookService{

    @Autowired
    private NotebookMapper notebookMapper;

    public void add(Notebook notebook){
        notebookMapper.insert(notebook);
    }
    public void delete(Notebook notebook){
        notebookMapper.deleteById(notebook.getId());
    }
    public void update(Notebook notebook){
        notebookMapper.update(notebook);
    }
    public List<Notebook> notebooks(){
        List<Notebook> notebooks = notebookMapper.selectAll();
        if (notebooks != null) {
            return notebooks;
        }else {
            return null;
        }
    }
    public Notebook notebook(Integer id){
        Notebook notebook = notebookMapper.selectById(id);
        if (notebook != null) {
            return notebook;
        }else {
            return null;
        }
    }
}
