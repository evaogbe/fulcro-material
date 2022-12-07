(ns ogbe.fulcro.mui.icons.book
  #?(:cljs (:require
            ["@mui/icons-material/Book" :default Book]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-book
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Book)))