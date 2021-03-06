package com.codepath.apps.restclienttemplate;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\u0014\u0010\u0015\u001a\u00020\u000b2\n\u0010\u0016\u001a\u00060\u0017j\u0002`\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u000bH\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u001a"}, d2 = {"Lcom/codepath/apps/restclienttemplate/LoginActivity;", "Lcom/codepath/oauth/OAuthLoginActionBarActivity;", "Lcom/codepath/apps/restclienttemplate/TwitterClient;", "()V", "sampleModelDao", "Lcom/codepath/apps/restclienttemplate/models/SampleModelDao;", "getSampleModelDao", "()Lcom/codepath/apps/restclienttemplate/models/SampleModelDao;", "setSampleModelDao", "(Lcom/codepath/apps/restclienttemplate/models/SampleModelDao;)V", "loginToRest", "", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onLoginFailure", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onLoginSuccess", "app_debug"})
public final class LoginActivity extends com.codepath.oauth.OAuthLoginActionBarActivity<com.codepath.apps.restclienttemplate.TwitterClient> {
    @org.jetbrains.annotations.Nullable()
    private com.codepath.apps.restclienttemplate.models.SampleModelDao sampleModelDao;
    
    public LoginActivity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.codepath.apps.restclienttemplate.models.SampleModelDao getSampleModelDao() {
        return null;
    }
    
    public final void setSampleModelDao(@org.jetbrains.annotations.Nullable()
    com.codepath.apps.restclienttemplate.models.SampleModelDao p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public void onLoginSuccess() {
    }
    
    @java.lang.Override()
    public void onLoginFailure(@org.jetbrains.annotations.NotNull()
    java.lang.Exception e) {
    }
    
    public final void loginToRest(@org.jetbrains.annotations.Nullable()
    android.view.View view) {
    }
}