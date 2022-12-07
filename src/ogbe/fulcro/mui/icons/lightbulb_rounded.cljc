(ns ogbe.fulcro.mui.icons.lightbulb-rounded
  #?(:cljs (:require
            ["@mui/icons-material/LightbulbRounded" :default LightbulbRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-lightbulb-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LightbulbRounded)))