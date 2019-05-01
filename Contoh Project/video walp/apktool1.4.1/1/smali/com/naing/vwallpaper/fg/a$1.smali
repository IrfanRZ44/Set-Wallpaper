.class Lcom/naing/vwallpaper/fg/a$1;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/naing/vwallpaper/fg/a;->a(Lcom/naing/vwallpaper/fg/a$b;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/naing/model/a;

.field final synthetic b:I

.field final synthetic c:Lcom/naing/vwallpaper/fg/a;


# direct methods
.method constructor <init>(Lcom/naing/vwallpaper/fg/a;Lcom/naing/model/a;I)V
    .locals 0

    iput-object p1, p0, Lcom/naing/vwallpaper/fg/a$1;->c:Lcom/naing/vwallpaper/fg/a;

    iput-object p2, p0, Lcom/naing/vwallpaper/fg/a$1;->a:Lcom/naing/model/a;

    iput p3, p0, Lcom/naing/vwallpaper/fg/a$1;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/a$1;->c:Lcom/naing/vwallpaper/fg/a;

    iget-object v0, v0, Lcom/naing/vwallpaper/fg/a;->c:Lcom/naing/vwallpaper/fg/a$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/a$1;->c:Lcom/naing/vwallpaper/fg/a;

    iget-object v0, v0, Lcom/naing/vwallpaper/fg/a;->c:Lcom/naing/vwallpaper/fg/a$a;

    iget-object v1, p0, Lcom/naing/vwallpaper/fg/a$1;->a:Lcom/naing/model/a;

    iget v2, p0, Lcom/naing/vwallpaper/fg/a$1;->b:I

    invoke-interface {v0, v1, v2}, Lcom/naing/vwallpaper/fg/a$a;->a(Lcom/naing/model/a;I)V

    :cond_0
    return-void
.end method
