.class Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$10;
.super Ljava/lang/Object;
.source "VideoLiveWallpaperPreferences.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->onCreateDialog(I)Landroid/app/Dialog;
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
    iput-object p1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$10;->this$0:Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;

    .line 312
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 3
    .parameter "dialog"
    .parameter "which"

    .prologue
    .line 315
    iget-object v1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$10;->this$0:Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;

    invoke-virtual {v1}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    .line 317
    .local v0, spee:Landroid/content/SharedPreferences$Editor;
    const-string v1, "ChangelogLastViewed"

    invoke-static {}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->access$1()I

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 318
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 319
    return-void
.end method
