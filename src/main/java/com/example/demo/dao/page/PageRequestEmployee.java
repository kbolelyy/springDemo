package com.example.demo.dao.page;

import org.springframework.data.domain.Sort;

public class PageRequestEmployee {


    private long countEntity;
    private int pageSize;
    private int limitPage;
    private Sort.Direction sortDirection;
    private String field;



    public long getCountEntity() {
        return countEntity;
    }

    public void setCountEntity(long countEntity) {
        this.countEntity = countEntity;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getLimitPage() {
        return limitPage;
    }

    public void setLimitPage(int limitPage) {
        this.limitPage = limitPage;
    }

    public Sort.Direction getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(Sort.Direction sortDirection) {
        this.sortDirection = sortDirection;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
