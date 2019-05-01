.class public Lcom/naing/vwallpaper/fg/c;
.super Landroid/support/v4/app/Fragment;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/widget/RelativeLayout;

.field private b:Landroid/widget/RelativeLayout;

.field private c:Landroid/widget/RelativeLayout;

.field private d:Landroid/widget/RelativeLayout;

.field private e:Landroid/widget/TextView;

.field private f:Landroid/widget/TextView;

.field private g:Landroid/widget/TextView;

.field private h:Landroid/widget/TextView;

.field private i:Landroid/widget/ImageView;

.field private j:Landroid/widget/ImageView;

.field private k:Landroid/content/SharedPreferences;

.field private l:Z

.field private m:Z

.field private n:I

.field private o:I

.field private p:Ljava/lang/String;

.field private q:Landroid/graphics/Typeface;

.field private r:Lcom/naing/vwallpaper/MainActivity;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/support/v4/app/Fragment;-><init>()V

    return-void
.end method

.method public static a()Lcom/naing/vwallpaper/fg/c;
    .locals 1

    new-instance v0, Lcom/naing/vwallpaper/fg/c;

    invoke-direct {v0}, Lcom/naing/vwallpaper/fg/c;-><init>()V

    return-object v0
.end method

.method private c()Z
    .locals 4

    const v3, 0x7f0d005b

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/naing/vwallpaper/fg/c;->p:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/c;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/c;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/c;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/naing/c/b;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/naing/vwallpaper/fg/c;->d()V

    :goto_0
    return v0

    :cond_0
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/naing/vwallpaper/fg/c;->p:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljava/io/File;->isFile()Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/c;->getContext()Landroid/content/Context;

    move-result-object v1

    const v2, 0x7f0d005d

    invoke-virtual {p0, v2}, Lcom/naing/vwallpaper/fg/c;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/naing/c/b;->a(Landroid/content/Context;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/naing/vwallpaper/fg/c;->d()V

    goto :goto_0

    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private d()V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/c;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/naing/vwallpaper/VideoChooser;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget v1, Lcom/naing/c/b;->b:I

    invoke-virtual {p0, v0, v1}, Lcom/naing/vwallpaper/fg/c;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method private e()V
    .locals 3

    iget-object v1, p0, Lcom/naing/vwallpaper/fg/c;->g:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/c;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget-boolean v0, p0, Lcom/naing/vwallpaper/fg/c;->l:Z

    if-eqz v0, :cond_0

    const v0, 0x7f0d0053

    :goto_0
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/naing/vwallpaper/fg/c;->i:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/c;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget-boolean v0, p0, Lcom/naing/vwallpaper/fg/c;->l:Z

    if-eqz v0, :cond_1

    const v0, 0x7f070073

    :goto_1
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_0
    const v0, 0x7f0d0052

    goto :goto_0

    :cond_1
    const v0, 0x7f070072

    goto :goto_1
.end method

.method private f()V
    .locals 3

    iget-object v1, p0, Lcom/naing/vwallpaper/fg/c;->h:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/c;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget-boolean v0, p0, Lcom/naing/vwallpaper/fg/c;->m:Z

    if-eqz v0, :cond_0

    const v0, 0x7f0d0057

    :goto_0
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, Lcom/naing/vwallpaper/fg/c;->j:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/c;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    iget-boolean v0, p0, Lcom/naing/vwallpaper/fg/c;->m:Z

    if-eqz v0, :cond_1

    const v0, 0x7f070069

    :goto_1
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_0
    const v0, 0x7f0d0058

    goto :goto_0

    :cond_1
    const v0, 0x7f070068

    goto :goto_1
.end method


# virtual methods
.method b()V
    .locals 3

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/c;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/naing/c/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/c;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    const/16 v1, 0x3e9

    const v2, 0x7f0d0043

    invoke-virtual {p0, v2}, Lcom/naing/vwallpaper/fg/c;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lcom/naing/c/c;->a(Landroid/app/Activity;ILjava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-direct {p0}, Lcom/naing/vwallpaper/fg/c;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/c;->getContext()Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/naing/vwallpaper/AdjusterActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    sget v1, Lcom/naing/c/b;->b:I

    invoke-virtual {p0, v0, v1}, Lcom/naing/vwallpaper/fg/c;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_0
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onActivityResult(IILandroid/content/Intent;)V

    sget v0, Lcom/naing/c/b;->b:I

    if-ne p1, v0, :cond_0

    const/4 v0, -0x1

    if-ne p2, v0, :cond_0

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/c;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->finish()V

    :cond_0
    return-void
.end method

.method public onAttach(Landroid/content/Context;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onAttach(Landroid/content/Context;)V

    instance-of v0, p1, Lcom/naing/vwallpaper/MainActivity;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/naing/vwallpaper/MainActivity;

    iput-object p1, p0, Lcom/naing/vwallpaper/fg/c;->r:Lcom/naing/vwallpaper/MainActivity;

    :cond_0
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    :goto_0
    return-void

    :sswitch_0
    iget-boolean v2, p0, Lcom/naing/vwallpaper/fg/c;->l:Z

    if-nez v2, :cond_0

    :goto_1
    iput-boolean v0, p0, Lcom/naing/vwallpaper/fg/c;->l:Z

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/c;->k:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "sound"

    iget-boolean v2, p0, Lcom/naing/vwallpaper/fg/c;->l:Z

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-direct {p0}, Lcom/naing/vwallpaper/fg/c;->e()V

    goto :goto_0

    :cond_0
    move v0, v1

    goto :goto_1

    :sswitch_1
    invoke-direct {p0}, Lcom/naing/vwallpaper/fg/c;->d()V

    goto :goto_0

    :sswitch_2
    iget-boolean v2, p0, Lcom/naing/vwallpaper/fg/c;->m:Z

    if-nez v2, :cond_1

    :goto_2
    iput-boolean v0, p0, Lcom/naing/vwallpaper/fg/c;->m:Z

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/c;->k:Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "scale"

    iget-boolean v2, p0, Lcom/naing/vwallpaper/fg/c;->m:Z

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    invoke-direct {p0}, Lcom/naing/vwallpaper/fg/c;->f()V

    goto :goto_0

    :cond_1
    move v0, v1

    goto :goto_2

    :sswitch_3
    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/c;->b()V

    goto :goto_0

    :sswitch_4
    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/c;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/naing/c/b;->g(Landroid/content/Context;)V

    goto :goto_0

    :sswitch_5
    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/c;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/naing/c/b;->f(Landroid/content/Context;)V

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x7f08002e -> :sswitch_0
        0x7f080083 -> :sswitch_5
        0x7f08009b -> :sswitch_3
        0x7f08009c -> :sswitch_4
        0x7f0800a5 -> :sswitch_2
        0x7f0800ef -> :sswitch_1
    .end sparse-switch
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onCreate(Landroid/os/Bundle;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/naing/vwallpaper/fg/c;->setHasOptionsMenu(Z)V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onCreateOptionsMenu(Landroid/view/Menu;Landroid/view/MenuInflater;)V

    const/high16 v0, 0x7f0b

    invoke-virtual {p2, v0, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 2

    const v0, 0x7f0a0032

    const/4 v1, 0x0

    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public onDetach()V
    .locals 1

    invoke-super {p0}, Landroid/support/v4/app/Fragment;->onDetach()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/naing/vwallpaper/fg/c;->r:Lcom/naing/vwallpaper/MainActivity;

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 2

    const/4 v0, 0x1

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    :cond_0
    :goto_0
    return v0

    :sswitch_0
    invoke-direct {p0}, Lcom/naing/vwallpaper/fg/c;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/c;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/naing/c/b;->d(Landroid/content/Context;)V

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/c;->getActivity()Landroid/support/v4/app/FragmentActivity;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentActivity;->finish()V

    goto :goto_0

    :sswitch_1
    iget-object v1, p0, Lcom/naing/vwallpaper/fg/c;->r:Lcom/naing/vwallpaper/MainActivity;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/naing/vwallpaper/fg/c;->r:Lcom/naing/vwallpaper/MainActivity;

    invoke-virtual {v1}, Lcom/naing/vwallpaper/MainActivity;->e()V

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x7f08001c -> :sswitch_0
        0x7f080024 -> :sswitch_1
    .end sparse-switch
.end method

.method public onPrepareOptionsMenu(Landroid/view/Menu;)V
    .locals 2

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/c;->r:Lcom/naing/vwallpaper/MainActivity;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/c;->r:Lcom/naing/vwallpaper/MainActivity;

    invoke-virtual {v0}, Lcom/naing/vwallpaper/MainActivity;->f()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, 0x7f080024

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/app/Fragment;->onPrepareOptionsMenu(Landroid/view/Menu;)V

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1

    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/app/Fragment;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    const/16 v0, 0x3e9

    if-ne p1, v0, :cond_0

    invoke-static {p3}, Lcom/naing/c/c;->a([I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/c;->b()V

    :cond_0
    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 7

    const/4 v6, 0x0

    invoke-super {p0, p1, p2}, Landroid/support/v4/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/c;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/naing/c/b;->e(Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, Lcom/naing/vwallpaper/fg/c;->q:Landroid/graphics/Typeface;

    const v0, 0x7f08009b

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/naing/vwallpaper/fg/c;->a:Landroid/widget/RelativeLayout;

    const v0, 0x7f0800ef

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/naing/vwallpaper/fg/c;->b:Landroid/widget/RelativeLayout;

    const v0, 0x7f08002e

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/naing/vwallpaper/fg/c;->c:Landroid/widget/RelativeLayout;

    const v0, 0x7f0800a5

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/naing/vwallpaper/fg/c;->d:Landroid/widget/RelativeLayout;

    const v0, 0x7f08006a

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/naing/vwallpaper/fg/c;->i:Landroid/widget/ImageView;

    const v0, 0x7f080070

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/naing/vwallpaper/fg/c;->j:Landroid/widget/ImageView;

    const v0, 0x7f0800e8

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/naing/vwallpaper/fg/c;->e:Landroid/widget/TextView;

    const v0, 0x7f0800eb

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/naing/vwallpaper/fg/c;->f:Landroid/widget/TextView;

    const v0, 0x7f0800e5

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/naing/vwallpaper/fg/c;->g:Landroid/widget/TextView;

    const v0, 0x7f0800ea

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/naing/vwallpaper/fg/c;->h:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/c;->e:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/naing/vwallpaper/fg/c;->q:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/c;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/naing/vwallpaper/fg/c;->q:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/c;->g:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/naing/vwallpaper/fg/c;->q:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/c;->h:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/naing/vwallpaper/fg/c;->q:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const v0, 0x7f0800e9

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/naing/vwallpaper/fg/c;->q:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const v0, 0x7f0800e6

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, p0, Lcom/naing/vwallpaper/fg/c;->q:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/c;->a:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/c;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/c;->c:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/c;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, p0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f080083

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    const v0, 0x7f08009c

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/c;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/naing/c/b;->a(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lcom/naing/vwallpaper/fg/c;->k:Landroid/content/SharedPreferences;

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/c;->k:Landroid/content/SharedPreferences;

    const-string v1, "start"

    invoke-interface {v0, v1, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/naing/vwallpaper/fg/c;->n:I

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/c;->k:Landroid/content/SharedPreferences;

    const-string v1, "end"

    invoke-interface {v0, v1, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/naing/vwallpaper/fg/c;->o:I

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/c;->k:Landroid/content/SharedPreferences;

    const-string v1, "sound"

    invoke-interface {v0, v1, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/naing/vwallpaper/fg/c;->l:Z

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/c;->k:Landroid/content/SharedPreferences;

    const-string v1, "scale"

    invoke-interface {v0, v1, v6}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Lcom/naing/vwallpaper/fg/c;->m:Z

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/c;->k:Landroid/content/SharedPreferences;

    const-string v1, "location"

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/c;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const v3, 0x7f0d005b

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/naing/vwallpaper/fg/c;->p:Ljava/lang/String;

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/c;->f:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/naing/vwallpaper/fg/c;->p:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/naing/vwallpaper/fg/c;->e()V

    invoke-direct {p0}, Lcom/naing/vwallpaper/fg/c;->f()V

    iget-object v0, p0, Lcom/naing/vwallpaper/fg/c;->e:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/naing/vwallpaper/fg/c;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0d0055

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x2

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p0, Lcom/naing/vwallpaper/fg/c;->n:I

    int-to-long v4, v3

    invoke-static {v4, v5}, Lcom/naing/view/RangeBar;->a(J)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v6

    const/4 v3, 0x1

    iget v4, p0, Lcom/naing/vwallpaper/fg/c;->o:I

    int-to-long v4, v4

    invoke-static {v4, v5}, Lcom/naing/view/RangeBar;->a(J)Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
