.class Lcom/naing/vwallpaper/fg/b$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/arch/lifecycle/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/naing/vwallpaper/fg/b;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/arch/lifecycle/n",
        "<",
        "Ljava/util/List",
        "<",
        "Lcom/naing/model/a;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/naing/vwallpaper/fg/b;


# direct methods
.method constructor <init>(Lcom/naing/vwallpaper/fg/b;)V
    .locals 0

    iput-object p1, p0, Lcom/naing/vwallpaper/fg/b$2;->a:Lcom/naing/vwallpaper/fg/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/naing/model/a;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/b$2;->a:Lcom/naing/vwallpaper/fg/b;

    iget-object v0, v0, Lcom/naing/vwallpaper/fg/b;->c:Landroid/widget/ProgressBar;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/b$2;->a:Lcom/naing/vwallpaper/fg/b;

    iget-object v0, v0, Lcom/naing/vwallpaper/fg/b;->a:Lcom/naing/vwallpaper/fg/a;

    invoke-virtual {v0, p1}, Lcom/naing/vwallpaper/fg/a;->a(Ljava/util/List;)V

    return-void
.end method

.method public synthetic onChanged(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/naing/vwallpaper/fg/b$2;->a(Ljava/util/List;)V

    return-void
.end method
