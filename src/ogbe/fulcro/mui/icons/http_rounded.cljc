(ns ogbe.fulcro.mui.icons.http-rounded
  #?(:cljs (:require
            ["@mui/icons-material/HttpRounded" :default HttpRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-http-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory HttpRounded)))