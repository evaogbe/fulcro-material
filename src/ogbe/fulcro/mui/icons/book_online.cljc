(ns ogbe.fulcro.mui.icons.book-online
  #?(:cljs (:require
            ["@mui/icons-material/BookOnline" :default BookOnline]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-book-online
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BookOnline)))