module org.example.helper.impl {
    
    requires org.example.helper.api;
    provides org.example.helper.api.Helper with org.example.helper.impl.HelperImpl1;
}