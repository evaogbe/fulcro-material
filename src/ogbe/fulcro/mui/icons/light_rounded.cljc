(ns ogbe.fulcro.mui.icons.light-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LightRounded" :default LightRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-light-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LightRounded)))