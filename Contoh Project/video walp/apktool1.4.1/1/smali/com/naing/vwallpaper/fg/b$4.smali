.class Lcom/naing/vwallpaper/fg/b$4;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/naing/vwallpaper/fg/b;->a(ILjava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/naing/vwallpaper/fg/b;


# direct methods
.method constructor <init>(Lcom/naing/vwallpaper/fg/b;I)V
    .locals 0

    iput-object p1, p0, Lcom/naing/vwallpaper/fg/b$4;->b:Lcom/naing/vwallpaper/fg/b;

    iput p2, p0, Lcom/naing/vwallpaper/fg/b$4;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 6

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/b$4;->b:Lcom/naing/vwallpaper/fg/b;

    iget-object v1, p0, Lcom/naing/vwallpaper/fg/b$4;->b:Lcom/naing/vwallpaper/fg/b;

    invoke-virtual {v1}, Lcom/naing/vwallpaper/fg/b;->getContext()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    iget-object v3, p0, Lcom/naing/vwallpaper/fg/b$4;->b:Lcom/naing/vwallpaper/fg/b;

    const v4, 0x7f0d0034

    invoke-virtual {v3, v4}, Lcom/naing/vwallpaper/fg/b;->getString(I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static {v1, v2, v3, v4, v5}, Landroid/app/ProgressDialog;->show(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZZ)Landroid/app/ProgressDialog;

    move-result-object v1

    iput-object v1, v0, Lcom/naing/vwallpaper/fg/b;->e:Landroid/app/ProgressDialog;

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/b$4;->b:Lcom/naing/vwallpaper/fg/b;

    iget-object v0, v0, Lcom/naing/vwallpaper/fg/b;->d:Lcom/naing/vwallpaper/fg/CWpViewModel;

    iget v1, p0, Lcom/naing/vwallpaper/fg/b$4;->a:I

    invoke-virtual {v0, v1}, Lcom/naing/vwallpaper/fg/CWpViewModel;->a(I)V

    return-void
.end method
