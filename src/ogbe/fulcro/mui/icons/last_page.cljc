(ns ogbe.fulcro.mui.icons.last-page
  #?(:cljs (:require
            ["@mui/icons-material/LastPage" :default LastPage]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-last-page
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LastPage)))