.class public Lcom/naing/vwallpaper/VideoChooser;
.super Lcom/naing/vwallpaper/BaseActivity;

# interfaces
.implements Landroid/support/v7/widget/SearchView$OnQueryTextListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/naing/vwallpaper/VideoChooser$b;,
        Lcom/naing/vwallpaper/VideoChooser$a;
    }
.end annotation


# instance fields
.field private a:Landroid/widget/TextView;

.field private b:Landroid/widget/ListView;

.field private c:Landroid/support/v7/widget/SearchView;

.field private d:Lcom/naing/vwallpaper/VideoChooser$a;

.field private e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/naing/model/VideoModel;",
            ">;"
        }
    .end annotation
.end field

.field private f:Landroid/content/ContentResolver;

.field private g:Landroid/graphics/Typeface;

.field private h:Lcom/naing/c/a;

.field private i:Landroid/os/Handler;

.field private j:Ljava/lang/Runnable;

.field private k:Ljava/lang/String;

.field private l:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/naing/vwallpaper/BaseActivity;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->k:Ljava/lang/String;

    const-string v0, "datetaken DESC"

    iput-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->l:Ljava/lang/String;

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->i:Landroid/os/Handler;

    new-instance v0, Lcom/naing/vwallpaper/VideoChooser$1;

    invoke-direct {v0, p0}, Lcom/naing/vwallpaper/VideoChooser$1;-><init>(Lcom/naing/vwallpaper/VideoChooser;)V

    iput-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->j:Ljava/lang/Runnable;

    return-void
.end method

