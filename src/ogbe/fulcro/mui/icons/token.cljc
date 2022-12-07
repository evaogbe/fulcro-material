(ns ogbe.fulcro.mui.icons.token
  #?(:cljs (:require
            ["@mui/icons-material/Token" :default Token]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-token
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Token)))