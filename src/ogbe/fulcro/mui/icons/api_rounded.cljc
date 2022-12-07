(ns ogbe.fulcro.mui.icons.api-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ApiRounded" :default ApiRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-api-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ApiRounded)))