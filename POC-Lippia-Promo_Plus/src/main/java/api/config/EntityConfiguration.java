package api.config;

import services.PromoPlusService;

public enum EntityConfiguration {

    PROMOPLUS {
        @Override
        public Class<?> getEntityService() {
            return PromoPlusService.class;
        }
    };

    public abstract Class<?> getEntityService();
}



