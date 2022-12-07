(ns ogbe.fulcro.mui.icons.router-rounded
  #?(:cljs (:require
            ["@mui/icons-material/RouterRounded" :default RouterRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-router-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory RouterRounded)))