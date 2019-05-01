.class Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$1;
.super Ljava/lang/Object;
.source "VideoLiveWallpaperPreferences.java"

# interfaces
.implements Landroid/preference/Preference$OnPreferenceClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;


# direct methods
.method constructor <init>(Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;)V
    .locals 0
    .parameter

    .prologue
    .line 1
    iput-object p1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$1;->this$0:Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 3
    .parameter "preference"

    .prologue
    .line 71
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$1;->this$0:Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;

    invoke-static {v1}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->access$0(Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;)Landroid/os/Handler;

    move-result-object v1

    sput-object v1, Lcom/ccpcreations/android/VLW/FilePicker;->callbackHandler:Landroid/os/Handler;

    .line 72
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$1;->this$0:Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;

    sput-object v1, Lcom/ccpcreations/android/VLW/FilePicker;->callbackRunnable:Ljava/lang/Runnable;

    .line 73
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$1;->this$0:Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;

    const-class v2, Lcom/ccpcreations/android/VLW/FilePicker;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 74
    .local v0, intent:Landroid/content/Intent;
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$1;->this$0:Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;

    invoke-virtual {v1, v0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->startActivity(Landroid/content/Intent;)V

    .line 75
    const/4 v1, 0x1

    return v1
.end method
