(ns ogbe.fulcro.mui.icons.book-rounded
  #?(:cljs (:require
            ["@mui/icons-material/BookRounded" :default BookRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-book-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BookRounded)))