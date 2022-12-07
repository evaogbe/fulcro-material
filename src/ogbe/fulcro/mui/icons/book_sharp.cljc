(ns ogbe.fulcro.mui.icons.book-sharp
  #?(:cljs (:require
            ["@mui/icons-material/BookSharp" :default BookSharp]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-book-sharp
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BookSharp)))