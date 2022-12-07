(ns ogbe.fulcro.mui.icons.egg-rounded
  #?(:cljs (:require
            ["@mui/icons-material/EggRounded" :default EggRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-egg-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory EggRounded)))