.class Lcom/naing/vwallpaper/fg/b$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/naing/vwallpaper/fg/a$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/naing/vwallpaper/fg/b;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
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

    iput-object p1, p0, Lcom/naing/vwallpaper/fg/b$1;->a:Lcom/naing/vwallpaper/fg/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/naing/model/a;I)V
    .locals 3

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/b$1;->a:Lcom/naing/vwallpaper/fg/b;

    invoke-virtual {p1}, Lcom/naing/model/a;->a()I

    move-result v1

    invoke-virtual {p1}, Lcom/naing/model/a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/naing/vwallpaper/fg/b;->a(Lcom/naing/vwallpaper/fg/b;ILjava/lang/String;)V

    return-void
.end method
