 @import org.example.hexlet.dto.users.BuildUserPage
  @param BuildUserPage page

  @if(page.getErrors() != null)
      <ul>
          @for(var validator : page.getErrors().values())
              @for(var error : validator)
                  <li>${error.getMessage()}</li>
              @endfor
          @endfor
      </ul>
  @endif

  <form action="/articles" method="post">
    <div>
      <label>
        Название
        <input type="text" name="title" value="${page.getTitle()}" />
      </label>
    </div>
    <div>
      <label>
        Текст
        <textarea type="text" required name="content" value="${page.getContent()}" /textarea>
      </label>
    </div>
    <input type="submit" value="Зарегистрировать" />
  </form>