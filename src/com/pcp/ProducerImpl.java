package com.pcp;

public class ProducerImpl implements Producer<ProducerRequest>{
    private BaseModel baseModel;

    @Override
    public void produce(ProducerRequest producerRequest) {

    }

    public BaseModel getBaseModel() {
        return baseModel;
    }

    public void setBaseModel(BaseModel baseModel) {
        this.baseModel = baseModel;
    }
}
