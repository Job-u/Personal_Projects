     // Enhanced form submission handling with proper Formspree integration
        document.getElementById('contactForm').addEventListener('submit', async function(e) {
            e.preventDefault(); // Prevent default form submission
            
            const form = this;
            const submitBtn = document.getElementById('send-button');
            const successMessage = document.getElementById('successMessage');
            const errorMessage = document.getElementById('errorMessage');
            
            // Get form values for validation
            const name = document.getElementById('name-input').value.trim();
            const email = document.getElementById('email-input').value.trim();
            const message = document.getElementById('message-input').value.trim();
            
            // Clear previous messages
            successMessage.style.display = 'none';
            errorMessage.style.display = 'none';
            
            // Basic validation
            if (!name || !email || !message) {
                showError('Please fill in all fields.');
                return;
            }
            
            // Email validation
            const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
            if (!emailRegex.test(email)) {
                showError('Please enter a valid email address.');
                return;
            }
            
            // Show loading state
            submitBtn.textContent = 'Sending...';
            submitBtn.disabled = true;
            
            try {
                // Create FormData object
                const formData = new FormData(form);
                
                // Submit to Formspree
                const response = await fetch(form.action, {
                    method: 'POST',
                    body: formData,
                    headers: {
                        'Accept': 'application/json'
                    }
                });
                
                if (response.ok) {
                    // Success
                    showSuccess('Message sent successfully!');
                    form.reset();
                    resetInputStyles();
                } else {
                    // Formspree returned an error
                    const data = await response.json();
                    if (data.errors) {
                        showError(data.errors.map(error => error.message).join(', '));
                    } else {
                        showError('Sorry, an error occurred. Please try again.');
                    }
                }
            } catch (error) {
                // Network error or other issue
                showError('Network error. Please check your connection and try again.');
            } finally {
                // Reset button
                submitBtn.textContent = 'Send';
                submitBtn.disabled = false;
            }
        });

        // Helper functions
        function showSuccess(message) {
            const successMessage = document.getElementById('successMessage');
            successMessage.textContent = message;
            successMessage.style.display = 'block';
            
            // Hide message after 5 seconds
            setTimeout(() => {
                successMessage.style.display = 'none';
            }, 5000);
        }

        function showError(message) {
            const errorMessage = document.getElementById('errorMessage');
            errorMessage.textContent = message;
            errorMessage.style.display = 'block';
            
            // Hide message after 5 seconds
            setTimeout(() => {
                errorMessage.style.display = 'none';
            }, 5000);
        }

        function resetInputStyles() {
            const inputs = document.querySelectorAll('#contactForm input, #contactForm textarea');
            inputs.forEach(input => {
                input.classList.remove('invalid-input', 'valid-input');
            });
        }

        // Real-time input validation
        const inputs = document.querySelectorAll('#contactForm input, #contactForm textarea');
        inputs.forEach(input => {
            // Validation on blur (when user clicks away)
            input.addEventListener('blur', function() {
                validateInput(this);
            });
            
            // Reset styles when user starts typing
            input.addEventListener('input', function() {
                this.classList.remove('invalid-input', 'valid-input');
                // Hide error messages when user starts typing
                document.getElementById('errorMessage').style.display = 'none';
            });
        });

        function validateInput(input) {
            const value = input.value.trim();
            
            if (value === '') {
                input.classList.add('invalid-input');
                input.classList.remove('valid-input');
            } else if (input.type === 'email') {
                const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
                if (emailRegex.test(value)) {
                    input.classList.add('valid-input');
                    input.classList.remove('invalid-input');
                } else {
                    input.classList.add('invalid-input');
                    input.classList.remove('valid-input');
                }
            } else {
                input.classList.add('valid-input');
                input.classList.remove('invalid-input');
            }
        }

        // Add smooth scrolling for better UX
        document.addEventListener('DOMContentLoaded', function() {
            // Add focus styles for better accessibility
            const inputs = document.querySelectorAll('#contactForm input, #contactForm textarea');
            inputs.forEach(input => {
                input.addEventListener('focus', function() {
                    this.style.transform = 'scale(1.02)';
                });
                
                input.addEventListener('blur', function() {
                    this.style.transform = 'scale(1)';
                });
            });
        });

        // Smooth scrolling for navigation links
        document.querySelectorAll('a[href^="#"]').forEach(anchor => {
            anchor.addEventListener('click', function (e) {
                e.preventDefault();
                const target = document.querySelector(this.getAttribute('href'));
                if (target) {
                    target.scrollIntoView({
                        behavior: 'smooth',
                        block: 'start'
                    });
                }
            });
        });

        // Intersection Observer for scroll animations
        const observerOptions = {
            threshold: 0.1,
            rootMargin: '0px 0px -50px 0px'
        };

        const observer = new IntersectionObserver((entries) => {
            entries.forEach(entry => {
                if (entry.isIntersecting) {
                    entry.target.classList.add('animate');
                    // Optional: Stop observing once animated
                    // observer.unobserve(entry.target);
                }
            });
        }, observerOptions);

        // Observe all elements with scroll animation classes
        document.querySelectorAll('.scroll-animate, .scroll-animate-left, .scroll-animate-right, .scroll-animate-scale').forEach(el => {
            observer.observe(el);
        });



        // Enhanced typing effect for the name
        function typeWriter(element, text, speed = 100) {
            let i = 0;
            element.innerHTML = '';
            
            function type() {
                if (i < text.length) {
                    element.innerHTML += text.charAt(i);
                    i++;
                    setTimeout(type, speed);
                }
            }
            type();
        }

        // Trigger typing effect when about section is visible
        const aboutObserver = new IntersectionObserver((entries) => {
            entries.forEach(entry => {
                if (entry.isIntersecting) {
                    const nameElement = document.getElementById('name');
                    if (nameElement) {
                        typeWriter(nameElement, 'Job Montenegro', 150);
                    }
                    aboutObserver.unobserve(entry.target);
                }
            });
        }, { threshold: 0.5 });

        const aboutSection = document.getElementById('about');
        if (aboutSection) {
            aboutObserver.observe(aboutSection);
        }



        // Add scroll progress indicator
        window.addEventListener('scroll', () => {
            const scrollTop = window.pageYOffset;
            const docHeight = document.body.offsetHeight - window.innerHeight;
            const scrollPercent = (scrollTop / docHeight) * 100;
            
            // Create progress bar if it doesn't exist
            let progressBar = document.querySelector('.scroll-progress');
            if (!progressBar) {
                progressBar = document.createElement('div');
                progressBar.className = 'scroll-progress';
                progressBar.style.cssText = `
                    position: fixed;
                    top: 0;
                    left: 0;
                    width: 0%;
                    height: 7px;
                    background: linear-gradient(90deg, #A7D489, #7BC862);
                    z-index: 1000;
                    transition: width 0.1s ease;
                `;
                document.body.appendChild(progressBar);
            }
            
            progressBar.style.width = scrollPercent + '%';
        });
