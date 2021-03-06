;; This work is licensed under CC BY 4.0.
;; The original source can be found here:
;; https://github.com/google/material-design-icons

(ns uxbox.builtins.library.icons.material.actions
  (:require [uxbox.util.uuid :as uuid]))

(def +collection-icons-id+
  (uuid/random))

(def +icons+
  [{:name "Attachment"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M15 36c-6.08 0-11-4.93-11-11s4.92-11 11-11h21c4.42 0 8 3.58 8 8s-3.58 8-8 8h-17c-2.76 0-5-2.24-5-5s2.24-5 5-5h15v3h-15c-1.1 0-2 .89-2 2s.9 2 2 2h17c2.76 0 5-2.24 5-5s-2.24-5-5-5h-21c-4.42 0-8 3.58-8 8s3.58 8 8 8h19v3h-19z"}]}
   {:name "Cloud"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M38.71 20.07c-1.36-6.88-7.43-12.07-14.71-12.07-5.78 0-10.79 3.28-13.3 8.07-6.01.65-10.7 5.74-10.7 11.93 0 6.63 5.37 12 12 12h26c5.52 0 10-4.48 10-10 0-5.28-4.11-9.56-9.29-9.93z"}]}
   {:name "3d rotation"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M15.03 42.97c-6.53-3.1-11.22-9.45-11.93-16.97h-3c1.02 12.32 11.32 22 23.9 22 .45 0 .88-.04 1.32-.07l-7.62-7.63-2.67 2.67zm1.78-13.05c-.38 0-.73-.05-1.05-.17-.31-.11-.58-.27-.8-.47-.22-.2-.39-.45-.51-.73-.12-.29-.18-.6-.18-.94h-2.6c0 .72.14 1.35.42 1.9.28.55.65 1.01 1.12 1.37.47.37 1.01.64 1.63.83.62.2 1.26.29 1.94.29.74 0 1.43-.1 2.07-.3.64-.2 1.19-.5 1.66-.89s.83-.87 1.1-1.44c.26-.57.4-1.22.4-1.95 0-.39-.05-.76-.14-1.12-.1-.36-.25-.7-.45-1.02-.21-.32-.48-.6-.81-.86-.33-.25-.74-.46-1.21-.63.4-.18.75-.4 1.05-.66.3-.26.55-.54.75-.83.2-.3.35-.6.45-.92.1-.32.15-.64.15-.95 0-.73-.12-1.37-.36-1.92-.24-.55-.58-1.01-1.02-1.38-.44-.37-.96-.65-1.58-.84-.64-.2-1.32-.29-2.06-.29-.72 0-1.39.11-2 .32-.61.21-1.13.51-1.57.89-.44.38-.78.83-1.03 1.35-.25.52-.37 1.09-.37 1.7h2.6c0-.34.06-.64.18-.9.12-.27.29-.5.5-.68.21-.19.47-.34.76-.44.29-.1.61-.16.95-.16.8 0 1.39.21 1.78.62.39.41.58.99.58 1.73 0 .36-.05.68-.16.97-.11.29-.27.54-.49.75-.22.21-.5.37-.82.49-.33.12-.72.18-1.16.18h-1.54v2.05h1.54c.44 0 .84.05 1.19.15.35.1.65.25.9.47.25.21.44.48.58.8.13.32.2.7.2 1.14 0 .81-.23 1.43-.7 1.86-.45.42-1.08.63-1.89.63zm17.12-11.85c-.63-.66-1.39-1.17-2.27-1.53-.89-.36-1.86-.54-2.93-.54h-4.73v16h4.59c1.11 0 2.11-.18 3.02-.54.91-.36 1.68-.87 2.32-1.53.64-.66 1.14-1.46 1.48-2.39.35-.93.52-1.98.52-3.14v-.79c0-1.16-.18-2.2-.53-3.14-.35-.94-.84-1.74-1.47-2.4zm-.79 6.34c0 .83-.09 1.59-.29 2.25-.19.67-.47 1.23-.85 1.69-.38.46-.85.81-1.42 1.06-.57.24-1.23.37-1.99.37h-1.81v-11.54h1.95c1.44 0 2.53.46 3.29 1.37.75.92 1.13 2.24 1.13 3.98v.82zm-9.14-24.41c-.45 0-.88.04-1.32.07l7.62 7.63 2.66-2.66c6.54 3.09 11.23 9.44 11.94 16.96h3c-1.02-12.32-11.32-22-23.9-22z" :style {:stroke nil}}]}
   {:name "accesiblity"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24 4c2.21 0 4 1.79 4 4s-1.79 4-4 4-4-1.79-4-4 1.79-4 4-4zm18 14h-12v26h-4v-12h-4v12h-4v-26h-12v-4h36v4z" :style {:stroke nil}}]}
   {:name "Account Balance"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M8 20v14h6v-14h-6zm12 0v14h6v-14h-6zm-16 24h38v-6h-38v6zm28-24v14h6v-14h-6zm-9-18l-19 10v4h38v-4l-19-10z" :style {:stroke nil}}]}
   {:name "Account Balance Wallet"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M42 36v2c0 2.21-1.79 4-4 4h-28c-2.21 0-4-1.79-4-4v-28c0-2.21 1.79-4 4-4h28c2.21 0 4 1.79 4 4v2h-18c-2.21 0-4 1.79-4 4v16c0 2.21 1.79 4 4 4h18zm-18-4h20v-16h-20v16zm8-5c-1.66 0-3-1.34-3-3s1.34-3 3-3 3 1.34 3 3-1.34 3-3 3z" :style {:stroke nil}}]}
   {:name "Account Box"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M6 10v28c0 2.21 1.79 4 4 4h28c2.21 0 4-1.79 4-4v-28c0-2.21-1.79-4-4-4h-28c-2.21 0-4 1.79-4 4zm24 8c0 3.32-2.69 6-6 6s-6-2.68-6-6c0-3.31 2.69-6 6-6s6 2.69 6 6zm-18 16c0-4 8-6.2 12-6.2s12 2.2 12 6.2v2h-24v-2z" :style {:stroke nil}}]}
   {:name "Account Child"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M33 24c2.76 0 4.98-2.24 4.98-5s-2.22-5-4.98-5c-2.76 0-5 2.24-5 5s2.24 5 5 5zm-15-2c3.31 0 5.98-2.69 5.98-6s-2.67-6-5.98-6c-3.31 0-6 2.69-6 6s2.69 6 6 6zm15 6c-3.67 0-11 1.84-11 5.5v4.5h22v-4.5c0-3.66-7.33-5.5-11-5.5zm-15-2c-4.67 0-14 2.34-14 7v5h14v-4.5c0-1.7.67-4.67 4.74-6.94-1.74-.37-3.43-.56-4.74-.56z" :style {:stroke nil}}]}
   {:name "Account Circle"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24 4c-11.05 0-20 8.95-20 20s8.95 20 20 20 20-8.95 20-20-8.95-20-20-20zm0 6c3.31 0 6 2.69 6 6 0 3.32-2.69 6-6 6s-6-2.68-6-6c0-3.31 2.69-6 6-6zm0 28.4c-5.01 0-9.41-2.56-12-6.44.05-3.97 8.01-6.16 12-6.16s11.94 2.19 12 6.16c-2.59 3.88-6.99 6.44-12 6.44z" :style {:stroke nil}}]}
   {:name "Add Shopping Cart"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M22 18h4v-6h6v-4h-6v-6h-4v6h-6v4h6v6zm-8 18c-2.21 0-3.98 1.79-3.98 4s1.77 4 3.98 4 4-1.79 4-4-1.79-4-4-4zm20 0c-2.21 0-3.98 1.79-3.98 4s1.77 4 3.98 4 4-1.79 4-4-1.79-4-4-4zm-19.65-6.5c0-.09.02-.17.06-.24l1.8-3.26h14.9c1.5 0 2.81-.83 3.5-2.06l7.72-14.02-3.5-1.92h-.01l-2.21 4-5.51 10h-14.03l-.26-.54-4.49-9.46-1.9-4-1.89-4h-6.53v4h4l7.2 15.17-2.71 4.9c-.31.58-.49 1.23-.49 1.93 0 2.21 1.79 4 4 4h24v-4h-23.15c-.28 0-.5-.22-.5-.5z" :style {:stroke nil}}]}
   {:name "Alarm"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M44 11.44l-9.19-7.71-2.57 3.06 9.19 7.71 2.57-3.06zm-28.24-4.66l-2.57-3.06-9.19 7.71 2.57 3.06 9.19-7.71zm9.24 9.22h-3v12l9.49 5.71 1.51-2.47-8-4.74v-10.5zm-1.01-8c-9.95 0-17.99 8.06-17.99 18s8.04 18 17.99 18 18.01-8.06 18.01-18-8.06-18-18.01-18zm.01 32c-7.73 0-14-6.27-14-14s6.27-14 14-14 14 6.27 14 14-6.26 14-14 14z" :style {:stroke nil}}]}
   {:name "Alarm Add"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M15.76 6.78l-2.57-3.06-9.19 7.71 2.57 3.06 9.19-7.71zm28.24 4.66l-9.19-7.71-2.57 3.06 9.19 7.71 2.57-3.06zm-20.01-3.44c-9.95 0-17.99 8.06-17.99 18s8.04 18 17.99 18 18.01-8.06 18.01-18-8.06-18-18.01-18zm.01 32c-7.73 0-14-6.27-14-14s6.27-14 14-14 14 6.27 14 14-6.26 14-14 14zm2-22h-4v6h-6v4h6v6h4v-6h6v-4h-6v-6z" :style {:stroke nil}}]}
   {:name "Alarm Off"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24 12c7.73 0 14 6.27 14 14 0 1.69-.31 3.3-.86 4.8l3.04 3.04c1.16-2.37 1.82-5.03 1.82-7.84 0-9.94-8.06-18-18.01-18-2.81 0-5.46.66-7.84 1.81l3.05 3.05c1.5-.55 3.11-.86 4.8-.86zm20-.56l-9.19-7.71-2.57 3.06 9.19 7.71 2.57-3.06zm-38.16-6.85l-2.55 2.54 2.66 2.66-2.22 1.86 2.84 2.84 2.22-1.86 1.6 1.6c-2.73 3.16-4.39 7.27-4.39 11.77 0 9.94 8.04 18 17.99 18 4.51 0 8.62-1.67 11.77-4.4l4.4 4.4 2.54-2.55-34.91-34.91-1.95-1.95zm27.1 32.19c-2.43 2.01-5.54 3.22-8.94 3.22-7.73 0-14-6.27-14-14 0-3.4 1.21-6.51 3.22-8.94l19.72 19.72zm-16.91-30.23l-2.84-2.84-1.7 1.43 2.84 2.84 1.7-1.43z" :style {:stroke nil}}]}
   {:name "Alarm Off"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M44 11.44l-9.19-7.71-2.57 3.06 9.19 7.71 2.57-3.06zm-28.24-4.66l-2.57-3.06-9.19 7.71 2.57 3.06 9.19-7.71zm8.23 1.22c-9.95 0-17.99 8.06-17.99 18s8.04 18 17.99 18 18.01-8.06 18.01-18-8.06-18-18.01-18zm.01 32c-7.73 0-14-6.27-14-14s6.27-14 14-14 14 6.27 14 14-6.26 14-14 14zm-2.93-10.95l-4.24-4.24-2.12 2.12 6.36 6.36 12.01-12.01-2.12-2.12-9.89 9.89z" :style {:stroke nil}}]}
   {:name "Android"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M12 36c0 1.1.9 2 2 2h2v7c0 1.66 1.34 3 3 3s3-1.34 3-3v-7h4v7c0 1.66 1.34 3 3 3s3-1.34 3-3v-7h2c1.1 0 2-.9 2-2v-20h-24v20zm-5-20c-1.66 0-3 1.34-3 3v14c0 1.66 1.34 3 3 3s3-1.34 3-3v-14c0-1.66-1.34-3-3-3zm34 0c-1.66 0-3 1.34-3 3v14c0 1.66 1.34 3 3 3s3-1.34 3-3v-14c0-1.66-1.34-3-3-3zm-9.94-11.68l2.61-2.61c.39-.39.39-1.02 0-1.41-.39-.39-1.02-.39-1.41 0l-2.96 2.95c-1.6-.79-3.39-1.25-5.3-1.25-1.92 0-3.72.46-5.33 1.26l-2.97-2.97c-.39-.39-1.02-.39-1.41 0-.39.39-.39 1.02 0 1.41l2.62 2.62c-2.97 2.19-4.91 5.71-4.91 9.68h24c0-3.98-1.95-7.5-4.94-9.68zm-11.06 5.68h-2v-2h2v2zm10 0h-2v-2h2v2z" :style {:stroke nil}}]}
   {:name "Announcement"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M40 4h-32c-2.21 0-3.98 1.79-3.98 4l-.02 36 8-8h28c2.21 0 4-1.79 4-4v-24c0-2.21-1.79-4-4-4zm-14 18h-4v-12h4v12zm0 8h-4v-4h4v4z" :style {:stroke nil}}]}
   {:name "Aspect Ratio"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M38 24h-4v6h-6v4h10v-10zm-24-6h6v-4h-10v10h4v-6zm28-12h-36c-2.21 0-4 1.79-4 4v28c0 2.21 1.79 4 4 4h36c2.21 0 4-1.79 4-4v-28c0-2.21-1.79-4-4-4zm0 32.03h-36v-28.06h36v28.06z" :style {:stroke nil}}]}
   {:name "Assesment"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M38 6h-28c-2.21 0-4 1.79-4 4v28c0 2.21 1.79 4 4 4h28c2.21 0 4-1.79 4-4v-28c0-2.21-1.79-4-4-4zm-20 28h-4v-14h4v14zm8 0h-4v-20h4v20zm8 0h-4v-8h4v8z" :style {:stroke nil}}]}
   {:name "Assignment"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M38 6h-8.37c-.82-2.32-3.02-4-5.63-4s-4.81 1.68-5.63 4h-8.37c-2.21 0-4 1.79-4 4v28c0 2.21 1.79 4 4 4h28c2.21 0 4-1.79 4-4v-28c0-2.21-1.79-4-4-4zm-14 0c1.1 0 2 .89 2 2s-.9 2-2 2-2-.89-2-2 .9-2 2-2zm4 28h-14v-4h14v4zm6-8h-20v-4h20v4zm0-8h-20v-4h20v4z" :style {:stroke nil}}]}
   {:name "Assignment Ind"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M38 6h-8.37c-.82-2.32-3.02-4-5.63-4s-4.81 1.68-5.63 4h-8.37c-2.21 0-4 1.79-4 4v28c0 2.21 1.79 4 4 4h28c2.21 0 4-1.79 4-4v-28c0-2.21-1.79-4-4-4zm-14 0c1.1 0 2 .89 2 2s-.9 2-2 2-2-.89-2-2 .9-2 2-2zm0 8c3.31 0 6 2.69 6 6 0 3.32-2.69 6-6 6s-6-2.68-6-6c0-3.31 2.69-6 6-6zm12 24h-24v-2.8c0-4 8-6.2 12-6.2s12 2.2 12 6.2v2.8z" :style {:stroke nil}}]}
   {:name "Assignment Late"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M38 6h-8.37c-.82-2.32-3.02-4-5.63-4s-4.81 1.68-5.63 4h-8.37c-2.21 0-4 1.79-4 4v28c0 2.21 1.79 4 4 4h28c2.21 0 4-1.79 4-4v-28c0-2.21-1.79-4-4-4zm-12 30h-4v-4h4v4zm0-8h-4v-12h4v12zm-2-18c-1.1 0-2-.89-2-2s.9-2 2-2 2 .89 2 2-.9 2-2 2z" :style {:stroke nil}}]}
   {:name "Assignment Return"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M38 6h-8.37c-.82-2.32-3.02-4-5.63-4s-4.81 1.68-5.63 4h-8.37c-2.21 0-4 1.79-4 4v28c0 2.21 1.79 4 4 4h28c2.21 0 4-1.79 4-4v-28c0-2.21-1.79-4-4-4zm-14 0c1.1 0 2 .89 2 2s-.9 2-2 2-2-.89-2-2 .9-2 2-2zm8 24h-8v6l-10-10 10-10v6h8v8z" :style {:stroke nil}}]}
   {:name "Assignment Returned"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M38 6h-8.37c-.82-2.32-3.02-4-5.63-4s-4.81 1.68-5.63 4h-8.37c-2.21 0-4 1.79-4 4v28c0 2.21 1.79 4 4 4h28c2.21 0 4-1.79 4-4v-28c0-2.21-1.79-4-4-4zm-14 0c1.1 0 2 .89 2 2s-.9 2-2 2-2-.89-2-2 .9-2 2-2zm0 30l-10-10h6v-8h8v8h6l-10 10z" :style {:stroke nil}}]}
   {:name "Autorenew"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24 12v6l8-8-8-8v6c-8.84 0-16 7.16-16 16 0 3.14.92 6.05 2.48 8.52l2.92-2.92c-.89-1.67-1.4-3.57-1.4-5.6 0-6.63 5.37-12 12-12zm13.52 3.48l-2.92 2.92c.89 1.67 1.4 3.57 1.4 5.6 0 6.63-5.37 12-12 12v-6l-8 8 8 8v-6c8.84 0 16-7.16 16-16 0-3.14-.92-6.05-2.48-8.52z" :style {:stroke nil}}]}
   {:name "Backup"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M38.71 20.07c-1.36-6.88-7.43-12.07-14.71-12.07-5.78 0-10.79 3.28-13.3 8.07-6.01.65-10.7 5.74-10.7 11.93 0 6.63 5.37 12 12 12h26c5.52 0 10-4.48 10-10 0-5.28-4.11-9.56-9.29-9.93zm-10.71 5.93v8h-8v-8h-6l10-10 10 10h-6z" :style {:stroke nil}}]}
   {:name "Book"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M36 4h-24c-2.21 0-4 1.79-4 4v32c0 2.21 1.79 4 4 4h24c2.21 0 4-1.79 4-4v-32c0-2.21-1.79-4-4-4zm-24 4h10v16l-5-3-5 3v-16z" :style {:stroke nil}}]}
   {:name "Bookmark"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M34 6h-20c-2.21 0-3.98 1.79-3.98 4l-.02 32 14-6 14 6v-32c0-2.21-1.79-4-4-4z" :style {:stroke nil}}]}
   {:name "Bookmark Outline"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M34 6h-20c-2.21 0-3.98 1.79-3.98 4l-.02 32 14-6 14 6v-32c0-2.21-1.79-4-4-4zm0 30l-10-4.35-10 4.35v-26h20v26z" :style {:stroke nil}}]}
   {:name "Bug Report"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M40 16h-5.62c-.9-1.56-2.14-2.91-3.63-3.92l3.25-3.25-2.83-2.83-4.35 4.35c-.9-.22-1.85-.35-2.82-.35-.97 0-1.92.13-2.82.35l-4.35-4.35-2.83 2.83 3.25 3.25c-1.49 1.01-2.73 2.36-3.63 3.92h-5.62v4h4.18c-.11.65-.18 1.32-.18 2v2h-4v4h4v2c0 .68.07 1.35.18 2h-4.18v4h5.62c2.07 3.58 5.94 6 10.38 6s8.31-2.42 10.38-6h5.62v-4h-4.18c.11-.65.18-1.32.18-2v-2h4v-4h-4v-2c0-.68-.07-1.35-.18-2h4.18v-4zm-12 16h-8v-4h8v4zm0-8h-8v-4h8v4z" :style {:stroke nil}}]}
   {:name "Cached"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M38 16l-8 8h6c0 6.63-5.37 12-12 12-2.03 0-3.93-.51-5.61-1.39l-2.92 2.92c2.48 1.55 5.39 2.47 8.53 2.47 8.84 0 16-7.16 16-16h6l-8-8zm-26 8c0-6.63 5.37-12 12-12 2.03 0 3.93.51 5.61 1.39l2.92-2.92c-2.48-1.55-5.39-2.47-8.53-2.47-8.84 0-16 7.16-16 16h-6l8 8 8-8h-6z" :style {:stroke nil}}]}
   {:name "Class"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M36 4h-24c-2.21 0-4 1.79-4 4v32c0 2.21 1.79 4 4 4h24c2.21 0 4-1.79 4-4v-32c0-2.21-1.79-4-4-4zm-24 4h10v16l-5-3-5 3v-16z" :style {:stroke nil}}]}
   {:name "Credit Card"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M40 8h-32c-2.21 0-3.98 1.79-3.98 4l-.02 24c0 2.21 1.79 4 4 4h32c2.21 0 4-1.79 4-4v-24c0-2.21-1.79-4-4-4zm0 28h-32v-12h32v12zm0-20h-32v-4h32v4z" :style {:stroke nil}}]}
   {:name "Dashboard"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M6 26h16v-20h-16v20zm0 16h16v-12h-16v12zm20 0h16v-20h-16v20zm0-36v12h16v-12h-16z" :style {:stroke nil}}]}
   {:name "Delete"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M12 38c0 2.21 1.79 4 4 4h16c2.21 0 4-1.79 4-4v-24h-24v24zm26-30h-7l-2-2h-10l-2 2h-7v4h28v-4z" :style {:stroke nil}}]}
   {:name "Description"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M28 4h-16c-2.21 0-3.98 1.79-3.98 4l-.02 32c0 2.21 1.77 4 3.98 4h24.02c2.21 0 4-1.79 4-4v-24l-12-12zm4 32h-16v-4h16v4zm0-8h-16v-4h16v4zm-6-10v-11l11 11h-11z" :style {:stroke nil}}]}
   {:name "DNS"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M40 26h-32c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h32c1.1 0 2-.9 2-2v-12c0-1.1-.9-2-2-2zm-26 12c-2.21 0-4-1.79-4-4s1.79-4 4-4 4 1.79 4 4-1.79 4-4 4zm26-32h-32c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h32c1.1 0 2-.9 2-2v-12c0-1.1-.9-2-2-2zm-26 12c-2.21 0-4-1.79-4-4s1.79-4 4-4 4 1.79 4 4-1.79 4-4 4z" :style {:stroke nil}}]}
   {:name "Done"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M18 32.34l-8.34-8.34-2.83 2.83 11.17 11.17 24-24-2.83-2.83z" :style {:stroke nil}}]}
   {:name "Done All"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M36 14l-2.83-2.83-12.68 12.69 2.83 2.83 12.68-12.69zm8.49-2.83l-21.18 21.17-8.34-8.34-2.83 2.83 11.17 11.17 24-24-2.82-2.83zm-43.66 15.66l11.17 11.17 2.83-2.83-11.17-11.17-2.83 2.83z" :style {:stroke nil}}]}
   {:name "Event"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M34 24h-10v10h10v-10zm-2-22v4h-16v-4h-4v4h-2c-2.21 0-3.98 1.79-3.98 4l-.02 28c0 2.21 1.79 4 4 4h28c2.21 0 4-1.79 4-4v-28c0-2.21-1.79-4-4-4h-2v-4h-4zm6 36h-28v-22h28v22z" :style {:stroke nil}}]}
   {:name "Exit To App"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M20.17 31.17l2.83 2.83 10-10-10-10-2.83 2.83 5.17 5.17h-19.34v4h19.34l-5.17 5.17zm17.83-25.17h-28c-2.21 0-4 1.79-4 4v8h4v-8h28v28h-28v-8h-4v8c0 2.21 1.79 4 4 4h28c2.21 0 4-1.79 4-4v-28c0-2.21-1.79-4-4-4z" :style {:stroke nil}}]}
   {:name "Explore"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24 21.8c-1.21 0-2.2.99-2.2 2.2s.99 2.2 2.2 2.2c1.22 0 2.2-.99 2.2-2.2s-.98-2.2-2.2-2.2zm0-17.8c-11.05 0-20 8.95-20 20 0 11.04 8.95 20 20 20s20-8.96 20-20c0-11.05-8.95-20-20-20zm4.38 24.38l-16.38 7.62 7.62-16.38 16.38-7.62-7.62 16.38z" :style {:stroke nil}}]}
   {:name "Explore"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M41 22h-3v-8c0-2.21-1.79-4-4-4h-8v-3c0-2.76-2.24-5-5-5s-5 2.24-5 5v3h-8c-2.21 0-3.98 1.79-3.98 4l-.01 7.6h2.99c2.98 0 5.4 2.42 5.4 5.4s-2.42 5.4-5.4 5.4h-2.99l-.01 7.6c0 2.21 1.79 4 4 4h7.6v-3c0-2.98 2.42-5.4 5.4-5.4 2.98 0 5.4 2.42 5.4 5.4v3h7.6c2.21 0 4-1.79 4-4v-8h3c2.76 0 5-2.24 5-5s-2.24-5-5-5z" :style {:stroke nil}}]}
   {:name "Face Unlock"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:g
           [:path {:d "M29.39 34.21c-1.49 1.15-3.4 1.79-5.39 1.79s-3.9-.64-5.39-1.79c-.43-.34-1.06-.26-1.4.18-.34.44-.26 1.06.18 1.4 1.83 1.42 4.18 2.21 6.61 2.21s4.78-.79 6.61-2.21c.44-.34.52-.97.18-1.4-.34-.44-.97-.52-1.4-.18z" :style {:stroke nil}}]
           [:circle {:cx "17" :cy "25" :r "2" :style {:stroke nil}}]
           [:path {:d "M24 0c-13.25 0-24 10.75-24 24s10.75 24 24 24 24-10.75 24-24-10.75-24-24-24zm15.92 29.64c-2.18 7.48-8.54 12.91-16.08 12.91-7.55 0-13.92-5.45-16.09-12.95-2.38-.2-4.25-2.36-4.25-5.02 0-2.54 1.71-4.63 3.93-4.99v-.01c4.18-2.93 7.61-6.98 8.19-10.1l.01.01v-.03c2.71 5.25 12.6 10.38 23.65 10.12.2-.03.39-.07.59-.07 2.55 0 4.62 2.27 4.62 5.07.01 2.78-2.04 5.04-4.57 5.06z" :style {:stroke nil}}]
           [:circle {:cx "31" :cy "25" :r "2" :style {:stroke nil}}]]}
   {:name "Favorite"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24 42.7l-2.9-2.63c-10.3-9.35-17.1-15.52-17.1-23.07 0-6.17 4.83-11 11-11 3.48 0 6.82 1.62 9 4.17 2.18-2.55 5.52-4.17 9-4.17 6.17 0 11 4.83 11 11 0 7.55-6.8 13.72-17.1 23.07l-2.9 2.63z" :style {:stroke nil}}]}
   {:name "Favorite Outline"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M33 6c-3.48 0-6.82 1.62-9 4.17-2.18-2.55-5.52-4.17-9-4.17-6.17 0-11 4.83-11 11 0 7.55 6.8 13.72 17.1 23.07l2.9 2.63 2.9-2.63c10.3-9.35 17.1-15.52 17.1-23.07 0-6.17-4.83-11-11-11zm-8.79 31.11l-.21.19-.21-.19c-9.51-8.63-15.79-14.33-15.79-20.11 0-3.99 3.01-7 7-7 3.08 0 6.08 1.99 7.13 4.72h3.73c1.06-2.73 4.06-4.72 7.14-4.72 3.99 0 7 3.01 7 7 0 5.78-6.28 11.48-15.79 20.11z" :style {:stroke nil}}]}
   {:name "Find In Page"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M40 39.17v-23.17l-12-12h-16c-2.21 0-3.98 1.79-3.98 4l-.02 32c0 2.21 1.77 4 3.98 4h24.02c.89 0 1.71-.3 2.37-.8l-8.87-8.87c-1.57 1.05-3.46 1.67-5.5 1.67-5.52 0-10-4.48-10-10s4.48-10 10-10 10 4.48 10 10c0 2.04-.62 3.93-1.66 5.51l7.66 7.66zm-22-13.17c0 3.31 2.69 6 6 6s6-2.69 6-6-2.69-6-6-6-6 2.69-6 6z" :style {:stroke nil}}]}
   {:name "Find Replace"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M22 12c2.76 0 5.26 1.12 7.07 2.93l-5.07 5.07h12v-12l-4.1 4.1c-2.53-2.53-6.03-4.1-9.9-4.1-7.05 0-12.87 5.22-13.84 12h4.04c.93-4.56 4.96-8 9.8-8zm11.28 18.27c1.33-1.81 2.23-3.95 2.56-6.27h-4.04c-.93 4.56-4.96 8-9.8 8-2.76 0-5.26-1.12-7.07-2.93l5.07-5.07h-12v12l4.1-4.1c2.53 2.53 6.03 4.1 9.9 4.1 3.1 0 5.96-1.02 8.28-2.73l9.72 9.71 2.98-2.98-9.7-9.73z" :style {:stroke nil}}]}
   {:name "Flip To Back"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M18 14h-4v4h4v-4zm0 8h-4v4h4v-4zm0-16c-2.21 0-4 1.79-4 4h4v-4zm8 24h-4v4h4v-4zm12-24v4h4c0-2.21-1.79-4-4-4zm-12 0h-4v4h4v-4zm-8 28v-4h-4c0 2.21 1.79 4 4 4zm20-8h4v-4h-4v4zm0-8h4v-4h-4v4zm0 16c2.21 0 4-1.79 4-4h-4v4zm-28-20h-4v24c0 2.21 1.79 4 4 4h24v-4h-24v-24zm20-4h4v-4h-4v4zm0 24h4v-4h-4v4z" :style {:stroke nil}}]}
   {:name "Flip To Front"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M6 26h4v-4h-4v4zm0 8h4v-4h-4v4zm4 8v-4h-4c0 2.21 1.79 4 4 4zm-4-24h4v-4h-4v4zm24 24h4v-4h-4v4zm8-36h-20c-2.21 0-4 1.79-4 4v20c0 2.21 1.79 4 4 4h20c2.21 0 4-1.79 4-4v-20c0-2.21-1.79-4-4-4zm0 24h-20v-20h20v20zm-16 12h4v-4h-4v4zm-8 0h4v-4h-4v4z" :style {:stroke nil}}]}
   {:name "Get App"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M38 18h-8v-12h-12v12h-8l14 14 14-14zm-28 18v4h28v-4h-28z" :style {:stroke nil}}]}
   {:name "Grade"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24 34.54l12.36 7.46-3.27-14.06 10.91-9.45-14.38-1.24-5.62-13.25-5.62 13.25-14.38 1.24 10.91 9.45-3.27 14.06z" :style {:stroke nil}}]}
   {:name "Group Work"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24 4c-11.05 0-20 8.95-20 20 0 11.04 8.95 20 20 20s20-8.96 20-20c0-11.05-8.95-20-20-20zm-8 31c-2.76 0-5-2.24-5-5s2.24-5 5-5 5 2.24 5 5-2.24 5-5 5zm3-19c0-2.76 2.24-5 5-5s5 2.24 5 5-2.24 5-5 5-5-2.24-5-5zm13 19c-2.76 0-5-2.24-5-5s2.24-5 5-5 5 2.24 5 5-2.24 5-5 5z" :style {:stroke nil}}]}
   {:name "Help"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24 4c-11.05 0-20 8.95-20 20s8.95 20 20 20 20-8.95 20-20-8.95-20-20-20zm2 34h-4v-4h4v4zm4.13-15.49l-1.79 1.84c-1.44 1.44-2.34 2.65-2.34 5.65h-4v-1c0-2.21.9-4.21 2.34-5.66l2.49-2.52c.72-.72 1.17-1.72 1.17-2.82 0-2.21-1.79-4-4-4s-4 1.79-4 4h-4c0-4.42 3.58-8 8-8s8 3.58 8 8c0 1.76-.71 3.35-1.87 4.51z" :style {:stroke nil}}]}
   {:name "Highlight Remove"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M29.17 16l-5.17 5.17-5.17-5.17-2.83 2.83 5.17 5.17-5.17 5.17 2.83 2.83 5.17-5.17 5.17 5.17 2.83-2.83-5.17-5.17 5.17-5.17-2.83-2.83zm-5.17-12c-11.05 0-20 8.95-20 20s8.95 20 20 20 20-8.95 20-20-8.95-20-20-20zm0 36c-8.82 0-16-7.18-16-16s7.18-16 16-16 16 7.18 16 16-7.18 16-16 16z" :style {:stroke nil}}]}
   {:name "History"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:opacity ".9" :d "M25.99 6c-9.95 0-17.99 8.06-17.99 18h-6l7.79 7.79.14.29 8.07-8.08h-6c0-7.73 6.27-14 14-14s14 6.27 14 14-6.27 14-14 14c-3.87 0-7.36-1.58-9.89-4.11l-2.83 2.83c3.25 3.26 7.74 5.28 12.71 5.28 9.95 0 18.01-8.06 18.01-18s-8.06-18-18.01-18zm-1.99 10v10l8.56 5.08 1.44-2.43-7-4.15v-8.5h-3z" :style {:stroke nil}}]}
   {:name "Home"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M20 40v-12h8v12h10v-16h6l-20-18-20 18h6v16z" :style {:stroke nil}}]}
   {:name "Https"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M36 16h-2v-4c0-5.52-4.48-10-10-10s-10 4.48-10 10v4h-2c-2.21 0-4 1.79-4 4v20c0 2.21 1.79 4 4 4h24c2.21 0 4-1.79 4-4v-20c0-2.21-1.79-4-4-4zm-12 18c-2.21 0-4-1.79-4-4s1.79-4 4-4 4 1.79 4 4-1.79 4-4 4zm6.2-18h-12.4v-4c0-3.42 2.78-6.2 6.2-6.2 3.42 0 6.2 2.78 6.2 6.2v4z" :style {:stroke nil}}]}
   {:name "Info"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24 4c-11.05 0-20 8.95-20 20s8.95 20 20 20 20-8.95 20-20-8.95-20-20-20zm2 30h-4v-12h4v12zm0-16h-4v-4h4v4z" :style {:stroke nil}}]}
   {:name "Info Outline"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M22 34h4v-12h-4v12zm2-30c-11.05 0-20 8.95-20 20s8.95 20 20 20 20-8.95 20-20-8.95-20-20-20zm0 36c-8.82 0-16-7.18-16-16s7.18-16 16-16 16 7.18 16 16-7.18 16-16 16zm-2-22h4v-4h-4v4z" :style {:stroke nil}}]}
   {:name "Input"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M42 6.02h-36c-2.21 0-4 1.79-4 4v7.98h4v-8.02h36v28.06h-36v-8.04h-4v8.02c0 2.21 1.79 3.96 4 3.96h36c2.21 0 4-1.76 4-3.96v-28c0-2.21-1.79-4-4-4zm-20 25.98l8-8-8-8v6h-20v4h20v6z" :style {:stroke nil}}]}
   {:name "Invert Colors"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M35.31 15.86l-11.31-11.32-11.31 11.32c-6.25 6.25-6.25 16.38 0 22.63 3.12 3.12 7.22 4.69 11.31 4.69s8.19-1.56 11.31-4.69c6.25-6.25 6.25-16.38 0-22.63zm-11.31 23.31c-3.21 0-6.22-1.25-8.48-3.52-2.27-2.26-3.52-5.27-3.52-8.48s1.25-6.22 3.52-8.49l8.48-8.48v28.97z" :style {:stroke nil}}]}
   {:name "Label"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M35.27 11.69c-.73-1.02-1.92-1.69-3.27-1.69l-22 .02c-2.21 0-4 1.77-4 3.98v20c0 2.21 1.79 3.98 4 3.98l22 .02c1.35 0 2.54-.67 3.27-1.69l8.73-12.31-8.73-12.31z" :style {:stroke nil}}]}
   {:name "Label Outline"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M35.27 11.69c-.73-1.02-1.92-1.69-3.27-1.69l-22 .02c-2.21 0-4 1.77-4 3.98v20c0 2.21 1.79 3.98 4 3.98l22 .02c1.35 0 2.54-.67 3.27-1.69l8.73-12.31-8.73-12.31zm-3.27 22.31h-22v-20h22l7.09 10-7.09 10z" :style {:stroke nil}}]}
   {:name "Language"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M23.99 4c-11.05 0-19.99 8.95-19.99 20s8.94 20 19.99 20c11.05 0 20.01-8.95 20.01-20s-8.96-20-20.01-20zm13.85 12h-5.9c-.65-2.5-1.56-4.9-2.76-7.12 3.68 1.26 6.74 3.81 8.66 7.12zm-13.84-7.93c1.67 2.4 2.97 5.07 3.82 7.93h-7.64c.85-2.86 2.15-5.53 3.82-7.93zm-15.48 19.93c-.33-1.28-.52-2.62-.52-4s.19-2.72.52-4h6.75c-.16 1.31-.27 2.64-.27 4 0 1.36.11 2.69.28 4h-6.76zm1.63 4h5.9c.65 2.5 1.56 4.9 2.76 7.13-3.68-1.26-6.74-3.82-8.66-7.13zm5.9-16h-5.9c1.92-3.31 4.98-5.87 8.66-7.13-1.2 2.23-2.11 4.63-2.76 7.13zm7.95 23.93c-1.66-2.4-2.96-5.07-3.82-7.93h7.64c-.86 2.86-2.16 5.53-3.82 7.93zm4.68-11.93h-9.36c-.19-1.31-.32-2.64-.32-4 0-1.36.13-2.69.32-4h9.36c.19 1.31.32 2.64.32 4 0 1.36-.13 2.69-.32 4zm.51 11.12c1.2-2.23 2.11-4.62 2.76-7.12h5.9c-1.93 3.31-4.99 5.86-8.66 7.12zm3.53-11.12c.16-1.31.28-2.64.28-4 0-1.36-.11-2.69-.28-4h6.75c.33 1.28.53 2.62.53 4s-.19 2.72-.53 4h-6.75z" :style {:stroke nil}}]}
   {:name "Launch"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M38 38h-28v-28h14v-4h-14c-2.21 0-4 1.79-4 4v28c0 2.21 1.79 4 4 4h28c2.21 0 4-1.79 4-4v-14h-4v14zm-10-32v4h7.17l-19.66 19.66 2.83 2.83 19.66-19.66v7.17h4v-14h-14z" :style {:stroke nil}}]}
   {:name "List"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M6 26h4v-4h-4v4zm0 8h4v-4h-4v4zm0-16h4v-4h-4v4zm8 8h28v-4h-28v4zm0 8h28v-4h-28v4zm0-20v4h28v-4h-28z" :style {:stroke nil}}]}
   {:name "Lock"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M36 16h-2v-4c0-5.52-4.48-10-10-10s-10 4.48-10 10v4h-2c-2.21 0-4 1.79-4 4v20c0 2.21 1.79 4 4 4h24c2.21 0 4-1.79 4-4v-20c0-2.21-1.79-4-4-4zm-12 18c-2.21 0-4-1.79-4-4s1.79-4 4-4 4 1.79 4 4-1.79 4-4 4zm6.2-18h-12.4v-4c0-3.42 2.78-6.2 6.2-6.2 3.42 0 6.2 2.78 6.2 6.2v4z" :style {:stroke nil}}]}
   {:name "Lock Open"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24 34c2.21 0 4-1.79 4-4s-1.79-4-4-4-4 1.79-4 4 1.79 4 4 4zm12-18h-2v-4c0-5.52-4.48-10-10-10s-10 4.48-10 10h3.8c0-3.42 2.78-6.2 6.2-6.2 3.42 0 6.2 2.78 6.2 6.2v4h-18.2c-2.21 0-4 1.79-4 4v20c0 2.21 1.79 4 4 4h24c2.21 0 4-1.79 4-4v-20c0-2.21-1.79-4-4-4zm0 24h-24v-20h24v20z" :style {:stroke nil}}]}
   {:name "Lock Outline"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M36 16h-2v-4c0-5.52-4.48-10-10-10s-10 4.48-10 10v4h-2c-2.21 0-4 1.79-4 4v20c0 2.21 1.79 4 4 4h24c2.21 0 4-1.79 4-4v-20c0-2.21-1.79-4-4-4zm-12-10.2c3.42 0 6.2 2.78 6.2 6.2v4h-12.2v-4h-.2c0-3.42 2.78-6.2 6.2-6.2zm12 34.2h-24v-20h24v20zm-12-6c2.21 0 4-1.79 4-4s-1.79-4-4-4-4 1.79-4 4 1.79 4 4 4z" :style {:stroke nil}}]}
   {:name "Loyalty"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M42.82 23.16l-17.99-17.99c-.72-.72-1.72-1.17-2.83-1.17h-14c-2.21 0-4 1.79-4 4v14c0 1.11.45 2.11 1.18 2.83l18 18c.72.72 1.72 1.17 2.82 1.17 1.11 0 2.11-.45 2.83-1.17l14-14c.72-.73 1.17-1.73 1.17-2.83 0-1.11-.45-2.11-1.18-2.84zm-31.82-9.16c-1.66 0-3-1.34-3-3s1.34-3 3-3 3 1.34 3 3-1.34 3-3 3zm23.54 16.54l-8.54 8.54-8.54-8.54c-.9-.91-1.46-2.16-1.46-3.54 0-2.76 2.24-5 5-5 1.38 0 2.64.56 3.54 1.47l1.46 1.46 1.46-1.46c.91-.91 2.16-1.47 3.54-1.47 2.76 0 5 2.24 5 5 0 1.38-.56 2.63-1.46 3.54z" :style {:stroke nil}}]}
   {:name "Markunread mailbox"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M40 12h-20v12h-4v-16h12v-8h-16v12h-4c-2.2 0-4 1.8-4 4v24c0 2.2 1.8 4 4 4h32c2.2 0 4-1.8 4-4v-24c0-2.2-1.8-4-4-4z" :style {:stroke nil}}]}
   {:name "Note Add"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M28 4h-16c-2.21 0-3.98 1.79-3.98 4l-.02 32c0 2.21 1.77 4 3.98 4h24.02c2.21 0 4-1.79 4-4v-24l-12-12zm4 28h-6v6h-4v-6h-6v-4h6v-6h4v6h6v4zm-6-14v-11l11 11h-11z" :style {:stroke nil}}]}
   {:name "Open In Browser"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M38 8h-28c-2.21 0-4 1.79-4 4v24c0 2.21 1.79 4 4 4h8v-4h-8v-20h28v20h-8v4h8c2.21 0 4-1.79 4-4v-24c0-2.21-1.79-4-4-4zm-14 12l-8 8h6v12h4v-12h6l-8-8z" :style {:stroke nil}}]}
   {:name "Open In New"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M38 38h-28v-28h14v-4h-14c-2.21 0-4 1.79-4 4v28c0 2.21 1.79 4 4 4h28c2.21 0 4-1.79 4-4v-14h-4v14zm-10-32v4h7.17l-19.66 19.66 2.83 2.83 19.66-19.66v7.17h4v-14h-14z" :style {:stroke nil}}]}
   {:name "Open With"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M20 18h8v-6h6l-10-10-10 10h6v6zm-2 2h-6v-6l-10 10 10 10v-6h6v-8zm28 4l-10-10v6h-6v8h6v6l10-10zm-18 6h-8v6h-6l10 10 10-10h-6v-6z" :style {:stroke nil}}]}
   {:name "Pageview"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M22 16c-3.31 0-6 2.69-6 6s2.69 6 6 6 6-2.69 6-6-2.69-6-6-6zm16-10h-28c-2.21 0-4 1.79-4 4v28c0 2.21 1.79 4 4 4h28c2.21 0 4-1.79 4-4v-28c0-2.21-1.79-4-4-4zm-2.83 32l-7.66-7.66c-1.58 1.04-3.47 1.66-5.51 1.66-5.52 0-10-4.48-10-10s4.48-10 10-10 10 4.48 10 10c0 2.04-.62 3.93-1.66 5.51l7.66 7.66-2.83 2.83z" :style {:stroke nil}}]}
   {:name "Payment"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M40 8h-32c-2.21 0-3.98 1.79-3.98 4l-.02 24c0 2.21 1.79 4 4 4h32c2.21 0 4-1.79 4-4v-24c0-2.21-1.79-4-4-4zm0 28h-32v-12h32v12zm0-20h-32v-4h32v4z" :style {:stroke nil}}]}
   {:name "Perm Camera Mic"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M40 10h-6.34l-3.66-4h-12l-3.66 4h-6.34c-2.21 0-4 1.79-4 4v24c0 2.21 1.79 4 4 4h14v-4.18c-5.67-.96-10-5.89-10-11.82h4c0 4.41 3.59 8 8 8s8-3.59 8-8h4c0 5.93-4.33 10.86-10 11.82v4.18h14c2.21 0 4-1.79 4-4v-24c0-2.21-1.79-4-4-4zm-12 16c0 2.21-1.79 4-4 4s-4-1.79-4-4v-8c0-2.21 1.79-4 4-4s4 1.79 4 4v8z" :style {:stroke nil}}]}
   {:name "Perm Contact Cal"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M38 6h-2v-4h-4v4h-16v-4h-4v4h-2c-2.21 0-4 1.79-4 4v28c0 2.21 1.79 4 4 4h28c2.21 0 4-1.79 4-4v-28c0-2.21-1.79-4-4-4zm-14 6c3.31 0 6 2.69 6 6 0 3.32-2.69 6-6 6s-6-2.68-6-6c0-3.31 2.69-6 6-6zm12 24h-24v-2c0-4 8-6.2 12-6.2s12 2.2 12 6.2v2z" :style {:stroke nil}}]}
   {:name "Perm Data Setting"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M37.98 23c.68 0 1.36.06 2.02.15v-23.15l-40 40h23.13c-.09-.66-.15-1.32-.15-2 0-8.28 6.72-15 15-15zm7.43 15.98c.04-.32.07-.64.07-.98 0-.33-.03-.66-.07-.98l2.11-1.65c.19-.15.24-.42.12-.64l-2-3.46c-.12-.22-.39-.3-.61-.22l-2.49 1c-.52-.4-1.08-.73-1.69-.98l-.37-2.65c-.04-.24-.25-.42-.5-.42h-4c-.25 0-.46.18-.49.42l-.37 2.65c-.61.25-1.17.59-1.69.98l-2.49-1c-.23-.09-.49 0-.61.22l-2 3.46c-.13.22-.07.49.12.64l2.11 1.65c-.04.32-.07.65-.07.98 0 .33.03.66.07.98l-2.11 1.65c-.19.15-.24.42-.12.64l2 3.46c.13.22.39.3.61.22l2.49-1c.52.4 1.08.73 1.69.98l.37 2.65c.04.24.25.42.49.42h4c.25 0 .45-.18.49-.42l.37-2.65c.61-.25 1.17-.59 1.69-.98l2.49 1c.23.09.49 0 .61-.22l2-3.46c.13-.22.07-.49-.12-.64l-2.1-1.65zm-7.43 2.02c-1.66 0-3-1.34-3-3s1.34-3 3-3 3 1.34 3 3-1.34 3-3 3z" :style {:stroke nil}}]}
   {:name "Perm Device Info"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M26 14h-4v4h4v-4zm0 8h-4v12h4v-12zm8-19.98l-20-.02c-2.21 0-4 1.79-4 4v36c0 2.21 1.79 4 4 4h20c2.21 0 4-1.79 4-4v-36c0-2.21-1.79-3.98-4-3.98zm0 35.98h-20v-28h20v28z" :style {:stroke nil}}]}
   {:name "Perm Identity"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24 11.8c2.32 0 4.2 1.88 4.2 4.2s-1.88 4.2-4.2 4.2-4.2-1.88-4.2-4.2 1.88-4.2 4.2-4.2m0 18c5.95 0 12.2 2.91 12.2 4.2v2.2h-24.4v-2.2c0-1.29 6.25-4.2 12.2-4.2m0-21.8c-4.42 0-8 3.58-8 8 0 4.41 3.58 8 8 8s8-3.59 8-8c0-4.42-3.58-8-8-8zm0 18c-5.33 0-16 2.67-16 8v6h32v-6c0-5.33-10.67-8-16-8z" :style {:stroke nil}}]}
   {:name "Perm Media"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M4 12h-4v10h.02l-.02 18c0 2.21 1.79 4 4 4h36v-4h-36v-28zm40-4h-16l-4-4h-12c-2.21 0-3.98 1.79-3.98 4l-.02 24c0 2.21 1.79 4 4 4h32c2.21 0 4-1.79 4-4v-20c0-2.21-1.79-4-4-4zm-30 22l9-12 7 9.01 5-6.01 7 9h-28z" :style {:stroke nil}}]}
   {:name "Perm Phone Msg"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M40 31c-2.49 0-4.9-.4-7.14-1.14-.69-.22-1.48-.06-2.03.49l-4.4 4.41c-5.67-2.88-10.29-7.51-13.18-13.17l4.4-4.42c.55-.55.71-1.34.49-2.03-.74-2.24-1.14-4.65-1.14-7.14 0-1.11-.89-2-2-2h-7c-1.1 0-2 .89-2 2 0 18.78 15.22 34 34 34 1.11 0 2-.89 2-2v-7c0-1.11-.89-2-2-2zm-16-25v20l6-6h12v-14h-18z" :style {:stroke nil}}]}
   {:name "Perm Scan Wifi"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24 6c-10.09 0-17.71 3.7-24 8.47l24 29.53 24-29.5c-6.29-4.76-13.91-8.5-24-8.5zm2 26h-4v-12h4v12zm-4-16v-4h4v4h-4z" :style {:stroke nil}}]}
   {:name "Picture In Picture"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M38 14h-16v12h16v-12zm4-8h-36c-2.21 0-4 1.79-4 4v28c0 2.21 1.79 3.96 4 3.96h36c2.21 0 4-1.76 4-3.96v-28c0-2.21-1.79-4-4-4zm0 32.03h-36v-28.06h36v28.06z" :style {:stroke nil}}]}
   {:name "Polymer"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M38 8h-8l-15.79 25.26-5.21-9.26 9-16h-8l-9 16 9 16h8l15.79-25.26 5.21 9.26-9 16h8l9-16z" :style {:stroke nil}}]}
   {:name "Print"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M38 16h-28c-3.31 0-6 2.69-6 6v12h8v8h24v-8h8v-12c0-3.31-2.69-6-6-6zm-6 22h-16v-10h16v10zm6-14c-1.11 0-2-.89-2-2s.89-2 2-2c1.11 0 2 .89 2 2s-.89 2-2 2zm-2-18h-24v8h24v-8z" :style {:stroke nil}}]}
   {:name "Query Builder"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M23.99 4c-11.05 0-19.99 8.95-19.99 20s8.94 20 19.99 20c11.05 0 20.01-8.95 20.01-20s-8.96-20-20.01-20zm.01 36c-8.84 0-16-7.16-16-16s7.16-16 16-16 16 7.16 16 16-7.16 16-16 16z" :style {:stroke nil}}]}
   {:name "Question Answer"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M42 12h-4v18h-26v4c0 1.1.9 2 2 2h22l8 8v-30c0-1.1-.9-2-2-2zm-8 12v-18c0-1.1-.9-2-2-2h-26c-1.1 0-2 .9-2 2v28l8-8h20c1.1 0 2-.9 2-2z" :style {:stroke nil}}]}
   {:name "Receipt"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M36 34h-24v-4h24v4zm0-8h-24v-4h24v4zm0-8h-24v-4h24v4zm-30 26l3-3 3 3 3-3 3 3 3-3 3 3 3-3 3 3 3-3 3 3 3-3 3 3v-40l-3 3-3-3-3 3-3-3-3 3-3-3-3 3-3-3-3 3-3-3-3 3-3-3v40z" :style {:stroke nil}}]}
   {:name "Redeem"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M40 12h-4.37c.22-.63.37-1.29.37-2 0-3.31-2.69-6-6-6-2.09 0-3.93 1.07-5 2.69l-1 1.36-1-1.36c-1.07-1.62-2.91-2.69-5-2.69-3.31 0-6 2.69-6 6 0 .71.14 1.37.37 2h-4.37c-2.21 0-3.98 1.79-3.98 4l-.02 22c0 2.21 1.79 4 4 4h32c2.21 0 4-1.79 4-4v-22c0-2.21-1.79-4-4-4zm-10-4c1.1 0 2 .9 2 2s-.9 2-2 2-2-.9-2-2 .9-2 2-2zm-12 0c1.1 0 2 .9 2 2s-.9 2-2 2-2-.9-2-2 .9-2 2-2zm22 30h-32v-4h32v4zm0-10h-32v-12h10.16l-4.16 5.67 3.25 2.33 4.75-6.47 2-2.72 2 2.72 4.75 6.47 3.25-2.33-4.16-5.67h10.16v12z" :style {:stroke nil}}]}
   {:name "Reorder"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M3,15h18v-2H3V15z M3,19h18v-2H3V19z M3,11h18V9H3V11z M3,5v2h18V5H3z" :style {:stroke nil}}]}
   {:name "Report Problem"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M2 42h44l-22-38-22 38zm24-6h-4v-4h4v4zm0-8h-4v-8h4v8z" :style {:stroke nil}}]}
   {:name "Restore"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M25.99 6c-9.95 0-17.99 8.06-17.99 18h-6l7.79 7.79.14.29 8.07-8.08h-6c0-7.73 6.27-14 14-14s14 6.27 14 14-6.27 14-14 14c-3.87 0-7.36-1.58-9.89-4.11l-2.83 2.83c3.25 3.26 7.74 5.28 12.71 5.28 9.95 0 18.01-8.06 18.01-18s-8.06-18-18.01-18zm-1.99 10v10l8.56 5.08 1.44-2.43-7-4.15v-8.5h-3z" :style {:stroke nil}}]}
   {:name "Room"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24 4c-7.73 0-14 6.27-14 14 0 10.5 14 26 14 26s14-15.5 14-26c0-7.73-6.27-14-14-14zm0 19c-2.76 0-5-2.24-5-5s2.24-5 5-5 5 2.24 5 5-2.24 5-5 5z" :style {:stroke nil}}]}
   {:name "Schedule"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:g
           [:path {:fill-opacity ".9" :d "M23.99 4c-11.05 0-19.99 8.95-19.99 20s8.94 20 19.99 20c11.05 0 20.01-8.95 20.01-20s-8.96-20-20.01-20zm.01 36c-8.84 0-16-7.16-16-16s7.16-16 16-16 16 7.16 16 16-7.16 16-16 16z" :style {:stroke nil}}]
           [:path {:fill-opacity ".9" :d "M25 14h-3v12l10.49 6.3 1.51-2.46-9-5.34z" :style {:stroke nil}}]]}
   {:name "Search"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M31 28h-1.59l-.55-.55c1.96-2.27 3.14-5.22 3.14-8.45 0-7.18-5.82-13-13-13s-13 5.82-13 13 5.82 13 13 13c3.23 0 6.18-1.18 8.45-3.13l.55.55v1.58l10 9.98 2.98-2.98-9.98-10zm-12 0c-4.97 0-9-4.03-9-9s4.03-9 9-9 9 4.03 9 9-4.03 9-9 9z" :style {:stroke nil}}]}
   {:name "Settings"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M38.86 25.95c.08-.64.14-1.29.14-1.95s-.06-1.31-.14-1.95l4.23-3.31c.38-.3.49-.84.24-1.28l-4-6.93c-.25-.43-.77-.61-1.22-.43l-4.98 2.01c-1.03-.79-2.16-1.46-3.38-1.97l-.75-5.3c-.09-.47-.5-.84-1-.84h-8c-.5 0-.91.37-.99.84l-.75 5.3c-1.22.51-2.35 1.17-3.38 1.97l-4.98-2.01c-.45-.17-.97 0-1.22.43l-4 6.93c-.25.43-.14.97.24 1.28l4.22 3.31c-.08.64-.14 1.29-.14 1.95s.06 1.31.14 1.95l-4.22 3.31c-.38.3-.49.84-.24 1.28l4 6.93c.25.43.77.61 1.22.43l4.98-2.01c1.03.79 2.16 1.46 3.38 1.97l.75 5.3c.08.47.49.84.99.84h8c.5 0 .91-.37.99-.84l.75-5.3c1.22-.51 2.35-1.17 3.38-1.97l4.98 2.01c.45.17.97 0 1.22-.43l4-6.93c.25-.43.14-.97-.24-1.28l-4.22-3.31zm-14.86 5.05c-3.87 0-7-3.13-7-7s3.13-7 7-7 7 3.13 7 7-3.13 7-7 7z" :style {:stroke nil}}]}
   {:name "Settings Applications"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24 20c-2.21 0-4 1.79-4 4s1.79 4 4 4 4-1.79 4-4-1.79-4-4-4zm14-14h-28c-2.21 0-4 1.79-4 4v28c0 2.21 1.79 4 4 4h28c2.21 0 4-1.79 4-4v-28c0-2.21-1.79-4-4-4zm-3.5 18c0 .46-.04.92-.1 1.37l2.96 2.32c.26.21.34.59.16.89l-2.8 4.85c-.17.3-.54.42-.86.3l-3.49-1.41c-.72.56-1.51 1.02-2.37 1.38l-.52 3.71c-.04.33-.33.59-.68.59h-5.6c-.35 0-.64-.26-.69-.59l-.52-3.71c-.85-.35-1.64-.82-2.37-1.38l-3.48 1.4c-.32.12-.68 0-.86-.3l-2.8-4.85c-.18-.3-.1-.68.16-.89l2.96-2.31c-.06-.45-.1-.9-.1-1.37 0-.46.04-.92.1-1.37l-2.96-2.31c-.26-.21-.34-.59-.16-.89l2.8-4.85c.18-.3.54-.42.86-.3l3.48 1.4c.72-.55 1.51-1.02 2.37-1.38l.52-3.71c.05-.33.34-.59.69-.59h5.6c.35 0 .64.26.69.59l.52 3.71c.85.35 1.64.82 2.37 1.38l3.48-1.4c.32-.12.68 0 .86.3l2.8 4.85c.18.3.1.68-.16.89l-2.96 2.32c.06.44.1.9.1 1.36z" :style {:stroke nil}}]}
   {:name "Settings Backup Restore"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M28 24c0-2.21-1.79-4-4-4s-4 1.79-4 4 1.79 4 4 4 4-1.79 4-4zm-4-18c-9.94 0-18 8.06-18 18h-6l8 8 8-8h-6c0-7.73 6.27-14 14-14s14 6.27 14 14-6.27 14-14 14c-3.03 0-5.82-.97-8.12-2.61l-2.83 2.87c3.04 2.34 6.83 3.74 10.95 3.74 9.94 0 18-8.06 18-18s-8.06-18-18-18z" :style {:stroke nil}}]}
   {:name "Settings Bluetooth"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M22 48h4v-4h-4v4zm-8 0h4v-4h-4v4zm16 0h4v-4h-4v4zm5.41-36.59l-11.41-11.41h-2v15.17l-9.17-9.17-2.83 2.83 11.17 11.17-11.17 11.17 2.83 2.83 9.17-9.17v15.17h2l11.41-11.41-8.58-8.59 8.58-8.59zm-9.41-3.75l3.76 3.76-3.76 3.75v-7.51zm3.76 20.93l-3.76 3.75v-7.51l3.76 3.76z" :style {:stroke nil}}]}
   {:name "Settings Cell"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M14 48h4v-4h-4v4zm8 0h4v-4h-4v4zm8 0h4v-4h-4v4zm2-47.98l-16-.02c-2.21 0-4 1.79-4 4v32c0 2.21 1.79 4 4 4h16c2.21 0 4-1.79 4-4v-32c0-2.21-1.79-3.98-4-3.98zm0 31.98h-16v-24h16v24z" :style {:stroke nil}}]}
   {:name "Settings Display"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M42 6h-36c-2.21 0-4 1.79-4 4v28c0 2.21 1.79 4 4 4h36c2.21 0 4-1.79 4-4v-28c0-2.21-1.79-4-4-4zm0 32.03h-36v-28.06h36v28.06zm-26-6.03h5l3 3 3-3h5v-5l3-3-3-3v-5h-5l-3-3-3 3h-5v5l-3 3 3 3v5zm8-14c3.31 0 6 2.69 6 6s-2.69 6-6 6v-12z" :style {:stroke nil}}]}
   {:name "Settings Ethernet"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M15.54 13.52l-3.08-2.55-10.82 13.03 10.82 13.04 3.08-2.55-8.7-10.49 8.7-10.48zm-1.54 12.48h4v-4h-4v4zm20-4h-4v4h4v-4zm-12 4h4v-4h-4v4zm13.54-15.04l-3.08 2.55 8.7 10.49-8.7 10.48 3.08 2.55 10.82-13.03-10.82-13.04z" :style {:stroke nil}}]}
   {:name "Settings Input Antenna"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24 10c-7.73 0-14 6.27-14 14h4c0-5.52 4.48-10 10-10s10 4.48 10 10h4c0-7.73-6.27-14-14-14zm2 18.58c1.76-.77 3-2.53 3-4.58 0-2.76-2.24-5-5-5s-5 2.24-5 5c0 2.05 1.24 3.81 3 4.58v6.59l-6.83 6.83 2.83 2.83 6-6 6 6 2.83-2.83-6.83-6.83v-6.59zm-2-26.58c-12.15 0-22 9.85-22 22h4c0-9.94 8.06-18 18-18s18 8.06 18 18h4c0-12.15-9.85-22-22-22z" :style {:stroke nil}}]}
   {:name "Settings Input Component"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M10 4c0-1.1-.89-2-2-2s-2 .9-2 2v8h-4v12h12v-12h-4v-8zm8 28c0 2.61 1.68 4.81 4 5.63v8.37h4v-8.37c2.32-.83 4-3.02 4-5.63v-4h-12v4zm-16 0c0 2.61 1.68 4.81 4 5.63v8.37h4v-8.37c2.32-.83 4-3.02 4-5.63v-4h-12v4zm40-20v-8c0-1.1-.89-2-2-2s-2 .9-2 2v8h-4v12h12v-12h-4zm-16-8c0-1.1-.89-2-2-2s-2 .9-2 2v8h-4v12h12v-12h-4v-8zm8 28c0 2.61 1.68 4.81 4 5.63v8.37h4v-8.37c2.32-.83 4-3.02 4-5.63v-4h-12v4z" :style {:stroke nil}}]}
   {:name "Settings Input Composite"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M10 4c0-1.1-.89-2-2-2s-2 .9-2 2v8h-4v12h12v-12h-4v-8zm8 28c0 2.61 1.68 4.81 4 5.63v8.37h4v-8.37c2.32-.83 4-3.02 4-5.63v-4h-12v4zm-16 0c0 2.61 1.68 4.81 4 5.63v8.37h4v-8.37c2.32-.83 4-3.02 4-5.63v-4h-12v4zm40-20v-8c0-1.1-.89-2-2-2s-2 .9-2 2v8h-4v12h12v-12h-4zm-16-8c0-1.1-.89-2-2-2s-2 .9-2 2v8h-4v12h12v-12h-4v-8zm8 28c0 2.61 1.68 4.81 4 5.63v8.37h4v-8.37c2.32-.83 4-3.02 4-5.63v-4h-12v4z" :style {:stroke nil}}]}
   {:name "Settings Input HDMI"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M36 14v-6c0-2.21-1.79-4-4-4h-16c-2.21 0-4 1.79-4 4v6h-2v12l6 12v6h16v-6l6-12v-12h-2zm-20-6h16v6h-4v-4h-2v4h-4v-4h-2v4h-4v-6z" :style {:stroke nil}}]}
   {:name "Settings Input svideo"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M16 23c0-1.66-1.34-3-3-3s-3 1.34-3 3 1.34 3 3 3 3-1.34 3-3zm14-10c0-1.66-1.34-3-3-3h-6c-1.66 0-3 1.34-3 3s1.34 3 3 3h6c1.66 0 3-1.34 3-3zm-13 17c-1.66 0-3 1.34-3 3s1.34 3 3 3 3-1.34 3-3-1.34-3-3-3zm7-28c-12.13 0-22 9.87-22 22s9.87 22 22 22 22-9.87 22-22-9.87-22-22-22zm0 40c-9.93 0-18-8.08-18-18s8.07-18 18-18 18 8.08 18 18-8.07 18-18 18zm11-22c-1.66 0-3 1.34-3 3s1.34 3 3 3 3-1.34 3-3-1.34-3-3-3zm-4 10c-1.66 0-3 1.34-3 3s1.34 3 3 3 3-1.34 3-3-1.34-3-3-3z" :style {:stroke nil}}]}
   {:name "Settings Overscan"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24.01 11l-4.01 5h8l-3.99-5zm11.99 9v8l5-3.99-5-4.01zm-24 0l-5 4.01 5 3.99v-8zm16 12h-8l4.01 5 3.99-5zm14-26h-36c-2.21 0-4 1.79-4 4v28c0 2.21 1.79 4 4 4h36c2.21 0 4-1.79 4-4v-28c0-2.21-1.79-4-4-4zm0 32.03h-36v-28.06h36v28.06z" :style {:stroke nil}}]}
   {:name "Settings Phone"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M26 18h-4v4h4v-4zm8 0h-4v4h4v-4zm6 13c-2.49 0-4.89-.4-7.14-1.14-.69-.22-1.48-.06-2.03.49l-4.4 4.41c-5.67-2.88-10.29-7.51-13.18-13.17l4.4-4.41c.55-.55.71-1.34.49-2.03-.74-2.25-1.14-4.66-1.14-7.15 0-1.11-.89-2-2-2h-7c-1.11 0-2 .89-2 2 0 18.78 15.22 34 34 34 1.11 0 2-.89 2-2v-7c0-1.11-.89-2-2-2zm-2-13v4h4v-4h-4z" :style {:stroke nil}}]}
   {:name "Settings Power"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M14 48h4v-4h-4v4zm8 0h4v-4h-4v4zm4-44h-4v20h4v-20zm7.13 4.87l-2.89 2.89c3.45 2.11 5.76 5.9 5.76 10.24 0 6.63-5.37 12-12 12s-12-5.37-12-12c0-4.34 2.31-8.13 5.76-10.24l-2.89-2.89c-4.15 2.89-6.87 7.69-6.87 13.13 0 8.84 7.16 16 16 16s16-7.16 16-16c0-5.44-2.72-10.24-6.87-13.13zm-3.13 39.13h4v-4h-4v4z" :style {:stroke nil}}]}
   {:name "Settings Remote"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M30 18h-12c-1.11 0-2 .9-2 2v24c0 1.1.89 2 2 2h12c1.11 0 2-.9 2-2v-24c0-1.1-.89-2-2-2zm-6 12c-2.21 0-4-1.79-4-4s1.79-4 4-4 4 1.79 4 4-1.79 4-4 4zm-9.9-17.9l2.83 2.83c1.81-1.81 4.31-2.93 7.07-2.93s5.26 1.12 7.07 2.93l2.83-2.83c-2.53-2.53-6.03-4.1-9.9-4.1s-7.37 1.57-9.9 4.1zm9.9-12.1c-6.07 0-11.57 2.46-15.56 6.44l2.83 2.83c3.26-3.26 7.76-5.27 12.73-5.27s9.47 2.01 12.73 5.27l2.83-2.83c-3.99-3.98-9.49-6.44-15.56-6.44z" :style {:stroke nil}}]}
   {:name "Settings Voice"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M14 48h4v-4h-4v4zm10-22c3.31 0 5.98-2.69 5.98-6l.02-12c0-3.32-2.68-6-6-6-3.31 0-6 2.68-6 6v12c0 3.31 2.69 6 6 6zm-2 22h4v-4h-4v4zm8 0h4v-4h-4v4zm8-28h-3.4c0 6-5.07 10.2-10.6 10.2-5.52 0-10.6-4.2-10.6-10.2h-3.4c0 6.83 5.44 12.47 12 13.44v6.56h4v-6.56c6.56-.97 12-6.61 12-13.44z" :style {:stroke nil}}]}
   {:name "Shop Two"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M36 10v-4c0-2.21-1.79-4-4-4h-8c-2.21 0-4 1.79-4 4v4h-10v22c0 2.21 1.79 4 4 4h28c2.21 0 4-1.79 4-4v-22h-10zm-12-4h8v4h-8v-4zm0 24v-14l11 6-11 8zm-18-12h-4v22c0 2.21 1.79 4 4 4h28c2.21 0 4-1.79 4-4h-32v-22z" :style {:stroke nil}}]}
   {:name "Shopping Basket"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M34.42 18l-8.76-13.11c-.38-.58-1.02-.85-1.66-.85-.64 0-1.28.28-1.66.85l-8.76 13.11h-9.58c-1.1 0-2 .9-2 2 0 .19.03.37.07.54l5.07 18.54c.47 1.68 2.02 2.92 3.86 2.92h26c1.84 0 3.39-1.24 3.85-2.93l5.07-18.54c.05-.16.08-.34.08-.53 0-1.1-.9-2-2-2h-9.58zm-16.42 0l6-8.8 6 8.8h-12zm6 16c-2.21 0-4-1.79-4-4s1.79-4 4-4 4 1.79 4 4-1.79 4-4 4z" :style {:stroke nil}}]}
   {:name "Shopping Cart"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M14 36c-2.21 0-3.98 1.79-3.98 4s1.77 4 3.98 4 4-1.79 4-4-1.79-4-4-4zm-12-32v4h4l7.19 15.17-2.7 4.9c-.31.58-.49 1.23-.49 1.93 0 2.21 1.79 4 4 4h24v-4h-23.15c-.28 0-.5-.22-.5-.5 0-.09.02-.17.06-.24l1.79-3.26h14.9c1.5 0 2.81-.83 3.5-2.06l7.15-12.98c.16-.28.25-.61.25-.96 0-1.11-.9-2-2-2h-29.57l-1.9-4h-6.53zm32 32c-2.21 0-3.98 1.79-3.98 4s1.77 4 3.98 4 4-1.79 4-4-1.79-4-4-4z" :style {:stroke nil}}]}
   {:name "Speaker Notes"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M40 4h-32c-2.21 0-3.98 1.79-3.98 4l-.02 36 8-8h28c2.21 0 4-1.79 4-4v-24c0-2.21-1.79-4-4-4zm-24 24h-4v-4h4v4zm0-6h-4v-4h4v4zm0-6h-4v-4h4v4zm14 12h-10v-4h10v4zm6-6h-16v-4h16v4zm0-6h-16v-4h16v4z" :style {:stroke nil}}]}
   {:name "Spellcheck"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24.89 32h4.18l-10.21-26h-3.71l-10.22 26h4.18l2.25-6h11.29l2.24 6zm-12.03-10l4.14-11.05 4.14 11.05h-8.28zm30.31 1.17l-16.17 16.17-7.34-7.34-2.83 2.83 10.17 10.17 19-19-2.83-2.83z" :style {:stroke nil}}]}
   {:name "Star Rate"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24 28.6l7.42 5.4-2.84-8.72 7.42-5.28h-9.1l-2.9-9-2.9 9h-9.1l7.42 5.28-2.83 8.72z" :style {:stroke nil}}]}
   {:name "Stars"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M23.99 4c-11.05 0-19.99 8.95-19.99 20s8.94 20 19.99 20c11.05 0 20.01-8.95 20.01-20s-8.96-20-20.01-20zm8.47 32l-8.46-5.1-8.46 5.1 2.24-9.62-7.46-6.47 9.84-.84 3.84-9.07 3.84 9.07 9.84.84-7.46 6.47 2.24 9.62z" :style {:stroke nil}}]}
   {:name "Store"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M40 8h-32v4h32v-4zm2 20v-4l-2-10h-32l-2 10v4h2v12h20v-12h8v12h4v-12h2zm-18 8h-12v-8h12v8z" :style {:stroke nil}}]}
   {:name "Subject"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M28 34h-20v4h20v-4zm12-16h-32v4h32v-4zm-32 12h32v-4h-32v4zm0-20v4h32v-4h-32z" :style {:stroke nil}}]}
   {:name "Supervisor Account"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M12 2c-5.52 0-10 4.48-10 10s4.48 10 10 10 10-4.48 10-10-4.48-10-10-10zm0 2.5c1.24 0 2.25 1.01 2.25 2.25s-1.01 2.25-2.25 2.25-2.25-1.01-2.25-2.25 1.01-2.25 2.25-2.25zm5 10.56v2.5c-.45.41-.96.77-1.5 1.05v-.68c0-.34-.17-.65-.46-.92-.65-.62-1.89-1.02-3.04-1.02-.96 0-1.96.28-2.65.73l-.17.12-.21.17c.78.47 1.63.72 2.54.82l1.33.15c.37.04.66.36.66.75 0 .29-.16.53-.4.66-.28.15-.64.09-.95.09-.35 0-.69-.01-1.03-.05-.5-.06-.99-.17-1.46-.33-.49-.16-.97-.38-1.42-.64-.22-.13-.44-.27-.65-.43l-.31-.24c-.04-.02-.28-.18-.28-.23v-4.28c0-1.58 2.63-2.78 5-2.78s5 1.2 5 2.78v1.78z" :style {:stroke nil}}]}
   {:name "Swap Horiz"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M13.98 22l-7.98 8 7.98 8v-6h14.02v-4h-14.02v-6zm28.02-4l-7.98-8v6h-14.02v4h14.02v6l7.98-8z" :style {:stroke nil}}]}
   {:name "Swap Vert Circle"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24 4c-11.05 0-20 8.95-20 20s8.95 20 20 20 20-8.95 20-20-8.95-20-20-20zm-11 14l7-7 7 7h-5v8h-4v-8h-5zm22 12l-7 7-7-7h5v-8h4v8h5z" :style {:stroke nil}}]}
   {:name "System Update Tv"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24 32.5l8-8h-6v-18h-4v18h-6l8 8zm18-26h-12v3.97h12v28.06h-36v-28.06h12v-3.97h-12c-2.21 0-4 1.79-4 4v28c0 2.21 1.79 4 4 4h36c2.21 0 4-1.79 4-4v-28c0-2.21-1.79-4-4-4z" :style {:stroke nil}}]}
   {:name "Tab"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M42 6h-36c-2.21 0-4 1.79-4 4v28c0 2.21 1.79 4 4 4h36c2.21 0 4-1.79 4-4v-28c0-2.21-1.79-4-4-4zm0 32h-36v-28h20v8h16v20z" :style {:stroke nil}}]}
   {:name "Tab Unselected"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M2 18h4v-4h-4v4zm0 8h4v-4h-4v4zm0-16h4v-4c-2.21 0-4 1.79-4 4zm16 32h4v-4h-4v4zm-16-8h4v-4h-4v4zm4 8v-4h-4c0 2.21 1.79 4 4 4zm36-36h-16v12h20v-8c0-2.21-1.79-4-4-4zm0 28h4v-4h-4v4zm-24-24h4v-4h-4v4zm-8 32h4v-4h-4v4zm0-32h4v-4h-4v4zm32 32c2.21 0 4-1.79 4-4h-4v4zm0-16h4v-4h-4v4zm-16 16h4v-4h-4v4zm8 0h4v-4h-4v4z" :style {:stroke nil}}]}
   {:name "Theaters"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M36 6v4h-4v-4h-16v4h-4v-4h-4v36h4v-4h4v4h16v-4h4v4h4v-36h-4zm-20 28h-4v-4h4v4zm0-8h-4v-4h4v4zm0-8h-4v-4h4v4zm20 16h-4v-4h4v4zm0-8h-4v-4h4v4zm0-8h-4v-4h4v4z" :style {:stroke nil}}]}
   {:name "Thumb Down"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M30 6h-18c-1.66 0-3.08 1.01-3.68 2.44l-6.03 14.1c-.18.46-.29.95-.29 1.46v3.83l.02.02-.02.15c0 2.21 1.79 4 4 4h12.63l-1.91 9.14c-.04.2-.07.41-.07.63 0 .83.34 1.58.88 2.12l2.13 2.11 13.17-13.17c.72-.73 1.17-1.73 1.17-2.83v-20c0-2.21-1.79-4-4-4zm8 0v24h8v-24h-8z" :style {:stroke nil}}]}
   {:name "Thumbs Up Down"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24 12c0-1.1-.9-2-2-2h-10.37l1.33-6.35c.03-.15.05-.31.05-.47 0-.62-.25-1.18-.66-1.59l-1.59-1.59-9.88 9.88c-.54.54-.88 1.29-.88 2.12v13c0 1.66 1.34 3 3 3h13.5c1.24 0 2.31-.75 2.76-1.83l4.53-10.58c.13-.34.21-.7.21-1.09v-2.5zm21 8h-13.5c-1.24 0-2.31.75-2.76 1.83l-4.53 10.58c-.13.34-.21.7-.21 1.09v2.5c0 1.1.9 2 2 2h10.37l-1.33 6.35c-.03.15-.05.31-.05.47 0 .62.25 1.18.66 1.59l1.59 1.59 9.88-9.88c.54-.54.88-1.29.88-2.12v-13c0-1.66-1.34-3-3-3z" :style {:stroke nil}}]}
   {:name "Toc"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M6 18h28v-4h-28v4zm0 8h28v-4h-28v4zm0 8h28v-4h-28v4zm32 0h4v-4h-4v4zm0-20v4h4v-4h-4zm0 12h4v-4h-4v4z" :style {:stroke nil}}]}
   {:name "Today"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M38 6h-2v-4h-4v4h-16v-4h-4v4h-2c-2.21 0-3.98 1.79-3.98 4l-.02 28c0 2.21 1.79 4 4 4h28c2.21 0 4-1.79 4-4v-28c0-2.21-1.79-4-4-4zm0 32h-28v-22h28v22zm-24-18h10v10h-10z" :style {:stroke nil}}]}
   {:name "Track Changes"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:fill "#231F20" :d "M38.14 9.86l-2.83 2.83c2.9 2.89 4.69 6.89 4.69 11.31 0 8.84-7.16 16-16 16s-16-7.16-16-16c0-8.16 6.11-14.88 14-15.86v4.04c-5.67.95-10 5.88-10 11.82 0 6.63 5.37 12 12 12s12-5.37 12-12c0-3.31-1.34-6.31-3.51-8.49l-2.83 2.83c1.44 1.45 2.34 3.45 2.34 5.66 0 4.42-3.58 8-8 8s-8-3.58-8-8c0-3.72 2.56-6.83 6-7.72v4.27c-1.19.69-2 1.97-2 3.45 0 2.21 1.79 4 4 4s4-1.79 4-4c0-1.48-.81-2.75-2-3.45v-16.55h-2c-11.05 0-20 8.95-20 20 0 11.04 8.95 20 20 20 11.04 0 20-8.96 20-20 0-5.52-2.24-10.52-5.86-14.14z" :style {:stroke nil}}]}
   {:name "Translate"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M25.74 30.15l-5.08-5.02.06-.06c3.48-3.88 5.96-8.34 7.42-13.06h5.86v-4.01h-14v-4h-4v4h-14v3.98h22.34c-1.35 3.86-3.46 7.52-6.34 10.72-1.86-2.07-3.4-4.32-4.62-6.7h-4c1.46 3.26 3.46 6.34 5.96 9.12l-10.17 10.05 2.83 2.83 10-10 6.22 6.22 1.52-4.07zm11.26-10.15h-4l-9 24h4l2.25-6h9.5l2.25 6h4l-9-24zm-5.25 14l3.25-8.67 3.25 8.67h-6.5z" :style {:stroke nil}}]}
   {:name "Trending Down"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M32 36l4.59-4.59-9.76-9.75-8 8-14.83-14.83 2.83-2.83 12 12 8-8 12.58 12.59 4.59-4.59v12z" :style {:stroke nil}}]}
   {:name "Trending Neutral"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M44 24l-8-8v6h-30v4h30v6z" :style {:stroke nil}}]}
   {:name "Trending Up"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M32 12l4.59 4.59-9.76 9.75-8-8-14.83 14.83 2.83 2.83 12-12 8 8 12.58-12.59 4.59 4.59v-12z" :style {:stroke nil}}]}
   {:name "Turned In"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M34 6h-20c-2.21 0-3.98 1.79-3.98 4l-.02 32 14-6 14 6v-32c0-2.21-1.79-4-4-4z"  :style {:stroke nil}}]}
   {:name "Turned In Not"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M34 6h-20c-2.21 0-3.98 1.79-3.98 4l-.02 32 14-6 14 6v-32c0-2.21-1.79-4-4-4zm0 30l-10-4.35-10 4.35v-26h20v26z" :style {:stroke nil}}]}
   {:name "Verified User"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24 2l-18 8v12c0 11.11 7.67 21.47 18 24 10.33-2.53 18-12.89 18-24v-12l-18-8zm-4 32l-8-8 2.83-2.83 5.17 5.17 13.17-13.17 2.83 2.83-16 16z" :style {:stroke nil}}]}
   {:name "View Agenda"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M40 26h-34c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h34c1.1 0 2-.9 2-2v-12c0-1.1-.9-2-2-2zm0-20h-34c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h34c1.1 0 2-.9 2-2v-12c0-1.1-.9-2-2-2z" :style {:stroke nil}}]}
   {:name "View Array"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M8 36h6v-26h-6v26zm28-26v26h6v-26h-6zm-20 26h18v-26h-18v26z" :style {:stroke nil}}]}
   {:name "View Column"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M20 36h10v-26h-10v26zm-12 0h10v-26h-10v26zm24-26v26h10v-26h-10z" :style {:stroke nil}}]}
   {:name "View Day"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M4 42h38v-6h-38v6zm36-26h-34c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h34c1.1 0 2-.9 2-2v-12c0-1.1-.9-2-2-2zm-36-10v6h38v-6h-38z" :style {:stroke nil}}]}
   {:name "View Headline"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M8 30h34v-4h-34v4zm0 8h34v-4h-34v4zm0-16h34v-4h-34v4zm0-12v4h34v-4h-34z" :style {:stroke nil}}]}
   {:name "View List"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M8 28h8v-8h-8v8zm0 10h8v-8h-8v8zm0-20h8v-8h-8v8zm10 10h24v-8h-24v8zm0 10h24v-8h-24v8zm0-28v8h24v-8h-24z" :style {:stroke nil}}]}
   {:name "View Module"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M8 22h10v-12h-10v12zm0 14h10v-12h-10v12zm12 0h10v-12h-10v12zm12 0h10v-12h-10v12zm-12-14h10v-12h-10v12zm12-12v12h10v-12h-10z" :style {:stroke nil}}]}
   {:name "View Quilt"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M20 36h10v-12h-10v12zm-12 0h10v-26h-10v26zm24 0h10v-12h-10v12zm-12-26v12h22v-12h-22z" :style {:stroke nil}}]}
   {:name "View Stream"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M8 36h34v-12h-34v12zm0-26v12h34v-12h-34z" :style {:stroke nil}}]}
   {:name "View Week"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M12 10h-6c-1.1 0-2 .9-2 2v24c0 1.1.9 2 2 2h6c1.1 0 2-.9 2-2v-24c0-1.1-.9-2-2-2zm28 0h-6c-1.1 0-2 .9-2 2v24c0 1.1.9 2 2 2h6c1.1 0 2-.9 2-2v-24c0-1.1-.9-2-2-2zm-14 0h-6c-1.1 0-2 .9-2 2v24c0 1.1.9 2 2 2h6c1.1 0 2-.9 2-2v-24c0-1.1-.9-2-2-2z" :style {:stroke nil}}]}
   {:name "Visibility"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24 9c-10 0-18.54 6.22-22 15 3.46 8.78 12 15 22 15 10.01 0 18.54-6.22 22-15-3.46-8.78-11.99-15-22-15zm0 25c-5.52 0-10-4.48-10-10s4.48-10 10-10 10 4.48 10 10-4.48 10-10 10zm0-16c-3.31 0-6 2.69-6 6s2.69 6 6 6 6-2.69 6-6-2.69-6-6-6z" :style {:stroke nil}}]}
   {:name "Visibility Off"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M24 14c5.52 0 10 4.48 10 10 0 1.29-.26 2.52-.71 3.65l5.85 5.85c3.02-2.52 5.4-5.78 6.87-9.5-3.47-8.78-12-15-22.01-15-2.8 0-5.48.5-7.97 1.4l4.32 4.31c1.13-.44 2.36-.71 3.65-.71zm-20-5.45l4.56 4.56.91.91c-3.3 2.58-5.91 6.01-7.47 9.98 3.46 8.78 12 15 22 15 3.1 0 6.06-.6 8.77-1.69l.85.85 5.83 5.84 2.55-2.54-35.45-35.46-2.55 2.55zm11.06 11.05l3.09 3.09c-.09.43-.15.86-.15 1.31 0 3.31 2.69 6 6 6 .45 0 .88-.06 1.3-.15l3.09 3.09c-1.33.66-2.81 1.06-4.39 1.06-5.52 0-10-4.48-10-10 0-1.58.4-3.06 1.06-4.4zm8.61-1.57l6.3 6.3.03-.33c0-3.31-2.69-6-6-6l-.33.03z" :style {:stroke nil}}]}
   {:name "Wallet Giftcard"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M40 12h-4.37c.22-.63.37-1.3.37-2 0-3.31-2.69-6-6-6-2.09 0-3.93 1.07-5 2.69l-1 1.36-1-1.36c-1.07-1.62-2.91-2.69-5-2.69-3.31 0-6 2.69-6 6 0 .7.14 1.37.37 2h-4.37c-2.21 0-3.98 1.79-3.98 4l-.02 22c0 2.21 1.79 4 4 4h32c2.21 0 4-1.79 4-4v-22c0-2.21-1.79-4-4-4zm-10-4c1.1 0 2 .9 2 2s-.9 2-2 2-2-.9-2-2 .9-2 2-2zm-12 0c1.1 0 2 .9 2 2s-.9 2-2 2-2-.9-2-2 .9-2 2-2zm22 30h-32v-4h32v4zm0-10h-32v-12h10.16l-4.16 5.67 3.25 2.33 4.75-6.47 2-2.72 2 2.72 4.75 6.47 3.25-2.33-4.16-5.67h10.16v12z" :style {:stroke nil}}]}
   {:name "Wallet Membership"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M40 4h-32c-2.21 0-4 1.79-4 4v22c0 2.21 1.79 4 4 4h8v10l8-4 8 4v-10h8c2.21 0 4-1.79 4-4v-22c0-2.21-1.79-4-4-4zm0 26h-32v-4h32v4zm0-10h-32v-12h32v12z" :style {:stroke nil}}]}
   {:name "Wallet Travel"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M40 12h-6v-4c0-2.21-1.79-4-4-4h-12c-2.21 0-4 1.79-4 4v4h-6c-2.21 0-4 1.79-4 4v22c0 2.21 1.79 4 4 4h32c2.21 0 4-1.79 4-4v-22c0-2.21-1.79-4-4-4zm-22-4h12v4h-12v-4zm22 30h-32v-4h32v4zm0-10h-32v-12h6v4h4v-4h12v4h4v-4h6v12z" :style {:stroke nil}}]}
   {:name "Work"
    :id (uuid/random)
    :collection +collection-icons-id+
    :metadata {:width 48
               :height 48
               :view-box [0 0 48 48]}
    :content [:path {:d "M40 12h-8v-4c0-2.21-1.79-4-4-4h-8c-2.21 0-4 1.79-4 4v4h-8c-2.21 0-3.98 1.79-3.98 4l-.02 22c0 2.21 1.79 4 4 4h32c2.21 0 4-1.79 4-4v-22c0-2.21-1.79-4-4-4zm-12 0h-8v-4h8v4z" :style {:stroke nil}}]}
   ])
