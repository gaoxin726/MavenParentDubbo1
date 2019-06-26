package com.qphone.servcieimpl;

import com.qphone.dao.TextDao;
import com.qphone.pojo.Text;
import com.qphone.service.TextService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("textService")
public class TextServcieImpl implements TextService {
    @Autowired
    private TextDao textDao;
    @Override
    public List<Text> getall() {
        return textDao.getall();
    }
}
