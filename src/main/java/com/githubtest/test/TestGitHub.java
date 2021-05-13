package com.githubtest.test;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestGitHub {
    private static final Logger logger = LoggerFactory.getLogger(TestGitHub.class);

    @Test
    public void test(){
        System.out.println("testgithub");
        logger.info("info test...");

        logger.warn("commit cancel...");
        logger.warn("commit cancel...补充");//amend:修改到上次的提交中(即此次提交叠加到上次提交中,包括说明.但不能消减之前提交的文件.要消减只能reset撤销重来)
        logger.warn("commit cancel...has pushed");//已推送的,需本地撤销后强制推送一次
        logger.warn("commit cancel...未 pushed");//本地提交,未推送,只需本地撤销即可
    }
    
    public static void main(String[] args) {
        
    }
}
