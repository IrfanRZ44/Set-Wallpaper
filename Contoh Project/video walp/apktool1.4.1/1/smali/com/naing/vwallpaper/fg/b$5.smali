.class Lcom/naing/vwallpaper/fg/b$5;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/flask/colorpicker/a/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/naing/vwallpaper/fg/b;->c()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/naing/vwallpaper/fg/b;


# direct methods
.method constructor <init>(Lcom/naing/vwallpaper/fg/b;)V
    .locals 0

    iput-object p1, p0, Lcom/naing/vwallpaper/fg/b$5;->a:Lcom/naing/vwallpaper/fg/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/DialogInterface;I[Ljava/lang/Integer;)V
    .locals 2

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/b$5;->a:Lcom/naing/vwallpaper/fg/b;

    invoke-static {p2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, p2, v1}, Lcom/naing/vwallpaper/fg/b;->a(Lcom/naing/vwallpaper/fg/b;ILjava/lang/String;)V

    return-void
.end method
