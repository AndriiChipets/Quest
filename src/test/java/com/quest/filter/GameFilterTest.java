package com.quest.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

class GameFilterTest {

    @Test
    void testDoFilter() throws Exception {
        GameFilter gameFilter = new GameFilter();
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        FilterChain filterChain = mock(FilterChain.class);
        HttpSession session = mock(HttpSession.class);
        RequestDispatcher dispatcher = Mockito.mock(RequestDispatcher.class);
        ServletContext context = Mockito.mock(ServletContext.class);

        when(request.getSession()).thenReturn(session);
        when(request.getRequestDispatcher("/game")).thenReturn(dispatcher);
        when(request.getServletContext()).thenReturn(context);

        gameFilter.doFilter(request, response, filterChain);

        verify(filterChain).doFilter(request, response);
    }
}
