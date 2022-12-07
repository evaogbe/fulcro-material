(ns ogbe.fulcro.mui.icons.book-outlined
  #?(:cljs (:require
            ["@mui/icons-material/BookOutlined" :default BookOutlined]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-book-outlined
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory BookOutlined)))