.method static synthetic a(Lcom/naing/vwallpaper/VideoChooser;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->k:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic b(Lcom/naing/vwallpaper/VideoChooser;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->l:Ljava/lang/String;

    return-object v0
.end method

.method private b(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/naing/vwallpaper/VideoChooser;->l:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/naing/vwallpaper/VideoChooser;->g()V

    return-void
.end method

.method static synthetic c(Lcom/naing/vwallpaper/VideoChooser;)Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->e:Ljava/util/List;

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/naing/vwallpaper/AdjusterActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "PATH"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    sget v1, Lcom/naing/c/b;->b:I

    invoke-virtual {p0, v0, v1}, Lcom/naing/vwallpaper/VideoChooser;->startActivityForResult(Landroid/content/Intent;I)V

    return-void
.end method

.method static synthetic d(Lcom/naing/vwallpaper/VideoChooser;)Landroid/graphics/Typeface;
    .locals 1

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->g:Landroid/graphics/Typeface;

    return-object v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 7

    const/4 v3, 0x0

    :try_start_0
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "title LIKE \"%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%\" OR "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "album"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " LIKE \"%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%\" OR "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "artist"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " LIKE \"%"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "%\""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :cond_0
    iget-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->f:Landroid/content/ContentResolver;

    sget-object v1, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    const/4 v2, 0x4

    new-array v2, v2, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "_id"

    aput-object v5, v2, v4

    const/4 v4, 0x1

    const-string v5, "_data"

    aput-object v5, v2, v4

    const/4 v4, 0x2

    const-string v5, "_display_name"

    aput-object v5, v2, v4

    const/4 v4, 0x3

    const-string v5, "_size"

    aput-object v5, v2, v4

    const/4 v4, 0x0

    move-object v5, p2

    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    iget-object v1, p0, Lcom/naing/vwallpaper/VideoChooser;->a:Landroid/widget/TextView;

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V

    iget-object v1, p0, Lcom/naing/vwallpaper/VideoChooser;->e:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->clear()V

    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-eqz v1, :cond_2

    :cond_1
    const-string v1, "_id"

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    invoke-interface {v0, v1}, Landroid/database/Cursor;->getInt(I)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "_display_name"

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v2

    invoke-interface {v0, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v2

    const-string v3, "_data"

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v3

    invoke-interface {v0, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "_size"

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iget-object v5, p0, Lcom/naing/vwallpaper/VideoChooser;->e:Ljava/util/List;

    new-instance v6, Lcom/naing/model/VideoModel;

    invoke-direct {v6, v1, v2, v3, v4}, Lcom/naing/model/VideoModel;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-interface {v0}, Landroid/database/Cursor;->moveToNext()Z

    move-result v1

    if-nez v1, :cond_1

    :goto_0
    invoke-interface {v0}, Landroid/database/Cursor;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->d:Lcom/naing/vwallpaper/VideoChooser$a;

    invoke-virtual {v0}, Lcom/naing/vwallpaper/VideoChooser$a;->notifyDataSetChanged()V

    :goto_1
    return-void

    :cond_2
    :try_start_1
    iget-object v1, p0, Lcom/naing/vwallpaper/VideoChooser;->a:Landroid/widget/TextView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setVisibility(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {p0}, Lcom/naing/vwallpaper/VideoChooser;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0d0035

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/naing/c/b;->a(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->d:Lcom/naing/vwallpaper/VideoChooser$a;

    invoke-virtual {v0}, Lcom/naing/vwallpaper/VideoChooser$a;->notifyDataSetChanged()V

    goto :goto_1

    :catchall_0
    move-exception v0

    iget-object v1, p0, Lcom/naing/vwallpaper/VideoChooser;->d:Lcom/naing/vwallpaper/VideoChooser$a;

    invoke-virtual {v1}, Lcom/naing/vwallpaper/VideoChooser$a;->notifyDataSetChanged()V

    throw v0
.end method

.method g()V
    .locals 2

    invoke-static {p0}, Lcom/naing/c/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x3e9

    const v1, 0x7f0d0043

    invoke-virtual {p0, v1}, Lcom/naing/vwallpaper/VideoChooser;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/naing/c/c;->a(Landroid/app/Activity;ILjava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->i:Landroid/os/Handler;

    iget-object v1, p0, Lcom/naing/vwallpaper/VideoChooser;->j:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method h()V
    .locals 4

    invoke-static {p0}, Lcom/naing/c/c;->a(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0x3e9

    const v1, 0x7f0d0043

    invoke-virtual {p0, v1}, Lcom/naing/vwallpaper/VideoChooser;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/naing/c/c;->a(Landroid/app/Activity;ILjava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->i:Landroid/os/Handler;

    iget-object v1, p0, Lcom/naing/vwallpaper/VideoChooser;->j:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->i:Landroid/os/Handler;

    iget-object v1, p0, Lcom/naing/vwallpaper/VideoChooser;->j:Ljava/lang/Runnable;

    const-wide/16 v2, 0x12c

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method protected onActivityResult(IILandroid/content/Intent;)V
    .locals 3

    const v2, 0x7f0d0035

    const/4 v1, -0x1

    invoke-super {p0, p1, p2, p3}, Lcom/naing/vwallpaper/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    const/16 v0, 0x66

    if-ne p1, v0, :cond_2

    if-ne p2, v1, :cond_2

    if-eqz p3, :cond_2

    :try_start_0
    invoke-virtual {p3}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/naing/c/b;->a(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-direct {p0, v0}, Lcom/naing/vwallpaper/VideoChooser;->c(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    invoke-virtual {p0}, Lcom/naing/vwallpaper/VideoChooser;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    const v1, 0x7f0d0035

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/naing/c/b;->a(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {p0}, Lcom/naing/vwallpaper/VideoChooser;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/naing/c/b;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    sget v0, Lcom/naing/c/b;->b:I

    if-ne p1, v0, :cond_0

    if-ne p2, v1, :cond_0

    invoke-virtual {p0, v1}, Lcom/naing/vwallpaper/VideoChooser;->setResult(I)V

    invoke-virtual {p0}, Lcom/naing/vwallpaper/VideoChooser;->finish()V

    goto :goto_0
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 4

    const/4 v3, 0x1

    invoke-super {p0, p1}, Lcom/naing/vwallpaper/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f0a001d

    invoke-virtual {p0, v0}, Lcom/naing/vwallpaper/VideoChooser;->setContentView(I)V

    const v0, 0x7f0d004d

    invoke-virtual {p0, v0}, Lcom/naing/vwallpaper/VideoChooser;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v3, v0}, Lcom/naing/vwallpaper/VideoChooser;->a(ZLjava/lang/String;)V

    invoke-virtual {p0}, Lcom/naing/vwallpaper/VideoChooser;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    iput-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->f:Landroid/content/ContentResolver;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->e:Ljava/util/List;

    invoke-static {p0}, Lcom/naing/c/b;->e(Landroid/content/Context;)Landroid/graphics/Typeface;

    move-result-object v0

    iput-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->g:Landroid/graphics/Typeface;

    const v0, 0x7f08008f

    invoke-virtual {p0, v0}, Lcom/naing/vwallpaper/VideoChooser;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ListView;

    iput-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->b:Landroid/widget/ListView;

    const v0, 0x7f0800e7

    invoke-virtual {p0, v0}, Lcom/naing/vwallpaper/VideoChooser;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->a:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->a:Landroid/widget/TextView;

    iget-object v1, p0, Lcom/naing/vwallpaper/VideoChooser;->g:Landroid/graphics/Typeface;

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->a:Landroid/widget/TextView;

    invoke-virtual {p0}, Lcom/naing/vwallpaper/VideoChooser;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0d0036

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->b:Landroid/widget/ListView;

    invoke-virtual {v0, v3}, Landroid/widget/ListView;->setFastScrollEnabled(Z)V

    new-instance v0, Lcom/naing/vwallpaper/VideoChooser$a;

    invoke-direct {v0, p0, p0}, Lcom/naing/vwallpaper/VideoChooser$a;-><init>(Lcom/naing/vwallpaper/VideoChooser;Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->d:Lcom/naing/vwallpaper/VideoChooser$a;

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->b:Landroid/widget/ListView;

    iget-object v1, p0, Lcom/naing/vwallpaper/VideoChooser;->d:Lcom/naing/vwallpaper/VideoChooser$a;

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->b:Landroid/widget/ListView;

    invoke-virtual {v0, p0}, Landroid/widget/ListView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    new-instance v0, Lcom/naing/c/a;

    invoke-direct {v0}, Lcom/naing/c/a;-><init>()V

    iput-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->h:Lcom/naing/c/a;

    invoke-virtual {p0}, Lcom/naing/vwallpaper/VideoChooser;->g()V

    return-void
.end method

.method public onCreateOptionsMenu(Landroid/view/Menu;)Z
    .locals 2

    invoke-virtual {p0}, Lcom/naing/vwallpaper/VideoChooser;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    const v1, 0x7f0b0001

    invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    const v0, 0x7f08001b

    invoke-interface {p1, v0}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v4/view/g;->a(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/SearchView;

    iput-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->c:Landroid/support/v7/widget/SearchView;

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->c:Landroid/support/v7/widget/SearchView;

    const v1, 0x7f0d001f

    invoke-virtual {p0, v1}, Lcom/naing/vwallpaper/VideoChooser;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView;->setQueryHint(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->c:Landroid/support/v7/widget/SearchView;

    invoke-virtual {v0, p0}, Landroid/support/v7/widget/SearchView;->setOnQueryTextListener(Landroid/support/v7/widget/SearchView$OnQueryTextListener;)V

    const/4 v0, 0x1

    return v0
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->d:Lcom/naing/vwallpaper/VideoChooser$a;

    invoke-virtual {v0, p3}, Lcom/naing/vwallpaper/VideoChooser$a;->a(I)Lcom/naing/model/VideoModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/naing/model/VideoModel;->b()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/naing/vwallpaper/VideoChooser;->c(Ljava/lang/String;)V

    return-void
.end method

.method public onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 4

    const/4 v0, 0x1

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-super {p0, p1}, Lcom/naing/vwallpaper/BaseActivity;->onOptionsItemSelected(Landroid/view/MenuItem;)Z

    move-result v0

    :goto_0
    return v0

    :sswitch_0
    invoke-virtual {p0}, Lcom/naing/vwallpaper/VideoChooser;->finish()V

    goto :goto_0

    :sswitch_1
    :try_start_0
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.PICK"

    sget-object v3, Landroid/provider/MediaStore$Video$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const-string v2, "video/*"

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string v2, "android.intent.extra.LOCAL_ONLY"

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const v2, 0x7f0d004d

    invoke-virtual {p0, v2}, Lcom/naing/vwallpaper/VideoChooser;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v1

    const/16 v2, 0x66

    invoke-virtual {p0, v1, v2}, Lcom/naing/vwallpaper/VideoChooser;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {p0}, Lcom/naing/vwallpaper/VideoChooser;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f0d0030

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1}, Lcom/naing/c/b;->a(Landroid/content/Context;Ljava/lang/String;)V

    goto :goto_0

    :sswitch_2
    const-string v1, "album ASC"

    invoke-direct {p0, v1}, Lcom/naing/vwallpaper/VideoChooser;->b(Ljava/lang/String;)V

    goto :goto_0

    :sswitch_3
    const-string v1, "artist ASC"

    invoke-direct {p0, v1}, Lcom/naing/vwallpaper/VideoChooser;->b(Ljava/lang/String;)V

    goto :goto_0

    :sswitch_4
    const-string v1, "datetaken DESC"

    invoke-direct {p0, v1}, Lcom/naing/vwallpaper/VideoChooser;->b(Ljava/lang/String;)V

    goto :goto_0

    :sswitch_5
    const-string v1, "duration ASC"

    invoke-direct {p0, v1}, Lcom/naing/vwallpaper/VideoChooser;->b(Ljava/lang/String;)V

    goto :goto_0

    :sswitch_6
    const-string v1, "title ASC"

    invoke-direct {p0, v1}, Lcom/naing/vwallpaper/VideoChooser;->b(Ljava/lang/String;)V

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x102002c -> :sswitch_0
        0x7f080014 -> :sswitch_1
        0x7f08001e -> :sswitch_2
        0x7f08001f -> :sswitch_3
        0x7f080020 -> :sswitch_4
        0x7f080021 -> :sswitch_5
        0x7f080022 -> :sswitch_6
    .end sparse-switch
.end method

.method public onQueryTextChange(Ljava/lang/String;)Z
    .locals 1

    iget-object v0, p0, Lcom/naing/vwallpaper/VideoChooser;->k:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iput-object p1, p0, Lcom/naing/vwallpaper/VideoChooser;->k:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/naing/vwallpaper/VideoChooser;->h()V

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public onQueryTextSubmit(Ljava/lang/String;)Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 2

    const/16 v1, 0x3e9

    invoke-super {p0, p1, p2, p3}, Lcom/naing/vwallpaper/BaseActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    if-ne v1, p1, :cond_1

    invoke-static {p3}, Lcom/naing/c/c;->a([I)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/naing/vwallpaper/VideoChooser;->g()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    if-ne p1, v1, :cond_0

    invoke-static {p3}, Lcom/naing/c/c;->a([I)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/naing/vwallpaper/VideoChooser;->h()V

    goto :goto_0
.end method
