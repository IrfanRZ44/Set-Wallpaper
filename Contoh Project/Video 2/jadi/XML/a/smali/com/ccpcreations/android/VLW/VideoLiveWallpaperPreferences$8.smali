.class Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$8;
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
    iput-object p1, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$8;->this$0:Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;

    .line 286
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 1
    .parameter "dialog"
    .parameter "which"

    .prologue
    .line 289
    iget-object v0, p0, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences$8;->this$0:Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;

    invoke-virtual {v0}, Lcom/ccpcreations/android/VLW/VideoLiveWallpaperPreferences;->finish()V

    .line 290
    return-void
.end method
