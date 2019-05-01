.class Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$2;
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
    iput-object p1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$2;->this$0:Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;

    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPreferenceClick(Landroid/preference/Preference;)Z
    .locals 2
    .parameter "preference"

    .prologue
    .line 93
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$2;->this$0:Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;

    const/16 v1, 0x3e9

    invoke-virtual {v0, v1}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->showDialog(I)V

    .line 94
    const/4 v0, 0x1

    return v0
.end method
