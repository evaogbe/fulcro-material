(ns ogbe.fulcro.mui.icons.http
  #?(:cljs (:require
            ["@mui/icons-material/Http" :default Http]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-http
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Http)))